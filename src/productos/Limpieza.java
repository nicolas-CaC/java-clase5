package productos;

import clase5.Productos;

public class Limpieza extends Productos{

    private int cantidad;
    
    public Limpieza(String name, double price, int cantidad){
        super(name, price);
        this.cantidad = cantidad;
    }

    @Override
    protected double descuento(int desc) {
        return this.cantidad > 3 
                ? precio - ((precio /100) * desc)
                :precio;
    }
    
    @Override
    public void total(){
        System.out.println("Precio sin descuento: " + precio);
        System.out.println("Con descuento: " + descuento(10));
        System.out.println("Total: " + descuento(10) * cantidad);
    }
    
    
}
