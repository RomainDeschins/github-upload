package com.company;

public class RevolvingCreditLine extends CreditLines {
    public RevolvingCreditLine(String nameOfBorrower, long principalAmount, int maturityInMonths, double interestRate) {
        super("Revolving Credit Facility", nameOfBorrower, principalAmount, maturityInMonths, interestRate, new BulletRepayment());
    }
}
