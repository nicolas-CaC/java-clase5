package clase5;

import login.Login;
import productos.Desodorantes;
import productos.Limpieza;

public class Clase5 {

    public static void main(String[] args) {

        Desodorantes recsona = new Desodorantes("Rexona", 1000.00);
        recsona.getNombre();
        recsona.total();
        
        Limpieza ashudin = new Limpieza("Ayudin", 1500.00, 4);
        ashudin.getNombre();
        ashudin.total();
        
        // INTERFACES
        
        Login logueo = new Login();
        logueo.registrarse("Nico", "Nikito", "nikitodev@gmail.com", "abc123");
        
        System.out.println(logueo.loguearse("adin", "admin"));
        System.out.println(logueo.olvidarPassword("nikitidev@gmail.com")[0]);
        System.out.println(logueo.olvidarPassword("nikitidev@gmail.com")[1]);
        
        
    }

}
