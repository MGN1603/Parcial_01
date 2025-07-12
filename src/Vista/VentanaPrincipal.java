package Vista;

import Controlador.ControladorPrincipal;
import Modelo.Paciente;
import Modelo.Receta;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());
    private final ControladorPrincipal controlador;

    public VentanaPrincipal(ControladorPrincipal controlador) {
        initComponents();
        this.controlador = controlador;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblIdPaciente = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblMedicamento = new javax.swing.JLabel();
        lblDosis = new javax.swing.JLabel();
        lblDias = new javax.swing.JLabel();
        txtIdPaciente = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtMedicamento = new javax.swing.JTextField();
        txtDosis = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReceta = new javax.swing.JTable();
        btnRegistrarReceta = new javax.swing.JButton();
        btnModificarDosis = new javax.swing.JButton();
        btnBuscarReceta = new javax.swing.JButton();
        btnEliminarReceta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondo.setBackground(new java.awt.Color(0, 0, 0));

        panelTitulo.setBackground(new java.awt.Color(153, 153, 153));

        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Recetas Medicas");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitulo)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lblIdPaciente.setForeground(new java.awt.Color(255, 255, 255));
        lblIdPaciente.setText("id Paciente:");

        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre Paciente:");

        lblMedicamento.setForeground(new java.awt.Color(255, 255, 255));
        lblMedicamento.setText("Medicamento:");

        lblDosis.setForeground(new java.awt.Color(255, 255, 255));
        lblDosis.setText("Dosis:");

        lblDias.setForeground(new java.awt.Color(255, 255, 255));
        lblDias.setText("Dias:");

        tablaReceta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaReceta);

        btnRegistrarReceta.setBackground(new java.awt.Color(153, 153, 153));
        btnRegistrarReceta.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarReceta.setText("Registrar Receta");
        btnRegistrarReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRecetaActionPerformed(evt);
            }
        });

        btnModificarDosis.setBackground(new java.awt.Color(153, 153, 153));
        btnModificarDosis.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarDosis.setText("Modificar Dosis");
        btnModificarDosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDosisActionPerformed(evt);
            }
        });

        btnBuscarReceta.setBackground(new java.awt.Color(153, 153, 153));
        btnBuscarReceta.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarReceta.setText("Buscar Receta");
        btnBuscarReceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRecetaActionPerformed(evt);
            }
        });

        btnEliminarReceta.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarReceta.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarReceta.setText("Eliminar Receta");

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(lblDosis, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(lblMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(lblIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(lblDias, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscarReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnModificarDosis, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarReceta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdPaciente)
                            .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMedicamento)
                            .addComponent(txtMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDosis)
                            .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDias)
                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarReceta)
                    .addComponent(btnModificarDosis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarReceta)
                    .addComponent(btnEliminarReceta))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRecetaActionPerformed
        // TODO add your handling code here:
        int idPaciente = Integer.parseInt(txtIdPaciente.getText());
        String nombrePaciente = txtNombre.getText();
        String medicamento = txtMedicamento.getText();
        int dosisPaciente = Integer.parseInt(txtDosis.getText());
        int dia = Integer.parseInt(txtDia.getText());
        Paciente paciente = new Paciente(idPaciente, nombrePaciente);
        Receta receta = new Receta(medicamento, dosisPaciente, dia);
        boolean guardar = controlador.agregarReceta(paciente, receta);
        if (guardar) {
            JOptionPane.showMessageDialog(null, "Se guardo la receta a el paciente correspondiente");
            llenarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "no se pudo Guardar la Receta al Paciente");
        }
    }//GEN-LAST:event_btnRegistrarRecetaActionPerformed

    private void btnModificarDosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDosisActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnModificarDosisActionPerformed

    private void btnBuscarRecetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRecetaActionPerformed
        // TODO add your handling code here:
        String ingresar = JOptionPane.showInputDialog(null, "Ingrese el Numero de su Documento:");
        int id = Integer.parseInt(ingresar);
        Paciente buscar = controlador.buscarPaciente(id);
        if (buscar != null) {
            String mensaje = """
                              Encontrado: Paciente
                             Documento: """ + buscar.getDocumento() + "\n"
                    + "Nombre: " + buscar.getNombre() + "\n"
                    + "Documento: " + buscar.getDocumento()+ "\n";
                    

            JOptionPane.showMessageDialog(null, mensaje, "Resultado de búsqueda", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "❌ No se encontró ninguna Propietario con ese N.Documento.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarRecetaActionPerformed

    public void llenarTabla() {
        int documento = Integer.parseInt(txtIdPaciente.getText());
        Paciente paciente = controlador.buscarPaciente(documento);
        tablaReceta.setModel(controlador.listarReceta(paciente));
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        ControladorPrincipal controladorventana = new ControladorPrincipal();
        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal(controladorventana).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarReceta;
    private javax.swing.JButton btnEliminarReceta;
    private javax.swing.JButton btnModificarDosis;
    private javax.swing.JButton btnRegistrarReceta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblDosis;
    private javax.swing.JLabel lblIdPaciente;
    private javax.swing.JLabel lblMedicamento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTable tablaReceta;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtDosis;
    private javax.swing.JTextField txtIdPaciente;
    private javax.swing.JTextField txtMedicamento;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
