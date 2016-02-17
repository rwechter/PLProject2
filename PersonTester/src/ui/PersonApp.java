package ui;

/**
 * Created by Ryan_Wechter on 2/16/16.
 */
import business.Customer;
import business.Employee;

public class PersonApp {

    public static void main(String args[]) {

        Console.displayLine("Welcome to the Person Tester Application");
        Console.displayLine();

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            String userInput = Console.getString("Create customer or employee? (c/e): ");
            Console.displayLine();

            if (userInput.equalsIgnoreCase("c")) {
                Customer cust = new Customer();
                cust.setFirstName(Console.getString("Enter first name: "));
                cust.setLastName(Console.getString("Enter last name: "));
                cust.setEmailAddress(Console.getString("Enter email address: "));
                cust.setCustomerNumber(Console.getString("Customer Number: "));
                Console.displayLine();
                Console.displayLine("You entered: ");
                Console.displayLine(cust.getDisplayText());
            } else if (userInput.equalsIgnoreCase("e")) {
                Employee empl = new Employee();
                empl.setFirstName(Console.getString("Enter first name: "));
                empl.setLastName(Console.getString("Enter last name: "));
                empl.setEmailAddress(Console.getString("Enter email address: "));
                empl.setSocialSecurityNumber(Console.getString("Social Security Number: "));
                Console.displayLine();
                Console.displayLine("You entered: ");
                Console.displayLine(empl.getDisplayText());
            }

            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
    }
}
