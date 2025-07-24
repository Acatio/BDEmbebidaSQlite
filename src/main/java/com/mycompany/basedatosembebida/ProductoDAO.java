/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basedatosembebida;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose
 */
public class ProductoDAO
{

    public static void insertarProducto(String nombre, double precio) throws SQLException
    {
        String sql = "INSERT INTO productos(nombre, precio) VALUES(?, ?)";

        try (Connection conn = DatabaseConnector.connect(); PreparedStatement stmt = conn.prepareStatement(
                sql))
        {

            stmt.setString(1, nombre);
            stmt.setDouble(2, precio);
            stmt.executeUpdate();

        } catch (SQLException e)
        {
            throw new SQLException("No se pudo insertar el producto", e);
        }
    }

    public static List<Producto> listarProductos() throws SQLException
    {
        String sql = "SELECT id, nombre, precio FROM productos";
        List<Producto> productos = new ArrayList<>();

        try (Connection conn = DatabaseConnector.connect(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery())
        {

            while (rs.next())
            {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");

                Producto producto = new Producto(id, nombre, precio);
                productos.add(producto);
            }

        } catch (SQLException e)
        {
            throw new SQLException("No se pudo listar los productos", e);
        }

        return productos;
    }

}
