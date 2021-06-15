package com.ucreativa;

import com.ucreativa.delivery.entities.Express;
import com.ucreativa.delivery.entities.Producto;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Producto producto;

        producto = new Express(1234, "Combo 1", "McDonald's",3500,"Express",
                "Bryan Guzman", "83330758", true, false,"Catzi, lote 9B",1500,
                15);
        producto.infoOrden();


    }
}
