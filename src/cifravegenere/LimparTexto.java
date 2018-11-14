
package cifravegenere;

public class LimparTexto {
    
     private String tabela = "abcdefghijklmnñopqrstuvwxyzáéíóúABCDEFGHIJKLMNÑOPQRSTUVWXYZÁÉÍÓÚ1234567890.,;_:+-*/ @$€#¿?!¡=()[]{}\\\"";

     public String LimparTexto (String texto){
        texto = texto.replaceAll("\n", "");
        
        for (int x = 0; x < texto.length(); x++){
            int posicao = tabela.indexOf(texto.charAt(x));
            if (posicao ==-1){
                texto = texto.replace(texto.charAt(x),' ');
            }
        }
        return texto;
        }
    
}
