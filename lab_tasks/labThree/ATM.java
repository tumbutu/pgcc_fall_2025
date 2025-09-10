import java.util.Scanner;

public class ATM {

    // Global variable to keep track of user balance
    static double balance = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
			displayMenu();  // Show menu
			
			int choice = getUserChoice(scanner); //get user's choice

            switch (choice) {
                case 1:
                    checkBalance();
                    break;

                case 2:
                    deposit(scanner);
                    break;

                case 3:
                    //call the withdraw method here
                    break;

                case 4:
                    System.out.println("Thank you for using the PGCC ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please select between 1 and 4.");
                    continue;
            }

            /*TODO
			add an if condition to break from the loop if user's is 4	
			*/
        }

        scanner.close();
    }
	
	public static int getUserChoice(Scanner scanner)
	{
		System.out.print("Enter your choice (1-4): ");
        return scanner.nextInt();
	}

    //Method to display the menu and return user's choice
    public static void displayMenu() {
        System.out.println("\n=== ATM Menu ===");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    //Method to check current balance
    public static void checkBalance() {
        //TODO: Print the current balance
    }

    //Method to handle deposits
    public static void deposit(Scanner scanner) {
        //TODO: Ask user for deposit amount
        //TODO: If the amount is negative, print error and use continue
        //TODO: Otherwise, add to balance and print success message
    }

    //Method to handle withdrawals
    public static void withdraw(Scanner scanner) {
        //TODO: Ask user for withdrawal amount
        //TODO: If the amount is negative, print error and use continue
        //TODO: If the amount is more than balance, print error and use `continue`
        //TODO: Otherwise, deduct from balance and print success message
    }
}
