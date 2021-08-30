package vista;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.NewSocio;
import modelo.SqlSocio;
import modelo.User;
import user.JLogin;
import user.JNewUser;


public class JHome extends javax.swing.JFrame {

    User mod;
    public static JLogin frmlog;
    public static JVisita frmVisita;
    public static jRenovar frmRenovar;
    public static JNewUser frmNewUser;
    
    PJVenta vt;
    PJProductos prtos;
    
    private boolean panelNewSocio = false;
    private boolean panelEditSocio = false;
    private boolean ventanaVenta = false;
    private boolean ventanaInicio = true;
    
    public JHome() {
       //initComponents();
    }
    
    public JHome(User mod) {
        initComponents();
        //setLocationRelativeTO(null);//para centrar la ventana
        this.getContentPane().setBackground(new Color(240, 242, 245)); //COLOR BACKGROUND
        this.mod = mod;
        txtUserName.setText(this.mod.getNombre());
        
        /*ADMINSTRADOR*/
        if(this.mod.getId_tipo() == 1){  
            
        }
        /*ENCARGADO*/
        else if(this.mod.getId_tipo() == 2){
            btnNewUser.setVisible(false); 
        }
        
        /*TODOS*/
        btnRegistrarEntrada.setEnabled(false);
        btnRenovarM.setEnabled(false);
        btnEditarSocio.setEnabled(false);
        btnEliminarSocio.setEnabled(false);
        
        pNewSocio.setVisible(this.panelNewSocio);
        mostrarClientes();
        
    }
    
    public void mostrarClientes(){/*Muestra los socios existentes*/
         /*Obtenemos Fecha y Hora de registro de usuario*/
        Date date = new Date();
        DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
        
        SqlSocio logica = new SqlSocio();
        DefaultTableModel modelo = logica.mostrarClientes();
        DefaultTableModel modeloDia = logica.mostrarClientesDia(fecha.format(date));
        DefaultTableModel modeloVencidos = logica.mostrarClientesVencidos(fecha.format(date));
        
        
        tblaSocios.setModel(new DefaultTableModel());
        tblaSocios.setModel(modelo);
        
        tblaVisitantes.setModel(modeloDia);
        tblaVencidos.setModel(modeloVencidos);
        
    }
    
    public static String upperCaseFirst(String val) {/* Metodo para convertir la primera letra en mayusucula */
      char[] arr = val.toCharArray();
      arr[0] = Character.toUpperCase(arr[0]);
      return new String(arr);
    }
    
    private void limpiarNewSocio(){ /*Limpia el formulario de Nuevo socio*/
        txtNumSocio.setText("");
        txtNombre.setText("");
        txtApellido1.setText("");
        txtApellido2.setText("");
        cboxMembresia.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInicio = new javax.swing.JButton();
        btnVenta = new javax.swing.JToggleButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnNewUser = new javax.swing.JToggleButton();
        tpPrincipal = new javax.swing.JTabbedPane();
        pInicio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblaVisitantes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblaVencidos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrarEntrada = new javax.swing.JToggleButton();
        btnVisita = new javax.swing.JToggleButton();
        btnRenovarM = new javax.swing.JToggleButton();
        pSocios = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblaSocios = new javax.swing.JTable();
        pNewSocio = new javax.swing.JPanel();
        txtNuevoSocio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        cboxMembresia = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JToggleButton();
        jtxtNumSocio = new javax.swing.JLabel();
        txtNumSocio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JToggleButton();
        btnEditarSocio = new javax.swing.JToggleButton();
        btnEliminarSocio = new javax.swing.JToggleButton();
        btnNewSocio = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(252, 252, 252));

