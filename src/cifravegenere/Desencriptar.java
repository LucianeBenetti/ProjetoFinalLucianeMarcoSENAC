package cifravegenere;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Desencriptar {
    
    private String tabela = "abcdefghijklmnñopqrstuvwxyzáéíóúABCDEFGHIJKLMNÑOPQRSTUVWXYZÁÉÍÓÚ1234567890.,;_:+-*/ @$€#¿?!¡=()[]{}\\\"";
    LimparTexto limparTexto = new LimparTexto();
    
     public String Desencriptar (String texto, String chave) throws FileNotFoundException, IOException{
        String textoLimpo = limparTexto.LimparTexto(texto);
        String descifrado = "";
         
        File f = new File("criptografia.txt");
        if(f.exists()){
                       
            FileInputStream fin = new FileInputStream(f);
            DataInputStream din = new DataInputStream(fin);
                    
            for(int t = 0,c=0; t<textoLimpo.length();t++,c=(c+1)%chave.length()){
            int posicao = (tabela.indexOf(textoLimpo.charAt(t))- tabela.indexOf(chave.charAt(c)));
            posicao = (posicao<0)?(posicao + tabela.length()):posicao;
            descifrado += tabela.charAt(posicao);
        }
        }
        return descifrado;
    }
    
}
