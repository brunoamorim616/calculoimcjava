
package calculoimc;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GravacaoDeArquivos {
    
    private String caminhoArquivo;
    private String nomeArquivo;
    
    public GravacaoDeArquivos(String caminho, String nome){
        this.caminhoArquivo = caminho;
        this.nomeArquivo = nome;
        
    }
    
    public void gravar(String conteudo) throws IOException{
        FileWriter arquivoTxt = new FileWriter(this.caminhoArquivo+"///"+this.nomeArquivo, true);
        PrintWriter gravarArq = new PrintWriter(arquivoTxt);
        
        gravarArq.print(conteudo);
        arquivoTxt.close();
        
    }
    public String[] ler() throws FileNotFoundException, IOException{
        FileReader arquivTxt = new FileReader(this.caminhoArquivo+"///"+this.nomeArquivo);
        BufferedReader lerArq = new BufferedReader(arquivTxt);
        
        String linha = lerArq.readLine();
        int contador = 0 ;
        while(linha != null){
            contador++;
            linha = lerArq.readLine();
        }
        String[] conteudo = new String[contador];
        lerArq.reset();
        
        //popula o array
        linha = lerArq.readLine();
        contador = 0;
        while (linha != null){
            conteudo [contador] = linha;
            contador++;
            linha = lerArq.readLine();
        }
        return conteudo;
    }
    
    public String lerEmString() throws IOException{
        String conteudoArquivo[] = this.ler();
        String conteudo = "";
        for (int i = 0; i<conteudoArquivo.length; i++){
            conteudo = conteudo + conteudoArquivo[i]+"\n";
        }
        return conteudo;
    }
}    