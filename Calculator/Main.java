public class Main {

    public static void main(String[] args) {
        // Creating an object of UserInput to display the menu
        UserInput userInput = new UserInput();
        
        // Creating an object of Calculator to perform operations
        Calculator calc = new Calculator();
        
        // Display the menu to the user
        userInput.displayMenu();
    }
}
