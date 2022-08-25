/*
 * Author Name : M.Krishna.
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class SavingsAccountImpl {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountNumber(122333444);
        savingsAccount.setAccountOpeningDate("11/2/24");
        savingsAccount.setInternetMobileBankingEnabled("yes");
        savingsAccount.setAccountHoldersName("vamshi krishna");
        savingsAccount.setAccountStatus("active");
        savingsAccount.setAvailableBalance(25000);
        savingsAccount.setIntrestRate(5);
        savingsAccount.setTotalBalance(25000);
        savingsAccount.setModeOfOperation("online");
        savingsAccount.displayDetails();
        double credit = savingsAccount.creditBalance(500);
        System.out.println("Balance after crediting is :" + credit);//25000+500
        savingsAccount.setTotalBalance(credit);
        double debit = savingsAccount.debitBalance(600);
        System.out.println("Balance after debiting is :" + debit);///25000+500-600
        savingsAccount.setTotalBalance(debit);
        savingsAccount.setAvailableBalance(savingsAccount.getTotalBalance());
        System.out.println("Your retrived balance is :" + savingsAccount.retrieveBalance());

    }
}