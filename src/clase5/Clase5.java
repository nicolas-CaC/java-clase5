package clase5;

import login.ClaseFinal;
import login.Login;
import login.OtrasFunciones;
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
        System.out.println(logueo.olvidarPassword("nikitodev@gmail.com")[0]);
        System.out.println(logueo.olvidarPassword("nikitodev@gmail.com")[1]);
        
        
        System.out.println(logueo.ruta);
        
        // SOBRECARGA DE METODOS
        
        logueo.mensajito();
        logueo.mensajito("Holis");
        
        logueo.funcionObligatoria();
        
        // CLASE FINAL
        
        ClaseFinal ultimoPunto = new ClaseFinal("Monchito", 10);
        System.out.println(ultimoPunto.ruta + ultimoPunto.getNombre());
    
        OtrasFunciones objetoDesdeInterface = new ClaseFinal("Juan",2);
        objetoDesdeInterface.funcionObligatoria();
//        OtrasFunciones objeto2 = new OtrasFunciones();
    
    }
//C:\Users\Diseno\Desktop\
}
