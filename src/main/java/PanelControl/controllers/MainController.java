package PanelControl.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class MainController {

	@FXML
	private StackPane MainSP;



	@FXML
	public void initialize() {
		loadMenuScreen();

	}

	public void loadMenuScreen() {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/TestingMenu.fxml"));
		Pane pane = null;
		try {
			pane = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		MenuController MenuC = loader.getController();
		MenuC.setMainController(this);
		setScreen(pane);
	}

	public void setScreen(Pane pane) {
		MainSP.getChildren().clear();
		MainSP.getChildren().add(pane);
	}

}
