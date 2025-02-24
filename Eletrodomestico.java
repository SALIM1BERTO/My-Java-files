
package uscs;

public class Eletrodomestico{
    
    //atributos
    int ano;
    String modelo;
    float valor;
    String cor;
    
    //metodo 
    
    public Eletrodomestico(){
           
    } 
    public Eletrodomestico(int ano, String modelo, float valor, String cor){
           this.ano = ano;
           this.cor = cor;
           this.modelo = modelo;
           this.valor = valor;
    }  
     
    public void ligar(){
        System.out.println("Ligando...");
    }
    public void desligar(){
        System.out.println("Desligando...");
    }
    public void descricao(){
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Valor: " + valor);
    }
    
}