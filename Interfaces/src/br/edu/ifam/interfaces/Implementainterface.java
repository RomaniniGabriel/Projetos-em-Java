package br.edu.ifam.interfaces;
public class Implementainterface extends Pessoa implements Aluno, Funcionario{
    
    @Override
    public void ler(){
        System.out.println("O aluno esta lendo.");
    }
    
    @Override
    public void estudar(){
        System.out.println("O aluno esta estudando.");
    }
    
    @Override
    public void trabalhar(){
        System.out.println("O funcionario esta trabalhando.");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
