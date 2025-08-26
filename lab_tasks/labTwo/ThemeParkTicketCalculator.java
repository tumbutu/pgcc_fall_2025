import java.util.Scanner;

public class ThemeParkTicketCalculator {

    // Final constants for ticket prices
    public static final int PRICE_FREE = 0;
	public static final int PRICE_CHILD = 10;
    //TODO declare the other constants here

    // Constants for weekend days
    public static final String SATURDAY = "Saturday";
    public static final String SUNDAY = "Sunday";

    public static void main(String[] args) {
        // TODO declare a scanner variable and call it "scanner"

        // Get user input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        int basePrice = 0;
        int totalPrice = 0;

        // TODO: Determine basePrice using if statements based on age

        // TODO: Use switch to check if weekend surcharge applies
        // and add it to the base price if needed

        // TODO: Print the final result
        // Example output:
        // Base Price: $20
        // Weekend surcharge applied: $5
        // Total Ticket Price: $25

        // TODO close the scanner
    }
}
