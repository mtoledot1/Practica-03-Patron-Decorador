/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

/**
 *
 * @author tano
 */
public interface IOrden {
    public void agregarProducto(Producto p);
    public double total();
    public void mostrar();
}
