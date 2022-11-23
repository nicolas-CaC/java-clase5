package productos;

import clase5.Productos;

public class Desodorantes extends Productos {

    public Desodorantes(String nombre, double precio){
        super(nombre, precio);
    }

    @Override
    protected double descuento(int valor) {
        return precio/valor;
    }

    @Override
    public void total() {
        System.out.println("Precio sin descuento: " + precio);
        System.out.println("Total: " + (precio - descuento(10)));
    }
}
