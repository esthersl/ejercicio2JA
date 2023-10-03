import java.util.Scanner;

/**
 *Comprueba si un número es negativo o si es cero
 * @author esthe
 */
public class ejercicio10 {
    public static void main(String[] args) {
        int num1;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println(" Dame un numero: ");
        num1= teclado.nextInt();
        
        if(num1<0 || num1==0){
            System.out.println("Este numero es negativo o  es cero ");
        }else{
            System.out.println("Este numero es positivo y no es cero");
        }
                
        
        
    }
    
}
