/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criptografia;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author luciane
 */
public class Encriptar {
    
    
    public String Encriptar(String frase) throws FileNotFoundException, IOException{
            
         char[] arrayChars = frase.toCharArray();
            for(int i=0; i<arrayChars.length;i++){
                arrayChars[i]= (char)(arrayChars[i] + 4);
                         
            }  
            
            File f2 = new File("criptografia.txt");
            FileOutputStream fout= new FileOutputStream(f2);
            DataOutputStream dout= new DataOutputStream(fout);
            dout.writeBytes(String.valueOf(arrayChars));
            System.out.println("Conversão realizada!!");
            System.out.println(arrayChars);
            return String.valueOf(arrayChars);
            
}
    
          
}
