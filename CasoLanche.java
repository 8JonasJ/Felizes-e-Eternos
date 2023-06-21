/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.text;

/**
 *
 * @author JONAS PINHEIRO
 */
public class CasoLanche extends casoPrato{
    
   // Declarando os atributos principais do lanche
    private double paoDoceAbacateMaionese,paoDoceAbacateSalada,paoDoceQueijoteMaionese,paoDoceQueijoSalada,
                   paoSalgadoAbacateMaionese, paoSalgadoAbacateSalada, paoSalgadoQueijoMaionese, paoSalgadoQueijoSalada;
                
    public double getPaoDoceAbacateMaionese(){
        return paoDoceAbacateMaionese;
        
    }

    public void setPaoDoceAbacateMaionese(double paoDoceAbacateMaionese) {
        this.paoDoceAbacateMaionese = paoDoceAbacateMaionese;
    }

    public double getPaoDoceAbacateSalada() {
        return paoDoceAbacateSalada;
    }

    public void setPaoDoceAbacateSalada(double paoDoceAbacateSalada) {
        this.paoDoceAbacateSalada = paoDoceAbacateSalada;
    }

    public double getPaoDoceQueijoteMaionese() {
        return paoDoceQueijoteMaionese;
    }

    public void setPaoDoceQueijoteMaionese(double paoDoceQueijoteMaionese) {
        this.paoDoceQueijoteMaionese = paoDoceQueijoteMaionese;
    }

    public double getPaoDoceQueijoSalada() {
        return paoDoceQueijoSalada;
    }

    public void setPaoDoceQueijoSalada(double paoDoceQueijoSalada) {
        this.paoDoceQueijoSalada = paoDoceQueijoSalada;
    }

    public double getPaoSalgadoAbacateMaionese() {
        return paoSalgadoAbacateMaionese;
    }

    public void setPaoSalgadoAbacateMaionese(double paoSalgadoAbacateMaionese) {
        this.paoSalgadoAbacateMaionese = paoSalgadoAbacateMaionese;
    }

    public double getPaoSalgadoAbacateSalada() {
        return paoSalgadoAbacateSalada;
    }

    public void setPaoSalgadoAbacateSalada(double paoSalgadoAbacateSalada) {
        this.paoSalgadoAbacateSalada = paoSalgadoAbacateSalada;
    }

    public double getPaoSalgadoQueijoMaionese() {
        return paoSalgadoQueijoMaionese;
    }

    public void setPaoSalgadoQueijoMaionese(double paoSalgadoQueijoMaionese) {
        this.paoSalgadoQueijoMaionese = paoSalgadoQueijoMaionese;
    }

    public double getPaoSalgadoQueijoSalada() {
        return paoSalgadoQueijoSalada;
    }

    // gets & sets
    public void setPaoSalgadoQueijoSalada(double PaoSalgadoQueijoSalada) {
        this.paoSalgadoQueijoSalada = PaoSalgadoQueijoSalada;
    }

    // métodos para cada prato
    public double paoDoceAbacateMaionese() {
        pesar();
        double lanche = getPeso()*90;
        setPaoDoceAbacateMaionese(lanche);      
        return getPaoDoceAbacateMaionese();
    }
    
    public double paoDoceAbacateSalada(){
        pesar();
        double lanche = getPeso()*90;
        setPaoDoceAbacateSalada(lanche);      
        return getPaoDoceAbacateSalada();
    
    }
    
    public double paoDoceQueijoteMaionese(){
        pesar();
        double lanche = getPeso()*90;
        setPaoDoceQueijoteMaionese(lanche);      
        return getPaoDoceQueijoteMaionese();
    } 
    
    public double paoDoceQueijoSalada(){
        pesar();
        double lanche = getPeso()*90;
        setPaoDoceQueijoSalada(lanche);      
        return getPaoDoceQueijoSalada();
    }
    
    public double paoSalgadoAbacateMaionese(){
        pesar();
        double lanche = getPeso()*90;
        setPaoSalgadoAbacateMaionese(lanche);      
        return getPaoSalgadoAbacateMaionese();
    
    
    }
    
    public double paoSalgadoAbacateSalada(){
        pesar();
        double lanche = getPeso()*90;
        setPaoSalgadoAbacateSalada(lanche);      
        return getPaoSalgadoAbacateSalada();
    
    }
 
    public double paoSalgadoQueijoMaionese(){
        pesar();
        double lanche = getPeso()*90;
        setPaoSalgadoQueijoMaionese(lanche);      
        return getPaoSalgadoQueijoMaionese();
    
    }

    public double paoSalgadoQueijoSalada(){
        pesar();
        double lanche = getPeso()*90;
        setPaoSalgadoQueijoSalada(lanche);      
        return getPaoSalgadoQueijoSalada();
    
    }

    
    
    
    public void cardapioLanche(){
            System.out.println("************LANCHE*********************");
            System.out.println(""
                    + "9 -------------- Lanche: Pão Doce + Abacate + Maionese\n"
                    + "10 -------------- Lanche: Pão Doce + Abacate + Salada\n"
                    + "11 -------------- Lanche: Pão Doce + Queijo + Maionese\n"
                    + "12 -------------- Lanche: Pão Doce + Queijo + Salada\n"
                    + "13 -------------- Lanche: Pão Salgado + Abacate + Maionese\n"
                    + "14 -------------- Lanche: Pão Salgado + Abacate + Salada\n"
                    + "15 -------------- Lanche: Pão Salgado + Queijo + Maionese\n"
                    + "16 -------------- Lanche: Pão Salgado + Queijo + Salada\n");
            
        }
    
}
