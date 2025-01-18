class Calculator {

    // Method to perform addition
    int addition(int[] numbers) {
        return numbers[0] + numbers[1];
    }

    // Method to perform subtraction
    int subtraction(int[] numbers) {
        return numbers[0] - numbers[1];
    }

    // Method to perform multiplication
    int multiplication(int[] numbers) {
        return numbers[0] * numbers[1];
    }

    // Method to perform division
    double division(int[] numbers) {
        if (numbers[1] == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (double) numbers[0] / numbers[1];
    }

    // Method to calculate Fibonacci sequence up to nth term
    void fibonacci(int n) {
        int first = 0, second = 1;

        // Print the Fibonacci sequence up to n terms
        System.out.print(first + " " + second + " ");
        
        for (int i = 3; i <= n; i++) {
            int nextTerm = first + second;
            System.out.print(nextTerm + " ");
            first = second;
            second = nextTerm;
        }
        System.out.println();
    }

    // Method to calculate the mean of an array
    double mean(int[] numbers) {
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    // Method to calculate the variance of an array
    double variance(int[] numbers) {
        double mean = mean(numbers);
        double sumOfSquares = 0;
        for (int num : numbers) {
            sumOfSquares += Math.pow(num - mean, 2);
        }
        return sumOfSquares / numbers.length;
    }
}
