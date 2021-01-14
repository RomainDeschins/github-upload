package com.company;

public class QuarterlyInstallments implements AmortizingStructure {
    public double annuityCalculation(long principalAmount, int maturity, double interestRate){
        return principalAmount*(interestRate/100/4)/(1- Math.pow(1+(interestRate/100/4),-maturity));
    }
}
