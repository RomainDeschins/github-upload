package com.company;

public class MonthlyInstallments implements AmortizingStructure {
    public double annuityCalculation(long principalAmount, int maturity, double interestRate){
        return principalAmount*(interestRate/100/12)/(1- Math.pow(1+(interestRate/100/12),-maturity));
    }
}
