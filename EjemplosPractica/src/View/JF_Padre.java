
package View;

import Controller.Controler_NIC;
import Controller.ControllerPelicula;
import Controller.ControllerTipoCambio;
import Controller.Controller_Persona;
import Controller.Controller_Reg;
import Controller.TextoController;

public class JF_Padre extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private ControllerTipoCambio ctro;
    private Controler_NIC ct;
    private Controller_Persona pr;
    private Controller.Controller_Reg controller;
    private Controller.ControllerPelicula ctr;
    
    public JF_Padre() 
    {
        initComponents();
        setupController();
        setExtendedState(MAXIMIZED_BOTH);
    }
    private void setupController() {
        TextoController txt = new TextoController(this);
        ctro = new ControllerTipoCambio(this);
        ct = new Controler_NIC(this);
        pr = new Controller_Persona(this);
        controller = new Controller_Reg(this);
        ctr = new ControllerPelicula(this);
        
        New_Concatenacion.addActionListener(txt);  // 1
        jM_NewCambio.addActionListener(ctro);      // 2
        jM_Nicaragua.addActionListener(ct);        // 3
        jM_NewPersona.addActionListener(pr);       // 4
        jM_NewVaLCeduda.addActionListener(controller);  // 5
        jM_New_Boletos.addActionListener(ctr);  // 6
        
        jM_Salir.addActionListener(txt);
    }

    public void ShowChild(javax.swing.JInternalFrame frame, boolean maximizeFrame) {
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        int xy[] = getPosition(frame);
        jDesktop_Pantalla.add(frame);
        frame.setLocation(xy[0], xy[1]);
        frame.setVisible(true);
        if (maximizeFrame) 
        {
            jDesktop_Pantalla.getDesktopManager().maximizeFrame(frame);
        }
        setCursor(java.awt.Cursor.getDefaultCursor());
        
    }

    public int[] getPosition(javax.swing.JInternalFrame inter) {
        int position[] = new int[2];
        position[0] = (jDesktop_Pantalla.getWidth() - inter.getWidth()) / 2;
        position[1] = (jDesktop_Pantalla.getHeight() - inter.getHeight()) / 2;

        return position;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jDesktop_Pantalla = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAplicacion = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jM_Salir = new javax.swing.JMenuItem();
        Menu2 = new javax.swing.JMenu();
        New_Concatenacion = new javax.swing.JMenuItem();
        jM_NewCambio = new javax.swing.JMenuItem();
        jM_Nicaragua = new javax.swing.JMenuItem();
        jM_NewPersona = new javax.swing.JMenuItem();
        jM_NewVaLCeduda = new javax.swing.JMenuItem();
        jM_New_Boletos = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu6.setText("jMenu6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktop_PantallaLayout = new javax.swing.GroupLayout(jDesktop_Pantalla);
        jDesktop_Pantalla.setLayout(jDesktop_PantallaLayout);
        jDesktop_PantallaLayout.setHorizontalGroup(
            jDesktop_PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jDesktop_PantallaLayout.setVerticalGroup(
            jDesktop_PantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        MenuAplicacion.setText("Aplicación");
        MenuAplicacion.setActionCommand("New");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Image/conf.png"))); // NOI18N
        jMenuItem1.setText("Configurar");
        MenuAplicacion.add(jMenuItem1);

        jM_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Image/Exit.png"))); // NOI18N
        jM_Salir.setText("Salir");
        MenuAplicacion.add(jM_Salir);

        jMenuBar1.add(MenuAplicacion);

        Menu2.setText("Misceláneos");
        Menu2.setActionCommand("NewTextoConcat");

        New_Concatenacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Image/concatenar.png"))); // NOI18N
        New_Concatenacion.setText("Concatenar Archivos TXT");
        New_Concatenacion.setActionCommand("New_Concatenacion");
        Menu2.add(New_Concatenacion);

        jM_NewCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Image/Modena.png"))); // NOI18N
        jM_NewCambio.setText("Cambios de Monedas");
        jM_NewCambio.setActionCommand("NewConvertidor");
        Menu2.add(jM_NewCambio);

        jM_Nicaragua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Image/cyty.png"))); // NOI18N
        jM_Nicaragua.setText("Departamentos y Municipios de NIC.");
        jM_Nicaragua.setActionCommand("NewNic");
        Menu2.add(jM_Nicaragua);

        jM_NewPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Image/Person.png"))); // NOI18N
        jM_NewPersona.setText("Registro de Persona");
        jM_NewPersona.setActionCommand("NewPersona");
        Menu2.add(jM_NewPersona);

        jM_NewVaLCeduda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Image/cedula.png"))); // NOI18N
        jM_NewVaLCeduda.setText("Valida Cedula de identidad");
        jM_NewVaLCeduda.setActionCommand("NewValCedula");
        Menu2.add(jM_NewVaLCeduda);

        jM_New_Boletos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Image/claqueta.png"))); // NOI18N
        jM_New_Boletos.setText("Registro de ventas de boletos");
        jM_New_Boletos.setActionCommand("New_RegistroB");
        Menu2.add(jM_New_Boletos);

        jMenuBar1.add(Menu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop_Pantalla)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop_Pantalla)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu2;
    private javax.swing.JMenu MenuAplicacion;
    private javax.swing.JMenuItem New_Concatenacion;
    private javax.swing.JDesktopPane jDesktop_Pantalla;
    private javax.swing.JMenuItem jM_NewCambio;
    private javax.swing.JMenuItem jM_NewPersona;
    private javax.swing.JMenuItem jM_NewVaLCeduda;
    private javax.swing.JMenuItem jM_New_Boletos;
    private javax.swing.JMenuItem jM_Nicaragua;
    private javax.swing.JMenuItem jM_Salir;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables

    
}
