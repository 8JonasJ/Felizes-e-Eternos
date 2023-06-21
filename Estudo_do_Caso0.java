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

// Cliente
public class Estudo_do_Caso0{
    
    Scanner scanner = new Scanner(System.in);
     private int pizzaS;
     private int pizzaM;
     private double preco;
     private double pagar;
     private String nome;
     private double valorPago;
     private int resultado;
     private int condicionarPedido;

    public int getCondicionarPedido() {
        return condicionarPedido;
    }

    public void setCondicionarPedido(int condicionarPedido) {
        this.condicionarPedido = condicionarPedido;
    }
     

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPizzaS() {
        return pizzaS;
    }

    public void setPizzaS(int pizzaS) {
        this.pizzaS = pizzaS;
    }

    public int getPizzaM() {
        return pizzaM;
    }

    public void setPizzaM(int pizzaM) {
        this.pizzaM = pizzaM;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPagar() {
        return pagar;
    }

    public void setPagar(double pagar) {
        this.pagar = pagar;
    }
//===============================================================================================
    
    public String cadastramento(){
        System.out.println(" Digite seu nome:");
        String nome = scanner.nextLine();
        setNome(nome);
        //cardapio();
        return getNome();
        
    }
    public String cadastrado(){
        String nome = getNome();
        
        return nome;
    }
    
    CasoPizzaSimples pizza = new CasoPizzaSimples();
    CasoLanche lanche = new CasoLanche();
    CasoSalgadinho salgadinho = new CasoSalgadinho();
    public void cardapio(){
        pizza.cardapioPizza();
        lanche.cardapioLanche(); 
        salgadinho.cardapioSalgadinho();
    }
    
    public int fazerPedido(){
        System.out.println(" Digite 1 para fazer pedido e 0 para sair");
        int pedido=scanner.nextInt();
        setCondicionarPedido(pedido);
        if(pedido==1){
            setCondicionarPedido(pedido);
            pedir();
        }
        else if(pedido==0 || pedido!=1)
            System.out.println("Volte Sempre");
            setCondicionarPedido(pedido);
            
        return getCondicionarPedido();
            
    }
    
    public int condicionarPedido(){
        int pedido = getCondicionarPedido();
        return pedido;
    }


       
       public double pedir(){
        CasoPizzaSimples pizzaS = new CasoPizzaSimples();
        double[] precoG = new double[24];
           
         //int valor;
        System.out.println("digite a quantidade de prato");
            int qt=scanner.nextInt();
            for(int i=0; i<qt; i++){
                
              //for(int i=0; i<precoG.length; i++){  
               
                System.out.println(" escolha o prato: ");
                int prato=scanner.nextInt();
                switch(prato){
                    case 0:
                        precoG[0]=pizza.pizzaSimples();
                        pizza.setPizzaSimples(precoG[0]);
                        break;
                    case 1:
                        precoG[1]=pizza.brancoFrangoChocolate();
                        pizza.setBrancoFrangoChocolate(precoG[1]);
                        break;
                    case 2:
                        precoG[2]=pizza.brancoFrangoMorango();
                        pizza.setBrancoFrangoMorango(precoG[2]);
                        break;
                    case 3:
                        precoG[3]=pizza.brancoSalsichaChocolate();
                        pizza.setBrancoSalsichaChocolate(precoG[3]);
                        break;
                    case 4:
                        precoG[4]=pizza.brancoSalsichaMorango();
                        pizza.setBrancoSalsichaMorango(precoG[4]);
                        break;
                    case 5:
                        precoG[5]=pizza.tomateFrangoChocolate();
                        pizza.setTomateFrangoChocolate(precoG[5]);
                        break;
                    case 6:
                        precoG[6]=pizza.tomateFrangoMorango();
                        pizza.setTomateFrangoMorango(precoG[6]);
                        break;
                    case 7:
                        precoG[7]=pizza.tomateSalichaChocolate();
                        pizza.setTomateSalichaChocolate(precoG[7]);
                        break;
                    case 8:
                        precoG[8]=pizza.tomateSalsichaMorango();
                        pizza.setTomateSalsichaMorango(precoG[8]);
                        break;
                    case 9:
                        precoG[9]=lanche.paoDoceAbacateMaionese();
                        lanche.setPaoDoceAbacateMaionese(precoG[9]);
                        break;
                    case 10:                        
                        precoG[10]=lanche.paoDoceAbacateSalada();
                        lanche.setPaoDoceAbacateSalada(precoG[10]);
                        break;
                    case 11:                        
                        precoG[11]=lanche.paoDoceQueijoteMaionese();
                        lanche.setPaoDoceQueijoteMaionese(precoG[11]);
                        break;
                    case 12:                        
                        precoG[12]=lanche.paoDoceQueijoSalada();
                        lanche.setPaoDoceQueijoSalada(precoG[12]);
                        break;
                        
                    case 13:                     
                        precoG[13]=lanche.paoSalgadoAbacateMaionese();
                        lanche.setPaoSalgadoAbacateMaionese(precoG[13]);
                        break;
                    case 14:                      
                        precoG[14]=lanche.paoSalgadoAbacateSalada();
                        lanche.setPaoSalgadoAbacateSalada(precoG[14]);
                        break;
                    case 15:                     
                        precoG[15]=lanche.paoSalgadoQueijoMaionese();
                        lanche.setPaoSalgadoQueijoMaionese(precoG[15]);
                        break;
                    case 16:                     
                        precoG[16]=lanche.paoSalgadoQueijoSalada();
                        lanche.setPaoSalgadoQueijoSalada(precoG[16]);
                        break;
                    case 17:                    
                        precoG[17]=salgadinho.fritoFinaMaionese();
                        salgadinho.setFritoFinaMaionese(precoG[17]);
                        break;
                    case 18:                    
                        precoG[18]=salgadinho.fritoGrossaMaionese();
                        salgadinho.setFritoGrossaMaionese(precoG[18]);
                        break;
                    case 19:                    
                        precoG[19]=salgadinho.assadoFinaMaionese();
                        salgadinho.setAssadoFinaMaionese(precoG[19]);
                        break;
                        
                    case 20:                  
                        precoG[20]=salgadinho.assadoGrossaMaionese();
                        salgadinho.setAssadoGrossaMaionese(precoG[20]);
                        break;

                   
                    default:
                        System.out.println(" Opção inválida! \n Tente novamente");
                        break;
                }
              //}
              
        }
            System.out.printf("%s-----%s%n", "Prato", "Preço");
            double total=0;
            for(int i=0; i<precoG.length; i++){
                if((precoG[i]>0)){
                    System.out.printf("   %d ---- %.2f%n", i, precoG[i]);
                    
                    //double molho = precoG[1];
                    //setPizzaMolho1(molho);
                    
                    total= total+precoG[i];
                    setPreco(total);
                }
                
            }
            System.out.printf("%s-----%.2f%n", "Total", getPreco());
           return getPreco();
        
      }
       
       public void situacao(){
            
            System.out.println("***Itens Consumido***");
            double[] item = new double[]{
                pizza.getPizzaSimples(),pizza.getBrancoFrangoChocolate(),
                pizza.getBrancoFrangoMorango(),pizza.getBrancoSalsichaChocolate(),
                pizza.getBrancoSalsichaMorango(),pizza.getTomateFrangoChocolate(),
                pizza.getTomateFrangoMorango(),pizza.getTomateSalichaChocolate(),
                pizza.getTomateSalsichaMorango(),lanche.getPaoDoceAbacateMaionese(),
                lanche.getPaoDoceAbacateSalada(),lanche.getPaoDoceQueijoteMaionese(),
                lanche.getPaoDoceQueijoSalada(), lanche.getPaoSalgadoAbacateMaionese(),
                lanche.getPaoSalgadoAbacateSalada(),lanche.getPaoSalgadoQueijoMaionese(),
                lanche.getPaoSalgadoQueijoSalada(),salgadinho.getFritoFinaMaionese(),
                salgadinho.getFritoGrossaMaionese(),salgadinho.getAssadoFinaMaionese(),
                salgadinho.getAssadoGrossaMaionese()};
            
            for(int i=0; i<item.length; i++){
                if(item[i]>0){
                    System.out.printf("   %d ---- %.2f%n", i, item[i]);
                }
            }
            System.out.printf("%s-----%.2f%n", "Total", getPreco());
       }
       
       public double continuar(){
          
           System.out.println("Digite -1- para efetuar o pagamento pelo aplicativo"
                   + ""
                   + " e -0- para sair");
           int resultado=scanner.nextInt();
           switch(resultado){
               case 1: 
                   System.out.println("Insire o valor");
                   double valorPago =scanner.nextDouble();
                   setPagar(valorPago);
                   break;   
               case 0: 
                    valorPago = -1;
                   setPagar(valorPago);
                   System.out.println("Volte Sempre");
                   break;
               default:
                   System.out.println(" Opção inválida! ");
                   break;
               
           }
           return getPagar();
       }
       
       public int avaliarContinuar(){
           int situacao = (int) getPagar();
           return situacao;
       }
       
       public double pago(){
             
             double totalPago = getPagar();
             setValorPago(totalPago);
              return getValorPago();
  
       }
       

            public double valorReceber(){
                double troco = getValorPago() - getPreco();
                return troco;
            }
       
       
       public int fazerPagamento(){
            int resultado;
            pago();

                   if(getValorPago()>=getPreco()){
                   
                   System.out.println("pagamento feito com sucesso");
                   resultado =1;
                   setResultado(resultado);
                   
                   }
                   else {
                       System.out.println(" Valor a baixo do pedido \n Reajuste");
                       resultado=0;
                       setResultado(resultado);
                   
                   } 
                   return getResultado();

           }

        public int situacaoPagamento(){
            int situacaoP = getResultado();
              return situacaoP;
            
        }
           
            
       
       
       
     
      
     
}
