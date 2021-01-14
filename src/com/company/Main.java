package com.company;

public class Main {

    public static void main(String[] args) {

        TermLoan termLoan1 = new TermLoan("James Dean", 500000, 240, 2);
        RevolvingCreditLine revolvingCreditLine1 = new RevolvingCreditLine("Bruce Springsteen",75000,18,4);

        termLoan1.printCreditLineInformation();
        revolvingCreditLine1.printCreditLineInformation();
        termLoan1.setAnnuityCalculations(new QuarterlyInstallments());
        termLoan1.printCreditLineInformation();



    }
}
