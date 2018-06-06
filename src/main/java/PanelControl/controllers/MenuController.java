package PanelControl.controllers;

import java.awt.Desktop;
import java.io.IOException;

import java.net.URI;
import java.net.URISyntaxException;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class MenuController {

	private MainController mainController;
	
	@FXML
	private TextField LoginID;
	@FXML
	private PasswordField PasswordID;
	@FXML
	private Label IncorrectLog;
	
	

	@FXML
	public void LogIn() {
		if (LoginID.getText().equals("1") && PasswordID.getText().equals("1")) {
			
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/User.fxml"));
			Pane pane;
			pane = null;
			try {
				pane = loader.load();
			} catch (IOException e) {
				e.printStackTrace();
			}
			UserController userController = loader.getController();
			userController.setMainController(mainController);
			mainController.setScreen(pane);
		}
		else {
			IncorrectLog.setText("Invalid username or password");
		}
	}

	@FXML
	public void Exit() {
		Platform.exit();
	}
	@FXML
	public void Website() throws IOException, URISyntaxException {
			Desktop desktop = Desktop.getDesktop();
			desktop.browse(new URI("https://www.facebook.com/knkonstruktor"));

	}

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}

}
