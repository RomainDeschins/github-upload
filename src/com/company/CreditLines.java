package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class CreditLines {
    public String typeOfCreditLine;
    public String nameOfTheBorrower;
    public long principalAmount;
    public int maturityInMonths;
    public double interestRate;
    public AmortizingStructure amortizingStructure;
    public double annuity;

    public CreditLines(String typeOfCreditLine, String nameOfTheBorrower, long principalAmount, int maturityInMonths, double interestRate, AmortizingStructure amortizingStructure) {
        this.typeOfCreditLine = typeOfCreditLine;
        this.nameOfTheBorrower = nameOfTheBorrower;
        this.principalAmount = principalAmount;
        this.maturityInMonths = maturityInMonths;
        this.interestRate = interestRate;
        this.amortizingStructure = amortizingStructure;
        System.out.println("\nA " + typeOfCreditLine + " is created for " + nameOfTheBorrower + ".");
        calculateAnnuities();
    }

    public void calculateAnnuities(){
        this.annuity = amortizingStructure.annuityCalculation(principalAmount, maturityInMonths,interestRate);
    }

    public void printCreditLineInformation(){
        System.out.println("\nCredit line information:\n\tName: " + nameOfTheBorrower + "'(s) "+ typeOfCreditLine + "\n\tPrincipal: " +
                NumberFormat.getCurrencyInstance(Locale.GERMANY).format(principalAmount) + "\n\tMaturity: "
                + maturityInMonths + " months\n\tInterest rate: " +
                new DecimalFormat(" ##.00%").format(interestRate/100));
        if (this.annuity == this.principalAmount) {
            System.out.println("\tBullet repayment at maturity");
        } else {
            System.out.println("\tAnnuity: " + NumberFormat.getCurrencyInstance(Locale.GERMANY).format(annuity));
        }
    }

    public void setAnnuityCalculations(AmortizingStructure newAmortizingStructure){
        double formerAnnuity = annuity;
        this.amortizingStructure = newAmortizingStructure;
        calculateAnnuities();
        System.out.println("\nThe annuity of " + nameOfTheBorrower +" changed from " +  NumberFormat.getCurrencyInstance(Locale.GERMANY).format(formerAnnuity)
               + " to " + NumberFormat.getCurrencyInstance(Locale.GERMANY).format(annuity));
    }

}
