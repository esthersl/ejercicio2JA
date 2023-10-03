import java.util.Scanner;

/**
 *Verifica si un número es menor que 50 o mayor que 100.
 * @author esthe
 */
public class ejercicio8 {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero:   ");
        num= teclado.nextInt();
        
        if(num<50 || num>100){
            System.out.println("Este numero es menor que 50 o mayor que 100 ");
        } else{
            System.out.println("Este numero NO es menor que 50 o mayor que 100 ");
        }
    }
    
}
