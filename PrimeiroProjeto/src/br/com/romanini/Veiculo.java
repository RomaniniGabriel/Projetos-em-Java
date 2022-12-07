package br.com.romanini;

/**
 *
 * @author Gabriel Romanini A. Monteiro
 */
public class  Veiculo {
    
    private String cor;
    private String marca;
    private String modelo;
    private int qtPax;
    private int qtLitrosCombustivel;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQtPax() {
        return qtPax;
    }

    public void setQtPax(int numeroPax) {
        this.qtPax = numeroPax;
    }

    public int getQtLitrosCombustivel() {
        return qtLitrosCombustivel;
    }

    public void setQtLitrosCombustivel(int qtLitrosCombustivel) {
        this.qtLitrosCombustivel = qtLitrosCombustivel;
    }
    
    public void estadoLigar (){
        System.out.println("O veiculo esta ligado.");
    }
}
