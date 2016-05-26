
/*
 * This program calls a login screen (that doesn't verifies anything) and 
 * if the login button is pressed another scene is called in the stage.
 * The project also uses some css attributes, but nothing big. 
 */
package br.com.casa.switchscreen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {

		Pane root = FXMLLoader.load(getClass().getResource(
				"/br/com/casa/switchscreen/view/Login.fxml")); //load a panel from another package...
		
		Scene scene = new Scene(root); //sets the scene
		
		scene.getStylesheets().add(
				getClass().getResource(
						"/br/com/casa/switchscreen/view/application.css")
						.toExternalForm()); //get style sheet

		primaryStage.setScene(scene); //put the scene on stage
		
		primaryStage.show(); // shows the stage
		primaryStage.setResizable(false); //you can't resize this

	}

	public static void main(String[] args) {
		launch(args);
	}
}
