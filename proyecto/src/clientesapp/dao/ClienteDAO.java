package clientesapp.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import clientesapp.model.Cliente;

public class ClienteDAO {

    private final static String archivo = "src/clientesapp/clientes.txt";

    public ClienteDAO() {
    }

    /**
    * leer archivo
    * construir cliente
    * agregar cliente a lista
    * devolver lista
     * @return
     */
    public List<Cliente>getClientes(){
        List<Cliente>clientes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while((linea=br.readLine())!=null){
                String[]partes = linea.split(";");
                int id = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                String apellido = partes[2];
                String pais = partes[3];
                Cliente c = new Cliente(id, nombre, apellido);
                c.setPais(pais);
                clientes.add(c);
            }    
        } catch(FileNotFoundException ex){
            System.err.println("Archivo " + archivo + " no encontrado");   
        }catch (IOException e) {
            System.err.println("Error de E/S en " + archivo);
        }
        return clientes;
    }

    public Cliente getClienteById(int idCliente){
        Cliente c = null;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while((linea=br.readLine())!=null){
                String[]partes = linea.split(";");
                int id = Integer.parseInt(partes[0]);
                if(idCliente == id){
                    c = new Cliente(id, partes[1], partes[2]);
                    c.setPais(partes[3]);
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("Archivo " + archivo + " no encontrado");
        }
        return c;
    }

    public void insertarCliente(Cliente c) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo,true))) {
            String linea = "\n" +c.getId() + ";" + c.getNombre() + ";" + c.getApellido() + ";" + c.getPais();
            bw.write(linea);
        } catch(FileNotFoundException ex1){
            System.err.println("Archivo " + archivo + " no encontrado");
        }catch (IOException e) {
            System.err.println("Error de E/S en " + c);
        }
    }

    
}
