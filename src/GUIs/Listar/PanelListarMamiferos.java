/**
 * @author Sandro Martínez Pérez
 * @author Fernando David Gómez Gutierrez
 * @author Carlos Alberto Lara Hernández
 */
package GUIs.Listar;

import DB.Mammal_DB;
import java.awt.Component;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PanelListarMamiferos extends javax.swing.JPanel {

    private final Mammal_DB MDB;
    public PanelListarMamiferos() {
        initComponents();
        MDB = new Mammal_DB();
        this.listar();
        this.limpiar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_Sexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Mamiferos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ct_idMamifero = new javax.swing.JTextField();
        ct_Nombre = new javax.swing.JTextField();
        ct_Color = new javax.swing.JTextField();
        rb_Macho = new javax.swing.JRadioButton();
        rb_Hembra = new javax.swing.JRadioButton();
        jdc_fNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        cb_TipoPelo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        ct_Dientes = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cb_Categoria = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        b_Eliminar = new javax.swing.JButton();
        b_Actualizar = new javax.swing.JButton();
        b_Limpiar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Mamíferos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24))); // NOI18N

        jLabel1.setText("Mamíferos registrados en la base de datos:");

        jt_Mamiferos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jt_Mamiferos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_MamiferosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_Mamiferos);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Mamífero"));

        jLabel2.setText("ID del Mamífero:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Color:");

        jLabel5.setText("Sexo:");

        jLabel6.setText("Fecha de Nacimiento:");

        ct_idMamifero.setEnabled(false);

        bg_Sexo.add(rb_Macho);
        rb_Macho.setText("Macho");

        bg_Sexo.add(rb_Hembra);
        rb_Hembra.setText("Hembra");

        jdc_fNacimiento.setMaxSelectableDate(new Date());
        jdc_fNacimiento.setMinSelectableDate(new java.util.Date(946710106000L));

        jLabel7.setText("Tipo de Pelo:");

        cb_TipoPelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Corto", "Mediano", "Largo" }));
        cb_TipoPelo.setSelectedIndex(-1);

        jLabel8.setText("No. de Dientes:");

        jLabel9.setText("Categoría:");

        cb_Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roedor", "Carnívoro", "Cetáceo", "Artiodáctilo", "Primate" }));
        cb_Categoria.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(ct_idMamifero, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(ct_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(rb_Macho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_Hembra)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(cb_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jdc_fNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(ct_Color, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(cb_TipoPelo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(ct_Dientes, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ct_idMamifero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ct_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ct_Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(cb_TipoPelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rb_Macho)
                    .addComponent(rb_Hembra)
                    .addComponent(jLabel9)
                    .addComponent(cb_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jdc_fNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ct_Dientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        b_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarR.png"))); // NOI18N
        b_Eliminar.setText("Eliminar");
        b_Eliminar.setEnabled(false);
        b_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_EliminarActionPerformed(evt);
            }
        });

        b_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alta1.JPG"))); // NOI18N
        b_Actualizar.setText("Actualizar");
        b_Actualizar.setEnabled(false);
        b_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ActualizarActionPerformed(evt);
            }
        });

        b_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.JPG"))); // NOI18N
        b_Limpiar.setText("Limpiar");
        b_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_Limpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_Actualizar)
                .addGap(18, 18, 18)
                .addComponent(b_Eliminar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_Eliminar)
                    .addComponent(b_Actualizar)
                    .addComponent(b_Limpiar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_EliminarActionPerformed
        int res = 0;
        int fila = jt_Mamiferos.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "Selecciona un registro de la tabla",
                    "Eliminar registro", 1);
        } else {
            try {
                res = MDB.eliminarRegistro(Integer.parseInt(jt_Mamiferos.getValueAt(fila, 0).toString()));
            } catch (SQLException ex) {
                Logger.getLogger(PanelListarMamiferos.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (res > 0) {
                this.limpiar();
                this.listar();
            }
        }
    }//GEN-LAST:event_b_EliminarActionPerformed

    private void jt_MamiferosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_MamiferosMouseClicked
        b_Actualizar.setEnabled(true);
        b_Eliminar.setEnabled(true);
        jPanel1.setEnabled(true);
        b_Limpiar.setEnabled(true);
        for (Component component : jPanel1.getComponents ()) { component.setEnabled (true); }
        ct_idMamifero.setEnabled(false);
        
        int fila = jt_Mamiferos.getSelectedRow();
        ct_idMamifero.setText(jt_Mamiferos.getValueAt(fila, 0).toString());
        ct_Nombre.setText(jt_Mamiferos.getValueAt(fila, 1).toString());
        ct_Color.setText(jt_Mamiferos.getValueAt(fila, 2).toString());
        ct_Dientes.setText(jt_Mamiferos.getValueAt(fila, 6).toString());
        cb_TipoPelo.setSelectedItem(jt_Mamiferos.getValueAt(fila, 5).toString());
        cb_Categoria.setSelectedItem(jt_Mamiferos.getValueAt(fila, 7).toString());
        if(jt_Mamiferos.getValueAt(fila, 3).toString().equals("F")) {
            rb_Hembra.setSelected(true);
        } else {
            rb_Macho.setSelected(true);
        }
        
        String fecha = jt_Mamiferos.getValueAt(fila, 4).toString();
        Date fechaN;
        try {
            fechaN = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Error en fecha", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        jdc_fNacimiento.setDate(fechaN);
       
    }//GEN-LAST:event_jt_MamiferosMouseClicked

    private void b_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ActualizarActionPerformed
        boolean band = false;
        if(ct_Color.getText().equals("") ||
                ct_Nombre.getText().equals("") ||
                ct_Dientes.getText().equals("") ||
                cb_Categoria.getSelectedIndex() == -1 ||
                cb_TipoPelo.getSelectedIndex() == -1 ||
                jdc_fNacimiento.getDate() == null ||
                bg_Sexo.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "ERROR", JOptionPane.ERROR_MESSAGE);
            band = true;
        } else {
            String name, color, categoria, tipoPelo, sexo;
            int dientes;
            Date fNacimiento;
            
            name = ct_Nombre.getText();
            try {
                dientes = Integer.parseInt(ct_Dientes.getText());
                if (dientes < 0 || dientes > 9280) {
                    JOptionPane.showMessageDialog(null, "El campo dientes debe ser un número entero positivo menor a 9280", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } catch (NumberFormatException e) {
                 JOptionPane.showMessageDialog(null, "El campo dientes debe ser un número entero positivo menor a 9280", "ERROR", JOptionPane.ERROR_MESSAGE);
                 return;
            }
            color = ct_Color.getText();
            categoria = cb_Categoria.getItemAt(cb_Categoria.getSelectedIndex());
            tipoPelo = cb_TipoPelo.getItemAt(cb_TipoPelo.getSelectedIndex());
            fNacimiento = jdc_fNacimiento.getDate();
            if(fNacimiento == null || fNacimiento.before(jdc_fNacimiento.getMinSelectableDate()) || fNacimiento.after(jdc_fNacimiento.getMaxSelectableDate())) {
                JOptionPane.showMessageDialog(null, "Error en fecha", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(rb_Macho.isSelected()) {
                sexo = "M";
            } else {
                sexo = "F";
            }
            int id = Integer.parseInt(ct_idMamifero.getText());
            int res = MDB.actualizarRegistro(name, color, sexo, 
                    new java.sql.Date(fNacimiento.getTime()), tipoPelo, 
                    dientes, categoria, id);
            if (res > 0) {
                this.limpiar();
                this.listar();
            }
        }
    }//GEN-LAST:event_b_ActualizarActionPerformed

    private void b_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_LimpiarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_b_LimpiarActionPerformed
    
    private void listar() {
        jt_Mamiferos.setModel(MDB.getDatos());
    }    
    
    public void limpiar() {
        ct_idMamifero.setText("");
        ct_Color.setText("");
        ct_Nombre.setText("");
        ct_Dientes.setText("");
        cb_Categoria.setSelectedIndex(-1);
        cb_TipoPelo.setSelectedIndex(-1);
        jdc_fNacimiento.setDate(null);
        bg_Sexo.clearSelection();
        for (Component component : jPanel1.getComponents ()) { component.setEnabled (false); }
        b_Actualizar.setEnabled(false);
        b_Eliminar.setEnabled(false);
        b_Limpiar.setEnabled(false);
        jPanel1.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Actualizar;
    private javax.swing.JButton b_Eliminar;
    private javax.swing.JButton b_Limpiar;
    private javax.swing.ButtonGroup bg_Sexo;
    private javax.swing.JComboBox<String> cb_Categoria;
    private javax.swing.JComboBox<String> cb_TipoPelo;
    private javax.swing.JTextField ct_Color;
    private javax.swing.JTextField ct_Dientes;
    private javax.swing.JTextField ct_Nombre;
    private javax.swing.JTextField ct_idMamifero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdc_fNacimiento;
    private javax.swing.JTable jt_Mamiferos;
    private javax.swing.JRadioButton rb_Hembra;
    private javax.swing.JRadioButton rb_Macho;
    // End of variables declaration//GEN-END:variables
}
