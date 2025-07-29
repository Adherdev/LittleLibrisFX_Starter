package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import library.User;

public class DashboardController {

    @FXML private Label welcomeLabel;

    public void setUser(User user) {
        welcomeLabel.setText("Welcome, " + user.getUsername() + "!");
    }
}
