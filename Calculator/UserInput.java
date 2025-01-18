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

	
	iint[] userArrInput() {
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
	