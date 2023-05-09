package piedraPapelTijera;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label OrdenadorLabel;

    @FXML
    private Label jugadorLabel;

    @FXML
    private Button papelButton;

    @FXML
    private Button piedraButton;

    @FXML
    private Button tijerasButton;

    @FXML
    void onPapel(ActionEvent event) {
        jugadorLabel.setText("PAPEL");
    }

    @FXML
    void onPiedra(ActionEvent event) {
        jugadorLabel.setText("PIEDRA");
    }

    @FXML
    void onTijeras(ActionEvent event) {
        jugadorLabel.setText("TIJERAS");
    }

}
