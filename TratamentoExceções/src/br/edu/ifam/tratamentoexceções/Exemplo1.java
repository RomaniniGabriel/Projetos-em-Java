package br.edu.ifam.tratamentoexceções;

import java.util.Scanner;

public class Exemplo1 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        try {   //Tudo que deve funcionar precisa estar dentro do try, inclusive a declaração da variável numero.
            int numero;
            System.out.println("Digite um numero inteiro: ");
            numero = leitor.nextInt();
            
            System.out.println("O numero digitado foi: " + numero);
            
        } catch (Exception erro){     //aquilo que deve ocorrer caso ocorra uma exceção fica dentro do catch.
            
            System.out.println("O valor digitado nao e um numero inteiro.");
            
        }
    }
}

/*Excepiton (linha 18) é uma classe que vem junto da linguagem Java. Ela vem embutida.
Essa classe vai tratar milhares de exceções dentro do código.
A cláusula "erro" foi um nome dado por mim. O importante é que essa cláusula transformará
as mensagens de erro do próprio Java na mensagem que eu escrevi (linha20).
*/