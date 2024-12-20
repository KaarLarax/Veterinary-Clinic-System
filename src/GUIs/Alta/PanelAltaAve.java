/**
 * @author Sandro Martínez Pérez
 * @author Fernando David Gómez Gutierrez
 * @author Carlos Alberto Lara Hernández
 */
package GUIs.Alta;

import DB.Bird_DB;
import java.util.Date;
import javax.swing.JOptionPane;

public class PanelAltaAve extends javax.swing.JPanel {
    
    private final Bird_DB BDB;
    
    public PanelAltaAve() {
        initComponents();
        BDB = new Bird_DB();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_Sexo = new javax.swing.ButtonGroup();
        bg_Vuela = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ct_Nombre = new javax.swing.JTextField();
        ct_Color = new javax.swing.JTextField();
        rb_Macho = new javax.swing.JRadioButton();
        rb_Hembra = new javax.swing.JRadioButton();
        jdc_fNacimiento = new com.toedter.calendar.JDateChooser();
        rb_Si = new javax.swing.JRadioButton();
        rb_No = new javax.swing.JRadioButton();
        cb_TipoPico = new javax.swing.JComboBox<>();
        cb_Tamano = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        b_Guardar = new javax.swing.JButton();
        b_Limpiar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alta de Ave", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 36), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Color:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Sexo:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Fecha de Nacimiento:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Tipo de Pico:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setText("Capacidad de Volar:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText("Tamaño:");

        ct_Nombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        ct_Color.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        bg_Sexo.add(rb_Macho);
        rb_Macho.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        rb_Macho.setText("Macho");

        bg_Sexo.add(rb_Hembra);
        rb_Hembra.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        rb_Hembra.setText("Hembra");

        jdc_fNacimiento.setMaxSelectableDate(new Date());
        jdc_fNacimiento.setMinSelectableDate(new java.util.Date(946710060000L));

        bg_Vuela.add(rb_Si);
        rb_Si.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        rb_Si.setText("Sí");

        bg_Vuela.add(rb_No);
        rb_No.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        rb_No.setText("No");

        cb_TipoPico.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cb_TipoPico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pico Cónico", "Pico Gancho", "Pico Conico-Curvado", "Pico de Espátula", "Pico Aguja", "Pico Perforador", "Pico Tubular", "Pico Martillo", " " }));
        cb_TipoPico.setSelectedIndex(-1);

        cb_Tamano.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cb_Tamano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeño", "Mediano", "Grande", "Muy Grande", "Envergadura de Alas Grande", " " }));
        cb_Tamano.setSelectedIndex(-1);

        b_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.JPG"))); // NOI18N
        b_Guardar.setText("Guardar");
        b_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_GuardarActionPerformed(evt);
            }
        });

        b_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.JPG"))); // NOI18N
        b_Limpiar.setText("Limpiar");
        b_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_Limpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_Guardar)
                .addGap(139, 139, 139))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_Guardar)
                    .addComponent(b_Limpiar))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_TipoPico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_Si)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_No))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_Tamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_Macho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_Hembra))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ct_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdc_fNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ct_Color, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(404, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ct_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ct_Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rb_Macho)
                    .addComponent(rb_Hembra))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cb_TipoPico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(rb_Si)
                            .addComponent(rb_No))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cb_Tamano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jdc_fNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_LimpiarActionPerformed
        cb_Tamano.setSelectedIndex(-1);
        cb_TipoPico.setSelectedIndex(-1);
        bg_Sexo.clearSelection();
        bg_Vuela.clearSelection();
        ct_Color.setText("");
        ct_Nombre.setText("");
        jdc_fNacimiento.setDate(null);
    }//GEN-LAST:event_b_LimpiarActionPerformed

    private void b_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_GuardarActionPerformed
        if(cb_Tamano.getSelectedIndex() == -1 || 
                cb_TipoPico.getSelectedIndex() == -1 || 
                ct_Color.getText().equals("") ||
                ct_Nombre.getText().equals("") || 
                jdc_fNacimiento.getDate() == null || 
                bg_Sexo.getSelection() == null ||
                bg_Vuela.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "ERROR", JOptionPane.ERROR_MESSAGE);
            
        } else {
            String name, color, tamano, sexo, tipoPico;
            int vuela;
            Date fNacimiento;
            color = ct_Color.getText();
            tamano = cb_Tamano.getItemAt(cb_Tamano.getSelectedIndex());
            tipoPico = cb_TipoPico.getItemAt(cb_TipoPico.getSelectedIndex());
            fNacimiento = jdc_fNacimiento.getDate();
            name = ct_Nombre.getText();
            
            if(fNacimiento == null || fNacimiento.before(jdc_fNacimiento.getMinSelectableDate()) || fNacimiento.after(jdc_fNacimiento.getMaxSelectableDate())) {
                JOptionPane.showMessageDialog(null, "Error en fecha", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if(rb_No.isSelected()) {
                vuela = 0;
            } else {
                vuela = 1;
            }
            if(rb_Macho.isSelected()) {
                sexo = "M";
            } else {
                sexo = "F";
            }
            int res = BDB.insertarRegistro("bird", name, color, sexo, new java.sql.Date(fNacimiento.getTime()), tipoPico, vuela, tamano);
            if (res > 0) {
                this.b_LimpiarActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_b_GuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Guardar;
    private javax.swing.JButton b_Limpiar;
    private javax.swing.ButtonGroup bg_Sexo;
    private javax.swing.ButtonGroup bg_Vuela;
    private javax.swing.JComboBox<String> cb_Tamano;
    private javax.swing.JComboBox<String> cb_TipoPico;
    private javax.swing.JTextField ct_Color;
    private javax.swing.JTextField ct_Nombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jdc_fNacimiento;
    private javax.swing.JRadioButton rb_Hembra;
    private javax.swing.JRadioButton rb_Macho;
    private javax.swing.JRadioButton rb_No;
    private javax.swing.JRadioButton rb_Si;
    // End of variables declaration//GEN-END:variables
    
}
