module assignment3javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens assignment3javafx to javafx.fxml;
    exports assignment3javafx;
}
