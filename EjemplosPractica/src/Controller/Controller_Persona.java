
package Controller;

import Models.CPersona;
import View.JIF_RegistroP;
import View.JF_Padre;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Controller_Persona implements ActionListener{

    private JF_Padre JF_Persona;
    private JIF_RegistroP JIF;
    private JFileChooser d;
    private int seleccion;
    private CPersona person;
    FileDialog fg;
    
    public Controller_Persona(JF_Padre per)
    {
        this.JF_Persona = per;
    }
    public Controller_Persona(JIF_RegistroP JIF)
    {
        this.JIF = JIF;
    }
    
    public void KeyTiped(JTextField jt) 
    {
        jt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) 
            {
                int d = jt.getText().replace(" ","").length();
                char c = e.getKeyChar();
                
                if( d <  14)
                {
                    if (d < 13) {
                        if ((!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_ENTER))) {
                            e.consume();
                        }
                    } else if (d > 12 && d < 14) {

                        if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_ENTER)) {
                            e.consume();
                        }
                    }
                    if(d == 14)
                    {
                        JIF.validaCedula();
                    }
                }else
                {
                    if (true) {
                        e.consume();
                    } 
                }

            } 
        });
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand())
        {
            case "Verificar" ->
            {
                JIF.validaCedula();
            }
            case "NewPersona" ->
            {
                JIF_RegistroP n = new JIF_RegistroP();
                JF_Persona.ShowChild(n, false);
            }
            case "Select" ->
            {

                d = new JFileChooser();
                seleccion = d.showOpenDialog(JF_Persona);

                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    CPersona pers = open(d.getSelectedFile());
                    JIF.SetDataPersona(pers);
                } else if (seleccion == JFileChooser.CANCEL_OPTION) {
                }  
            }
            case "Save" ->
            {
                
                if(JIF.validaLLenado())
                {
                    JFileChooser fl = new JFileChooser();
                    int selec = fl.showSaveDialog(JF_Persona);
                    
                    if (selec == JFileChooser.APPROVE_OPTION) {
                        File file = fl.getSelectedFile();
                        this.person = JIF.getDataPersona();
                        if (save(file)) {
                            JOptionPane.showMessageDialog(JF_Persona, "Se ha guardado con exito");
                        }else{
                            JOptionPane.showMessageDialog(JF_Persona,"El archivo no se pudo guardar");
                        }
                    } else if (selec == JFileChooser.CANCEL_OPTION) {
                    }
                }else{
                    JOptionPane.showMessageDialog(JF_Persona,"Rellene todos los campos !");
                }
                
            }
            case "Clear" ->
            {
                JIF.Clear();
            }
        }
    }
    
//    private File saveArchivo() {
//        JFileChooser fl = new JFileChooser();
//        int seleccion = fl.showSaveDialog(JF_Persona);
//
//        if (seleccion == JFileChooser.APPROVE_OPTION) {
//            return fl.getSelectedFile();
//        } else if (seleccion == JFileChooser.CANCEL_OPTION) {
//        }
//        return null;
//    }
    
    public boolean save(File file) {
        try {
            ObjectOutputStream w = new ObjectOutputStream(new FileOutputStream(file));
            w.writeObject(this.person);
            w.flush();
            return true;
        } catch (IOException ex) {
            return false;
        }
    }
 

    public CPersona open(File file) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            return (CPersona) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            return null;
        }

    }
    


}
