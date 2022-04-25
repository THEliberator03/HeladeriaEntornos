package paquete;

import java.util.Scanner;

public class main {

    public static void main(String args[]) {
        System.out.println("¿Quieres un cono o una tarrina?");
        String helado = new Scanner(System.in).nextLine();
        System.out.println("Los sabores que tenemos son los siguientes:");
        System.out.println("fresa, nata, choco, naranja y limón");
        String sabores[] = {" ", " f", "f "};

        if (helado.equalsIgnoreCase("cono")) {
            for (int i = 0; i < 3; i++) {
                System.out.println("¿Que sabor quiere?");
                String sabor = new Scanner(System.in).nextLine();

                switch (sabor) {
                    case "fresa":
                        sabores [i] = "fresa";
                        break;
                    case "nata":
                        sabores [i] = "nata";
                        break;
                    case "choco":
                        sabores [i] = "fresa";
                        break;
                    case "naranja":
                        sabores [i] = "naranja";
                        break;
                    case "limon":
                        sabores[i] = "limon";
                        break;
                    default:
                        System.out.println("No tenemos ese sabor");
                        i--;
                }
                if (i < 2){
                    System.out.println("¿Quieres otro sabor?");
                    String respuesta = new Scanner (System.in).nextLine();
                    if (respuesta.equalsIgnoreCase("No")){
                    i = 4;
                    }
                }
                
            }
            helado h1 = new cono(sabores[0],sabores[1],sabores[2]);
            
        }else{
            for (int i = 0; i < 3; i++) {
                System.out.println("¿Que sabor quiere?");
                String sabor = new Scanner(System.in).nextLine();

                switch (sabor) {
                    case "fresa":
                        sabores [i] = "fresa";
                        break;
                    case "nata":
                        sabores [i] = "nata";
                        break;
                    case "choco":
                        sabores [i] = "fresa";
                        break;
                    case "naranja":
                        sabores [i] = "naranja";
                        break;
                    case "limon":
                        sabores[i] = "limon";
                        break;
                    default:
                        System.out.println("No tenemos ese sabor");
                        i--;
                }
                if (i < 2){
                    System.out.println("¿Quieres otro sabor?");
                    String respuesta = new Scanner (System.in).nextLine();
                    if (respuesta.equalsIgnoreCase("No")){
                    i = 4;
                    }
                }
            }
            helado h1 = new tarrina(sabores[0],sabores[1],sabores[2]);
        }
    }
}
