import java.util.Scanner;
/**
 * Comprueba si un número es mayor que 5 y menor que 10 o si es mayor que 20 y
menor que 30
 * @author esthe
 */
public class Ejercicio13 {
    public boolean verificarMayor5yMenor10(int num){
        if(num>5 && num<10){
            return true;
        }else{
            return false;
        }
    }
    public boolean verificarMayor20ymenor30(int num){
        if(num>20 && num<30){
            return true;
        }else{
            return false;
        }
    }
    public boolean verificarCondiciones(int num){
        if(this.verificarMayor5yMenor10(num)||this.verificarMayor20ymenor30(num)){
            return true;
    }else{
    return false;}
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num= teclado.nextInt();
        
        Ejercicio13 eje13 = new Ejercicio13();
        
        if(eje13.verificarCondiciones(num)){
            System.out.println("El numero es mayor a 5 y menor que 10 o es mayor a 20 y menor a 30");
        }else{
            System.out.println("El numero es menor a 5 y menor que 20 pero mayor que 30");
        }
    }
  
    
}
