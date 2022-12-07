package br.edu.ifam.tempo;
public class TestaTempo {
    
    public static void main(String[] args) {
        
        Tempo relogio = new Tempo(); //relógio é um objeto instanciado
        
        relogio.hora = 26;
        relogio.minuto = 75;
        relogio.segundo = -31;
        
        relogio.getExibeTempo();
        
    }
}
