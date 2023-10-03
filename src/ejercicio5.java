import java.util.Scanner;

/**
 *Verifica si un número es par o si es múltiplo de 5.
 * @author esthe
 */
public class ejercicio5 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa un numero: ");
        numero = teclado.nextInt();
        
        if(numero%2==0 || numero%5==0){
            System.out.println("Este numero es par o  multiplo de 5 ");
        }else{
            System.out.println("Este numero NO es par o  multiplo de 5 ");
        }
        
        
    }
    
}
