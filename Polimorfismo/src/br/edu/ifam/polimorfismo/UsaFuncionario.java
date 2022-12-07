package br.edu.ifam.polimorfismo;
public class UsaFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        
        f1.setNome("Dacoberto da Silva Weintraub");
        f1.setRg("40485725843");
        f1.setCartao("RH845");
        
        System.out.println(f1.getNome());    
        System.out.println(f1.getRg());
        System.out.println(f1.getCartao());
        
        
    }
}
