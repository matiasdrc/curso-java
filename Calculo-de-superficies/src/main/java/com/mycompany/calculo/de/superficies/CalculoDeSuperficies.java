/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculo.de.superficies;

import java.util.Scanner;

/**
 *
 * @author malvarez
 */
public class CalculoDeSuperficies {

    public static void main(String[] args) {
        
    int opc;
    double l1;
    double l2;       
    double radio1;        
    Scanner teclado = new Scanner(System.in);
        System.out.println("");
        System.out.println("1- TRIANGULO");
        System.out.println("2- CUADRADO");
        System.out.println("3- RECTANGULO");
        System.out.println("4- CIRCULO");
        System.out.println("5- SALIR");        
        System.out.println("");
        System.out.println("Ingrese su Figura:");
        System.out.println("");
        opc = teclado.nextInt();
        
        
        switch(opc){
             case 1:
                System.out.println("TRIANGULO");
                System.out.println("");
                System.out.println("Ingrese Base : ");
                l1=teclado.nextDouble();
                System.out.println("Ingrese Altura: ");
                l2=teclado.nextDouble();
                System.out.println("");
                System.out.println("La superficie del Triangulo es: " + ((l1*l2)/2));
                break;
            case 2:
                System.out.println("CUADRADO");
                System.out.println("");
                System.out.println("Ingrese Lado 1: ");
                l1=teclado.nextDouble();
                System.out.println("Ingrese Lado 2: ");
                l2=teclado.nextDouble();
                System.out.println("");
                System.out.println("La superficie del Cuadrado es: " + l1*l2);            
                break;
            case 3:
                System.out.println("RECTANGULO");
                System.out.println("");
                System.out.println("Ingrese Lado 1: ");
                l1=teclado.nextDouble();
                System.out.println("Ingrese Lado 2: ");
                l2=teclado.nextDouble();
                System.out.println("");
                System.out.println("La superficie del Rectangulo es: " + l1*l2); 
                
                
                break;
            case 4:
                System.out.println("Circulo");
                System.out.println("");
                System.out.println("Ingrese Radio: ");
                radio1=teclado.nextDouble();
                System.out.println("");                
                System.out.println("La superficie del Circulo es: " + (3.14*(radio1*radio1)));               
                    
                break;
            case 5:
                System.out.println("Salir");
                break;
                
            default:
                 System.out.println("Opcion ingresada invalida");
        
        }
        
    }
    
}
