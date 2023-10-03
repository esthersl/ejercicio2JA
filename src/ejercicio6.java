import java.util.Scanner;

/**
 *Determina si un estudiante ha aprobado si su nota es mayor o igual a 60 y menor o
igual a 100.
 * @author esthe
 */
public class ejercicio6 {
    public static void main(String[] args) {
    int numero;
    Scanner tablero= new Scanner(System.in);
    System.out.println("Ingresa un numero:  ");
    numero = tablero.nextInt();
   
    if(numero>=60 && numero<=100){
        System.out.println("Este estudiante aprovo ");
    } else{
        System.out.println(" No aprovo ");
    }
    
   
    
    
    } 
}
