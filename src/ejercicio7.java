
import java.util.Scanner;
/**
 *Comprueba si una persona es mayor de edad y tiene un permiso de conducir.
 * @author esthe
 */
public class ejercicio7 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Dime tu edad: ");
        numero1=teclado.nextInt();
        System.out.println("Pon 1 SI tienes permiso de conducir o un 0 s NO");
        numero2=teclado.nextInt();
        
        if(numero1>=18 && numero2==1){
            System.out.println("Eres mayor y puedes conducir "); 
        }else{
            System.out.println("No puedes conducir, lo siento");
        }
        
        
    }
    
}
