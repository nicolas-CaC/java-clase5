package login;

public class Login implements FuncionesNecesarias {

    public String ruta = "otraRutta.html";
    
    // SOBRECARGA DE METODOS
    
    public void mensajito(){
        System.out.println("soy un mensajito");
    }
    
    public void mensajito(String datito){
        System.out.println("Mensajito: " + datito);
    }
    
    // IMPLEMENTACION DE INTERFACE

    @Override
    public boolean loguearse(String user, String pass) {
           return user.equals("admin") && pass.equals("admin");
    }

    @Override
    public void registrarse(String name, String username, String email, String password) {
        System.out.println(FuncionesNecesarias.ruta);
        System.out.printf("Datos: %s - %s - %s - %s\n", name, username, email, password);
    }

    @Override
    public String[] olvidarPassword(String email) {
        String[] datos = {email, "abc123"};
        return datos;
    }
    
    
    
    
    
    
}
