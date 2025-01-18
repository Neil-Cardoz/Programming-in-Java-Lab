import java.util.Scanner;

// Class to perform basic calculator operations
class Calculator {

    // Method to perform addition
    int addition() {
        // Declaring an array to store the user inputs
        int[] num;
        
        // Creating an object of UserInput to fetch user inputs
        UserInput in = new UserInput();
        num = in.userInput(); // Calling the method to get user inputs

        // Adding the two numbers
        int sum = num[0] + num[1];

        // Returning the result
        return sum;
    }

    // Method to perform subtraction
    int subtraction() {
        int[] num;
        UserInput in = new UserInput();
        num = in.userInput(); // Fetching user inputs

        // Subtracting the second number from the first
        int difference = num[0] - num[1];
        
        // Returning the result
        return difference;
    }

    // Method to perform multiplication
    int multiplication() {
        int[] num;
        UserInput in = new UserInput();
        num = in.userInput(); // Fetching user inputs

        // Multiplying the two numbers
        int product = num[0] * num[1];
        
        // Returning the result
        return product;
    }

    // Method to perform division
    double division() {
        int[] num;
        UserInput in = new UserInput();
        num = in.userInput(); // Fetching user inputs

        // Checking if division by zero is attempted
        if (num[1] == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // Return 0 if division by zero is attempted
        }

        // Dividing the first number by the second
        double quotient = (double) num[0] / num[1];
        
        // Returning the result
        return quotient;
    }

    // Method to calculate the mean of the array
    double calculateMean(int[] arr) {
        int sum = 0;

        // Summing up all elements in the array
        for (int num : arr) {
            sum += num;
        }

        // Returning the mean as a double
        return (double) sum / arr.length;
    }

    // Method to calculate the variance of the array
    double calculateVariance(int[] arr) {
        double mean = calculateMean(arr); // Get the mean
        double variance = 0;

        // Calculating variance
        for (int num : arr) {
            variance += Math.pow(num - mean, 2); // (xi - mean)^2
        }

        // Returning the variance
        return variance / arr.length;
    }
}
