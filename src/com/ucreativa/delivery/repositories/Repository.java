package com.ucreativa.delivery.repositories;

import com.ucreativa.delivery.entities.Producto;

import java.util.List;

public interface Repository {

    void guardarProducto(Producto producto, String tipo);
    List<String> obtenerLista();
}
