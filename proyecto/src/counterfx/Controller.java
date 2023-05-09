package counterfx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller implements Initializable{

    private int counter;


    @FXML
    private Label contadorLabel;

    @FXML
    private Label counterLabel;

    @FXML
    private Button incBtn;

    @FXML
    void incrementar(ActionEvent event) {
        counter = Integer.parseInt(counterLabel.getText())+1;
        counterLabel.setText(""+counter);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        counter = 0;
    }

}
