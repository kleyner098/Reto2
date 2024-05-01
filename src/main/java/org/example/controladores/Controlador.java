package org.example.controladores;

import org.example.clases.Viaje;
import org.example.modelos.Modelo;
import org.example.vistas.Interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controlador {

        private Interfaz vista;
        private Modelo modelo;

        public Controlador(Interfaz vista, Modelo modelo){
            this.vista = vista;
            this.modelo = modelo;

            // Obtenemos las lista de viajes desde el modelo
            ArrayList<Viaje> listaViajes = modelo.listarViajes();

            // Creamos un DefaultComboBoxModel con los elementos de la lista de viajes
            DefaultComboBoxModel<Viaje> comboBoxModel = new DefaultComboBoxModel<>(listaViajes.toArray(new Viaje[0]));

            //Establecemos la lista en el JComboBox
            vista.getViajeJComboBox().setModel(comboBoxModel);

            // Evento del boton guardar
            this.vista.getGuardarButton().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Obtenemos los datos del cliente
                    String nombreApellidos = vista.getNombreApellidoField().getText();
                    String dni = vista.getDniField().getText();
                    String telefono = vista.getTelefonoField().getText();
                    String correo = vista.getCorreoField().getText();

                    //Obtenemos el viaje que se ha seleccionado
                    Viaje viajeSeleccionado = (Viaje) vista.getViajeJComboBox().getSelectedItem();

                    Boolean guardado = modelo.guardar(nombreApellidos,dni,telefono,correo, viajeSeleccionado);

                    if(guardado){
                        JOptionPane.showMessageDialog(vista, "Los datos se han guardado correctamente en la base de datos.");
                    }else{
                        JOptionPane.showMessageDialog(vista, "Error al guardar los datos en la base de datos");
                    }
                }
            });
        }

}
