/**
 * @author Sandro Martínez Pérez
 * @author Fernando David Gómez Gutierrez
 * @author Carlos Alberto Lara Hernández
 */
package GUIs.Alta;

import DB.Animal_DB;
import DB.Revision_DB;
import DB.Veterinarian_DB;
import Clases.Animal;
import Clases.Veterinarian;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PanelAltaRevision extends javax.swing.JPanel {

    private final Veterinarian_DB VDB;
    private final Animal_DB ADB;
    private final Revision_DB RDB;
    public ArrayList<Veterinarian> vList = new ArrayList<>();
    public ArrayList<Animal> aList = new ArrayList<>();
    
    public PanelAltaRevision() {
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
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb_idAnimal = new javax.swing.JComboBox<>();
        cb_idVeterinario = new javax.swing.JComboBox<>();
        jdc_fRevision = new com.toedter.calendar.JDateChooser();
        ct_Observaciones = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        b_Guardar = new javax.swing.JButton();
        b_Limpiar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alta de Revisión", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gadugi", 1, 36), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("ID de Animal:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("ID de Veterinario:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Fecha de Revisión:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Observaciones:");

        cb_idAnimal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cb_idAnimal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_idAnimalItemStateChanged(evt);
            }
        });
        cb_idAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_idAnimalActionPerformed(evt);
            }
        });

        cb_idVeterinario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        cb_idVeterinario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_idVeterinarioItemStateChanged(evt);
            }
        });
        cb_idVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_idVeterinarioActionPerformed(evt);
            }
        });

        jdc_fRevision.setMaxSelectableDate(new Date());
        jdc_fRevision.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jdc_fRevisionFocusGained(evt);
            }
        });
        jdc_fRevision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdc_fRevisionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jdc_fRevisionMouseEntered(evt);
            }
        });
        jdc_fRevision.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdc_fRevisionPropertyChange(evt);
            }
        });

        ct_Observaciones.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_Guardar)
                    .addComponent(b_Limpiar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(581, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_idAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_idVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdc_fRevision, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ct_Observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_idAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_idVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jdc_fRevision, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ct_Observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_GuardarActionPerformed
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
            
            if(fRevision == null) {
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
            
            int res = RDB.insertarRegistro(idAnimal, idVeterinario, new java.sql.Date(fRevision.getTime()), obs);
            if (res > 0) {
                this.b_LimpiarActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_b_GuardarActionPerformed

    private void b_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_LimpiarActionPerformed
        cb_idAnimal.setSelectedIndex(-1);
        cb_idVeterinario.setSelectedIndex(-1);
        ct_Observaciones.setText("");
        jdc_fRevision.setDate(null);
    }//GEN-LAST:event_b_LimpiarActionPerformed

    private void cb_idAnimalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_idAnimalItemStateChanged
        
    }//GEN-LAST:event_cb_idAnimalItemStateChanged

    private void cb_idVeterinarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_idVeterinarioItemStateChanged
        
    }//GEN-LAST:event_cb_idVeterinarioItemStateChanged

    private void cb_idAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_idAnimalActionPerformed
        
    }//GEN-LAST:event_cb_idAnimalActionPerformed

    private void cb_idVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_idVeterinarioActionPerformed
        
    }//GEN-LAST:event_cb_idVeterinarioActionPerformed

    private void jdc_fRevisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdc_fRevisionMouseClicked

    }//GEN-LAST:event_jdc_fRevisionMouseClicked

    private void jdc_fRevisionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdc_fRevisionMouseEntered
          
    }//GEN-LAST:event_jdc_fRevisionMouseEntered

    private void jdc_fRevisionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jdc_fRevisionFocusGained
        
    }//GEN-LAST:event_jdc_fRevisionFocusGained

    private void jdc_fRevisionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdc_fRevisionPropertyChange
        
    }//GEN-LAST:event_jdc_fRevisionPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Guardar;
    private javax.swing.JButton b_Limpiar;
    private javax.swing.JComboBox<String> cb_idAnimal;
    private javax.swing.JComboBox<String> cb_idVeterinario;
    private javax.swing.JTextField ct_Observaciones;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jdc_fRevision;
    // End of variables declaration//GEN-END:variables
}
