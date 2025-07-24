/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basedatosembebida;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jose
 */
public class DatabaseConnector
{

    private static final String DB_URL = "jdbc:sqlite:baseDatos.db";

    public static Connection connect() throws SQLException
    {
        try
        {
            return DriverManager.getConnection(DB_URL);
        } catch (SQLException e)
        {
            throw new SQLException("Ocurrio un error al conectar la base de datos", e);
        }
    }

}
