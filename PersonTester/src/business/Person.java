package business;

public abstract class Person {

    private String firstName;
    private String lastName;
    private String emailAddress;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String Name) {
        firstName = Name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String Name) {
        lastName = Name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String Email) {
        emailAddress = Email;
    }

    public String toString() {
        String returnString = "Name: " + firstName + " " + lastName + "\n" + "Email: " + emailAddress;
        return returnString;
    }

    public abstract String getDisplayText();

}