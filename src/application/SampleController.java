package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class SampleController {

	@FXML Label etykietka;
	@FXML Button przycisk;
	
	@FXML public void klikneli(ActionEvent event) {
		etykietka.setText("GRATULACJE!");
		etykietka.setFont(Font.font("serif", 40.0));
	}
	
}
