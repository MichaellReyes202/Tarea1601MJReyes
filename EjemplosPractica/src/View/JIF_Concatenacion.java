
package View;

import Controller.TextoController;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JTextField;


public class JIF_Concatenacion extends javax.swing.JInternalFrame {

    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension dimBarra = null;

    public void ocultarBarraTitulo() {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        dimBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        repaint();
    }
    private static final long serialVersionUID = 1L;
    private TextoController txt;
    
    public JIF_Concatenacion() 
    {
        initComponents();
        setupController();
    }
    
    
    private void setupController()
    {
        txt = new TextoController(this);
        jB_Texto1.addActionListener(txt);
        jB_Texto2.addActionListener(txt);
        jB_Guardar.addActionListener(txt);
    }
    
    public boolean Validallenado()
    {
        if(jT_File1.getText().length() > 0 && jT_File2.getText().length() > 0)
        {
            return true;
        }else{
            jT_Area.setText("Selecciona los Archivos");
            return false;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Area = new javax.swing.JTextArea();
        jT_File1 = new javax.swing.JTextField();
        jB_Texto1 = new javax.swing.JButton();
        jT_File2 = new javax.swing.JTextField();
        jB_Texto2 = new javax.swing.JButton();
        jB_Guardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setAutoscrolls(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jT_Area.setEditable(false);
        jT_Area.setColumns(20);
        jT_Area.setRows(5);
        jScrollPane1.setViewportView(jT_Area);

        jT_File1.setEditable(false);

        jB_Texto1.setText(".....");
        jB_Texto1.setActionCommand("Archivo");
        jB_Texto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Texto1ActionPerformed(evt);
            }
        });

        jT_File2.setEditable(false);

        jB_Texto2.setText("....");
        jB_Texto2.setActionCommand("Archivo2");

        jB_Guardar.setText("Guardar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jT_File1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_Texto1)
                .addGap(6, 6, 6)
                .addComponent(jT_File2)
                .addGap(12, 12, 12)
                .addComponent(jB_Texto2)
                .addGap(6, 6, 6)
                .addComponent(jB_Guardar)
                .addGap(35, 35, 35))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jB_Texto1)
                        .addComponent(jT_File1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jT_File2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Texto2)
                    .addComponent(jB_Guardar))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_Texto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Texto1ActionPerformed
        
    }//GEN-LAST:event_jB_Texto1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Guardar;
    private javax.swing.JButton jB_Texto1;
    private javax.swing.JButton jB_Texto2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jT_Area;
    private javax.swing.JTextField jT_File1;
    private javax.swing.JTextField jT_File2;
    // End of variables declaration//GEN-END:variables

    public JTextField getjT_File1() {
        return jT_File1;
    }

    public void setTex_jT_File1(String texto1) {
        jT_File1.setText(texto1);
    }
    
    public JTextField getjT_File2() {
        return jT_File2;
    }

    public void setTex_jT_File2(String texto) {
        jT_File2.setText(texto);
    }
    
    public void setTex_jTextArea1(String texto)
    {
        this.jT_Area.setText(texto);
    }
    public String getTex_jTextArea1()
    {
        return jT_Area.getText();
    }
}
