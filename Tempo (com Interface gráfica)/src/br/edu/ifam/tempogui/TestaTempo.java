package br.edu.ifam.tempogui;

import javax.swing.JOptionPane; //importação da interface gráfica

public class TestaTempo {
    
    public static void main(String[] args) {
        
        Tempo relogio = new Tempo(); //Instanciamento
        
        int hora1, minuto1, segundo1; //criação de variáveis prórpias do objeto
        
        JOptionPane.showMessageDialog(null,"Você inventará um horário.\n Clique"
                + " no botão a seguir para começar!");
        
        hora1=Integer.parseInt(JOptionPane.showInputDialog("Digite a hora: "));
        //conversão de int para String
        relogio.setHora(hora1);
        
        minuto1=Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto: "));
        //conversão de int para String
        relogio.setMinuto(minuto1);
    
        segundo1=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo: "));
        //conversão de int para String
        relogio.setSegundo(segundo1);
    
        JOptionPane.showMessageDialog(null, "Horário de Brasília: " + 
        relogio.getExibeTempo()+ " (Fictício)");
    
    }
}
//É possível exibir um zero nos valores menores que 10 através de uma sistema 
//if-else?