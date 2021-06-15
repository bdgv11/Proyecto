package com.ucreativa.delivery.entities;

public abstract class Producto {

    private int id;
    private String nombreProducto;
    private String nombreRestaurante;
    private double precio;
    private String tipoEnvio;
    private String nombreCliente;
    private String telefonoCliente;
    private boolean pagoTarjeta;
    private boolean pagoEfectivo;

    public Producto(int id, String nombreProducto, String nombreRestaurante, double precio,
                    String tipoEnvio, String nombreCliente, String telefonoCliente,
                    boolean pagoTarjeta, boolean pagoEfectivo){

        this.id = id;
        this.nombreProducto = nombreProducto;
        this.nombreRestaurante = nombreRestaurante;
        this.precio = precio;
        this.tipoEnvio = tipoEnvio;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.pagoTarjeta = pagoTarjeta;
        this.pagoEfectivo = pagoEfectivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public boolean isPagoTarjeta() {
        return pagoTarjeta;
    }

    public void setPagoTarjeta(boolean pagoTarjeta) {
        this.pagoTarjeta = pagoTarjeta;
    }

    public boolean isPagoEfectivo() {
        return pagoEfectivo;
    }

    public void setPagoEfectivo(boolean pagoEfectivo) {
        this.pagoEfectivo = pagoEfectivo;
    }

    public abstract void infoOrden();
}