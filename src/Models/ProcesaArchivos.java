
package Models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProcesaArchivos {
    private Scanner entrada;
    private String acumulador ="";
    private static Formatter salida; // envía texto a un archivo 
    
    public String abrirArchivo(String p) throws IOException 
    {
        File fd = new File(p);
        entrada = new Scanner(fd.toPath());
        
        try {
            while (entrada.hasNext()) // mientras haya más qué leer
            {
                acumulador += entrada.nextLine() + " ";
            }
        } catch (NoSuchElementException elementException) {
            JOptionPane.showMessageDialog(null, "El archivo no esta bien formado.");
        } catch (IllegalStateException stateException) {
            JOptionPane.showMessageDialog(null, "Error al leer del archivo");
        }
        cerrarArchivo();
        return acumulador; 
    }
    
    public void guardaArchivo(String ruta , String contenido) throws FileNotFoundException
    {
        File fd = new File(ruta);
        salida = new Formatter(ruta);
        salida.format("%s",contenido);
        cerrarArchivoEscritura();
    }
    


    private  void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        }

    }

    public void cerrarArchivoEscritura() {
        if (salida != null) {
            salida.close();
        }
        
    }
}
