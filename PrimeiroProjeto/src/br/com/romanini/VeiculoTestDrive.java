package br.com.romanini;
import java.util.Scanner;
/**
 *
 * @author Gabriel Romanini A. Monteiro
 */
public class VeiculoTestDrive {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        Carro fox = new Carro(); //Carro 1, veículo 1 
        
        String cor;
        String marca;
        String modelo;
        int qtPax;
        int qtPortas;
        int qtRodas;
        int qtLitrosCombustivel;
        
        System.out.println("Digite a cor do veiculo a ser criado: ");
        cor = teclado.nextLine();
        fox.setCor(cor);
        
        System.out.println("Digite a marca do veiculo: ");
        marca = teclado.nextLine();
        fox.setMarca(marca);
        
        System.out.println("Digite qual e o modelo do veiculo: ");
        modelo = teclado.nextLine();
        fox.setModelo(modelo);
        
        System.out.println("Quantos passageiros o veiculo carregara? ");
        qtPax = teclado.nextInt();
        fox.setQtPax(qtPax);
        
        System.out.println("Digite a quantidade de portas do veiculo em questao: ");
        qtPortas = teclado.nextInt();
        fox.setQtPortas(qtPortas);
        
        System.out.println("A quantidade atual de combustivel e: " + fox.getQtLitrosCombustivel());
        System.out.println("Digite quantos litros de combustivel serao colocados: ");
        qtLitrosCombustivel = teclado.nextInt();
        fox.setQtLitrosCombustivel(qtLitrosCombustivel);
        
        System.out.println("  ");
        
        System.out.println("A cor do veiculo e: " + fox.getCor());
        System.out.println("O modelo do veiculo e: " + fox.getModelo() + ", modelo exclusivo da marca " + fox.getMarca());
        System.out.println("A marca do veiculo e: " + fox.getMarca());
        System.out.println("O veiculo " + fox.getModelo() + " transporta " + fox.getQtPax() + " passageiros.");
        System.out.println("A quantidade de portas do veiculo e: " + fox.getQtPortas());
        
        fox.estadoLigar();
        
        System.out.println("Quantidade atual de combustivel: " + fox.getQtLitrosCombustivel());
      
        System.out.println("  ");
        
        Carro spin = new Carro(); //Carro 2, veículo 2 
        
        teclado.nextLine();
        
        System.out.println("Digite a cor do veiculo a ser criado: ");
        cor = teclado.nextLine();
        spin.setCor(cor);
        
        System.out.println("Digite a marca do veiculo: ");
        marca = teclado.nextLine();
        spin.setMarca(marca);
        
        System.out.println("Digite qual e o modelo do veiculo: ");
        modelo = teclado.nextLine();
        spin.setModelo(modelo);
        
        System.out.println("Quantos passageiros o veiculo carregara? ");
        qtPax = teclado.nextInt();
        spin.setQtPax(qtPax);
        
        System.out.println("Digite a quantidade de portas do veiculo em questao: ");
        qtPortas = teclado.nextInt();
        spin.setQtPortas(qtPortas);
                
        System.out.println("A quantidade atual de combustivel e: " + spin.getQtLitrosCombustivel());
        System.out.println("Digite quantos litros de combustivel serao colocados: ");
        qtLitrosCombustivel = teclado.nextInt();
        spin.setQtLitrosCombustivel(qtLitrosCombustivel);
        
        System.out.println("  ");
        
        System.out.println("A cor do veiculo e: " + fox.getCor());
        System.out.println("O modelo do veiculo e: " + fox.getModelo() + ", modelo exclusivo da marca " + fox.getMarca());
        System.out.println("A marca do veiculo e: " + fox.getMarca());
        System.out.println("O veiculo " + fox.getModelo() + " transporta " + fox.getQtPax() + " passageiros.");
        System.out.println("A quantidade de portas do veiculo e: " + fox.getQtPortas());
        
        spin.estadoLigar();
        
        System.out.println("Quantidade atual de combustivel: " + spin.getQtLitrosCombustivel());
        
        System.out.println("  ");
        
        Motocicleta nc750x = new Motocicleta(); //Moto 1, veículo 3
        
        teclado.nextLine();
        
        System.out.println("Digite a cor do veiculo a ser criado: ");
        cor = teclado.nextLine();
        nc750x.setCor(cor);
        
        System.out.println("Digite a marca do veiculo: ");
        marca = teclado.nextLine();
        nc750x.setMarca(marca);
        
        System.out.println("Digite qual e o modelo do veiculo: ");
        modelo = teclado.nextLine();
        nc750x.setModelo(modelo);
        
        System.out.println("Quantos passageiros o veiculo carregara? ");
        qtPax = teclado.nextInt();
        nc750x.setQtPax(qtPax);
        
        System.out.println("Digite a quantidade de rodas do veiculo em questao: ");
        qtRodas = teclado.nextInt();
        nc750x.setQtRodas(qtRodas);
                
        System.out.println("A quantidade atual de combustivel e: " + nc750x.getQtLitrosCombustivel());
        System.out.println("Digite quantos litros de combustivel serao colocados: ");
        qtLitrosCombustivel = teclado.nextInt();
        nc750x.setQtLitrosCombustivel(qtLitrosCombustivel);
        
        System.out.println("  ");
        
        System.out.println("A cor do veiculo e: " + nc750x.getCor());
        System.out.println("O modelo do veiculo e: " + nc750x.getModelo() + ", modelo exclusivo da marca " + nc750x.getMarca());
        System.out.println("A marca do veiculo e: " + nc750x.getMarca());
        System.out.println("O veiculo " + nc750x.getModelo() + " transporta " + nc750x.getQtPax() + " passageiros.");
        System.out.println("A quantidade de rodas do veiculo e: " + nc750x.getQtRodas());
        
        nc750x.estadoLigar();
        
        System.out.println("Quantidade atual de combustivel: " + nc750x.getQtLitrosCombustivel());
        
        
    }
}
