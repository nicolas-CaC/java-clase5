package login;

final public class ClaseFinal extends Login implements OtrasFunciones {

    public final String nombre;
    public final int edad;
    
    public ClaseFinal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    @Override
    public void funcionObligatoria(){
        System.out.println("Se produjo una funcion obligatoria desde la clase Final");
    }
    
}
