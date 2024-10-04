/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contarpalabrasdemo;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author 2damb
 */
public class ContarPalabrasProceso {
    public static void main(String[] args) throws IOException, InterruptedException {
        Timer timer = new Timer();
        File f = new File("Ficheros/TWY");
        //for(File fichero : f.listFiles()){
        ProcessBuilder constructor = new ProcessBuilder("java", "-jar", "./src/contarpalabrasdemo/ContarPalabrasDemo.jar grande/bible.txt");
            //ProcessBuilder constructor = new ProcessBuilder("java", "-jar", "./src/contarpalabrasdemo/ContarPalabrasDemo.jar " + fichero.toPath());

         //}
         //for(File fichero : f.listFiles()){
                // secuencial
                
                //contarPalabra(fichero);
                
                //parlelo
        /*
                ProcessBuilder constructor =
                new ProcessBuilder("java", "-jar", "./src/contarpalabrasdemo/ContarPalabrasDemo.jar grande/bible.txt");
        
        Process p = constructor.start();
*/
                
            }
         /*
        ProcessBuilder constructor =
                new ProcessBuilder("java", "-jar", "./src/contarpalabrasdemo/ContarPalabrasDemo.jar grande/bible.txt");
        
        Process p = constructor.start();
        p.waitFor();
          timer.finalizar();
        System.out.println(timer.tiempoTotal());
*/
    }

            
