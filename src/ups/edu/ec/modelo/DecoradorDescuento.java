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
public class DecoradorDescuento extends DecoradorBase{
    
    protected double descuento = 0.4;
    
    public DecoradorDescuento(IOrden orden) {
        super(orden);
    }
    
    public double subTotal(){
        return orden.total();
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    @Override
    public double total(){
        double total = orden.total()*descuento;
        total = orden.total()-total;
        return total;
    }
    
    @Override
    public void mostrar(){
        orden.mostrar();
        System.out.println("Descuento: "+(descuento*100)+"%");
        System.out.println("Costo Final: "+total());
    }
}
