
package View;

import Controller.Controler_NIC;
import Models.Model_Nicaragua;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JIF_Dep_Muni extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;
    private Controller.Controler_NIC ctr;
    private Model_Nicaragua M = new Model_Nicaragua();
    
    public JIF_Dep_Muni() 
    {
        initComponents();
        sutupController();
    }
    private void sutupController()
    {
        ctr = new Controler_NIC(this);
        ctr.ComboDepartamento(jC_Departamento);
        ctr.ComboMunicipio(jC_Municipio);
    }
    public void rellenaMunicipio(int i)
    {
        jC_Municipio.removeAllItems();
        String[] muni = M.getMunicipios(i);
        jC_Municipio.setModel(new DefaultComboBoxModel<>(muni));
        jC_Municipio.setSelectedIndex(-1);
        jC_Municipio.setSelectedItem(null);
        
    }
    public void Mensaje(JF_Padre jf)
    { //jC_Departamento.getSelectedIndex() != -1 &&
        if( (jC_Municipio.getSelectedIndex() != -1));
        {
            JOptionPane.showMessageDialog(jf,String.format("Has seleccionado %s , %s",jC_Departamento.getSelectedItem().toString(),jC_Municipio.getSelectedItem().toString()));
        }
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jC_Departamento = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jC_Municipio = new javax.swing.JComboBox<>();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Departamento ");

        jC_Departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boaco", "Carazo", "Chinandega", "Chontales", "Costa Caribe Norte", "Costa Caribe Sur", "Estelí", "Granada", "Jinotega", "León", "Madriz", "Managua", "Masaya", "Matagalpa", "Nueva Segovia", "Río San Juan", "Rivas" }));
        jC_Departamento.setSelectedIndex(-1);
        jC_Departamento.setSelectedItem(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Municipio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jC_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jC_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jC_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jC_Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jC_Departamento;
    private javax.swing.JComboBox<String> jC_Municipio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
