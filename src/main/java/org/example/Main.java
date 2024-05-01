package org.example;


import org.example.controladores.Controlador;
import org.example.modelos.Modelo;
import org.example.vistas.Interfaz;

public class Main {
    public static void main(String[] args) {
        new Controlador(new Interfaz(),new Modelo());
    }
}
