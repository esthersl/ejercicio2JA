import java.util.Scanner;


/**
 * Determina si un usuario tiene acceso si ha ingresado un nombre de usuario y una
contraseña válidos
 * @author esthe
 */
public class ejercicio9 {
    public static void main(String[] args) {
        String nombre ="Esther";
        String contraseña="12345";
        String user, contra;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu nombre:  ");
        user = teclado.nextLine();
        System.out.println("Cual es tu contraseña: ");
        contra = teclado.nextLine();
        
        if(nombre.equals(user)&& contraseña.equals(contra))
        {System.out.println("Puedes ingresar "+ nombre);
        }else{
            System.out.println("No puedes pasar " + user);
        }
        
        
    }
    
}
