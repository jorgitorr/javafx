package login;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button button1;

    @FXML
    private Button button10;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button clearButton;

    @FXML
    private TextField contraseniaTextField;

    @FXML
    private Button enterButton;

    private String contraseniaSecreta;

    private Integer[]numerosAleatorios = {1,2,3,4,5,6,7,8,9,0};
    
    private List<Integer>numeros;

    private String contrasenia;


    @FXML
    private void initialize() {
        iniciarBotones();
    }

    public Controller() {
        this.contraseniaSecreta = "9654";
        this.numeros = Arrays.asList(numerosAleatorios);
        Collections.shuffle(numeros);
        this.contrasenia = "";
    }

    private void cambiarTextoInicial(){
        if(contraseniaTextField.getText().equals("Introducir codigo acceso"))
            contraseniaTextField.setText("");
    }

    private void iniciarBotones(){
        Button[]botones = {button1,button2,button3,button4,button5,button6,button7,button8,button9,button10};
        int pos = 0;
        for(Button button: botones){
            button.setText(numeros.get(pos) + "");
            pos++;
        }

    }

    @FXML
    void clear(ActionEvent event) {
        contraseniaTextField.setText("");
        contrasenia = "";
    }

    @FXML
    void enter(ActionEvent event) {
        if(contrasenia.equals(contraseniaSecreta))
            System.out.println("Start");
    }

    @FXML
    void onButton1() {
        cambiarTextoInicial();
        contrasenia += button1.getText();
        contraseniaTextField.setText(contraseniaTextField.getText()+"*");
    }

    @FXML
    void onButton10(ActionEvent event) {
        cambiarTextoInicial();
        contrasenia += button10.getText();
        contraseniaTextField.setText(contraseniaTextField.getText()+"*");
    }

    @FXML
    void onButton2(ActionEvent event) {
        cambiarTextoInicial();
        contrasenia += button2.getText();
        contraseniaTextField.setText(contraseniaTextField.getText()+"*");
    }

    @FXML
    void onButton3(ActionEvent event) {
        cambiarTextoInicial();
        contrasenia += button3.getText();
        contraseniaTextField.setText(contraseniaTextField.getText()+"*");
    }

    @FXML
    void onButton4(ActionEvent event) {
        cambiarTextoInicial();
        contrasenia += button4.getText();
        contraseniaTextField.setText(contraseniaTextField.getText()+"*");
    }

    @FXML
    void onButton5(ActionEvent event) {
        cambiarTextoInicial();
        contrasenia += button5.getText();
        contraseniaTextField.setText(contraseniaTextField.getText()+"*");
    }

    @FXML
    void onButton6(ActionEvent event) {
        cambiarTextoInicial();
        contrasenia += button6.getText();
        contraseniaTextField.setText(contraseniaTextField.getText()+"*");
    }

    @FXML
    void onButton7(ActionEvent event) {
        cambiarTextoInicial();
        contrasenia += button7.getText();
        contraseniaTextField.setText(contraseniaTextField.getText()+"*");
    }

    @FXML
    void onButton8(ActionEvent event) {
        cambiarTextoInicial();
        contrasenia += button8.getText();
        contraseniaTextField.setText(contraseniaTextField.getText()+"*");
    }

    @FXML
    void onButton9(ActionEvent event) {
        cambiarTextoInicial();
        contrasenia += button9.getText();
        contraseniaTextField.setText(contraseniaTextField.getText()+"*");

    }

}
