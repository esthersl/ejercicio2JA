import java.util.Scanner;

/**Verifica si un número es divisible por 2 y por 3.
 *
 * @author esthe
 */
public class ejercicio2 {
    public static void main(String[] args) {
        
        int num;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingresa un numero");
        num = teclado.nextInt();
        
        if(num%2==0 && num %3==0){
            System.out.println("Este numero es divisible por 2 y por 3.");
        }else{
            System.out.println("No es divisible ");
        }
        
        
        
    }
    
}
