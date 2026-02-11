import java.util.Scanner;

public class StudentUtilityApp {

    // Scanner object for user input
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        // do-while loop to keep menu running until user exits
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addTwoNumbers();
                    break;
                case 2:
                    checkEvenOrOdd();
                    break;
                case 3:
                    printNumbers();
                    break;
                case 4:
                    displayDayOfWeek();
                    break;
                case 5:
                    System.out.println("Thank you for using the app.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println(); // spacing

        } while (choice != 5);

        scanner.close();
    }

    // Method 1: Display Menu
    public static void displayMenu() {
        System.out.println("===== JAVA STUDENT UTILITY APP =====");
        System.out.println("1. Add Two Numbers");
        System.out.println("2. Check EVEN or ODD");
        System.out.println("3. Print Numbers from 1 to N");
        System.out.println("4. Display Day of the Week");
        System.out.println("5. Exit");
    }

    // Method 2: Add Two Numbers
    public static void addTwoNumbers() {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;  // arithmetic operator

        System.out.println("Sum = " + sum);
    }

    // Method 3: Check Even or Odd using ternary operator
    public static void checkEvenOrOdd() {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result = (number % 2 == 0) ? "EVEN" : "ODD";

        System.out.println("The number is " + result);
    }

    // Method 4: Print Numbers from 1 to N using for loop
    public static void printNumbers() {
        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            System.out.println("Numbers from 1 to " + n + ":");

            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    // Method 5: Display Day of Week using switch
    public static void displayDayOfWeek() {
        System.out.print("Enter a number (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}


