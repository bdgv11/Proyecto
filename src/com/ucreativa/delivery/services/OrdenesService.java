package com.ucreativa.delivery.services;

import com.ucreativa.delivery.entities.Express;
import com.ucreativa.delivery.entities.PickUp;
import com.ucreativa.delivery.entities.Producto;
import com.ucreativa.delivery.repositories.Repository;

public class OrdenesService {

    private Repository repository;

    public OrdenesService(Repository repository){
        this.repository = repository;
    }

    public void guardarProducto(String idParam, String nombreProducto, String nombreRestaurante, String precioParam,
                                String tipoEnvio, String nombreCliente, String telefonoCliente,
                                String metodoPago, String direccionEnvio, String costoEnvioParam, String tiempoEnvioParam,
                                String horaEntregaParam, String pedidoOnlineParam, String pedidoLlamadaParam){

        Producto producto;
        String tipo;

        int id = 0;
        double precio=0;
        double costoEnvio = 0;
        int tiempoEnvio = 0;

        int horaEntrega = 0;
        boolean pedidoOnline = true;
        boolean pedidoLlamada = true;

        try{
            id = Integer.parseInt(idParam);
            precio = Double.parseDouble(precioParam);
            costoEnvio = Double.parseDouble(costoEnvioParam);
            tiempoEnvio = Integer.parseInt(tiempoEnvioParam);

            horaEntrega = Integer.parseInt(horaEntregaParam);
            pedidoOnline = pedidoOnlineParam.equals("S");
            pedidoLlamada = pedidoLlamadaParam.equals("S");

        }catch (Exception x){
            System.out.println(x);
        }

        if(tipoEnvio.equals("E")){
            producto = new Express(id, nombreProducto, nombreRestaurante, precio, tipoEnvio, nombreCliente,
                    telefonoCliente, metodoPago, direccionEnvio, costoEnvio, tiempoEnvio);
            tipo = "E";
        }else{
            producto = new PickUp(id, nombreProducto, nombreRestaurante, precio, tipoEnvio, nombreCliente,
                    telefonoCliente,metodoPago, horaEntrega, pedidoLlamada, pedidoOnline);
            tipo = "P";
        }
        this.repository.guardarProducto(producto,tipo);
    }
}