package assignment3javafx;

public class Model {

    // Method to process the input from the user
    public String processInput(String input) {
        // Just a simple transformation logic for demonstration
        if (input == null || input.isEmpty()) {
            return "Please enter some text.";
        }

        // For example, we will reverse the input string as a simple logic
        StringBuilder reversed = new StringBuilder(input);
        return "Processed Input: " + reversed.reverse().toString();
    }
}
