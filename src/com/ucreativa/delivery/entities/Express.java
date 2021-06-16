package com.ucreativa.delivery.entities;

public class Express extends Producto{

    private String direccionEnvio;
    private double costoEnvio;
    private int tiempoEnvio;

    public Express(int id, String nombreProducto, String nombreRestaurante, double precio, String tipoEnvio, String nombreCliente, String telefonoCliente, String metodoPago,
                   String direccionEnvio, double costoEnvio, int tiempoEnvio) {
        super(id, nombreProducto, nombreRestaurante, precio, tipoEnvio, nombreCliente, telefonoCliente, metodoPago);

        this.direccionEnvio = direccionEnvio;
        this.costoEnvio = costoEnvio;
        this.tiempoEnvio = tiempoEnvio;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public int getTiempoEnvio() {
        return tiempoEnvio;
    }

    public void setTiempoEnvio(int tiempoEnvio) {
        this.tiempoEnvio = tiempoEnvio;
    }



    @Override
    public void infoOrden() {

        System.out.println("-----Informacion de la orden #" + getId() + "-----" + "\n"
                            + "Restaurante: " + getNombreRestaurante() + "\n"
                            + "Producto: " + getNombreProducto() + "\n"
                            + "Cliente: " + getNombreCliente() + "\n"
                            + "Precio producto: " + getPrecio() + "\n"
                            + "Tipo de envio: " + getTipoEnvio() + "\n"
                            + "Direccion de envio: " + getDireccionEnvio() + "\n"
                            + "Costo de envio: " + getCostoEnvio() + "\n"
                            + "Tiempo estimado de envio: " + getTiempoEnvio() + " minutos" + "\n");

                            //AGREGAR EL BOOLEAN DEL METODO DE PAGO.
                            //+ "Metodo de pago: " + isPagoEfectivo() + " minutos" + "\n");
    }
}