package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable{

    private double resultado;

    @FXML
    private Button clearButton;

    @FXML
    private Button divisionButton;

    @FXML
    private TextField firstNumberTextField;

    @FXML
    private Button multiplicarButton;

    @FXML
    private Button restarButton;

    @FXML
    private Button restoButton;

    @FXML
    private Label resultLabel;

    @FXML
    private TextField secondNumberTextField;

    @FXML
    private Button sumarButton;



    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        resultado = 0;
    }

    @FXML
    public void sumar(){
        double num1 = Double.parseDouble(firstNumberTextField.getText());
        double num2 = Double.parseDouble(secondNumberTextField.getText());

        resultado = num1+num2;
        resultLabel.setText(""+resultado);
    }

    public void restar(){
        double num1 = Double.parseDouble(firstNumberTextField.getText());
        double num2 = Double.parseDouble(secondNumberTextField.getText());

        resultado = num1-num2;
        resultLabel.setText(""+resultado);
    }

    public void multiplicar(){
        double num1 = Double.parseDouble(firstNumberTextField.getText());
        double num2 = Double.parseDouble(secondNumberTextField.getText());

        resultado = num1*num2;
        resultLabel.setText(""+resultado);
    }

    public void dividir(){
        double num1 = Double.parseDouble(firstNumberTextField.getText());
        double num2 = Double.parseDouble(secondNumberTextField.getText());

        resultado = num1/num2;
        resultLabel.setText(""+resultado);
    }

    public void resto(){
        double num1 = Double.parseDouble(firstNumberTextField.getText());
        double num2 = Double.parseDouble(secondNumberTextField.getText());

        resultado = num1%num2;
        resultLabel.setText(""+resultado);
    }

    public void clear(){
        firstNumberTextField.setText("");
        secondNumberTextField.setText("");
        resultLabel.setText("");
    }


    



}
