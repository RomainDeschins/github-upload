package com.company;

public class TermLoan extends CreditLines {
    public TermLoan(String nameOfBorrower, long principalAmount, int maturityInMonths, double interestRate) {
        super("Term Loan", nameOfBorrower, principalAmount, maturityInMonths, interestRate, new MonthlyInstallments());
    }


}
