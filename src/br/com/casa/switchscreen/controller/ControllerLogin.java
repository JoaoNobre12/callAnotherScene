package br.com.casa.switchscreen.controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControllerLogin {

	@FXML
	public void callHome(ActionEvent event) throws IOException{
		
		Parent home_page_parent = FXMLLoader.load(getClass().getResource(
				"/br/com/casa/switchscreen/view/HomePage.fxml")); //gets the homepage panel
		
		Scene home_page_scene = new Scene(home_page_parent, 600, 300);
		
		home_page_scene.getStylesheets().add(
				getClass().getResource(
						"/br/com/casa/switchscreen/view/application.css")
						.toExternalForm());//get stylesheet
		
		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow(); //get the stage 
		
		app_stage.setScene(home_page_scene); // changes the current scene
		
		app_stage.show();
	}

}
