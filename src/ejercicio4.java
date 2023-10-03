import java.util.Scanner;
/**
 *Comprueba si un número es positivo y no es igual a cero
 * @author esthe
 */
public class ejercicio4 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("Ingresa un numero: ");
        numero = teclado.nextInt();
        
        if(numero>0 && numero!=0){
            System.out.println("Este número es positivo y no es igual a cero ");
        } else{
            System.out.println("Es si es cero o negativo");
        }
        
    }
}
