/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado;

import mercado.servicios.ProductoServicio;

/**
 *
 * @author Extre
 */
public class Mercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoServicio productoServicio = new ProductoServicio();
        productoServicio.crearProducto();
        productoServicio.ordenarPorPrecio();
        productoServicio.mostrarProductos();
        productoServicio.productoMasCaroyMasBarato();
    }
    
}