        btnInicio.setBackground(new java.awt.Color(252, 252, 252));
        btnInicio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-monitor-40.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setFocusPainted(false);
        btnInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInicio.setMaximumSize(new java.awt.Dimension(160, 70));
        btnInicio.setMinimumSize(new java.awt.Dimension(158, 68));
        btnInicio.setOpaque(false);
        btnInicio.setPreferredSize(new java.awt.Dimension(160, 70));
        btnInicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnVenta.setBackground(new java.awt.Color(252, 252, 252));
        btnVenta.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-shopping-cart-40.png"))); // NOI18N
        btnVenta.setText("Vender Producto");
        btnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenta.setFocusPainted(false);
        btnVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVenta.setMaximumSize(new java.awt.Dimension(160, 70));
        btnVenta.setMinimumSize(new java.awt.Dimension(138, 68));
        btnVenta.setPreferredSize(new java.awt.Dimension(160, 70));
        btnVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        btnCerrarSesion.setBackground(new java.awt.Color(252, 252, 252));
        btnCerrarSesion.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-upload-40.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setFocusPainted(false);
        btnCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrarSesion.setMaximumSize(new java.awt.Dimension(160, 70));
        btnCerrarSesion.setMinimumSize(new java.awt.Dimension(138, 68));
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(160, 70));
        btnCerrarSesion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnNewUser.setBackground(new java.awt.Color(252, 252, 252));
        btnNewUser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnNewUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-user-40.png"))); // NOI18N
        btnNewUser.setText("Registrar Usuario");
        btnNewUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewUser.setFocusPainted(false);
        btnNewUser.setFocusable(false);
        btnNewUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNewUser.setMaximumSize(new java.awt.Dimension(160, 70));
        btnNewUser.setMinimumSize(new java.awt.Dimension(138, 68));
        btnNewUser.setPreferredSize(new java.awt.Dimension(160, 70));
        btnNewUser.setRequestFocusEnabled(false);
        btnNewUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewUserActionPerformed(evt);
            }
        });

        tpPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tpPrincipal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        pInicio.setBackground(new java.awt.Color(252, 252, 252));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        tblaVisitantes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblaVisitantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num. Socio", "Nombre", "Apellidos", "Fecha De vencimiento", "Ultima entrada"
            }
        ));
        tblaVisitantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblaVisitantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblaVisitantes);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        tblaVencidos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblaVencidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Socio", "Nombre", "Apellidos", "Tipo de Membresia", "Fecha de Vencimiento"
            }
        ));
        tblaVencidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblaVencidosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblaVencidos);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Socios vencidos");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Visitantes del Dia");

        btnRegistrarEntrada.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnRegistrarEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-sensor-de-puerta-controlado-16.png"))); // NOI18N
        btnRegistrarEntrada.setText(" Registrar Entrada");
        btnRegistrarEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEntradaActionPerformed(evt);
            }
        });

        btnVisita.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnVisita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-dos-entradas-16.png"))); // NOI18N
        btnVisita.setText(" Visita");
        btnVisita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitaActionPerformed(evt);
            }
        });

        btnRenovarM.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnRenovarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-actualizar-16.png"))); // NOI18N
        btnRenovarM.setText(" Renovar Membresia");
        btnRenovarM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRenovarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenovarMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pInicioLayout = new javax.swing.GroupLayout(pInicio);
        pInicio.setLayout(pInicioLayout);
        pInicioLayout.setHorizontalGroup(
            pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInicioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrarEntrada)
                        .addGap(18, 18, 18)
                        .addComponent(btnVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInicioLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnRenovarM)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE))
                .addContainerGap())
        );
        pInicioLayout.setVerticalGroup(
            pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addGroup(pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegistrarEntrada)
                        .addComponent(btnVisita))
                    .addComponent(btnRenovarM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        tpPrincipal.addTab("Inicio", pInicio);

        pSocios.setBackground(new java.awt.Color(252, 252, 252));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        tblaSocios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblaSocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Socio", "Nombre", "Primer Apellido", "Segundo Apellido", "Tipo de membresia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblaSocios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblaSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblaSociosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblaSocios);
        if (tblaSocios.getColumnModel().getColumnCount() > 0) {
            tblaSocios.getColumnModel().getColumn(0).setMinWidth(100);
            tblaSocios.getColumnModel().getColumn(0).setMaxWidth(150);
        }

        pNewSocio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNuevoSocio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNuevoSocio.setText("Nuevo Socio");
        pNewSocio.add(txtNuevoSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nombre (s):");
        pNewSocio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Primer Apellido:");
        pNewSocio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Segundo Apellido:");
        pNewSocio.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Tipo de Membresia:");
        pNewSocio.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 20));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pNewSocio.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 170, 20));

        txtApellido1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApellido1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pNewSocio.add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 170, 20));

        txtApellido2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApellido2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pNewSocio.add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 170, 20));

        cboxMembresia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboxMembresia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mensual", "Bimestral", "Trimestral", "Cuatrimestral", "Semestral", "Anual" }));
        cboxMembresia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        cboxMembresia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pNewSocio.add(cboxMembresia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 170, -1));

        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        pNewSocio.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 174, 49));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-users-100.png"))); // NOI18N
        pNewSocio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        btnCancelar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pNewSocio.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 90, 30));

        jtxtNumSocio.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jtxtNumSocio.setText("Num. Socio:");
        pNewSocio.add(jtxtNumSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 20));

        txtNumSocio.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNumSocio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pNewSocio.add(txtNumSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 170, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Buscar:");

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-búsqueda-16.png"))); // NOI18N
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditarSocio.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnEditarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-crear-nuevo-16.png"))); // NOI18N
        btnEditarSocio.setText("Editar");
        btnEditarSocio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarSocioActionPerformed(evt);
            }
        });

        btnEliminarSocio.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnEliminarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-eliminar-16.png"))); // NOI18N
        btnEliminarSocio.setText("Eliminar");
        btnEliminarSocio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSocioActionPerformed(evt);
            }
        });

        btnNewSocio.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnNewSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-más-16.png"))); // NOI18N
        btnNewSocio.setText("Nuevo Socio");
        btnNewSocio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNewSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewSocioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSociosLayout = new javax.swing.GroupLayout(pSocios);
        pSocios.setLayout(pSociosLayout);
        pSociosLayout.setHorizontalGroup(
            pSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSociosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
                    .addGroup(pSociosLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnNewSocio)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pNewSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pSociosLayout.setVerticalGroup(
            pSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSociosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(btnBuscar)
                    .addComponent(btnEditarSocio)
                    .addComponent(btnEliminarSocio)
                    .addComponent(btnNewSocio))
                .addGap(21, 21, 21)
                .addGroup(pSociosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pNewSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
                .addContainerGap())
        );

        tpPrincipal.addTab("Socios", pSocios);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("USUARIO:");

        txtUserName.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tpPrincipal)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNewUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addComponent(tpPrincipal)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        if(frmlog == null){
            frmlog = new JLogin();
            frmlog.setVisible(true); //Abre la ventana de login
            this.dispose(); //Cerrar ventana
        } 
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewUserActionPerformed
        if(frmNewUser == null){
            frmNewUser = new JNewUser(); //Abre la ventana de para registrar usuarios
            frmNewUser.setVisible(true);
        }
        btnNewUser.setFocusPainted(false);
    }//GEN-LAST:event_btnNewUserActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        SqlSocio modsqlscio = new SqlSocio();
        NewSocio modscio = new NewSocio();

        if(this.panelNewSocio){
            if(txtNombre.getText().equals("") || txtApellido1.getText().equals("") || txtApellido2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");
            }else{
                /*Obtenemos Fecha y Hora de registro de usuario*/
                Date date = new Date();
                Calendar c = Calendar.getInstance();
                c.setTime(date);

                DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
                DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                modscio.setNombre(upperCaseFirst(txtNombre.getText()));
                modscio.setApellidoP(upperCaseFirst(txtApellido1.getText()));
                modscio.setApellidoM(upperCaseFirst(txtApellido2.getText()));
                modscio.setTipoMembresia(cboxMembresia.getSelectedItem().toString());

                c.add(Calendar.MONTH, cboxMembresia.getSelectedIndex() + 1);
                modscio.setFechaInscripcion(fecha.format(date));
                modscio.setFechaMembrecias(fecha.format(c.getTime()));
                modscio.setUltimaEntrada(fechaHora.format(date));

                String numSocio = (modscio.getApellidoP().substring(0,2) + modscio.getNombre().substring(0,1) + "00").toLowerCase();
                modscio.setNumeroSocio(numSocio);

                if(modsqlscio.existeSocio(modscio) == 0){
                    if (modsqlscio.registrarSocio(modscio, this.mod)) {
                        JOptionPane.showMessageDialog(null, "Registro guardado");

                        limpiarNewSocio();
                        mostrarClientes();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al guardar");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Existe el Socio");
                }
            }
        }
        
        if(this.panelEditSocio){
            
            if (txtNombre.getText().equals("") && txtApellido1.getText().equals("") && txtApellido2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ningun campo puede estar vasio");
            }else{
                if (modsqlscio.editSocio(txtNumSocio.getText(), txtNombre.getText(), txtApellido1.getText(), txtApellido2.getText())) {
                            JOptionPane.showMessageDialog(null, "Registro Editado Correctamente");

                            limpiarNewSocio();
                            pNewSocio.setVisible(false);
                            this.panelNewSocio = false;
                            this.panelEditSocio = false;
                            mostrarClientes();
                } else {
                            JOptionPane.showMessageDialog(null, "Error al guardar");
                }
            }
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed

        if(!ventanaInicio){
            tpPrincipal.addTab("Inicio",pInicio);
            tpPrincipal.addTab("Socios",pSocios);
        
            tpPrincipal.remove(vt);
            tpPrincipal.remove(prtos);
        
            tpPrincipal.setSelectedComponent(pInicio);
        
            ventanaInicio = true;
            ventanaVenta = false;
        }else{
            System.out.println("Ya estas en la ventana Inicio");
        }
        
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        if(!ventanaVenta){
            vt = new PJVenta(mod);
            tpPrincipal.addTab("Venta",vt);
            prtos = new PJProductos(mod);
            tpPrincipal.addTab("Productos",prtos);

            tpPrincipal.remove(pInicio);
            tpPrincipal.remove(pSocios);

            tpPrincipal.setSelectedComponent(vt);

            ventanaVenta = true;
            ventanaInicio = false;
        }else{
            System.out.println("Ya estas en la ventana de Ventas");
        }    
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnEditarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarSocioActionPerformed
        
        pNewSocio.setVisible(true);
        this.panelNewSocio = false;
        this.panelEditSocio = true;
        jtxtNumSocio.setVisible(true);
        txtNumSocio.setVisible(true);
        
        txtNuevoSocio.setText("Editar Socio");
        int i = tblaSocios.getSelectedRow();

        String numSocio = tblaSocios.getValueAt(i, 0).toString();
        String nombre = tblaSocios.getValueAt(i, 1).toString();
        String apellido1 = tblaSocios.getValueAt(i, 2).toString();
        String apellido2 = tblaSocios.getValueAt(i, 3).toString();
        String membresia = tblaSocios.getValueAt(i, 4).toString();

        txtNumSocio.setText(numSocio);
        txtNombre.setText(nombre);
        txtApellido1.setText(apellido1);
        txtApellido2.setText(apellido2);
        cboxMembresia.setSelectedItem(membresia);
        
        
        cboxMembresia.setEnabled(false);
        txtNumSocio.setEnabled(false);

    }//GEN-LAST:event_btnEditarSocioActionPerformed

    private void btnNewSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewSocioActionPerformed

        if(!this.panelNewSocio | panelEditSocio){
            pNewSocio.setVisible(true);
            this.panelNewSocio = true;
            this.panelEditSocio = true;

            txtNuevoSocio.setText("Nuevo Socio");
            
            txtNumSocio.setText("");
            txtNombre.setText("");
            txtApellido1.setText("");
            txtApellido2.setText("");
            cboxMembresia.setSelectedIndex(0);
            jtxtNumSocio.setVisible(false);
            txtNumSocio.setVisible(false);
            cboxMembresia.setEnabled(true);
            
        }else{
            pNewSocio.setVisible(false);
            this.panelNewSocio = false;
        }
    }//GEN-LAST:event_btnNewSocioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        pNewSocio.setVisible(false);
        this.panelNewSocio = false;
        this.panelEditSocio = false;
        
        btnEditarSocio.setEnabled(false);
        btnEliminarSocio.setEnabled(false);
        tblaSocios.clearSelection();
        
        txtNombre.setText("");
        txtApellido1.setText("");
        txtApellido2.setText("");
        cboxMembresia.setSelectedIndex(0);
        cboxMembresia.setEnabled(true);
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblaSociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblaSociosMouseClicked
        btnEditarSocio.setEnabled(true);
        btnEliminarSocio.setEnabled(true);
    }//GEN-LAST:event_tblaSociosMouseClicked

    private void tblaVencidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblaVencidosMouseClicked
        btnRenovarM.setEnabled(true);
        
        tblaVisitantes.clearSelection();
        btnRegistrarEntrada.setEnabled(false);
    }//GEN-LAST:event_tblaVencidosMouseClicked

    private void tblaVisitantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblaVisitantesMouseClicked
        btnRegistrarEntrada.setEnabled(true);
        
        tblaVencidos.clearSelection();
        btnRenovarM.setEnabled(false);
    }//GEN-LAST:event_tblaVisitantesMouseClicked

    private void btnRenovarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenovarMActionPerformed
        int i = tblaVencidos.getSelectedRow();
        String numSocio = tblaVencidos.getValueAt(i, 0).toString();
        String nombre = tblaVencidos.getValueAt(i, 0).toString();
        String apellido1 = tblaVencidos.getValueAt(i, 0).toString();
        String apellido2 = tblaVencidos.getValueAt(i, 0).toString();
        
        if(frmRenovar == null){
            frmRenovar = new jRenovar(numSocio, nombre, apellido1, apellido2); //Abre la ventana de para registrar una visita
            frmRenovar.setVisible(true);
        }
        
        mostrarClientes();
    }//GEN-LAST:event_btnRenovarMActionPerformed

    private void btnRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEntradaActionPerformed
        SqlSocio modsqlscio = new SqlSocio();
        
        Date date = new Date();
        DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        int i = tblaVisitantes.getSelectedRow();
        String numSocio = tblaVisitantes.getValueAt(i, 0).toString();
        
        modsqlscio.registrarEntrada(numSocio, mod, fechaHora.format(date));
        
        mostrarClientes();
    }//GEN-LAST:event_btnRegistrarEntradaActionPerformed

    private void btnVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitaActionPerformed
        
        if(frmVisita == null){
            frmVisita = new JVisita(); //Abre la ventana de para registrar una visita
            frmVisita.setVisible(true);
        }
        
        mostrarClientes();
    }//GEN-LAST:event_btnVisitaActionPerformed

    private void btnEliminarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSocioActionPerformed
        SqlSocio modsqlscio = new SqlSocio();
        int i = tblaSocios.getSelectedRow();
        String numSocio = tblaSocios.getValueAt(i, 0).toString();
        String nombre = tblaSocios.getValueAt(i, 1).toString() + " " + tblaSocios.getValueAt(i, 2).toString() + " " + tblaSocios.getValueAt(i, 3).toString();
        
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar a: " + nombre + "?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE); 
        
        if(resp == 0){
  
        modsqlscio.eliminar(numSocio, mod);
        mostrarClientes();
        JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
        }
        
    }//GEN-LAST:event_btnEliminarSocioActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       
        if(txtBuscar.getText().equals("")){
            mostrarClientes();
        }else{
        SqlSocio logica = new SqlSocio();
        DefaultTableModel modelo = logica.buscar(txtBuscar.getText());
        
        tblaSocios.setModel(new DefaultTableModel());
        tblaSocios.setModel(modelo);
        }
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAceptar;
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JToggleButton btnEditarSocio;
    private javax.swing.JToggleButton btnEliminarSocio;
    private javax.swing.JButton btnInicio;
    private javax.swing.JToggleButton btnNewSocio;
    private javax.swing.JToggleButton btnNewUser;
    public static javax.swing.JToggleButton btnRegistrarEntrada;
    public static javax.swing.JToggleButton btnRenovarM;
    private javax.swing.JToggleButton btnVenta;
    private javax.swing.JToggleButton btnVisita;
    private javax.swing.JComboBox<String> cboxMembresia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jtxtNumSocio;
    private javax.swing.JPanel pInicio;
    private javax.swing.JPanel pNewSocio;
    private javax.swing.JPanel pSocios;
    private javax.swing.JTable tblaSocios;
    private javax.swing.JTable tblaVencidos;
    private javax.swing.JTable tblaVisitantes;
    private javax.swing.JTabbedPane tpPrincipal;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtNuevoSocio;
    private javax.swing.JTextField txtNumSocio;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables
}
