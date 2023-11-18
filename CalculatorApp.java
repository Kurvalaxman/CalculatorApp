import java.util.Scanner;
//This line imports the Scanner class from the java.util package Scanner is used to read user input from the command line.

 class CalculatorApp {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

//Scanner scanner is used to read input from the user.
//boolean running is a flag that determines whether the application should continue running. It's set to true to start the program

        while (running)
//This is the main loop that keeps the program running until the user chooses to exit.
 {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

//These lines display the calculator menu with options for addition, subtraction, multiplication, division, and exiting the program.

            System.out.print("Select an option (1-5): ");
            int choice = scanner.nextInt();

//The program prompts the user to select an option by entering a number between 1 and 5.
//The user's choice is stored in the choice variable.

//The switch statement is used to perform actions based on the user's choice (the value of choice).

            switch (choice) {
                case 1:
                    performAddition(scanner);
                    break;
//If the user chooses "1" (Addition), it calls the performAddition method, which reads two numbers and displays their sum.
                case 2:
                    performSubtraction(scanner);
                    break;
//If the user chooses "2" (Substraction), it calls the performSubstraction method, which reads two numbers and displays their substraction.
                case 3:
                    performMultiplication(scanner);
                    break;
                case 4:
                    performDivision(scanner);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
//if the user enters an invalid choice it displays an error message.                    
            }
//the main loop continues until the running flag is set to false.            
        }

        System.out.println("Calculator closed.");
        scanner.close();
    }
  //After the loop the program prints a closing message and closes the scanner object.  

    public static void performAddition(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    public static void performSubtraction(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    public static void performMultiplication(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    public static void performDivision(Scanner scanner) {
        System.out.print("Enter the dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter the divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor != 0) {
            double result = dividend / divisor;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
