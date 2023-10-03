import java.util.Scanner;

/**
 *Verifica si un estudiante ha aprobado si su nota es mayor o igual a 70 o si ha
obtenido un resultado de "Aprobado" en su evaluación.
 * @author esthe
 */
public class Ejercicio14 {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Dame el nombre de la alumna: ");
       String nombre = teclado.nextLine();
       System.out.println("Dame la calificacion de "+nombre+": ");
       int calificacion = teclado.nextInt();
       Alumno alumno1= new Alumno();
       alumno1.setNombre(nombre); 
       alumno1.setCalificacion(calificacion);
        
        System.out.println("El alumno "+alumno1.getNombre()+" tiene una calificacion de: "
                +alumno1.getCalificacion()+" el alumno, esta "+alumno1.status());
        
    }
    
}
class Alumno{
   private String nombre;
   private int calificacion;
   
   public String getNombre(){
       return nombre;
       
   }
   public int getCalificacion(){
       return calificacion;
   }
   public void setNombre(String nombre){
       this.nombre= nombre;    
   }
   public void setCalificacion(int calificacion){
       this.calificacion=calificacion;
   }
   public String status(){
       if(calificacion>=70){
           return "aprovado";
       }else{
           return "reprobado";
       }
   }
   
    
}