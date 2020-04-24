package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import models.User;
import registerapp.App;

public class LoginController implements Initializable {

    @FXML
    private Button btnLogin;
    @FXML
    private Button btnRegister;
    @FXML
    private TextField txtUsername;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Label lblMessage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void handleLogin(ActionEvent event) {
        String name = txtUsername.getText();
        String password = txtPassword.getText();

        if (name.isEmpty()) {
            lblMessage.setText("Name is required");
            return;
        }
        if (password.isEmpty()) {
            lblMessage.setText("Password is required");
            return;
        }
        if (App.login(name, password) == 1) {
            App.change("/views/MainFrame.fxml", "Main Frame");
        } else {
            lblMessage.setText("Wrong user name or password");
        }

    }

    @FXML
    private void handleRegister(ActionEvent event) {
        App.change("/views/Register.fxml", "Create New Account");
    }

}
