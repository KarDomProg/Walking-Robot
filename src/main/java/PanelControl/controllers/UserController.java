package PanelControl.controllers;

import javafx.fxml.FXML;

public class UserController {
	
	private MainController mainController;
	
	@FXML
	public void EventLogOut() {
		mainController.loadMenuScreen();
		
	}

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}

}
