/**
 * @author Sandro Martínez Pérez
 * @author Fernando David Gómez Gutierrez
 * @author Carlos Alberto Lara Hernández
 */
package GUIs.Listar;

import Clases.Animal;
import Clases.Veterinarian;
import DB.Animal_DB;
import DB.Revision_DB;
import DB.Veterinarian_DB;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class PanelListarRevisiones extends javax.swing.JPanel {

    private final Veterinarian_DB VDB;
    private final Animal_DB ADB;
    private final Revision_DB RDB;
    public ArrayList<Veterinarian> vList = new ArrayList<>();
    public ArrayList<Animal> aList = new ArrayList<>();
    
    public PanelListarRevisiones() {
        initComponents();
        VDB = new Veterinarian_DB();
        ADB = new Animal_DB();
        RDB = new Revision_DB();
        vList = VDB.generarLista();
        aList = ADB.generarLista();
        
        
        for (Veterinarian v : vList) {
            cb_idVeterinario.addItem(String.valueOf(v.getID()));
        }
        for (Animal a : aList) {
            cb_idAnimal.addItem(String.valueOf(a.getId()));
        }
        this.limpiar();
    }
    public void limpiar() {
        cb_idAnimal.setSelectedIndex(-1);
        cb_idVeterinario.setSelectedIndex(-1);
        ct_Observaciones.setText("");
        jdc_fRevision.setDate(null);
        for (Component component : jPanel1.getComponents ()) { component.setEnabled (false); }
        b_Actualizar.setEnabled(false);
        b_Eliminar.setEnabled(false);
        b_Limpiar.setEnabled(false);
        this.listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ct_idRevision = new javax.swing.JTextField();
        cb_idAnimal = new javax.swing.JComboBox<>();
        cb_idVeterinario = new javax.swing.JComboBox<>();
        jdc_fRevision = new com.toedter.calendar.JDateChooser();
        ct_Observaciones = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Revisiones = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        b_Eliminar = new javax.swing.JButton();
        b_Actualizar = new javax.swing.JButton();
        b_Limpiar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Revisiones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Revisión"));

        jLabel1.setText("ID de Revisión:");

        jLabel2.setText("ID de Animal:");

        jLabel3.setText("ID de Veterinario:");

        jLabel4.setText("Fecha de Revisión:");

        jLabel5.setText("Observaciones:");

        ct_idRevision.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(ct_idRevision, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cb_idAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cb_idVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jdc_fRevision, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(ct_Observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ct_idRevision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_idAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cb_idVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdc_fRevision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ct_Observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel6.setText("Revisiones registradas en la base de datos:");

        jt_Revisiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jt_Revisiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_RevisionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_Revisiones);

        b_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarR.png"))); // NOI18N
        b_Eliminar.setText("Eliminar");
        b_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_EliminarActionPerformed(evt);
            }
        });

        b_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alta1.JPG"))); // NOI18N
        b_Actualizar.setText("Actualizar");
        b_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(b_Actualizar))
                .addContainerGap())
        );

        b_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.JPG"))); // NOI18N
        b_Limpiar.setText("Limpiar");
        b_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_Limpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b_Limpiar)
                        .addGap(39, 39, 39))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_EliminarActionPerformed
        int res = 0;
        int fila = jt_Revisiones.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "Selecciona un registro de la tabla",
                    "Eliminar registro", 1);
        } else {
            res = RDB.eliminarRegistro(Integer.parseInt(jt_Revisiones.getValueAt(fila, 0).toString()));
            if (res > 0) {
                this.limpiar();
                this.listar();
            }
        }
    }//GEN-LAST:event_b_EliminarActionPerformed

    private void jt_RevisionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_RevisionesMouseClicked
        b_Actualizar.setEnabled(true);
        b_Eliminar.setEnabled(true);
        b_Limpiar.setEnabled(true);
        jPanel1.setEnabled(true);
        for (Component component : jPanel1.getComponents ()) { component.setEnabled (true); }
        ct_idRevision.setEnabled(false);
        
        
        
        int fila = jt_Revisiones.getSelectedRow();
        ct_idRevision.setText(jt_Revisiones.getValueAt(fila, 0).toString());
        cb_idAnimal.setSelectedItem(jt_Revisiones.getValueAt(fila, 1).toString());
        cb_idVeterinario.setSelectedItem(jt_Revisiones.getValueAt(fila, 2).toString());
        ct_Observaciones.setText(jt_Revisiones.getValueAt(fila, 4).toString());
        
        String fecha = jt_Revisiones.getValueAt(fila, 3).toString();
        Date fechaR;
        try {
            fechaR = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Error en fecha", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        jdc_fRevision.setDate(fechaR);
    }//GEN-LAST:event_jt_RevisionesMouseClicked

    private void b_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_LimpiarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_b_LimpiarActionPerformed

    private void b_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ActualizarActionPerformed
        if(cb_idAnimal.getSelectedIndex() == -1 || 
                cb_idVeterinario.getSelectedIndex() == -1 ||
                ct_Observaciones.getText().equals("") || 
                jdc_fRevision.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            
            int idAnimal, idVeterinario;
            String obs;
            idAnimal = Integer.parseInt(cb_idAnimal.getSelectedItem().toString());
            idVeterinario = Integer.parseInt(cb_idVeterinario.getSelectedItem().toString());
            obs = ct_Observaciones.getText();
            Date fRevision = jdc_fRevision.getDate();
            Animal a = ADB.buscarAnimal(Integer.parseInt(cb_idAnimal.getSelectedItem().toString()));
            Veterinarian v = VDB.buscarVeterinario(Integer.parseInt(cb_idVeterinario.getSelectedItem().toString()));
            
            if(fRevision == null || fRevision.before(jdc_fRevision.getMinSelectableDate()) || fRevision.after(jdc_fRevision.getMaxSelectableDate())) {
                JOptionPane.showMessageDialog(null, "Error en fecha", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (a.getDOB().isAfter(v.getDateOfHire())) {
                ZonedDateTime zonedDateTime = a.getDOB().atStartOfDay(ZoneId.systemDefault());
                Instant instant = zonedDateTime.toInstant();
                Date utilDate = Date.from(instant);
                if(fRevision.before(utilDate)) {
                    JOptionPane.showMessageDialog(null, "Error en fechas", "ERROR", JOptionPane.ERROR_MESSAGE);
                    jdc_fRevision.setMinSelectableDate(utilDate);
                    return;
                }
            } else {
                ZonedDateTime zonedDateTime = v.getDateOfHire().atStartOfDay(ZoneId.systemDefault());
                Instant instant = zonedDateTime.toInstant();
                Date utilDate = Date.from(instant);
                if(fRevision.before(utilDate)) {
                    JOptionPane.showMessageDialog(null, "Error en fechas", "ERROR", JOptionPane.ERROR_MESSAGE);
                    jdc_fRevision.setMinSelectableDate(utilDate);
                    return;
                }
            }
            int revision_id = Integer.parseInt(ct_idRevision.getText());
            int res = RDB.actualizarRegistro(idAnimal, idVeterinario, new java.sql.Date(fRevision.getTime()), obs, revision_id);
            if (res > 0) {
                this.limpiar();
            }
        }
    }//GEN-LAST:event_b_ActualizarActionPerformed
    
    
    public void listar() {
        jt_Revisiones.setModel(RDB.getDatos());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Actualizar;
    private javax.swing.JButton b_Eliminar;
    private javax.swing.JButton b_Limpiar;
    private javax.swing.JComboBox<String> cb_idAnimal;
    private javax.swing.JComboBox<String> cb_idVeterinario;
    private javax.swing.JTextField ct_Observaciones;
    private javax.swing.JTextField ct_idRevision;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdc_fRevision;
    private javax.swing.JTable jt_Revisiones;
    // End of variables declaration//GEN-END:variables
}
