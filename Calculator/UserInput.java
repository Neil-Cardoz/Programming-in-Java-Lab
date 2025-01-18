import java.util.Scanner;

class UserInput {

    // Method to take two integer inputs from the user and return them as an array
    int[] userInput() {
        int[] numbers = new int[2];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st Number:");
        numbers[0] = scan.nextInt();

        System.out.println("Enter 2nd Number:");
        numbers[1] = scan.nextInt();

        return numbers;
    }

    // Method to take an array of numbers input from the user
    int[] userArrInput() {
        int a;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the length of the array:");
        a = scan.nextInt();
        
        int[] ar = new int[a];
        
        for (int i = 1; i <= a; i++) {
            System.out.println("Enter Number " + i + ":");
            ar[i - 1] = scan.nextInt();
        }
        
        return ar;
    }

    // Method to display the menu and perform operations based on user choice
    void displayMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nSelect the operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Fibonacci Sequence");
        System.out.println("6. Mean of an Array");
        System.out.println("7. Variance of an Array");
        
        int choice = scan.nextInt();
        
        // Create a new Calculator object to perform operations
        Calculator calc = new Calculator();
        
        switch (choice) {
            case 1:
                int[] addNumbers = userInput();
                System.out.println("Result of addition: " + calc.addition(addNumbers));
                break;

            case 2:
                int[] subNumbers = userInput();
                System.out.println("Result of subtraction: " + calc.subtraction(subNumbers));
                break;

            case 3:
                int[] mulNumbers = userInput();
                System.out.println("Result of multiplication: " + calc.multiplication(mulNumbers));
                break;

            case 4:
                int[] divNumbers = userInput();
                System.out.println("Result of division: " + calc.division(divNumbers));
                break;

            case 5:
                System.out.println("Enter the number of Fibonacci terms you want:");
                int n = scan.nextInt();
                System.out.println("Fibonacci Sequence: ");
                calc.fibonacci(n);
                break;
                
            case 6:
                int[] arrForMean = userArrInput();
                System.out.println("Mean of the array: " + calc.mean(arrForMean));
                break;

            case 7:
                int[] arrForVariance = userArrInput();
                System.out.println("Variance of the array: " + calc.variance(arrForVariance));
                break;

            default:
                System.out.println("Invalid choice. Please select a valid operation.");
                break;
        }
    }
}
