package assignment3javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Load the FXML file for the View
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        // Set the title for the main window
        stage.setTitle("Assignment 3 - JavaFX Application");
        stage.setScene(scene);

        // Show the stage (main window)
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
