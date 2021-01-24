
package Controller;

import View.JF_Padre;
import View.JIF_Region;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class Controller_Reg implements ActionListener{
    private JF_Padre JF;
    private JIF_Region JIF;

    public Controller_Reg(JF_Padre JF) 
    {
        this.JF = JF;
    }
    
    public Controller_Reg(JIF_Region JIF)
    {
        this.JIF = JIF;
    }
    public void KeyTiped(JTextField jt) {
        
        jt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                int d = jt.getText().replace(" ", "").length();
                char c = e.getKeyChar();

                if (d < 14) {
                    if (d < 13) {
                        if ((!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_ENTER))) {
                            e.consume();
                        }
                    } else if (d > 12 && d < 14) {

                        if (!(Character.isLetter(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_ENTER)) {
                            e.consume();
                        }
                    }
                } else {
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
            case "NewValCedula" ->
            {
                JIF_Region n = new JIF_Region();
                JF.ShowChild(n,false);
            }
            case "Clear" ->
            {
                JIF.clear();
            }
            case "Verificar" ->
            {
                JIF.validaCedula();
                System.out.println("Controlador Correcto");
            }
        }
    }

}
