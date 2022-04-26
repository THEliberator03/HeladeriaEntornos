/*

 */
package examen_entornos;
import java.util.Scanner;

public class EXAMEN_ENTORNOS {

   
    public static void main(String[] args) {
       double precio = 0;
       System.out.println("¿Qué tipo de helado quiere?");
       String opcion = new Scanner(System.in).nextLine();
       String forma= opcion.toLowerCase();
       switch(forma){
           case "cono":
               precio=1;
               
                   System.out.println("¿Qué sabor quieres?,Tenemos:Fresa, Nata, Chocolate, Naranja, Limón,Pistacho");
                   String respuesta2 = new Scanner(System.in).nextLine();
                   precio+=1; 
                   for(int i=0;i<2;i++){
                       System.out.println("¿Qué sabor quieres?,Tenemos:Fresa, Nata, Chocolate, Naranja, Limón,Pistacho");
                        String respuesta = new Scanner(System.in).nextLine();
                       switch(respuesta){
                           case "fresa":
                               precio+=0.50;
                               break;
                           case "nata":
                               precio+=0.50;
                               break;
                           case "chocolate":
                               precio+=0.50;
                               break;
                           case "naranja":
                               precio+=0.50;
                               break;
                           case "limon":
                               precio+=0.50;
                               break;
                           case "nada":
                               i=3;
                               break;
                            case "pistacho":
                                precio+=0.50;
                                break;
                        } 
                   }
               
               break;
           case "tarrina":
               precio=0.50;
                   System.out.println("¿Qué sabor quieres?");
                   String respuesta = new Scanner(System.in).nextLine();
                   precio+=1;          
                for(int i=0;i<2;i++){
                    System.out.println("¿Qué sabor quieres?,Tenemos:Fresa, Nata, Chocolate, Naranja, Limón, Pistacho");
                   String respuesta1 = new Scanner(System.in).nextLine();
                   switch(respuesta1){
                           case "fresa":
                               precio+=0.50;
                               break;
                           case "nata":
                               precio+=0.50;
                               break;
                           case "chocolate":
                               precio+=0.50;
                               break;
                           case "naranja":
                               precio+=0.50;
                               break;
                           case "limon":
                               precio+=0.50;
                               break;
                           case "nada":
                               i=3;
                               break;
                            case "pistacho":
                                precio+=0.50;
                                break;
                   } 
                }   
             break;   
       }
       double aumento=precio*0.1;
       precio=precio+aumento;
       System.out.println("El precio del helado es de : " +precio+ " euros");

       System.out.println("¿Con cuanto dinero va a pagar usted?");
       double dinero= new Scanner(System.in).nextInt();
       if(dinero>precio){
           double vuelta=dinero-precio;
           System.out.println("Tome su vuelta de " +vuelta+ " euros y gracias por comprar");
       }else{
           System.out.println("El dinero queme ha dado es insuficiente");
       }

       
    }
    
}
