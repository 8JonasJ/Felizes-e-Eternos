/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.text;

import java.util.Scanner;

import com.mycompany.text.db.SourceDB;

/**
 *
 * @author JONAS PINHEIRO
 */
public class Text {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Estudo_do_Caso0 caso1 = new Estudo_do_Caso0();
        CasoVenda venda = new CasoVenda(caso1.cadastrado(), caso1.pago(), caso1.valorReceber());

        // Cliente
        caso1.cadastramento();
        caso1.cadastrado();
        caso1.cardapio();
        caso1.fazerPedido();
        if (caso1.condicionarPedido() == 1) {
            caso1.continuar();
          if(caso1.pedir()>0){
            if (caso1.avaliarContinuar() > 0) {
                caso1.fazerPagamento();
                caso1.pago();
                caso1.valorReceber();
   

                // Vendedor
                if (caso1.situacaoPagamento() == 1) {
                    System.out.println("==================Tela do Vendedor======================\n");
                    System.out.printf("Nome do cliente: %s%n Valor Pago: $%.2f %n Troco: $%.2f %n%n",
                            caso1.cadastrado(), caso1.pago(), caso1.valorReceber());
                }

                // Cliente
                if (caso1.situacaoPagamento() == 1) {
                    System.out.println("==================Tela do Cliente======================\n");
                    System.out.println("----Factura----\n");
                    System.out.println("Nome: " + caso1.cadastrado());
                    caso1.situacao();
                    System.out.println(" Valor Pago: " + caso1.pago());
                    System.out.println(" troco: " + caso1.valorReceber());

                }

            }

          } else 
              System.out.println(" Valor inválido, Volte sempre ");
        }

    }

}
