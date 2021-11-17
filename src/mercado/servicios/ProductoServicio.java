/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado.servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mercado.entidades.Producto;

/**
 *
 * @author Extre
 */
public class ProductoServicio {

    private ArrayList<Producto> listaDeProductos = new ArrayList<>();

    public List<Producto> crearProducto() {
        listaDeProductos.add(new Producto("Coca-Cola Zero", 20, 1.5, "Litros"));
        listaDeProductos.add(new Producto("Coca-Cola", 18, 1.5, "Litros"));
        listaDeProductos.add(new Producto("Shampoo Sedal", 19, 0.5, "Litros"));
        listaDeProductos.add(new Producto("Frutillas", 64, 1.0, "Kilos"));
        return listaDeProductos;
    }

    public void ordenarPorPrecio() {
        Collections.sort(listaDeProductos, Collections.reverseOrder());
    }

    public void productoMasCaroyMasBarato() {
        System.out.println("Producto mas barato : " + listaDeProductos.get(listaDeProductos.size() - 1).getNombre());
        System.out.println("Producto mas caro : " + listaDeProductos.get(0).getNombre());
    }

    public void mostrarProductos() {
        for (Producto producto : listaDeProductos) {
            System.out.println(producto.toString());
            System.out.println("---------------------------------------------");
        }
    }
}
