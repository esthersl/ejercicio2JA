import java.util.Scanner;

/**
 *Determina si una cadena de texto contiene la letra "a" y la letra "b".
 * @author esthe
 */
public class ejercicio3 {
    public static void main(String[] args) {
        String cadena ="";
        int valorASCII=0;
       boolean contienea=false;
       boolean contieneb=false;
        //int j=0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa una palabra: ");
        cadena=teclado.next();
        
        for(int i=0; i<cadena.length();i++){
            char caracter = cadena.charAt(i);
            System.out.println("caracter"+ caracter);
            valorASCII = (int) caracter;
            System.out.println(" valorASCII"+ valorASCII);
            if( valorASCII==97){
                contienea=true;
            }else if(valorASCII==98){
                 contieneb=true;
            }
            if( contienea &&contieneb){
                System.out.println("si contiene a y b");
                break;
            }
            
            
            
        }     
            } 
                }
        
        
   
     

