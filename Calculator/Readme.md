# Calculator Application

This is a simple Java-based calculator that performs basic arithmetic operations (Addition, Subtraction, Multiplication, Division) and also calculates the Fibonacci sequence, mean, and variance of an array.

## Features

- **Basic Arithmetic Operations:**
  - Addition
  - Subtraction
  - Multiplication
  - Division (with zero check)
  
- **Fibonacci Sequence:**
  - Calculates and prints the Fibonacci sequence up to the `n`th term.

- **Mean of an Array:**
  - Calculates the mean (average) of an array of numbers.

- **Variance of an Array:**
  - Calculates the variance of an array of numbers.

- **User Interaction:**
  - The program provides a menu-based interface to allow users to choose which operation to perform.
  
## File Structure

### `Main.java`
- **`public class Main`**: This is the entry point of the application. It initializes the `UserInput` and `Calculator` classes and starts the program by displaying the menu to the user.

### `UserInput.java`
- **`class UserInput`**: This class handles the input from the user, including operations and arrays of numbers. It displays the menu, takes input, and calls methods in the `Calculator` class to perform operations based on the user's choice.

- **`int[] userInput()`**: This method prompts the user to enter two integer values for basic arithmetic operations.
- **`int[] userArrInput()`**: This method prompts the user to enter multiple numbers into an array.
- **`void displayMenu()`**: This method displays a list of available operations and handles the user's choice by calling the relevant method in the `Calculator` class.

### `Calculator.java`
- **`class Calculator`**: This class implements the logic for the different operations: addition, subtraction, multiplication, division, Fibonacci sequence, mean, and variance.

- **`int addition(int[] numbers)`**: This method performs the addition of two integers.
- **`int subtraction(int[] numbers)`**: This method performs the subtraction of two integers.
- **`int multiplication(int[] numbers)`**: This method performs the multiplication of two integers.
- **`double division(int[] numbers)`**: This method performs division and checks for division by zero.
- **`void fibonacci(int n)`**: This method calculates and prints the Fibonacci sequence up to the `n`th term.
- **`double mean(int[] numbers)`**: This method calculates and returns the mean of an array of numbers.
- **`double variance(int[] numbers)`**: This method calculates and returns the variance of an array of numbers.



