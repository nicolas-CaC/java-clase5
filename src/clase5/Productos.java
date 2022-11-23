package clase5;

abstract public class Productos {

    protected String nombre;
    protected double precio;

    public Productos(String name, double price) {
        nombre = name;
        precio = price;
    }

    protected abstract double descuento(int valor);
    
    public abstract void total();
    
    public void getNombre(){
        System.out.println("Producto: " + nombre);
    }
}
