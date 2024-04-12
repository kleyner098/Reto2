package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Viaje1 {
    private static String[] ciudades = {"Barcelona", "París", "Madrid", "Milán", "Berlín", "Ibiza", "Roma", "Londres", "Belgrado", "Atenas"};

    private String salida, destino;
    private int precio;
    public Viaje1(){
        this.salida = generarLugar();
        this.destino = generarLugar();
        this.precio = calcularPrecio();
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

    private static String generarLugar() {
        Random random = new Random();
        int index = random.nextInt(ciudades.length);
        return ciudades[index];
    }



    private static int calcularPrecio() {
        Random random = new Random();
        return random.nextInt(901) + 100;
    }
}