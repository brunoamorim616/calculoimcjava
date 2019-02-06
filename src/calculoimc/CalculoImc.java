
package calculoimc;

import javax.swing.JFrame;
import telas.PainelPrincipal;

public class CalculoImc {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Calculadora de IMC");
        PainelPrincipal painel = new PainelPrincipal();
        
        //Define atributos da TELA
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        janela.setSize(399, 413);
        janela.add(painel);
        janela.setVisible(true);
    }
    
}
