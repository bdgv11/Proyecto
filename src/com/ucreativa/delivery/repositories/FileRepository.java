package com.ucreativa.delivery.repositories;
import com.ucreativa.delivery.entities.Producto;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileRepository implements Repository{

    private final String FILE_PATH = "db.txt";

    @Override
    public void guardarProducto(Producto producto, String tipo) {

        String text;

        if(tipo.equals("E")){
            text = "-----Informacion de la orden #" + producto.getId() + "-----" + "\n"
                    + "Restaurante: " + producto.getNombreRestaurante() + "\n"
                    + "Producto: " + producto.getNombreProducto() + "\n"
                    + "Cliente: " + producto.getNombreCliente() + "\n"
                    + "Precio producto: " + producto.getPrecio() + "\n"
                    + "Tipo de envio: " + producto.getTipoEnvio() + "\n";
                 //   + "Direccion de envio: " + producto.getDireccionEnvio() + "\n"
                 //   + "Costo de envio: " + producto.getCostoEnvio() + "\n"
                 //   + "Tiempo estimado de envio: " + producto.getTiempoEnvio() + " minutos" + "\n";
        }else{

            text = "-----Informacion de la orden #" + producto.getId() + "-----" + "\n"
                    + "Restaurante: " + producto.getNombreRestaurante() + "\n"
                    + "Producto: " + producto.getNombreProducto() + "\n"
                    + "Cliente: " + producto.getNombreCliente() + "\n"
                    + "Precio producto: " + producto.getPrecio() + "\n"
                    + "Tipo de envio: " + producto.getTipoEnvio() + "\n";
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("bd.txt",true));
            writer.append(text);
            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @Override
    public List<String> obtenerLista() {
        return null;
    }
}
