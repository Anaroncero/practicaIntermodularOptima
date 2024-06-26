/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tfc.practica_intermodular;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBDD {

    //variables para conectarnos al script sql de la base de datos, usuario y contraseña
    private static final String URL = "jdbc:mysql://localhost:3306/practica_intermodular";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "Med@c";

    /**
     * Obtiene una conexión a la base de datos.
     * 
     * @return Conexion a la base de datos.
     * @throws SQLException por si hay un erro al conectarse a la base de datos.
     */
    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
    }
}
