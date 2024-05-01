package org.example.clases;

public class Viaje {
    private String salida, destino;
    private int precio, id;

    public Viaje(int id, String salida, String destino, int precio){
        this.id = id;
        this.salida = salida;
        this.destino = destino;
        this.precio = precio;

    }

    public int getId() {
        return id;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Salida: " + salida + " | Destino: " + destino + " | Precio: " + precio ;
    }
}