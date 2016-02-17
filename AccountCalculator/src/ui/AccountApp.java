package ui;

import business.CheckingAccount;

public class AccountApp {
    public static void main(String args[]) {
        CheckingAccount acc = new CheckingAccount();
        //System.out.println(acc.getMonthlyFee());
        //System.out.println(acc.getBalance());
        Console.displayLine("Welcome to the Account Calculator\n" +
                "\nStarting Balance\nChecking Account: " + acc.getBalanceFormatted() +"\n");
        Console.displayLine("Enter the transactions for the month");
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            String action = Console.getString("\nWithdrawal or Deposit? (w/d): ");
            if (action.equalsIgnoreCase("w")) {
                acc.withdraw(Console.getDouble("Amount: "));
            } else if (action.equalsIgnoreCase("d")) {
                acc.deposit(Console.getDouble("Amount: "));
            }
            choice = Console.getString("\nContinue? (y/n): ");
        }
        Console.displayLine("\nMonthly Fees\nChecking fee: " + acc.getMonthlyFeeFormatted());
        Console.displayLine("\nFinal Balance\nChecking: " + acc.getBalanceFormatted());
    }
}
