/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basedatosembebida;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jose
 */
public class DatabaseInitializer
{

    public static void inicializarBd() throws SQLException
    {

        String sql = """
               CREATE TABLE IF NOT EXISTS productos
               (id INTEGER PRIMARY KEY AUTOINCREMENT,
               nombre TEXT NOT NULL,
               precio REAL NOT NULL);
               """;
        try (Connection conn = DatabaseConnector.connect(); Statement stmt = conn.createStatement())
        {
            stmt.execute(sql);
            System.out.println("Base de datos lista.");
        } catch (SQLException e)
        {
            throw new SQLException("Ocurrio un error al inicializar la base de datos",e);
        }
    }

}
