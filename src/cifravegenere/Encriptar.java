
package cifravegenere;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Encriptar {
      
    private String tabela = "abcdefghijklmnñopqrstuvwxyzáéíóúABCDEFGHIJKLMNÑOPQRSTUVWXYZÁÉÍÓÚ1234567890.,;_:+-*/ @$€#¿?!¡=()[]{}\\\"";
    
    LimparTexto limparTexto = new LimparTexto();
    
    public String Encriptar (String texto, String chave) throws FileNotFoundException, IOException{
        String textoLimpo = limparTexto.LimparTexto(texto);
        String cifrado = "";
        
        for(int t = 0,k=0; t<textoLimpo.length();t++,k=(k+1)%chave.length()){
            int posicao = (tabela.indexOf(textoLimpo.charAt(t))+ tabela.indexOf(chave.charAt(k)))%tabela.length();
            cifrado += tabela.charAt(posicao);
        }
            File f2 = new File("criptografia.txt");
            FileOutputStream fout= new FileOutputStream(f2);
            DataOutputStream dout= new DataOutputStream(fout);
            dout.writeBytes(String.valueOf(cifrado));
            System.out.println("Conversão realizada!!");
            System.out.println(cifrado);
            
        return cifrado;
    }
}
