/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ventaropa;

import java.util.Scanner;

/**
 *
 * @author malvarez
 */
public class VentaRopa {

    public static void main(String[] args) {
        System.out.println("Tienda de Ropa");
        int contador = 0;

        String usuario;
        String password;
        int intentos=0;
        Scanner lector = new Scanner(System.in);
        int opc;
        int opc2;
        int cant=0;
        double precio1=15000;
        double envio=1000;
        double p2=1500;
        double p3=6000;
        double p4=5500;
        double p5=660;
        
        do {
            System.out.println("*****  Autenticacion de Usuario ******");
            System.out.print("Ingrese usuario: ");
            usuario = lector.next();
            System.out.print("Ingrese password: ");
            password = lector.next();
          
            if(!(usuario.equals("mati") && password.equals("kapo"))){
                System.out.println("Ususario o contrasenia incorrectos, intentelo nuevamente");
                intentos++;
            }else{
                System.out.println("Bienvenido!!");
                break;
            }            
        } while(intentos < 3);

        if(intentos == 3){
            System.out.println("Usuario Bloqueado");
        }else{
            System.out.println("Sigo con el programa");
            do{
            System.out.println("*******Venta de articulos***********");
            System.out.println("");
            System.out.println("Seleccione el numero del Producto que desea: ");
            System.out.println("");
            System.out.println("");
            System.out.println("1 - CAMPERAS");
            System.out.println("2 - REMERAS");
            System.out.println("3 - PANTALONES");
            System.out.println("4 - MEDIAS");
            System.out.println("5 - ***** SALIR ******");
            System.out.println("");
            System.out.println("Ingrese su opcion: ");
            opc = lector.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("********  CAMPERAS  ********");
                    System.out.println("");
                    System.out.println("El precio por unidad es: " + precio1 + "$");
                    System.out.println("");
                    System.out.println("Ingrese cantidad: ");
                    cant=lector.nextInt();
                    System.out.println("La cantidad a llevar es: " + cant);
                    System.out.println("");
                    System.out.println("El precio de la campera por unidad es de: " + (precio1*cant) + "$");
                    System.out.println("1 - Retiro por sucursal");
                    System.out.println("2 - Envio a domicilio " + envio + "$");
                    System.out.println("");
                    System.out.println("Ingrese opcion: ");
                    opc2 = lector.nextInt();
                    if(opc2 == 2){
                        System.out.println("El monto a pagar con envio es: " + ((precio1*cant)+envio));
                        System.out.println("");
                    }else{
                        System.out.println("El monto total es:" + (precio1*cant) + "$");
                        System.out.println("");
                    }                   
                                       
                            
                                              
                    break;
                
                case 2:
                    System.out.println("********  REMERAS  ********");                    
                    System.out.println("");
                    System.out.println("El precio por unidad es: " + p4 + "$");
                    System.out.println("");
                    System.out.println("Ingrese cantidad: ");
                    cant=lector.nextInt();
                    System.out.println("El precio de las Remeras es de: " + (p4*cant) + "$");
                    System.out.println("1 - Retiro por sucursal");
                    System.out.println("2 - Envio a domicilio es: " + envio + "$");
                    System.out.println("");
                    System.out.println("Ingrese opcion: ");
                    opc2 = lector.nextInt();
                    if(opc2 == 2){
                        System.out.println("El monto a pagar con envio es: " + ((p4*cant)+envio));
                        System.out.println("");
                    }else{
                        System.out.println("El monto total es: " + (p4*cant) + "$");
                        System.out.println("");
                    }
                    
                    break;
                    
                case 3:
                    System.out.println("*******  PANTALONES  ********");
                    System.out.println("");
                    System.out.println("El precio por unidad es: " + p3 + "$");
                    System.out.println("");
                    System.out.println("Ingrese cantidad: ");
                    cant=lector.nextInt();
                    System.out.println("El precio de los Pantalones es de: " + (p3*cant) + "$");
                    System.out.println("1 - Retiro por sucursal");
                    System.out.println("2 - Envio a domicilio es: " + envio + "$");
                    System.out.println("");
                    System.out.println("Ingrese opcion: ");
                    opc2 = lector.nextInt();
                    if(opc2 == 2){
                        System.out.println("El monto a pagar con envio es: " + ((p3*cant)+envio + "$"));
                        System.out.println("");
                    }else{
                        System.out.println("El monto total es:" + p3);
                        System.out.println("");
                    }
                    
                    break;
                    
                case 4:
                    System.out.println("*********  MEDIAS  *********");
                    System.out.println("");
                    System.out.println("El precio por unidad es: " + p5 + "$");
                    System.out.println("");
                    System.out.println("Ingrese cantidad: ");
                    cant=lector.nextInt();
                    System.out.println("");
                    System.out.println("El precio de la Medias es de: " + (p5*cant) + "$");
                    System.out.println("1 - Retiro por sucursal");
                    System.out.println("2 - Envio a domicilio es: " + envio + "$");
                    System.out.println("");
                    System.out.println("Ingrese opcion: ");
                    opc2 = lector.nextInt();
                    if(opc2 == 2){
                        System.out.println("El monto a pagar con envio es: " + ((p5*cant)+envio + "$"));
                        System.out.println("");
                    }else{
                        System.out.println("El monto total es:" + p5);
                        System.out.println("");
                    }
                    
                    break;
                    
                case 5:
                    System.out.println("******  Salio del sistema  ********");
                    System.out.println("");
                    break;
                    
                default:
                     System.out.println("Vuelva a elegir una opcion: ");
                     break;
                     
            }                   

            
                 
        }while(opc != 5);
        }         
    }
}
    
    

