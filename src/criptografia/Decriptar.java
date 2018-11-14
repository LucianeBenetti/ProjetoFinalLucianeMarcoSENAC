package criptografia;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Decriptar {
    
    public void Decriptar(String fraseCodificada) throws FileNotFoundException, IOException{
        
        
        File f = new File("criptografia.txt");
        if(f.exists()){
                       
            FileInputStream fin = new FileInputStream(f);
            DataInputStream din = new DataInputStream(fin);
            byte[] mensagemCifrada=new byte[din.available()];
            din.readFully(mensagemCifrada);
            char[] msgOriginal= new char[mensagemCifrada.length];
            for(int i=0; i<mensagemCifrada.length;i++){
                msgOriginal[i]= (char)(mensagemCifrada[i] - 4);
  
                          
            }
                       
            System.out.println(String.valueOf(msgOriginal));
}
    }
}
