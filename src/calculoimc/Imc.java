
package calculoimc;

public class Imc {
    public double resultado;
    /**
     * Calcula o IMC 
     */
    public double calcular(double peso, double altura){
        resultado = peso/(altura*altura);
        return resultado;
    }
    /**
     * Retorna a situação do IMC
     */
    public String situacao(String situation){
        if(this.resultado >= 18.5 && this.resultado <= 24.99){
            situation = "Normal";
        }else if(this.resultado >= 25 && this.resultado <= 29.99){
            situation = "Acima do peso";
        }else if(this.resultado >= 30 && this.resultado <= 34.99){
            situation = "OBESIDADE 1";
        }else if(this.resultado >= 35 && this.resultado <= 39.99){
            situation = "OBESIDADE 2";
        }else if(this.resultado >= 40){
            situation = "OBESIDADE 3";
        }      
            return situation;
    }
}

