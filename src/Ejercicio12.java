import java.util.Scanner;
/**
 * Determina si una persona es adulta y no es jubilada.
 * @author esthe
 */
public class Ejercicio12 {
    
    public boolean esAdulto(int edad){
        if(edad>=18){
            return true;
        }else{
            return false;
        }
    }
    public boolean esJubilado(int edad){
        if(edad<=60){
            return true;
        }else{
            return false;
        }
    }
    public boolean verificar(int edad){
        if(this.esAdulto(edad) && this.esJubilado(edad)){
             return true; 
        }else{
            return false;   }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu edad: ");
        int edad =teclado.nextInt();
        
        Ejercicio12 eje12 = new Ejercicio12();
        if(eje12.verificar(edad)){
            System.out.println("Esta persona es adulta y no es jubilada");
        }else{
            System.out.println("No es ");
        }
    }
}

