package business;

/**
 * Created by Ryan_Wechter on 2/16/16.
 */
public class Employee extends Person {


    private String socialSecurityNumber;
    public Employee() {}

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String SSN){
        socialSecurityNumber = SSN;
    }

    @Override
    public String getDisplayText() {
        return this.toString() + "\nSocial security number: " + socialSecurityNumber +"\n";
    }
}
