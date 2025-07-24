/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basedatosembebida;

/**
 *
 * @author jose
 */
public class Producto
{
    private int id;
    private String nombre;
    private double precio;

    public Producto()
    {
    }

    public Producto(int id, String nombre, double precio)
    {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public double getPrecio()
    {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    @Override
    public String toString()
    {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}
