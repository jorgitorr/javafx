package tresEnRaya;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    private Button button0;

    @FXML
    private Button button1;

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

    private boolean ganador;
    private char turno;
    private int partidas;
    private char[]tablero;

    public Controller() {
        partidas = 9;
        ganador = false;
        turno = 'X';
        tablero = new char[9];
    }


    private void cambiarTurno(){
        if(turno=='X')
            turno = 'O';
        else
            turno = 'X';
    }

    private void checkGanador(){
        if(tablero[0]==turno && tablero[1]==turno && tablero[2]==turno)
            ganador = true;
        if(tablero[3]==turno && tablero[4]==turno && tablero[5]==turno)
            ganador = true;
        if(tablero[6]==turno && tablero[7]==turno && tablero[8]==turno)
            ganador = true;
        if(tablero[0]==turno && tablero[4]==turno && tablero[8]==turno)
            ganador = true;
        if(tablero[2]==turno && tablero[4]==turno && tablero[6]==turno)
            ganador = true; 
        
        if(ganador)
            imprimeGanador();
    }

    public void reiniciar(){
        tablero = new char[9];
        ganador = false;
        partidas = 9;
    }

    private void comprueba(){
        if(ganador || partidas==0){
            button0.setText("");
            button1.setText("");
            button2.setText("");
            button3.setText("");
            button4.setText("");
            button5.setText("");
            button6.setText("");
            button7.setText("");
            button8.setText("");
            reiniciar();
        }
    }

    private void imprimeGanador(){
        if(ganador){
            button0.setText("G");
            button1.setText("A");
            button2.setText("N");
            button3.setText("");
            button4.setText("");
            button5.setText("A");
            button6.setText("");
            button7.setText("");
            button8.setText(turno + "");
        }
    }

    private boolean checkButton(Button button){
        comprueba();
        return button.getText().equals("");
    }


    @FXML
    void onButton0(ActionEvent event) {
        if(checkButton(button0)){
            button0.setText(turno + "");
            tablero[0] = turno;
            checkGanador();
            cambiarTurno();   
            partidas--;
        }
    }

    @FXML
    void onButton1(ActionEvent event) {
        if(checkButton(button1)){
            button1.setText(turno + "");
            tablero[1] = turno;
            checkGanador();
            cambiarTurno();
            partidas--;
        }
    }

    @FXML
    void onButton2(ActionEvent event) {
        if(checkButton(button2)){
            button2.setText(turno + " ");
            tablero[2] = turno;
            checkGanador();
            cambiarTurno();
            partidas--;
        }
    }

    @FXML
    void onButton3(ActionEvent event) {
        if(checkButton(button3)){
            button3.setText(turno + " ");
            tablero[3] = turno;
            checkGanador();
            cambiarTurno();
            partidas--;
        }
    }

    @FXML
    void onButton4(ActionEvent event) {
        if(checkButton(button4)){
            button4.setText(turno + " ");
            tablero[4] = turno;
            checkGanador();
            cambiarTurno();
            partidas--;
        }
    }

    @FXML
    void onButton5(ActionEvent event) {
        if(checkButton(button5)){
            button5.setText(turno + " ");
            tablero[5] = turno;
            checkGanador();
            cambiarTurno();
            partidas--;
        }
    }

    @FXML
    void onButton6(ActionEvent event) {
        if(checkButton(button6)){
            button6.setText(turno + " ");
            tablero[6] = turno;
            checkGanador();
            cambiarTurno();
            partidas--;
        }
    }

    @FXML
    void onButton7(ActionEvent event) {
        if(checkButton(button7)){
            button7.setText(turno + " ");
            tablero[7] = turno;
            checkGanador();
            cambiarTurno();
            partidas--;
        }
    }

    @FXML
    void onButton8(ActionEvent event) {
        if(checkButton(button8)){
            button8.setText(turno + " ");
            tablero[8] = turno;
            checkGanador();
            cambiarTurno();
            partidas--;
        }
    }

}
