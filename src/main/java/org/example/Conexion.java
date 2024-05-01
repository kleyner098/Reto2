package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

    public String nombreDB= "viajes1";

    public String host= "localhost";

    public String puerto="3306";

    public String url= "jdbc:mysql://"+host+":"+puerto+"/"+ nombreDB+"?useSSL=false";

    public String username= "root";

    public String password="";


    public Connection conectarMYSQL() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
