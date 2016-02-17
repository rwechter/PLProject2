package business;

import java.text.NumberFormat;

public class CheckingAccount extends Account{

    private double monthlyFee;

    public CheckingAccount() {
        monthlyFee = 1;
    }

    public void subtractMonthlyFee() {
        setBalance(getBalance() - monthlyFee);
    }

    public void setMonthlyFee(double monthlyFee){
        this.monthlyFee = monthlyFee;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public String getMonthlyFeeFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String balanceFormatted = currency.format(monthlyFee);
        return balanceFormatted;
    }


}
