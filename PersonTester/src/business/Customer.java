package business;

/**
 * Created by Ryan_Wechter on 2/16/16.
 */
public class Customer extends Person {


    private String customerNumber;
    public Customer(){

    }

    public void setCustomerNumber(String number) {
        customerNumber = number;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    @Override
    public String getDisplayText() {
        return this.toString() + "\nCustomer number: " + customerNumber +"\n";
    }
}
