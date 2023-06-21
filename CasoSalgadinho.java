/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.text;

/**
 *
 * @author JONAS PINHEIRO
 */
public class CasoSalgadinho extends casoPrato{
    
    
   private double fritoFinaMaionese, fritoGrossaMaionese,assadoFinaMaionese, assadoGrossaMaionese;

    public double getFritoFinaMaionese() {
        return fritoFinaMaionese;
    }

    public void setFritoFinaMaionese(double fritoFinaMaionese) {
        this.fritoFinaMaionese = fritoFinaMaionese;
    }

    public double getFritoGrossaMaionese() {
        return fritoGrossaMaionese;
    }

    public void setFritoGrossaMaionese(double fritoGrossaMaionese) {
        this.fritoGrossaMaionese = fritoGrossaMaionese;
    }

    public double getAssadoFinaMaionese() {
        return assadoFinaMaionese;
    }

    public void setAssadoFinaMaionese(double AssadoFinaMaionese) {
        this.assadoFinaMaionese = AssadoFinaMaionese;
    }

    public double getAssadoGrossaMaionese() {
        return assadoGrossaMaionese;
    }

    public void setAssadoGrossaMaionese(double AssadoGrossaMaionese) {
        this.assadoGrossaMaionese = AssadoGrossaMaionese;
    }
   
    
    public double fritoFinaMaionese(){
        pesar();
        double salgadinho = getPeso()*90;
        setFritoFinaMaionese(salgadinho);      
        return getFritoFinaMaionese();
        
    }
            
            
            
    public double fritoGrossaMaionese(){
        pesar();
        double salgadinho = getPeso()*90;
        setFritoGrossaMaionese(salgadinho);      
        return getFritoGrossaMaionese();
    }
            
    public double assadoFinaMaionese(){
        pesar();
        double salgadinho = getPeso()*90;
        setAssadoFinaMaionese(salgadinho);      
        return getAssadoFinaMaionese();
    } 
    
            
    public double assadoGrossaMaionese(){
        pesar();
        double salgadinho = getPeso()*90;
        setAssadoGrossaMaionese(salgadinho);      
        return getAssadoGrossaMaionese();
    }
   
    

    
    public void cardapioSalgadinho(){
            System.out.println("************SALGADINHO*********************");
            System.out.println(""
                    + "17 -------------- SALGADINHO: Frito + Massa Fina + Maionese\n"
                    + "18 -------------- SALGADINHO: Frito + Massa Grossa + Maionese\n"
                    + "19 -------------- SALGADINHO: Assado + Massa Fina + Maionese\n"
                    + "20 -------------- SALGADINHO: Assado + Massa Grossa + maionese\n");
            
        }
    
}
