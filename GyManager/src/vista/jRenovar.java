package vista;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.SqlSocio;

public class jRenovar extends javax.swing.JFrame {

    String numSocio;
    String nombre;
    String apellidos;
    String membresia;

    public jRenovar() {
        initComponents();
    }

    public jRenovar(String numSocio, String nombre, String apellido1, String apellido2) {
        initComponents();

        this.nombre = nombre;
        this.apellidos = apellido1 + " " + apellido2;
        this.numSocio = numSocio;

        txtNumSocio.setText(numSocio);
        txtNombre.setText(nombre);
        txtApellidos.setText(apellido1 + " " + apellido2);

        txtNumSocio.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumSocio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        cboxMembresia = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(252, 252, 252));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("Renovar Membresia");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 120, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellidos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 120, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Num. Socio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 120, 30));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Tipo de membresia:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 120, 30));

        txtNumSocio.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtNumSocio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(txtNumSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 180, 30));

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 180, 30));

        txtApellidos.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        txtApellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 180, 30));

        cboxMembresia.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        cboxMembresia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mensual", "Bimestral", "Trimestral", "Cuatrimestral", "Semestral", "Anual" }));
        cboxMembresia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        cboxMembresia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cboxMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 180, 30));

        btnAceptar.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(51, 51, 51));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 230, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-calendar-32.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 30, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-NewUser-100.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 100, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        SqlSocio modsql = new SqlSocio();
        this.membresia = cboxMembresia.getSelectedItem().toString();
        Date date = new Date();
        DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        if (modsql.renovarMembresia(this.numSocio, this.membresia, fechaHora.format(date))) {
            JOptionPane.showMessageDialog(null, "Rerenovo Membresia de: " + this.nombre + " " + this.apellidos);
            JHome.btnRenovarM.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JHome.frmRenovar = null;
        JHome.btnRenovarM.setEnabled(false);
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAceptar;
    private javax.swing.JComboBox<String> cboxMembresia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumSocio;
    // End of variables declaration//GEN-END:variables
}
