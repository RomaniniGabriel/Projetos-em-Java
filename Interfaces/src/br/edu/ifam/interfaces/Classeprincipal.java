package br.edu.ifam.interfaces;
import java.util.Scanner;
public class Classeprincipal {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String nomep;
        int idadep;
        
        Implementainterface pessoa1 = new Implementainterface();
        
        System.out.println("Digite o nome da pessoa: ");
        nomep=teclado.nextLine();
        pessoa1.setNome(nomep);
        
        System.out.println("Digite a idade da pessoa: ");
        idadep=teclado.nextInt();
        pessoa1.setIdade(idadep);
        
        System.out.println(pessoa1.getNome() + ", " + pessoa1.getIdade() + ", e a pessoa 1.");
        
        pessoa1.estudar();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
