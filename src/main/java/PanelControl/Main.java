package PanelControl;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/FXML/MainWindow.fxml"));

		StackPane stackpane = loader.load();
		Scene scene = new Scene(stackpane, 900, 700);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Control Panel");
		primaryStage.setResizable(false);
		primaryStage.show();
	}
}