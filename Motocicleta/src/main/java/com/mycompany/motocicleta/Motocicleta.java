/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.motocicleta;

/**
 *
 * @author malvarez
 */
public class Motocicleta {

    public static void main(String[] args) {
        System.out.println("Voy a programar mis motos");
    }
    public void prender() {
        System.out.println("Prende el motor"); 
    }
    public void arrancar() {
        System.out.println("Arranca");
    }
    public void frena() {
        System.out.println("Frena");
    }
    public void apagar(){
        System.out.println("Apaga motor");
    }
    public void cargar(){
        System.out.println("Cargar nafta");
    }
}

Motocicleta yamaha=new Motocicleta();
