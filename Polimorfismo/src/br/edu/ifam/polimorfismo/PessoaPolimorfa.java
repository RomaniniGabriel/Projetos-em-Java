package br.edu.ifam.polimorfismo;
import java.util.Scanner;
public class PessoaPolimorfa {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Pessoa p1 = null;
        int tipo;
        
        System.out.println("Digite um número de 1 a 4: ");
        tipo = teclado.nextInt();
        
        switch (tipo){
            
            case 1:
                    p1 = new Pessoa(); break;
            case 2:
                p1 = new PessoaFisica(); break;
            case 3: 
                p1 = new PessoaJuridica(); break;
            case 4:
                p1 = new Funcionario(); break;
                default:{
                        System.out.println("Tipo desconhecido.");
                        System.exit(0); //Encerra a execução da classe.
                }
        }
        
        p1.mostraClasse(); //Sobrecarga de métodos.
        
    }
}


//Não se esqueça de clicar com o botão direito e executar apenas esse arquivo
//para evitar rodar a outra classe principal.