// Importing the Scanner class to take user input
import java.util.Scanner;

// Defining a class named UserInput
class UserInput {

    // Method to take two integer inputs from the user and return them as an array
    int[] userInput() {
        // Declaring an array to store two numbers
        int[] numbers = new int[2];

        // Creating a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompting the user to enter the first number
        System.out.println("Enter 1st Number:");
        // Storing the entered number in the first position of the array
        numbers[0] = scan.nextInt();

        // Prompting the user to enter the second number
        System.out.println("Enter 2nd Number:");
        // Storing the entered number in the second position of the array
        numbers[1] = scan.nextInt();

        // Returning the array containing the two numbers
        return numbers;
    }
}

	
	int[] userArrInput() {
        // Declaring a variable to store the length of the array
        int a;
        
        // Declaring Scanner to store the value given by the user in variable a
        Scanner scan = new Scanner(System.in);
        
        // Asking the user to type in the length of the array
        System.out.println("Enter the length of the array:");
        
        // Storing the value in variable a
        a = scan.nextInt();
        
        // Using variable a to initialize an array of size a
        int[] ar = new int[a];
        
        // Using a for loop to store the numbers in the array
        for (int i = 1; i <= a; i++) {
            System.out.println("Enter Number " + i + ":");
            ar[i - 1] = scan.nextInt(); // Storing input at index (i - 1)
        }
        
        return ar; // Returning the array
    }
}
void displayMenu() {
        Scanner scan = new Scanner(System.in);
        
        // Displaying the available operations
        System.out.println("\nSelect the operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Mean of numbers");
        System.out.println("6. Variance of numbers");

        // Taking user choice
        int choice = scan.nextInt();

        // Using switch-case for handling user choice
        switch (choice) {
            case 1:
                // Calling the addition method from the Calculator class
                Calculator calc = new Calculator();
                System.out.println("Result of addition: " + calc.addition());
                break;

            case 2:
                // Calling the subtraction method from the Calculator class
                System.out.println("Result of subtraction: " + calc.subtraction());
                break;

            case 3:
                // Calling the multiplication method from the Calculator class
                System.out.println("Result of multiplication: " + calc.multiplication());
                break;

            case 4:
                // Calling the division method from the Calculator class
                System.out.println("Result of division: " + calc.division());
                break;

            case 5:
                // Calling the method to calculate the mean
                int[] numbersForMean = userArrInput(); // Get input for mean
                System.out.println("Mean of the numbers: " + calc.calculateMean(numbersForMean));
                break;

            case 6:
                // Calling the method to calculate the variance
                int[] numbersForVariance = userArrInput(); // Get input for variance
                System.out.println("Variance of the numbers: " + calc.calculateVariance(numbersForVariance));
                break;

            default:
                // Invalid input
                System.out.println("Invalid choice. Please select a valid operation.");
                break;
        }
    }
