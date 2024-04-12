package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Guardar {
    private static File fichero = new File("./DatosClientes/Recibos.txt");


    public static boolean guardarDatos(Persona cliente, Viaje1 viaje){

        try {
            FileWriter writer = new FileWriter(fichero, true);

            writer.write("Fecha del recibo: " + LocalDate.now() + "\n");

            writer.write("Datos cliente \n" );
            writer.write("DNI: " + cliente.getDNI() + "\n");
            writer.write("Nombre y apellidos: " + cliente.getNombreyapellidos() + "\n");
            writer.write("Teléfono: " + cliente.getTelefono() + "\n");
            writer.write("Correo electrónico: " + cliente.getCorreo() + "\n");

            writer.write("Datos viaje \n");
            writer.write("Salida: " + viaje.getSalida() + "\n") ;
            writer.write("Destino: " + viaje.getDestino() + "\n");
            writer.write("Precio: " + viaje.getPrecio() + "\n");

            writer.write("\n--------------------------------\n" );
            writer.close();
            return true;
        }catch (IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}
