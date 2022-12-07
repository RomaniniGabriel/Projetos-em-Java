package br.edu.ifam.polimorfismo;
public class Pessoa {
    
    private String nome;
    
    public void setNome(String nome){
        this. nome= nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void mostraClasse(){
        System.out.println("Classe Pessoa");
    }
}


/*polimorfismo é um mesmo objeto que possui comportamentos diferentes a depender
da classe em que ele está inserido.
*/