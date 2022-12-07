package br.com.romanini;

/**
 *
 * @author Gabriel Romanini A. Monteiro
 */
public class Motocicleta extends Veiculo{
    
    private int qtRodas;

    public int getQtRodas() {
        return qtRodas;
    }

    public void setQtRodas(int qtRodas) {
        this.qtRodas = qtRodas;
    }
    
    @Override
    public void estadoLigar(){
        System.out.println("A motociceta esta ligada.");
    }
    
    
}
