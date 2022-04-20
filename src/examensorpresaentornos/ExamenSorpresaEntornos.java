package examensorpresaentornos;
import java.util.*;
/**
 *
 * @author theli
 */
public class ExamenSorpresaEntornos {
    public static void main(String[] args) {
        double precio = 0.0;
        int pedido[] = new int[4], num = 0, numSabores= 1;
        boolean rep = true;
        
        //Presentación inicial del programa
        System.out.println("Autoservicio Helados Alfredo"
                + "\n============================");
        
        /*
          Un try-catch envuelve todo el prgrama principal para vigilar que no se introduzcan datos diferentes a un Integer.
        */
        try{
            
            /*
              El programa se presenta en un bucle, que se mueve a lo largo de un switch con las distintas partes de la selección del helado. El switch funciona 
              mediante el contador 'num', que va cambiando en cada repetición siguiendo los pasos del pedido.
            */
            while(rep){
                switch(num){
                    case 0:
                        /*
                          El programa empieza con 'num' en la posición 0, que pide al usuario seleccionar el recipiente para el helado. Se muestran las opciones 
                          mediante un menú numerado y en función del valor introducido se ajustaran los valores necesarios y procederá al siguiente paso.
                        */
                        System.out.println("\nSeleccione un recipiente para el helado: "
                            + "\n1.-Cono de barquillo  ~  1€"
                            + "\n2.-Tarrina de plástico  ~  0.50€");
                        
                        pedido[0] = new Scanner(System.in).nextInt();
                        switch(pedido[0]){
                            case 1:
                                precio += 1.0;
                                break;
                            case 2:
                                precio += 0.5;
                                break;
                            default:
                                System.out.println("\nEl valor introducido no es correcto, por favor repita.");
                                break;
                        }
                        num = 1;
                        break;
                    case 1:
                        /*
                          El segundo paso es la selección de sabores, se presenta un menú similar al anterior con las opciones disponibles, una vez selecionado, el 
                          valor se guardará y se aplicará el cargo en función de la cantidad de sabores pedidos, a continuación hará que proceda al paso siguiente.
                        */
                        System.out.println("\nSeleccione el sabor del helado: "
                            + "\n1.-Fresa  ~  1€"
                            + "\n2.-Nata  ~  1€"
                            + "\n3.-Chocolate  ~  1€"
                            + "\n4.-Naranja  ~  1€"
                            + "\n5.-Limón  ~  1€");
                        
                        pedido[numSabores] = new Scanner(System.in).nextInt();
                        num = 2;
                        if(numSabores > 1){
                            precio += 0.5;
                        }
                        else{
                            precio += 1.0;
                        }
                        break;
                    case 2:
                        /*
                          Este paso pregunta al cliente para añadir más sabores o proceder con el fin del pedido, hay un límite de 3 sabores máximo (repetidos o no 
                          los sabores) y en caso de no querer añadir más sabores o alcanzar el límite, el programa continuará al paso final.
                        */
                        if(numSabores < 3){
                            System.out.println("\n¿Desea añadir más sabores? (Máx 3 sabores, 0.50€ por cada sabor extra)."
                                + "\n1.-Sí"
                                + "\n2.-No");
                        
                            int temp = new Scanner(System.in).nextInt();
                            switch(temp){
                                case 1:
                                    num = 1;
                                    numSabores++;
                                    break;
                                case 2:
                                    num = 3;
                                    break;
                                default:
                                    break;
                            }
                        }
                        else{
                            num = 3;
                        }
                        break;
                    case 3:
                        /*
                          El último paso se encarga de tomar la información dada por el cliente y dar el resultado final junto con el precio al cliente
                        */
                        String finPedido = "";
                        
                        for(int i = 0; i < 5; i++){
                            if(i == 0){
                                switch(pedido[i]){
                                    case 1:
                                        finPedido += "Cono de ";
                                        break;
                                    case 2:
                                        finPedido += "Tarrina de ";
                                        break;
                                    default:
                                        break;
                                }
                            }
                            else if(i > 0 && i < 4){
                                switch(pedido[i]){
                                    case 1:
                                        finPedido += "Fresa, ";
                                        break;
                                    case 2:
                                        finPedido += "Nata, ";
                                        break;
                                    case 3:
                                        finPedido += "Chocolate, ";
                                        break;
                                    case 4:
                                        finPedido += "Naranja, ";
                                        break;
                                    case 5:
                                        finPedido += "Limón, ";
                                        break;
                                    default:
                                        break;
                                }
                            }
                            else if(i == 4){
                                finPedido += "= " +precio+ "€";
                            }
                        }
                        
                        System.out.println(finPedido);
                        rep = false;
                        break;
                    default:
                        System.out.println("Ha ocurrido un error inesperado, repita el proceso.");
                        break;
                }
            }
        }
        catch(InputMismatchException e){
            System.out.println("\nEl valor introducido ha provocado un error inesperado, repita el proceso de nuevo."
                    + "\n(" +e.getMessage()+ ".)");
        }
    }
}
