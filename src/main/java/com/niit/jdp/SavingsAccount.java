/*
 * Author Name : M.Krishna.
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp;

public class SavingsAccount {
    private String accountHoldersName;
    private long accountNumber;
    private String accountOpeningDate;
    private String accountStatus;
    private double availableBalance;
    private double totalBalance;
    private String InternetMobileBankingEnabled;
    private float intrestRate;
    private String modeOfOperation;


    public SavingsAccount() {
    }

    public String getAccountHoldersName() {
        return accountHoldersName;
    }

    public void setAccountHoldersName(String accountHoldersName) {
        this.accountHoldersName = accountHoldersName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }


    public float getIntrestRate() {
        return intrestRate;
    }

    public void setIntrestRate(float intrestRate) {
        this.intrestRate = intrestRate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public String getInternetMobileBankingEnabled() {
        return InternetMobileBankingEnabled;
    }

    public void setInternetMobileBankingEnabled(String internetMobileBankingEnabled) {
        InternetMobileBankingEnabled = internetMobileBankingEnabled;
    }

    public double retrieveBalance() {
        return availableBalance;
    }


    public double debitBalance(double cash) {
        return totalBalance - cash;
    }

    public double creditBalance(double cash) {
        return totalBalance + cash;

    }

    public void displayDetails() {
        System.out.println("your account number is : " + getAccountNumber());
        System.out.println("account status is :" + getAccountStatus());
        System.out.println("account holders name :" + getAccountHoldersName());
        System.out.println("date of account opened :" + getAccountOpeningDate());
        System.out.println("mobile banking :" + getInternetMobileBankingEnabled());
        System.out.println("your balance :" + getTotalBalance());
        System.out.println("mode :" + getModeOfOperation());
        System.out.println("intrest rate :" + getIntrestRate());
        System.out.println("your balance is :" + getAvailableBalance());
    }
}
