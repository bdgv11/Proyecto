package com.ucreativa.delivery.entities;

public class PickUp extends Producto{

    private int horaEntrega;
    private boolean pedidoOnline;
    private boolean pedidoLlamada;

    public PickUp(int id, String nombreProducto, String nombreRestaurante, double precio, String tipoEnvio, String nombreCliente,
                  String telefonoCliente, boolean pagoTarjeta, boolean pagoEfectivo, int horaEntrega, boolean pedidoOnline, boolean pedidoLlamada) {
        super(id, nombreProducto, nombreRestaurante, precio, tipoEnvio, nombreCliente, telefonoCliente, pagoTarjeta, pagoEfectivo);

        this.horaEntrega = horaEntrega;
        this.pedidoOnline = pedidoOnline;
        this.pedidoLlamada = pedidoLlamada;
    }

    public int getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(int horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public boolean isPedidoOnline() {
        return pedidoOnline;
    }

    public void setPedidoOnline(boolean pedidoOnline) {
        this.pedidoOnline = pedidoOnline;
    }

    public boolean isPedidoLlamada() {
        return pedidoLlamada;
    }

    public void setPedidoLlamada(boolean pedidoLlamada) {
        this.pedidoLlamada = pedidoLlamada;
    }

    @Override
    public void infoOrden() {

        System.out.println("-----Informacion de la orden #" + getId() + "-----" + "\n"
                + "Restaurante: " + getNombreRestaurante() + "\n"
                + "Producto: " + getNombreProducto() + "\n"
                + "Cliente: " + getNombreCliente() + "\n"
                + "Precio producto: " + getPrecio() + "\n"
                + "Tipo de envio: " + getTipoEnvio() + "\n");

        // CREAR LA FORMA DE AGREGAR UN PAR DE MINUTOS A LA HORA Y MOSTRAR LA HORA ESTIMADA DE ENTREGA y el boolean de si fue onnline o por llamada.
        //      + "Minutos estimados para la hora de entrega: " + getDireccionEnvio() + "\n");

    }
}