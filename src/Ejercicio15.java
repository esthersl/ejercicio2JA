
import java.util.Scanner;



/**
Determina si una persona puede votar si es mayor de 18 años y no está inhabilitada
legalmente.
 * @author esthe
 */
public class Ejercicio15 {
    public static void main(String[] args) {
//La persona es mayor de 18 y puedes votar
//La persona es mayor de 18 y esta inhabilitada legalmente para votar
//La persana es menor de 18 y no puede votar
 Scanner teclado = new Scanner(System.in);
       System.out.println("Dame el nombre de la persona: ");
       String nombre = teclado.nextLine();
       System.out.println("Dame la edad de "+nombre+": ");
       int edad = teclado.nextInt();
       Persona persona1= new Persona();
       persona1.setNombre(nombre); 
       persona1.setEdad(edad);
       //----------------------------------------------------
       if(persona1.getEdad()>=18){
           System.out.println("Dame tu estatus legal para votar (true para si y false para no): ");
           boolean statusLegalVotacion= teclado.nextBoolean();
           persona1.setStatusLegalVotacion(statusLegalVotacion);
       }else{
           persona1.setStatusLegalVotacion(false);
       }
       //-----------------------------------------------------
       if(        persona1.getEdad()>=18
               && persona1.getStatusLegalVotacion()){
           System.out.println("La persona es mayor de 18 y puedes votar ");
       }else 
           if(    persona1.getEdad()>=18
               && !persona1.getStatusLegalVotacion()){
           System.out.println("La persona es mayor de 18 y esta inhabilitada legalmente para votar");   
       }else{
           System.out.println("La persana es menor de 18 y no puede votar");
       }  
    }
    
    
}
class Persona{
   private String nombre;
   private int edad;
   private boolean statusLegalVotacion;
   
   public String getNombre(){
       return nombre;
       
   }
   public int getEdad(){
       return edad;
   }
   public void setNombre(String nombre){
       this.nombre= nombre;    
   }
   public void setEdad(int edad){
       this.edad=edad;
   }
   public void setStatusLegalVotacion(boolean statusLegalVotacion ){
       this.statusLegalVotacion=statusLegalVotacion;
   }
   public boolean getStatusLegalVotacion(){
       return statusLegalVotacion;
   }
   
   
    
}
