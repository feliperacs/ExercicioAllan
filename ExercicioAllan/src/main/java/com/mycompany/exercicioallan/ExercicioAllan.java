/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioallan;

/**
 *
 * @author andif
 */
public class ExercicioAllan {

    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta(50);
        System.out.println("Estado inicial da bicicleta ");             
        bicicleta.ImprimirEstado();
        bicicleta.Acelerar();
        bicicleta.Acelerar();
        bicicleta.Acelerar();
        bicicleta.Acelerar();
        bicicleta.Acelerar();
     
        System.out.println("Apos um pequeno embalo: ");
        bicicleta.ImprimirEstado();
        bicicleta.Frear();
        System.out.println("Apos uma freada: ");
        bicicleta.ImprimirEstado();
    }
}
