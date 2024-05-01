package org.example.vistas;

import org.example.clases.Viaje;

import javax.swing.*;
import java.awt.*;

public class Interfaz extends JFrame {

    private JTextField nombreApellidoField, dniField, telefonoField, correoField;
    private JButton guardarButton;

    private JComboBox<Viaje> viajeJComboBox;
    private JButton selectBoton;

    public Interfaz() {

        // Configuración de la ventana
        setTitle("Formulario de Cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Creación de paneles
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.PAGE_AXIS));

        JPanel panelFormulario = new JPanel(new GridLayout(4,2));
        JPanel panelViaje = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));


        // Componentes del formulario
        JLabel nombreApellidoLabel = new JLabel("Nombre y Apellidos:");
        nombreApellidoField = new JTextField(20);
        JLabel dniLabel = new JLabel("DNI:");
        dniField = new JTextField(20);
        JLabel telefonoLabel = new JLabel("Teléfono:");
        telefonoField = new JTextField(20);
        JLabel correoLabel = new JLabel("Correo Electrónico:");
        correoField = new JTextField(20);

        // Componentes del listado de viajes
        JLabel textoLabel = new JLabel("Seleciona un viaje");
        viajeJComboBox = new JComboBox<>();

        // Botón para guardar los datos
        guardarButton = new JButton("Guardar");

        // Agregamos los componentes del fomulario al panel del formulario
        panelFormulario.add(nombreApellidoLabel);
        panelFormulario.add(nombreApellidoField);
        panelFormulario.add(dniLabel);
        panelFormulario.add(dniField);
        panelFormulario.add(telefonoLabel);
        panelFormulario.add(telefonoField);
        panelFormulario.add(correoLabel);
        panelFormulario.add(correoField);

        // Agragamos los componentes para selecionar el viaje al panel de viaje
        panelViaje.add(textoLabel);
        panelViaje.add(viajeJComboBox);

        // Agregamos el boton al su panel
        panelBoton.add(guardarButton);

        // Agregamos los paneles al panel principal
        panelPrincipal.add(panelFormulario);
        panelPrincipal.add(panelViaje);
        panelPrincipal.add(panelBoton);

        // Agregar el panel pricipal  a la ventana
        add(panelPrincipal);

        // Hacemos visible la ventana
        setVisible(true);
    }


    // Getters
    public JTextField getNombreApellidoField() {
        return nombreApellidoField;
    }

    public JTextField getDniField() {
        return dniField;
    }

    public JTextField getTelefonoField() {
        return telefonoField;
    }

    public JTextField getCorreoField() {
        return correoField;
    }

    public JButton getGuardarButton() {
        return guardarButton;
    }

    public JComboBox<Viaje> getViajeJComboBox() {
        return viajeJComboBox;
    }

    public JButton getSelectBoton() {
        return selectBoton;
    }

    public static void main(String[] args) {
        new Interfaz();
    }

}
