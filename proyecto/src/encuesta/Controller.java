package encuesta;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.input.SwipeEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Button AceptarButton;

    @FXML
    private AnchorPane DeportesScroll;

    @FXML
    private Spinner<?> NunHermanosSpinner;

    @FXML
    private Text baloncestoText;

    @FXML
    private Button cancelarButton;

    @FXML
    private Slider cineSlider;

    @FXML
    private Slider comprasSlider;

    @FXML
    private CheckBox deporteCheckBox;

    @FXML
    private ChoiceBox<?> edadChoiceBox;

    @FXML
    private Text futbolText;

    @FXML
    private RadioButton hombreRadioButton;

    @FXML
    private RadioButton mujerRadioButton;

    @FXML
    private TextField profesionTextField;

    @FXML
    private Slider televisionSlider;

    @FXML
    private Text tenisText;

    @FXML
    void aceptar(ActionEvent event) {
        
    }

    @FXML
    void cancelar(ActionEvent event) {

    }

    @FXML
    void profesion(ActionEvent event) {
        
    }

    @FXML
    void spinnerDown(SwipeEvent event) {

    }

    @FXML
    void spinnerUp(SwipeEvent event) {

    }

}
