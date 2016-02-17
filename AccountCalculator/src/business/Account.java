package business;

import account.interfaces.Balanceable;
import account.interfaces.Depositable;
import account.interfaces.Withdrawable;

import java.text.NumberFormat;

public class Account implements Balanceable, Depositable, Withdrawable {

    private double balance;

    public void deposit(double amount) {
        if (amount <= 10000) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double amount) {
        balance = amount;
    }

    public String getBalanceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String balanceFormatted = currency.format(balance);
        return balanceFormatted;
    }




}
