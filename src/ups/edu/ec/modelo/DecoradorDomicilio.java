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
public class DecoradorDomicilio extends DecoradorBase{
    
    protected double costo = 2;

    public DecoradorDomicilio(IOrden orden) {
        super(orden);
    }
    
    @Override
    public double total(){
        return orden.total()+costo;
    }
    
    @Override
    public void mostrar(){
        orden.mostrar();
        System.out.println("Costo de entrega a domicilio: $"+costo);
        System.out.println("Precio con costo de envío: "+total());
    }
    
}
