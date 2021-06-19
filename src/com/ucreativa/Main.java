package com.ucreativa;

import com.ucreativa.delivery.repositories.FileRepository;
import com.ucreativa.delivery.repositories.Repository;
import com.ucreativa.delivery.services.OrdenesService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        OrdenesService service = new OrdenesService(new FileRepository());
        Repository repo = new FileRepository();
        Scanner scan = new Scanner(System.in);

        String id, nombreProducto, nombreRestaurante, precio, tipoEnvio,
                nombreCliente, telefonoCliente, metodoPago,
                // aca vienen los campos de la clase express
                direccionEnvio =null, costoEnvio=null, tiempoEnvio=null,
                // aca vienen los campos de la clase pickup
                horaEntrega = null, pedidoOnline = null, pedidoLlamada = null;

        boolean bandera = true;

        while(bandera){

            System.out.println("");
            System.out.println("--Digite la siguiente información--");
            System.out.println("");

            System.out.println("Id de la orden:");
            id = scan.nextLine();

            System.out.println("Nombre del producto comprado:");
            nombreProducto = scan.nextLine();

            System.out.println("Nombre del restaurante donde realizó el pedido:");
            nombreRestaurante = scan.nextLine();

            System.out.println("Precio del producto:");
            precio = scan.nextLine();

            System.out.println("Tipo de pedido, Express/PickUp (E/P) :");
            tipoEnvio = scan.nextLine();

            System.out.println("Nombre del Cliente:");
            nombreCliente = scan.nextLine();

            System.out.println("Teléfono del Cliente:");
            telefonoCliente = scan.nextLine();

            System.out.println("Método de pago (efectivo, tarjeta, sinpe):");
            metodoPago = scan.nextLine();

            if(tipoEnvio.equals("E")){

                System.out.println("Dirección de envío express:");
                direccionEnvio = scan.nextLine();

                System.out.println("Costo de envío a esa dirección:");
                costoEnvio = scan.nextLine();

                System.out.println("Tiempo de envío a esa dirección:");
                tiempoEnvio = scan.nextLine();

                //producto = new Express(Integer.parseInt(id), nombreProducto, nombreRestaurante, Double.parseDouble(precio),
                //        tipoEnvio, nombreCliente, telefonoCliente, metodoPago, direccionEnvio, Double.parseDouble(costoEnvio), Integer.parseInt(tiempoEnvio));

                //service.guardarProducto(id, nombreProducto, nombreRestaurante, precio,
                //        tipoEnvio, nombreCliente, telefonoCliente, metodoPago, direccionEnvio, costoEnvio,tiempoEnvio, horaEntrega,pedidoOnline, pedidoLlamada);

            }else{

                System.out.println("Minutos a partir de ahora para la entrega:");
                horaEntrega = scan.nextLine();

                System.out.println("El pedido fue online? (S/N):");
                pedidoOnline = scan.nextLine();

                System.out.println("El pedido fue por llamada? (S/N):");
                pedidoLlamada = scan.nextLine();

                //producto = new PickUp(Integer.parseInt(id), nombreProducto, nombreRestaurante, Double.parseDouble(precio), tipoEnvio,
                // nombreCliente, telefonoCliente, metodoPago, Integer.parseInt(horaEntrega), pedidoLlamada.equals("S"), pedidoOnline.equals("S"));
            }

            service.guardarProducto(id, nombreProducto, nombreRestaurante, precio,
                    tipoEnvio, nombreCliente, telefonoCliente, metodoPago, direccionEnvio, costoEnvio,tiempoEnvio, horaEntrega,pedidoOnline, pedidoLlamada);

            //repo.guardarProducto(producto, tipo);

            System.out.println("Desea imprimir la lista (S/N)");
            String print = scan.nextLine();

            if (print.equals("S")) {

                for ( String item : repo.obtenerLista()) {
                    System.out.println(item);
                }

            }else{
                System.out.println("Gracias por utilizar el sistema...");
                bandera = false;
            }
        }
    }
}
