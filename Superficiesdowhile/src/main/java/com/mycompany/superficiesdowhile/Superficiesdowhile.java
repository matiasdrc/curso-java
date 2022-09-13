/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.superficiesdowhile;

import java.util.Scanner;

/**
 *
 * @author malvarez
 */
public class Superficiesdowhile {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         Scanner teclado = new Scanner(System.in);
        int opc;
        double sup_tri;
        double base, altura;
        double l1;
        double l2;       
        double radio1;  
        // fin de declaracion de variables
        
        do {
            System.out.println("**************   CALCULADOR DE SUPERFICIES  **************");
            System.out.println("");
            System.out.println("");
            System.out.println("");

            System.out.println("1 - TRIANGULO");
            System.out.println("2 - CUADRADO");
            System.out.println("3 - CIRCULO");
            System.out.println("4 - Salir");
            System.out.println("");
            System.out.print("Ingrese su opcion: ");
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("*******  CALCULADOR DE SUP. DE UN TRIANGULO  *****************");
                    System.out.println("");
                    System.out.println("Ingrese la BASE: ");
                    base = teclado.nextDouble();
                    System.out.println("Ingrese la ALTURA: ");
                    altura = teclado.nextDouble();
                    sup_tri = (base * altura) / 2;
                    System.out.println("La Sup. de su Triangulo es: " + sup_tri);

                    break;

                case 2:
                    System.out.println("*****   CALCULADOR DE SUP. DE UN CUADRADO  *******************");
                    System.out.println("");
                System.out.println("Ingrese Lado 1: ");
                l1=teclado.nextDouble();
                System.out.println("Ingrese Lado 2: ");
                l2=teclado.nextDouble();
                System.out.println("");
                System.out.println("La superficie del Cuadrado es: " + l1*l2); 
                    break;

                case 3:
                    System.out.println("*****   CALCULADOR DE SUP. DE UN CIRCULO   ********************");
                    System.out.println("");
                System.out.println("Ingrese Radio: ");
                radio1=teclado.nextDouble();
                System.out.println("");                
                System.out.println("La superficie del Circulo es: " + (3.14*(radio1*radio1))); 
                    break;
                    
                case 4:
                System.out.println("Salio del sistema");
                break;

                default:
                    System.out.println("Vuelva a elegir una opcion: ");
                    break;
            }
                        
        } while (opc != 4);
        

        
    }
    
}
    

