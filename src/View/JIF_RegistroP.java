
package View;

import Controller.Controller_Persona;
import Models.CPersona;
import java.util.Date;
import javax.swing.JOptionPane;
import static util.DateOperator.getAge;
import static util.DateOperator.stringToDate;
import static util.Validator.getBirthDateFromId;
import static util.Validator.isNicaraguanNumberId;

public class JIF_RegistroP extends javax.swing.JInternalFrame {

    private static final long serialVersionUID = 1L;
    private Controller.Controller_Persona pr;
    

    public JIF_RegistroP() 
    {
        initComponents();
        setupController();
        
    }
    private void setupController()
    {
        pr = new Controller_Persona(this);
        
        jB_Select.addActionListener(pr);
        jB_Clear.addActionListener(pr);
        jB_Save.addActionListener(pr);
        jB_Verificar.addActionListener(pr);
        pr.KeyTiped(jT_Cedula);
    }
    
    public void SetDataPersona(CPersona p)
    {
        
        jT_PrimerNombre.setText(p.getPrimerNombre());
        jT_SegundoNombre.setText(p.getSegundoNombre());
        jT_PrimerApellido.setText(p.getPrimerApellido());
        jT_SegundoApellido.setText(p.getSegundoApellido());
        jT_Cedula.setText(p.getCedula());
        jT_Edad.setText(String.valueOf(p.getEdad()));
        jT_FechaNac.setText(p.getFechaNac());
    }
    public CPersona getDataPersona()
    {
        CPersona cp = new CPersona();
        cp.setPrimerNombre(jT_PrimerNombre.getText());
        cp.setSegundoNombre(jT_SegundoNombre.getText());
        cp.setPrimerApellido(jT_PrimerApellido.getText());
        cp.setSegundoApellido(jT_SegundoApellido.getText());
        cp.setCedula(jT_Cedula.getText());
        cp.setEdad(Integer.parseInt(jT_Edad.getText()));
        cp.setFechaNac(jT_FechaNac.getText());
        return cp;
    }
    public void prueba()
    {
        System.out.println("Primer nombre = "+jT_PrimerNombre.getText());
        System.out.println("Segundo nombre = "+jT_SegundoNombre.getText());
        System.out.println("Primer Apellido = "+jT_PrimerApellido.getText());
        System.out.println("Segundo Apellido = "+jT_SegundoApellido.getText());
        System.out.println("Numero de cedula = "+jT_Cedula.getText());
        System.out.println("Edad = "+jT_Edad.getText());
        System.out.println("Fecha = "+jT_FechaNac.getText());
    }
    public void Clear()
    {
        jT_PrimerNombre.setText("");
        jT_SegundoNombre.setText("");
        jT_PrimerApellido.setText("");
        jT_SegundoApellido.setText("");
        jT_Cedula.setText("");
        jT_Edad.setText("");
        jT_FechaNac.setText("");
    }
    
    public boolean validaLLenado()
    {
        
        if(jT_PrimerNombre.getText().equals("")){return false;}
        if(jT_SegundoNombre.getText().equals("")){return false;}
        if(jT_PrimerApellido.getText().equals("")){return false;}
        if(jT_SegundoApellido.getText().equals("")){return false;}
        if(jT_Cedula.getText().equals("")){return false;}
        if(jT_Edad.getText().equals("")){return false;}
        if(jT_FechaNac.getText().equals("")){return false;}
        
        return true;
    }
    
    public void validaCedula()
    {
        if (isNicaraguanNumberId(jT_Cedula.getText())) {
            String birthDate = getBirthDateFromId(jT_Cedula.getText());
            jT_FechaNac.setText(birthDate);
            Date bd = stringToDate(birthDate, "yyyy-MM-dd");
            
            jT_Edad.setText(String.valueOf(getAge(bd)));
        } else {
            JOptionPane.showMessageDialog(this, "El no. de cédula proporcionado no es válido", this.getTitle(), JOptionPane.WARNING_MESSAGE);
            jT_FechaNac.setText("");
            jT_Edad.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jT_PrimerNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jT_SegundoNombre = new javax.swing.JTextField();
        jT_FechaNac = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jT_PrimerApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jT_Cedula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jT_SegundoApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jT_Edad = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jB_Select = new javax.swing.JToggleButton();
        jB_Clear = new javax.swing.JToggleButton();
        jB_Save = new javax.swing.JToggleButton();
        jB_Verificar = new javax.swing.JToggleButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Primer Nombre");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fecha de Nacimiento");

        jT_FechaNac.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("# de Cedula");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Segundo Nombre");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Primer Apellido");

        jT_Cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jT_CedulaKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Segundo Apellido");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Edad");

        jT_Edad.setEditable(false);

        jB_Select.setText("Seleccionar");
        jB_Select.setActionCommand("Select");

        jB_Clear.setText("Limpiar");
        jB_Clear.setActionCommand("Clear");

        jB_Save.setText("Guardar");
        jB_Save.setActionCommand("Save");

        jB_Verificar.setText("Verificar Cedula");
        jB_Verificar.setActionCommand("Verificar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jT_PrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jT_PrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jT_SegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_SegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jT_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jB_Verificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jT_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jT_FechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jB_Select)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_PrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_SegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT_PrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_SegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_FechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jT_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Verificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Select)
                    .addComponent(jB_Clear)
                    .addComponent(jB_Save))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jT_CedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_CedulaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_CedulaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jB_Clear;
    private javax.swing.JToggleButton jB_Save;
    private javax.swing.JToggleButton jB_Select;
    private javax.swing.JToggleButton jB_Verificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jT_Cedula;
    private javax.swing.JTextField jT_Edad;
    private javax.swing.JTextField jT_FechaNac;
    private javax.swing.JTextField jT_PrimerApellido;
    private javax.swing.JTextField jT_PrimerNombre;
    private javax.swing.JTextField jT_SegundoApellido;
    private javax.swing.JTextField jT_SegundoNombre;
    // End of variables declaration//GEN-END:variables
}
