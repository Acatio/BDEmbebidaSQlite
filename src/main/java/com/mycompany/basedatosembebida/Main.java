/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basedatosembebida;

import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author jose
 */
public class Main
{

    public static void main(String[] args)
    {

        try
        {
            DatabaseInitializer.inicializarBd();
           
            List<Producto> productos = ProductoDAO.listarProductos();
            for (Producto p: productos)
            {
                System.out.println(p.toString()); 
            }
            
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
           
        }
    }

}
