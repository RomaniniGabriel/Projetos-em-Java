package br.edu.ifam.tempogui;
public class Tempo {
   
    private int hora, minuto, segundo;
    
    public void setHora(int hora){
        if (hora < 0 || hora > 23){     //Explicação no final do código.     
            this.hora=0;
        } else{
            this.hora = hora;
        }
    }
     
    public void setMinuto(int minuto){
        if (minuto < 0 || minuto > 59){             
            this.minuto=0;
        } else{
            this.minuto = minuto;
        }
    }
    
    public void setSegundo(int segundo){
        if (segundo < 0 || segundo > 59){             
            this.segundo=0;
        } else{
            this.segundo = segundo;
        }
    }
    
    public int getHora(){
        return hora;
    }
    
    public int getMinuto(){
        return minuto;
    }
    
    public int getSegundo(){
        return segundo;
    }
    
    public String getExibeTempo(){
        
        return hora + ":" + minuto + ":" + segundo;
    }
   
}

/*Em java, o operador "|" é chamado de pipe. Um pipe só não faz nada, mas dois
deles ("||") significa E. Esse operador torna obrigatória a satisfazação de uma 
condição e outra ao seu utilizar um operador de decisão. 
-Ex.: if (hora < 0 || hora > 23) -> se o valor de hora for menor que 0 E maior 
que 23, algo acontece. Esse operador torna obrigatória a satisfazação de ambas 
as condições apresentadas.
*/