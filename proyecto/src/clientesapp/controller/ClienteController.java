package clientesapp.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import clientesapp.dao.ClienteDAO;
import clientesapp.model.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ClienteController implements Initializable{
    private ClienteDAO dao;
    @FXML
    private Label apellidoLabel;

    @FXML
    private TextField apellidoTextField;

    @FXML
    private Label clienteLabel;

    @FXML
    private ListView<Cliente> clientesList;

    @FXML
    private Label idLabel;

    @FXML
    private TextField idTextField;

    @FXML
    private Button insertarButton;

    @FXML
    private Label nombreLabel;

    @FXML
    private TextField nombreTextField;

    @FXML
    private Label paisLabel;

    @FXML
    private TextField paisTextField;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        dao = new ClienteDAO();
        List<Cliente>clientes = dao.getClientes();
        System.out.println("Hay " +clientes.size() + " clientes.");
        for(Cliente c: clientes)
            clientesList.getItems().add(c);
    }

    @FXML
    void mostrarCliente(MouseEvent event) {
        Cliente cliente = clientesList.getSelectionModel().getSelectedItem();
        idLabel.setText(cliente.getId() + "");
        nombreLabel.setText(cliente.getNombre());
        apellidoLabel.setText(cliente.getApellido());
        paisLabel.setText(cliente.getPais());
    }

    @FXML
    void insertarCliente(ActionEvent event) {
        Cliente c = dao.getClienteById(Integer.parseInt(idTextField.getText()));
        if(c==null){//si c es null entra y agrega el nuevo cliente
            Cliente cliente = new Cliente(Integer.parseInt(idTextField.getText()), nombreTextField.getText(), apellidoTextField.getText());
            cliente.setPais(paisTextField.getText());
            dao.insertarCliente(cliente);
            clientesList.getItems().add(cliente);
        }
    }
    
    

    
}
