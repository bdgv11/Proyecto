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
                                boolean pagoTarjeta, boolean pagoEfectivo, String direccionEnvio, double costoEnvio, int tiempoEnvio,
                                int horaEntrega, boolean pedidoOnline, boolean pedidoLlamada){

        Producto producto;
        String tipo;

        if(tipoEnvio.equals("Express")){
            producto = new Express(id,nombreProducto, nombreRestaurante, precio,
                    tipoEnvio, nombreCliente, telefonoCliente, pagoTarjeta,
                    pagoEfectivo, direccionEnvio, costoEnvio, tiempoEnvio);
            tipo = "express";
        }else{
            producto = new PickUp(id,nombreProducto, nombreRestaurante, precio,
                    tipoEnvio, nombreCliente, telefonoCliente, pagoTarjeta,
                    pagoEfectivo, horaEntrega, pedidoOnline, pedidoLlamada);
            tipo = "pickup";
        }

        this.repository.guardarProducto(producto,tipo);


    }
}