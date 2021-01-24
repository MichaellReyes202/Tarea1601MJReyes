
package Controller;

import Models.Cambio;
import View.JF_Padre;
import View.JIF_Cambio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import javax.swing.JComboBox;

public class ControllerTipoCambio implements ActionListener{

    JIF_Cambio JIF;
    private final Cambio cambio = new Cambio();
    private JF_Padre jf;
    public ControllerTipoCambio(JIF_Cambio JIF)
    {
        this.JIF = JIF;
    }
    public ControllerTipoCambio(JF_Padre jf)
    {
        this.jf = jf;
    }
    public void Item(JComboBox jcb)
    {
        jcb.addItemListener((ItemEvent e) -> {
            if(e.getStateChange() == ItemEvent.SELECTED)
                {
                    JIF.relleno1();
                }
        });
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand())
        {
            case "Convertir" ->
            {
                int a = JIF.getIndex1();
                int b = JIF.getIndex2();
       
                if(a != -1 && b != -1)
                {
                    double r = cambio.Corvercion(JIF.getItem1(),JIF.getItem2(), JIF.getMonto());
                    JIF.setResultado(String.valueOf(r)); 
                }
            }
            case "NewConvertidor" ->
            {
                JIF_Cambio n = new JIF_Cambio();
                jf.ShowChild(n, false);
                
            }
        }
    }

}
