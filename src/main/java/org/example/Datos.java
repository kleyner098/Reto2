package org.example;

import java.util.Scanner;

public class Datos {
    public static void main(String[] args) {

        Persona cliente1 = new Persona();
        Scanner scanner = new Scanner(System.in);
        Viaje1 lista[] = new Viaje1[3];
        int opcion;

        do {
            // Solicitar al usuario que ingrese su nombre y apellidos
            System.out.print("Ingrese su nombre y apellidos: ");
           cliente1.setNombreyapellidos(scanner.nextLine());

            // Solicitar al usuario que ingrese su DNI
            System.out.print("Ingrese su DNI: ");
            cliente1.setDNI(scanner.nextLine());

            // Solicitar al usuario que ingrese su número de teléfono
            System.out.print("Ingrese su número de teléfono: ");
            cliente1.setTelefono(scanner.nextLine());

            // Solicitar al usuario que ingrese su correo electrónico
            System.out.print("Ingrese su correo electrónico: ");
           cliente1.setCorreo(scanner.nextLine());

            // Imprimir los datos ingresados por el usuario
            System.out.println("\nDatos ingresados:");
            System.out.println("Nombre y apellidos: " + cliente1.getNombreyapellidos());
            System.out.println("DNI: " + cliente1.getDNI());
            System.out.println("Teléfono: " + cliente1.getTelefono());
            System.out.println("Correo electrónico: " + cliente1.getCorreo());

            // Preguntar al usuario si los datos son correctos
            System.out.print("\n¿Son correctos estos datos? (sí/no): ");
            cliente1.setRespuesta(scanner.nextLine().toLowerCase());

            // Si la respuesta es "no", volver a solicitar los datos
            if (!cliente1.getRespuesta().equals("sí") && !cliente1.getRespuesta().equals("si")) {
                System.out.println("Volvamos a ingresar los datos:");
            }

        } while (!cliente1.getRespuesta().equals("sí") && !cliente1.getRespuesta().equals("si"));



        System.out.println("Lista de los viajes:");
        for (int i = 0; i < lista.length; i++){
            lista[i] = new Viaje1();
            System.out.println("Viaje " + (i+1) + ":");
            System.out.println("Salida desde:" + lista[i].getSalida());
            System.out.println("Lugar de destino:" + lista[i].getDestino());
            System.out.println("Salida Precio:" + lista[i].getPrecio());
            System.out.println();
        }

        System.out.println("Introduce el número del viaje que quieres:");

        opcion = scanner.nextInt();

        boolean guardado = Guardar.guardarDatos(cliente1,lista[opcion-1]);

        if (guardado){
            System.out.println("Se guardaron los datos corretamente");
        }else {
            System.out.println("Error: No se guadaron los datos corretamente");
        }
        // Cerrar el scanner
        scanner.close();
    }
}
