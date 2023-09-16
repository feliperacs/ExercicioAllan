/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioallan;

/**
 *
 * @author andif
 */
public class Bicicleta extends ExercicioAllan {
    private int velocidade, marcha; 
    private int velocidademaxima;

    public int getVelocidademaxima() {
        return velocidademaxima;
    }

    public void setVelocidademaxima(int velocidademaxima) {
        this.velocidademaxima = velocidademaxima;
    }
    public Bicicleta(int velocidademaxima){
        this.velocidade=0;
        this.marcha=0;
        this.velocidademaxima=velocidademaxima;
    }
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
    
    public void Acelerar(){
        if (marcha < 5){
            marcha++;
            if(velocidade+10<=velocidademaxima){
                velocidade+=10;  
        }else{
                System.out.println("velocidade maxima alcancada");
    }
        }
    }
    public void Frear(){
        if (velocidade > 0){
            marcha--;
            velocidade -= 10;
        }else{
            System.out.println("bicicleta esta no ponto morto");
    }
    }
    public void ImprimirEstado(){   
        System.out.println("marcha = "+marcha);
        System.out.println("velocidade = "+velocidade);
        System.out.println("velocidade maxima: "+velocidademaxima);
      
        
        
        
        
    }
}
