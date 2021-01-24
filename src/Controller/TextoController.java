package Controller;

import Models.ProcesaArchivos;
import View.JF_Padre;
import View.JIF_Concatenacion;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class TextoController implements ActionListener {

    
    private JFileChooser d;
    FileDialog fg;
    private ProcesaArchivos pc = new ProcesaArchivos();
    private JF_Padre jfPadre;
    private JIF_Concatenacion JIF;
    private boolean load ;
    
    public TextoController(JIF_Concatenacion jif) {this.JIF = jif;}
    public TextoController(JF_Padre jf) {jfPadre = jf;}
    
    
    

    @Override
    public void actionPerformed(ActionEvent e){
        
        load = "Guardar".equals(e.getActionCommand());
        
        switch (e.getActionCommand()) {
            case "New_Concatenacion" ->
            {
                System.out.println("entro al controlador ");
                JIF_Concatenacion n = new JIF_Concatenacion();
                jfPadre.ShowChild(n,false);
            }
            case "Salir" ->
            {
                System.exit(0);
            }
            case "Guardar" ->
            {
                if(JIF.Validallenado())
                {
                    String T = ShowSaveFileDialog();
                    if(T != null)
                    {
                        try {
                            pc.guardaArchivo(T,JIF.getTex_jTextArea1());
                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(TextoController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                
            }
            case "Archivo" -> 
            {
                String T = ShowOpenFileDialog(); 
                if(T != null)
                {
                    JIF.setTex_jT_File1(T);
                    try {
                        JIF.setTex_jTextArea1(pc.abrirArchivo(T));
                    } catch (IOException ex) {
                        Logger.getLogger(TextoController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            case "Archivo2" ->
            {
                String T = ShowOpenFileDialog();
                if (T != null) {
                    JIF.setTex_jT_File2(T);
                    try {
                        JIF.setTex_jTextArea1(pc.abrirArchivo(T));
                    } catch (IOException ex) {
                        Logger.getLogger(TextoController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            
        }
    }

    private File archivo() {
        JFileChooser fl = new JFileChooser();
        int seleccion = fl.showSaveDialog(jfPadre);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            return fl.getSelectedFile();
        } else if (seleccion == JFileChooser.CANCEL_OPTION) {
        }
        return null;
    }

    private String ShowOpenFileDialog() {
 
        fg = new FileDialog(jfPadre, "Selecciona un archivo txt",load ? FileDialog.SAVE : FileDialog.LOAD);
        fg.setVisible(true);

        String fl = fg.getFile();

        if(fl != null)
        {
            if ((fl.endsWith(".txt"))) 
            {
                System.out.println("Archivo compatible");
                fl = fg.getDirectory() + fg.getFile();
                return fl;
            }else{
                JOptionPane.showMessageDialog(jfPadre, "Formato no compatible");
            }
        }
        return null;
    }
    private String ShowSaveFileDialog()
    {
        fg = new FileDialog(jfPadre, "Guarde un archivo txt", load ? FileDialog.SAVE : FileDialog.LOAD);
        fg.setVisible(true);
        String fl = fg.getFile();

        if(fl != null)
        {
            if(fl.endsWith(".txt"))
            {
                fl = fg.getDirectory() + fg.getFile();
                return fl;
            }else{
                fl = fg.getDirectory() + fg.getFile()+".txt";
                return fl;
            }
        }
        return null;
    }
    
    

}
