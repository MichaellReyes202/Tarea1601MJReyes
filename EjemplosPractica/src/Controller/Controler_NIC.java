
package Controller;

import Models.Model_Nicaragua;
import View.JF_Padre;
import View.JIF_Dep_Muni;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;

public class Controler_NIC implements  ActionListener{

    private JIF_Dep_Muni JIF;
    private JF_Padre JF_N;
    private Model_Nicaragua M = new Model_Nicaragua();
    public Controler_NIC(JIF_Dep_Muni JIF) 
    {
        this.JIF = JIF;
    }

    public Controler_NIC(JF_Padre aThis) {
        this.JF_N = aThis;
    }
    
    public void ComboDepartamento(JComboBox jcD)
    {
        jcD.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                jcD.setMaximumRowCount(5);
                JIF.rellenaMunicipio(jcD.getSelectedIndex());
            }
        });
        
    }
    public void ComboMunicipio(JComboBox jcM)
    {
        jcM.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                jcM.setMaximumRowCount(5);
                JIF.Mensaje(JF_N);

            }
        });
        
//        jcM.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                if(e.getStateChange() == ItemEvent.SELECTED)
//                {
//                    System.out.println("=== "+e.getItemSelectable().toString());
//                    JIF.Mensaje(JF_N);
//                }
//            }
//        });
       
        
    }
            
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand())
        {
            case "NewNic" ->
            {
                JIF_Dep_Muni n = new JIF_Dep_Muni();
                JF_N.ShowChild(n,false);
            }
        }
    }

   

}
