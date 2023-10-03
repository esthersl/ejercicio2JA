import java.util.Scanner;

/**
 *Comprueba si un número es mayor que 10 y menor que 20.
 * @author esthe
 */
public class ejercicio1 {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        num= teclado.nextInt();
        
        if(num>10 &&num<20){
            System.out.println("Este numero es mayor que 10 y menor que 20 ");
        } else{
            System.out.println("Este numero es menor que 10");
        }
        
        
       
    }
    
     
}
