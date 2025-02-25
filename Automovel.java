
package uscs;

public class Automovel{
    String modelo;
    int kilometragem;
    String cor;
    float valor;
    
    Automovel(){
           
    }
    
    Automovel(String modelo, int kilometragem, String cor, float valor){
        this.modelo = modelo;
        this.kilometragem = kilometragem;
        this.cor = cor;
        this.valor = valor;
                
    }
    
    void ligar(){
        System.out.println("Dando partida...");  
    }
    
    void acelerar(){
        System.out.println("Acelerando");
    }
    void desc(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Kilometragem: " + kilometragem + "Km");
        System.out.println("Cor: " + cor);
        System.out.println("valor: " + valor);
    }
   }
