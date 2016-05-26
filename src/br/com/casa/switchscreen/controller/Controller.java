package br.com.casa.switchscreen.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
	
	@FXML Label txtHello;
	@FXML Button btnExit;

	@FXML private void initialize() {
		
		System.out.println("App inicializado");
	}

	@FXML public void exit() {
		/*When you click in Sair btn, it changes his cabkgroung, for we can see this
		 * the execution stops per 0.1 second
		 * */
		new Thread(){
			public void run(){
					try {
						
						btnExit.setStyle("-fx-background-color: #0000ff;"
									+ 	 "-fx-text-fill: #ffffff;"); //change button style
						
						sleep(100);//Para por 0.1 segundo
						System.exit(0);	
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}
		}.start();
		
	}

	@FXML public void clicked() {
		txtHello.setText("You clicked me!!!");
		System.out.println("Something clicked");
	}
}
