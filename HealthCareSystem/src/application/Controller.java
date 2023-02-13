package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class Controller implements Initializable {
    @FXML
    private AnchorPane Apane;

    @FXML
    private Label header;

    @FXML
    private Button login;

    @FXML
    private Label password;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label status;

    @FXML
    private Label username;

    @FXML
    private TextField usernameField;

	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	public void eventButton(ActionEvent e) {
		String user = usernameField.getText();
		String pass = passwordField.getText();
		
		if(user.equals("chhaya")&&pass.equals("123")) {
			status.setText(" Username and Password is Corrrect");
			status.setStyle("-fx-text-fill:green");
		}else {
			status.setText(" Username and Password is Incorrrect");
			status.setStyle("-fx-text-fill:red");
			
		}
		
	}
    
}
