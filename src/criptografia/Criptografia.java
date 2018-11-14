package criptografia;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author luciane
 */
public class Criptografia {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Encriptar frase = new Encriptar();
        String fraseCodificada = frase.Encriptar(JOptionPane.showInputDialog(null, "Digite uma frase"));
        
        Decriptar novo = new Decriptar();
        novo.Decriptar("criptografia.txt");
        
    }
}
