/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado.entidades;

/**
 *
 * @author Extre
 */
public class Producto implements Comparable<Producto>{

    private String nombre;
    private Integer precio;
    private Double cantidad;
    private String unidadDeVenta;

    public Producto() {
    }

    public Producto(String nombre, Integer precio, Double cantidad, String unidadDeVenta) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }
    

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio +"$"+ ", cantidad=" + cantidad + " " + unidadDeVenta + '}';
    }

    @Override
    public int compareTo(Producto p) {
       return this.precio.compareTo(p.getPrecio());
    }


}
