package com.ucreativa.delivery.repositories;
import com.ucreativa.delivery.entities.Express;
import com.ucreativa.delivery.entities.PickUp;
import com.ucreativa.delivery.entities.Producto;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileRepository implements Repository{

    private final String FILE_PATH = "db.txt";

    @Override
    public void guardarProducto(Producto producto, String tipo) {

        String text, tipoEnvio;

        if(producto.getTipoEnvio().equals("E")){
            tipoEnvio = "Express";
        }else{
            tipoEnvio = "PickUp";
        }

        if(tipo.equals("E")){

            Express express = (Express)producto;

            text = "\n" + "-----Informacion de la orden #" + express.getId() + "-----" + "\n"
                    + "\n"
                    + "Restaurante: " + express.getNombreRestaurante() + "\n"
                    + "Producto: " + express.getNombreProducto() + "\n"
                    + "Cliente: " + express.getNombreCliente() + "\n"
                    + "Precio producto: " + express.getPrecio() + "\n"
                    + "Tipo de envio: " + tipoEnvio + "\n"
                    + "Direccion de envio: " + express.getDireccionEnvio() + "\n"
                    + "Costo de envio: " + express.getCostoEnvio() + "\n"
                    + "Tiempo estimado de envio: " + express.getTiempoEnvio() + " minutos"
                    + "\n";
        }else{

            PickUp pick = (PickUp)producto;

            String metodoPedido;

            if(pick.isPedidoOnline()){
                metodoPedido = "Online";
            }else{
                metodoPedido = "Llamada";
            }

            text =  "\n" + "-----Informacion de la orden #" + pick.getId() + "-----" + "\n"
                    + "\n"
                    + "Restaurante: " + pick.getNombreRestaurante() + "\n"
                    + "Producto: " + pick.getNombreProducto() + "\n"
                    + "Cliente: " + pick.getNombreCliente() + "\n"
                    + "Precio producto: " + pick.getPrecio() + "\n"
                    + "Tipo de envio: " + tipoEnvio + "\n"
                    + "Minutos estimados para la entrega: " + pick.getHoraEntrega() + "\n"
                    + "Metodo utilizado para pedido: " + metodoPedido + "\n"
                    + "\n";
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
