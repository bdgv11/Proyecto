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

    public void guardarProducto(int id, String nombreProducto, String nombreRestaurante, double precio,
                                String tipoEnvio, String nombreCliente, String telefonoCliente,
                                String metodoPago, String direccionEnvio, double costoEnvio, int tiempoEnvio,
                                int horaEntrega, boolean pedidoOnline, boolean pedidoLlamada){

        Producto producto;
        String tipo;

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