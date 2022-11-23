package login;

public interface FuncionesNecesarias {
    
    // CONSTANTES
    
    String ruta = "login.html";
    
    // METODOS
    
    boolean loguearse(String user, String pass);
    
    void registrarse(String name, String username, String email, String password);
    
    String[] olvidarPassword(String email);

}
