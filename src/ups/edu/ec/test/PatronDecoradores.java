/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.test;

import ups.edu.ec.modelo.DecoradorDescuento;
import ups.edu.ec.modelo.DecoradorDomicilio;
import ups.edu.ec.modelo.IOrden;
import ups.edu.ec.modelo.Orden;
import ups.edu.ec.modelo.Producto;

/**
 *
 * @author tano
 */
public class PatronDecoradores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto manzanas = new Producto("manzana", 5, 0.10);
        Producto naranjas = new Producto("naranja", 10, 0.25);
        Producto mangos = new Producto("mango", 7, 0.50);
        IOrden orden = new Orden();
        orden.agregarProducto(mangos);
        orden.agregarProducto(manzanas);
        orden.agregarProducto(naranjas);
        orden.mostrar();
        orden = new DecoradorDescuento(orden);
        orden.mostrar();
        orden = new DecoradorDomicilio(orden);
        orden.mostrar();
    }
    
}
