/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.text;

/**
 *
 * @author JONAS PINHEIRO
 */
public class CasoPizzaSimples extends casoPrato {
    
    
    // Declarando os atributos Principais
    private double pizzaSimples, brancoFrangoChocolate, brancoFrangoMorango, brancoSalsichaChocolate, brancoSalsichaMorango,
                   tomateFrangoChocolate,  tomateFrangoMorango,  tomateSalichaChocolate,  tomateSalsichaMorango;
                 
    
    
    // gets & sets

    public double getPizzaSimples() {
        return pizzaSimples;
    }

    public void setPizzaSimples(double pizzaSimples) {
        this.pizzaSimples = pizzaSimples;
    }

    public double getBrancoFrangoChocolate() {
        return brancoFrangoChocolate;
    }

    public void setBrancoFrangoChocolate(double brancoFrangoChocolate) {
        this.brancoFrangoChocolate = brancoFrangoChocolate;
    }

    public double getBrancoFrangoMorango() {
        return brancoFrangoMorango;
    }

    public void setBrancoFrangoMorango(double brancoFrangoMorango) {
        this.brancoFrangoMorango = brancoFrangoMorango;
    }

    public double getBrancoSalsichaChocolate() {
        return brancoSalsichaChocolate;
    }

    public void setBrancoSalsichaChocolate(double brancoSalsichaChocolate) {
        this.brancoSalsichaChocolate = brancoSalsichaChocolate;
    }

    public double getBrancoSalsichaMorango() {
        return brancoSalsichaMorango;
    }

    public void setBrancoSalsichaMorango(double brancoSalsichaMorango) {
        this.brancoSalsichaMorango = brancoSalsichaMorango;
    }

    public double getTomateFrangoChocolate() {
        return tomateFrangoChocolate;
    }

    public void setTomateFrangoChocolate(double tomateFrangoChocolate) {
        this.tomateFrangoChocolate = tomateFrangoChocolate;
    }

    public double getTomateFrangoMorango() {
        return tomateFrangoMorango;
    }

    public void setTomateFrangoMorango(double tomateFrangoMorango) {
        this.tomateFrangoMorango = tomateFrangoMorango;
    }

    public double getTomateSalichaChocolate() {
        return tomateSalichaChocolate;
    }

    public void setTomateSalichaChocolate(double tomateSalichaChocolate) {
        this.tomateSalichaChocolate = tomateSalichaChocolate;
    }

    public double getTomateSalsichaMorango() {
        return tomateSalsichaMorango;
    }

    public void setTomateSalsichaMorango(double tomateSalsichaMorango) {
        this.tomateSalsichaMorango = tomateSalsichaMorango;
    }
    
    
    // Calculo do preço das pizzas
    
   
    
    public double pizzaSimples(){
        pesar();
        double pizza = getPeso()*50;
        setPizzaSimples(pizza);      
        return getPizzaSimples();
    }
    public double brancoFrangoChocolate(){
        pesar();
        double pizza = getPeso()*60;
        setBrancoFrangoChocolate(pizza);      
        return getBrancoFrangoChocolate();
    }
    
        public double brancoFrangoMorango(){
        pesar();
        double pizza = getPeso()*70;
        setBrancoFrangoMorango(pizza);      
        return getBrancoFrangoMorango();
    }
        
        public double brancoSalsichaChocolate(){
        pesar();
        double pizza = getPeso()*80;
        setBrancoSalsichaChocolate(pizza);      
        return getBrancoSalsichaChocolate();
    }
        public double brancoSalsichaMorango(){
        pesar();
        double pizza = getPeso()*90;
        setBrancoSalsichaMorango(pizza);      
        return getBrancoSalsichaMorango();
    }
       
        public double tomateFrangoChocolate(){
        pesar();
            double pizza = getPeso()*100;
            setTomateFrangoChocolate(pizza);      
            return getTomateFrangoChocolate();
    }
        public double tomateFrangoMorango(){
        pesar();
        double pizza = getPeso()*110;
        setTomateFrangoMorango(pizza);      
        return getTomateFrangoMorango();
    }
        
        public double tomateSalichaChocolate(){
        pesar();
        double pizza = getPeso()*110;
        setTomateSalichaChocolate(pizza);      
        return getTomateSalichaChocolate();
    }
        
        public double tomateSalsichaMorango(){
        pesar();
        double pizza = getPeso()*110;
        setTomateSalsichaMorango(pizza);      
        return getTomateSalsichaMorango();
    }
        
        
        public void pizzaComposto(){
            System.out.println("Escolha a composição:\n"
                    + "");
        }
        
        public void cardapioPizza(){
            System.out.println("************PIZZA*********************");
            System.out.println(""
                    + "0 -------------- PIZZA Simples\n"
                    + "1 -------------- PIZZA: Molho Branco + Recheio de Frango + Cobertura de Chocolate\n"
                    + "2 -------------- PIZZA: Molho Branco + Recheio de Frango + Cobertura de Morango\n"
                    + "3 -------------- PIZZA: Molho Branco + Recheio de Salsicha + Cobertura de Chocolate\n"
                    + "4 -------------- PIZZA: Molho Branco + Recheio de Salsicha + Cobertura de Morango\n"
                    + "5 -------------- PIZZA: Molho de Tomate + Recheio de Frango + Cobertura de Chocolate\n"
                    + "6 -------------- PIZZA: Molho de Tomate + Recheio de Frango + Cobertura de Morango\n"
                    + "7 -------------- PIZZA: Molho de Tomate + Recheio de Salsicha + Cobertura de Chocolate\n"
                    + "8 -------------- PIZZA: Molho de Tomate + Recheio de Salsicha + Cobertura de Morango\n");
            
        }
    
}
