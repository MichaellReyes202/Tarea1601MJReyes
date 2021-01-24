
package Controller;

import View.JF_Padre;
import View.JIF_RegistroCine;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ControllerPelicula implements ActionListener
{
    private JIF_RegistroCine JIF;
    private JF_Padre JF;
    public ControllerPelicula(JIF_RegistroCine JIF) 
    {
        this.JIF = JIF;
    }

    public ControllerPelicula(JF_Padre aThis) {
        this.JF = aThis;
    }
    
    public void keyLiberadaNino(JTextField jt)
    {
        jt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e)
            {
                //JIF.setPago(jt.getText());
                JIF.SetTotal_PagarNino();
            }
        });
        jt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) 
            {
                char c = e.getKeyChar();
                if ((!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_ENTER))) {
                    e.consume();
                }
            }
        });

    }
    public void KeyliberadaAdulto(JTextField jt)
    {
        jt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                JIF.SetTotal_PagarAdulto();
            }
        });
        jt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ((!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_ENTER))) {
                    e.consume();
                }
            }
        });
    }
    public void KeyLiberadoTotalPagado(JTextField Tp)
    {
        Tp.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                JIF.setTotalPagado();
            }
        });
        Tp.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ((!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_ENTER))) {
                    e.consume();
                }
            }
        });
    }
    public void Item(JComboBox jcb) {
        jcb.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) 
            {
                JIF.Sala(jcb.getSelectedIndex());
            }
        });
    }
    public void Control_RadioButton(JRadioButton JR1 ,JRadioButton JR2 )
    {
        JR1.addItemListener((ItemEvent e) ->{
            JIF.setPrecionSALA(140,120);
            JIF.PresentaPrecio();
            JIF.SetTotal_PagarAdulto();
            JIF.SetTotal_PagarNino();
            JIF.setTotalPagado();
        });
        JR2.addItemListener(((e) -> {
            JIF.setPrecionSALA(180,150);
            JIF.PresentaPrecio();
            JIF.SetTotal_PagarAdulto();
            JIF.SetTotal_PagarNino();
            JIF.setTotalPagado();
        }));
       
//        @Override
//        public void itemStateChanged
//        (ItemEvent e
//        
//            ) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
    }
    

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        switch(e.getActionCommand())
        {
            case "New_RegistroB" ->
            {
                JIF_RegistroCine n = new JIF_RegistroCine();
                JF.ShowChild(n,false);
            }
        }
    }

   

    
    

}
