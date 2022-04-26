/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helado;
import java.util.Scanner;
/**
 *
 * @author Glyaxz
 */
public class Helado {
    public static void main(String[] args) {
        boolean sigue1 = true, sigue2 = true;
        double precioFinal = 0;
        String valor, valor2, sabores = "";
        int i = 0;

        System.out.println("Bienvenido a la heladeria.\n¿Desea un cono o una tarrina?");
        valor = new Scanner(System.in).nextLine();

            switch(valor){
            case "Cono":
                precioFinal += 0.5;
                while(sigue2){
                    if(i < 3){
                        System.out.println("¿Quieres añadir un sabor? (Si/No)");
                        valor2 = new Scanner(System.in).nextLine();
                    }else{
                        valor2 = "No";
                    }
                    
                    switch(valor2){
                    case "Si": 
                        System.out.println("¿Que sabor quieres añadir? (Fresa, Nata, Chocolote, Naranja, Limon)");
                        sabores += new Scanner(System.in).nextLine() + ", ";
                        precioFinal += 0.50;
                        i++;
                        break;
                    case "No":
                        sigue2 = false;
                        System.out.println("Su helado es de "+sabores+"con un precio final de: "+precioFinal);
                        break;
                    }
                }

                break;

            case "Tarrina":
                while(sigue2){
                    if(i < 3){
                        System.out.println("¿Quieres añadir un sabor? (Si/No)");
                        valor2 = new Scanner(System.in).nextLine();
                    }else{
                        valor2 = "No";
                    }
                    switch(valor2){
                    case "Si": 
                        System.out.println("¿Que sabor quieres añadir? (Fresa, Nata, Chocolote, Naranja, Limon)");
                        sabores += new Scanner(System.in).nextLine() + ", ";
                        precioFinal += 0.50;
                        i++;
                        break;
                    case "No":
                        sigue2 = false;
                        System.out.println("Su helado es de "+sabores+"con un precio final de: "+precioFinal);
                        break;
                    }
                }
                break;
            default: 
                System.out.println("El valor introducido no es válido");
            }

    }
    
}
