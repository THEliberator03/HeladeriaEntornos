package paquete;

import java.util.Scanner;

public class main {

    public static void main(String args[]) {
        double precio = 0;
        System.out.println("¿Quieres un cono o una tarrina?");
        String helado = new Scanner(System.in).nextLine();
        System.out.println("Los sabores que tenemos son los siguientes:");
        System.out.println("fresa, nata, choco, naranja y limón");
        System.out.println("Tenemos tambien pistacho como nuevo sabor");
        String sabores[] = {" ", " ", " "};

        if (helado.equalsIgnoreCase("cono")) {
            precio = 2*0.10;
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
                    case "pistacho":
                        sabores[i] = "pistacho";
                    default:
                        System.out.println("No tenemos ese sabor");
                        i--;
                }
                if (i < 2){
                    System.out.println("¿Quieres otro sabor?");
                    String respuesta = new Scanner (System.in).nextLine();
                    if (respuesta.equalsIgnoreCase("No")){
                    i = 4;
                    }else{
                        precio +=(0.5*0.10);
                    }
                }
                
            }
            System.out.println("Su helado cuesta "+precio+" ¿Con cuanto vas a pagar?");
            boolean rep = true;
            while (rep){
                double respuestaPaga = new Scanner(System.in).nextDouble();
                if (respuestaPaga > precio){
                    double resultado = respuestaPaga - precio;
                    System.out.println("Aqui tiene su cambio ("+resultado+") y su helado");
                    rep = false;
                }else{
                    System.out.println("No es suficiente dinero o no tiene suficiente saldo en la tarjeta, vuelva a intentarlo");
                }
            }
            //helado h1 = new cono(sabores[0],sabores[1],sabores[2]);
            
        }else{
            precio = 1.5*0.10;
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
                    }else{
                        precio +=(0.5*0.10);
                    }
                }
            }
            System.out.println("Su tarrina cuesta "+precio+" ¿Con cuanto vas a pagar?");
            boolean rep = true;
            while (rep){
                double respuestaPaga = new Scanner(System.in).nextDouble();
                if (respuestaPaga > precio){
                    double resultado = respuestaPaga - precio;
                    System.out.println("Aqui tiene su cambio ("+resultado+") y su tarrina");
                    rep = false;
                }else{
                    System.out.println("No es suficiente dinero o no tiene suficiente saldo en la tarjeta, vuelva a intentarlo");
                }
            }
            //helado h1 = new tarrina(sabores[0],sabores[1],sabores[2]);
        }
    }
}
