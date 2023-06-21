/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.text;

/**
 *
 * @author JONAS PINHEIRO
 */
public class CasoVenda{

    private String nome;
    private double valorrecebido;
    private double troco;

    public CasoVenda(String nome, double valorrecebido, double troco) {
        this.nome = nome;
        this.valorrecebido = valorrecebido;
        this.troco = troco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorrecebido() {
        return valorrecebido;
    }

    public void setValorrecebido(double valorrecebido) {
        this.valorrecebido = valorrecebido;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }
    
    
    
    


    
}
