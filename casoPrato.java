/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.text;
import java.util.Scanner;
/**
 *
 * @author JONAS PINHEIRO
 */
public class casoPrato {
    
    private float peso;
    protected double recheio;

    public double getRecheio() {
        return recheio;
    }

    public void setRecheio(double recheio) {
        this.recheio = recheio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    // Peso
    
    public float pesar(){
        Scanner scanner=new Scanner(System.in);
        System.out.println( "Escolha o peso no intervalo de 5 a 800g \n");
        int tipoPeso = scanner.nextInt();
        if(tipoPeso>=5 && tipoPeso<=800){
        peso = tipoPeso; 
        setPeso(peso);
        } 
        else{
            System.out.println("Valor Invalido, Reajuste por favor");
            tipoPeso=0;
            peso=tipoPeso;
            setPeso(peso);
        }
        return peso;
    }
    
}
