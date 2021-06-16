package com.ucreativa;

import com.ucreativa.delivery.entities.Express;
import com.ucreativa.delivery.entities.Producto;
import com.ucreativa.delivery.repositories.FileRepository;
import com.ucreativa.delivery.repositories.Repository;
import com.ucreativa.delivery.services.OrdenesService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Producto producto;
        OrdenesService service = new OrdenesService(new FileRepository());
        Repository repo = new FileRepository();
        Scanner scan = new Scanner(System.in);

        String id, nombreProducto, nombreRestaurante, precio, tipoEnvio,
                nombreCliente, telefonoCliente, metodoPago,
                // aca vienen los campos de la clase express
                direccionEnvio, costoEnvio, tiempoEnvio,
                // aca vienen los campos de la clase pickup
                horaEntrega, pedidoOnline, pedidoLlamada;


        boolean bandera = true;

        while(bandera){

            System.out.println("");
            System.out.println("--Digite la siguiente informacion--");
            System.out.println("");

            System.out.println("Id de la orden:");
            id = scan.nextLine();

            System.out.println("Nombre del producto comprado:");
            nombreProducto = scan.nextLine();

            System.out.println("Nombre del restaurante donde realizo el pedido:");
            nombreRestaurante = scan.nextLine();

            System.out.println("Precio del producto:");
            precio = scan.nextLine();

            System.out.println("Tipo de pedido, Express/PickUp (E/P) :");
            tipoEnvio = scan.nextLine();

            System.out.println("Nombre del Cliente:");
            nombreCliente = scan.nextLine();

            System.out.println("Telefono del Cliente:");
            telefonoCliente = scan.nextLine();

            System.out.println("Metodo de pago:");
            metodoPago = scan.nextLine();




            System.out.println("Desea imprimir la lista (S)");
            String print = scan.nextLine();

            if (print.equals("S")) {

                //
            }else{
                System.out.println("Gracias por utilizar el sistema...");
                bandera = false;
            }
        }
    }
}
