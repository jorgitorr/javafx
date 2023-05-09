package conversorTemperatura;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField celsiusTextField;

    @FXML
    private TextField fahrenheitTextField;

    @FXML
    void celsiusToFahrenheit(ActionEvent event) {
        double celsius = Double.parseDouble(celsiusTextField.getText());
        double f = celsius*1.8+32;
        fahrenheitTextField.setText(""+f);
    }

    @FXML
    void fahrenheitToCelsius(ActionEvent event) {
        double fahrenheit = Double.parseDouble(fahrenheitTextField.getText());
        double c = (fahrenheit-32)/1.8;
        celsiusTextField.setText(Math.round(c)*100.0/100.0 + "");
    }

}
