
package View;

import Controller.ControllerTipoCambio;
import java.time.LocalDate;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;


public class JIF_Cambio extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L; 
    private final String[] tipos = {"Cordobas","Dolares","Euros"};
    private ControllerTipoCambio ctc;
    
    private LocalDate fechaActual = LocalDate.now();

    
    public JIF_Cambio() {
        initComponents();
        setupCotroller();
    }
    private void setupCotroller ()
    {
        ctc = new ControllerTipoCambio(this);
        ctc.Item(jC_Tengo);
        jT_Convertir.addActionListener(ctc);
        jf_Fecha.setText(fechaActual.toString());
        
    }
    
    // 0 cordoba
    // 1 dolar
    // 2 euro
    
    public String MauroMiamor1()
    {
        return jC_Tengo.getSelectedItem().toString();        
    }
    public String MauroMiamor2()
    {
        return jC_Deseo.getSelectedItem().toString();
    }
    
    
    
    public void relleno1()
    {
        jC_Deseo.removeAllItems();
        for (int i = 0; i < tipos.length; i++) {
              
            if (i == jC_Tengo.getSelectedIndex()) {
                continue;
            } else {
                jC_Deseo.addItem(tipos[i]);
            }
        }
    }
    
    public String getItem1()
    {
        return jC_Tengo.getSelectedItem().toString();
    }
    public String getItem2()
    {
        return jC_Deseo.getSelectedItem().toString();
    }
    //------------------------------------
    public int getIndex1()
    {
        //jC_Deseo.getSelectedItem()
        return jC_Tengo.getSelectedIndex();
    }
    public int getIndex2()
    {
        return jC_Deseo.getSelectedIndex();
    }
    //-------------------------------------
    public double getMonto()
    {
        return Double.parseDouble(jT_Monto.getText());
    }
    public void setResultado(String valor)
    {
        jT_Resultado.setText(valor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_Fecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jC_Tengo = new javax.swing.JComboBox<>();
        jC_Deseo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jT_Convertir = new javax.swing.JToggleButton();
        jT_Monto = new javax.swing.JTextField();
        jT_Resultado = new javax.swing.JTextField();

        setClosable(true);

        jf_Fecha.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jf_Fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jf_Fecha.setText("20/01/2021");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Moneda que tengo");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Moneda que deseo");

        jC_Tengo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cordobas", "Dolares", "Euros" }));
        jC_Tengo.setSelectedIndex(-1);
        jC_Tengo.setSelectedItem(null);

        jC_Deseo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cordobas", "Dolares", "Euros" }));
        jC_Deseo.setSelectedIndex(-1);
        jC_Deseo.setSelectedItem(null);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Monto");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Monto");

        jT_Convertir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jT_Convertir.setText("Convertir");

        jT_Resultado.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jC_Tengo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jT_Monto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jC_Deseo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jT_Resultado)))
                    .addComponent(jT_Convertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jf_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jf_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jC_Tengo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jC_Deseo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_Monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jT_Convertir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jC_Deseo;
    private javax.swing.JComboBox<String> jC_Tengo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JToggleButton jT_Convertir;
    private javax.swing.JTextField jT_Monto;
    private javax.swing.JTextField jT_Resultado;
    private javax.swing.JLabel jf_Fecha;
    // End of variables declaration//GEN-END:variables
}
