
import java.util.Scanner;
/**
 *Verifica si un número es primo y menor que 100.
 * @author esthe
 */
public class Ejercicio11 {
    int entrada;
      
    public boolean esMenorCien(int num1){
        if(num1<=100){
            return true;
        }else{
            return false;
        }   
    }
    public boolean esPrimo(int num1){
        byte residuoCount = 0;
        for(int i=1; i<=num1; i++ ){
            int residuo = num1%i;
            if(residuo==0){
                residuoCount++;   
            }
        }
        if(residuoCount <= 2){
            return true;
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dame un numero: ");
       int entrada=teclado.nextInt();
       
       Ejercicio11 primo = new Ejercicio11();
       
       if(primo.esMenorCien(entrada) && primo.esPrimo(entrada)){
           System.out.println("Es primo y menor que 100");
       }else{
           System.out.println("Es número compuesto");
       }
      // Primo.Escin(num1)
    
        
    }
       
     
}
    
         
        
    
       
    

   
    
    
    

