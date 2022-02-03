package com.jktm.taksapp.taskappjava17;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.stage.Stage;


public class LoginController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public LoginController() {
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Btn_Login;

    @FXML
    private PasswordField PasswordField_Password;

    @FXML
    private TextField TextField_Username;

    @FXML
    private Label Label_LoginCheck;

    public void userLogIn(ActionEvent event) throws IOException {
        if(TextField_Username.getText().equals("user") && PasswordField_Password.getText().equals("user")) {
            //Label_LoginCheck.setText("Success!");
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("TaskApp.fxml")));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else if (TextField_Username.getText().isEmpty() && PasswordField_Password.getText().isEmpty()) {
            Label_LoginCheck.setText("Please enter your data.");
        }
        else {
            Label_LoginCheck.setText("Wrong username or password!");
        }
    }
}
