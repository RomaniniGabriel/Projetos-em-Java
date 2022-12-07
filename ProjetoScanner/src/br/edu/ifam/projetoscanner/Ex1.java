package br.edu.ifam.projetoscanner;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String nomeEstudante; // nome de variável = primeira letra minúscula.
        System.out.println("Digite seu nome: ");
        nomeEstudante = teclado.nextLine();
        
        System.out.println("O nome digitado foi: " + nomeEstudante);
        
        int idade;
        System.out.println("Digite sua idade, em números: ");
        idade = teclado.nextInt();
        
        System.out.println("O nome digitado foi: " + idade);
    }
    
}
