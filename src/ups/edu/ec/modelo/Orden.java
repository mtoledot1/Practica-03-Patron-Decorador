/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tano
 */
public class Orden implements IOrden{
    
    private List<Producto> productos;
    private double total;

    public Orden(int numero) {
        productos = new ArrayList<>();
    }

    public Orden() {
        productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    @Override
    public double total() {
        total = 0;
        productos.stream().forEach(p -> {
            total += (p.getPrecio()*p.getCantidad());
        });
        return total;
    }

    @Override
    public void mostrar() {
        System.out.println("\nOrden");
        productos.stream().forEach(p -> System.out.println(p.toString()));
        System.out.println("Total: "+total());
    }
}
