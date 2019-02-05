
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
            situation = "normal";
        }else if(this.resultado >= 25 && this.resultado <= 29.99){
            situation = "GORDO(A)";
        }else if(this.resultado >= 30 && this.resultado <= 34.99){
            situation = "GORDO(A) PRA CARALHO";
        }else if(this.resultado >= 35 && this.resultado <= 39.99){
            situation = "MONTANHA DE MERDA / ISMAR";
        }else if(this.resultado > 40){
            situation = "O LIXO MAIS DESUMANO DO MUNDO";
        }      
            return situation;
    }
}

