package uscs;

public class Mamifero {
   String nome;
   float peso;
   int idade;
   String sexo;
   
   void correr(float distancia){
       System.out.println("Corrido: " + distancia + " mts");
       
   }
   
   void dormir(int horas){
       System.out.println("Dormiu: " + horas + " horas");
   
   }
   Mamifero(){
  
   }
   Mamifero(String nome, float peso, int idade, String sexo){
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.sexo = sexo;
        
   }  
   
   void carac(){
       System.out.println("Nome: " + nome);
       System.out.println("Peso: " + peso + "Kg");
       System.out.println("Idade: " + idade + " anos");
       System.out.println("Sexo: " + sexo);
   }
   
    
}
