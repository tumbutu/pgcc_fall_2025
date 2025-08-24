import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Language menu
        System.out.println("1. English");
        System.out.println("2. Français");
        /*TODO
        Add the other languages here
        */

        //TODO Prompt the user to enter a number between [0-6]
        //TODO declare an int variable called languageChoice
        //TODO use the scanner to accept integer input from the use and assign it to languageChoice

        //The following prompts the user to enter the grade in the user's preferred language set above
        if (languageChoice == 1) {
            System.out.print("Enter your numeric grade (0 - 100): ");
        } else if (languageChoice == 2) {
            System.out.print("Entrez votre note numérique (0 - 100): ");
        } else if (languageChoice == 3) {
            System.out.print("Ingrese su calificación numérica (0 - 100): ");
            message = "Su calificación es: ";
        } else if (languageChoice == 4) {
            System.out.print("请输入你的成绩 (0 - 100): ");
        } else if (languageChoice == 5) {
            System.out.print("あなたの成績は: (0 - 100): ");
        } else if (languageChoice == 6) {
            System.out.print("أدخل درجتك الرقمية (0 - 100): ");
        } else {
            System.out.println("Invalid language choice. Defaulting to English.");
            System.out.print("Enter your numeric grade (0 - 100): ");
        }

        int grade = scanner.nextInt();

        // Convert and display the letter grade in English
        if (grade >= 90 && grade <= 100)
        {
            System.out.println("Your grade is: A");
        }
        /*TODO
        Complete the if-else statement here
        */

        //Remember the scanner must always be closed
        scanner.close();
    }
}
