package br.edu.ifam.tratamentoexceções;
import java.util.Scanner;

public class Exemplo2 {
    
    public static void main(String[] args) {
        
        Scanner leitor2 = new Scanner(System.in);
        
        try{
          int x;
            System.out.println("Digite um numero ate 100: ");
            x = leitor2.nextInt();
            
            if  (x>100){
                throw new Exception ("Numero maior que 100.");
            }
        } catch (Exception erro){
            System.out.println(erro.getMessage());
        }
    } 
}
