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
import registerapp.App;

public class RegisterController implements Initializable {

    @FXML
    private Label lblMessage;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private TextField txtUsername;
    @FXML
    private Button btnRegister;
    @FXML
    private Button btnLogin;
    @FXML
    private TextField txtMobile;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    @FXML
    private void handleRegister(ActionEvent event) {
        String name = txtUsername.getText();
        String password = txtPassword.getText();
        String mobile = txtMobile.getText();
        if (name.isEmpty()) {
            lblMessage.setText("Name is required");
            return;
        }
        if (password.isEmpty()) {
            lblMessage.setText("Password is required");
            return;
        }
        if (mobile.isEmpty()) {
            lblMessage.setText("Mobile is required");
            return;
        }

        if (App.register(name, mobile, password) == 1) {
            App.change("/views/Login.fxml", "Login");
        } else {
            lblMessage.setText("Register failed");
        }
    }

    @FXML
    private void handleLogin(ActionEvent event) {
        App.change("/views/Login.fxml", "Login");
    }

}
