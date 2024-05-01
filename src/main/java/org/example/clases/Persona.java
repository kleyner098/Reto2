package org.example.clases;

public class Persona {
    private String nombreyapellidos;
    private String DNI;
    private String telefono;
    private String correo;
    private String respuesta;
   
    public String getNombreyapellidos() {
        return nombreyapellidos;
    }
    public void setNombreyapellidos(String nombreyapellidos) {
        this.nombreyapellidos = nombreyapellidos;
    }
    public String getDNI() {
        return DNI;
    }
    public void setDNI(String dNI) {
        DNI = dNI;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getRespuesta() {
        return respuesta;
    }
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
