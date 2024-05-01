package org.example.modelos;

import org.example.Conexion;
import org.example.clases.Viaje;

import java.sql.*;
import java.util.ArrayList;

public class Modelo {

    // Método que guarda los datos del cliente y de la factura
    public boolean guardar(String nombre, String dni, String telf, String correo, Viaje viaje){
        try {
            //Conexion con la base de datos
            Conexion cx = new Conexion();
            Connection cnx = cx.conectarMYSQL();

            // Insertar los datos del cliente
            String sql = "INSERT INTO datos_cliente (nombreyapellidos, DNI, telefono, correo) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = cnx.prepareStatement(sql);
            pstmt.setString(1, nombre);
            pstmt.setString(2, dni);
            pstmt.setString(3, telf);
            pstmt.setString(4, correo);

            pstmt.executeUpdate();

            //Insertar los datos de la factura
            sql = "INSERT INTO factura (dni, id_viaje) VALUES (?, ?)";
            pstmt = cnx.prepareStatement(sql);
            pstmt.setString(1, dni);
            pstmt.setString(2, String.valueOf(viaje.getId()));

            pstmt.executeUpdate();

            pstmt.close();
            cnx.close();

            return true;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    // Método que devuelve una lista con los viajes
    public ArrayList<Viaje> listarViajes(){
        Conexion cx = new Conexion();
        Connection cnx = cx.conectarMYSQL();
        ArrayList<Viaje> listaViajes = new ArrayList<Viaje>();


        try {
            // Realizamos la consulta
            Statement stmt = cnx.createStatement();
            String sql = "SELECT id, salida, destino, precio FROM oferta_viaje";
            ResultSet rs = stmt.executeQuery(sql);


            while (rs.next()) {

                // Recuperamos los datos
                String idViaje = rs.getString("id");
                String salida= rs.getString("salida");
                String destino=rs.getString("destino");
                String precio= rs.getString("precio");

                Viaje nuevoViaje = new Viaje(Integer.parseInt(idViaje), salida, destino, Integer.parseInt(precio));

                //Añadimos un nuevo objeto viajes
                listaViajes.add(nuevoViaje);

            }

            rs.close();

            return listaViajes;

        } catch (SQLException e) {
            return null;
        }
    }
}
