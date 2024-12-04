package assignment3javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField inputField; // For user input

    @FXML
    private Button submitButton; // Button to submit the input

    @FXML
    private Label resultLabel; // Label to display the result

    // Instance of the Model class
    private Model model = new Model();

    // Method that handles the button click event
    @FXML
    public void handleSubmitButtonAction(ActionEvent event) {
        // Get the text from the input field
        String input = inputField.getText();

        // Call the model's method to process the input
        String result = model.processInput(input);

        // Update the result label with the processed result
        resultLabel.setText(result);
    }
}
