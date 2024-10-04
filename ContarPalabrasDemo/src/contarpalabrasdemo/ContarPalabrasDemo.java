/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contarpalabrasdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author 2damb
 */
public class ContarPalabrasDemo {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
        public static void main(String[] args) throws FileNotFoundException {
        Timer timer = new Timer();
        File file = new File("./Ficheros/" + args[0]);
        Scanner scan = new Scanner(file);
        
        HashMap<String, Integer> lista = new HashMap<String, Integer>();
        ArrayList<String> lines = new ArrayList<String>();
        
        while ( scan.hasNextLine() ) {
            String currentLine = scan.nextLine();
            String[] currentLineSplitted = (currentLine.split("[,\\.\\s]"));
            for ( String word : currentLineSplitted) {
                if ( lista.containsKey(word) && word != "" ) {
                    int contador = lista.get(word);
                    lista.put(word, ++contador);
                }
                else if (word != ""){
                    lista.put(word, 1);
                }
            }
        }
        String clave = "";
        int mayorRepeticion = 0;
        for (Map.Entry<String, Integer> o : lista.entrySet()) {
            if( o.getValue() > mayorRepeticion) {
                clave = o.getKey();
                mayorRepeticion = o.getValue();
            }
        }
        System.out.println("La palabra mas repetidas es " + clave + " con un total de " + mayorRepeticion + " veces");
        timer.finalizar();
        System.out.println(timer.tiempoTotal());
    }
}
