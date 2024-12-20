/**
 * @author Sandro Martínez Pérez
 * @author Fernando David Gómez Gutierrez
 * @author Carlos Alberto Lara Hernández
 */
package GUIs;

import DB.Revision_DB;
import DB.Animal_DB;
import Clases.Veterinarian;
import DB.Veterinarian_DB;
import Clases.Animal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class PanelDetalleRevision extends javax.swing.JPanel {

    private final Revision_DB revision_DB;

    public PanelDetalleRevision() {
        initComponents();
        revision_DB = new Revision_DB();
        listar();
        limpiar();
    }

    private void listar() {
        for (int i = 0; i < revision_DB.getDatos().getRowCount(); i++) {
            int auxid = (int) revision_DB.getDatos().getValueAt(i, 0);
            ct_idRevision.addItem(auxid);
        }
    }

    private void limpiar() {
        ct_idAnimal.setText("");
        ct_ColorAnimal.setText("");
        ct_EdadAnimal.setText("");
        ct_NombreAnimal.setText("");
        ct_SexoAnimal.setText("");
        ct_EspecialidadVeterinario.setText("");
        ct_NombreVeterinario.setText("");
        ct_idVeterinario.setText("");
        ct_Observaciones.setText("");
        Date date = new Date();
        jDC_FCV.setDate(date);
        jDC_FNA.setDate(date);
        jDC_FNV.setDate(date);
        jDC_FR.setDate(date);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ct_idRevision = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ct_idAnimal = new javax.swing.JTextField();
        ct_NombreAnimal = new javax.swing.JTextField();
        ct_ColorAnimal = new javax.swing.JTextField();
        ct_EdadAnimal = new javax.swing.JTextField();
        ct_SexoAnimal = new javax.swing.JTextField();
        jDC_FNA = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ct_idVeterinario = new javax.swing.JTextField();
        ct_NombreVeterinario = new javax.swing.JTextField();
        ct_EspecialidadVeterinario = new javax.swing.JTextField();
        jDC_FNV = new com.toedter.calendar.JDateChooser();
        jDC_FCV = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ct_Observaciones = new javax.swing.JTextField();
        jDC_FR = new com.toedter.calendar.JDateChooser();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ver a Detalle una Revisión", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 36))); // NOI18N

        jLabel1.setText("ID de Revisión:");

        ct_idRevision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct_idRevisionActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Animal"));

        jLabel2.setText("ID de Animal: ");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Color:");

        jLabel5.setText("Edad:");

        jLabel6.setText("Sexo:");

        jLabel7.setText("Fecha de Nacimiento:");

        ct_idAnimal.setEditable(false);
        ct_idAnimal.setDisabledTextColor(new java.awt.Color(75, 110, 175));
        ct_idAnimal.setEnabled(false);

        ct_NombreAnimal.setEditable(false);
        ct_NombreAnimal.setDisabledTextColor(new java.awt.Color(75, 110, 175));
        ct_NombreAnimal.setEnabled(false);

        ct_ColorAnimal.setEditable(false);
        ct_ColorAnimal.setDisabledTextColor(new java.awt.Color(75, 110, 175));
        ct_ColorAnimal.setEnabled(false);

        ct_EdadAnimal.setEditable(false);
        ct_EdadAnimal.setDisabledTextColor(new java.awt.Color(75, 110, 175));
        ct_EdadAnimal.setEnabled(false);

        ct_SexoAnimal.setEditable(false);
        ct_SexoAnimal.setDisabledTextColor(new java.awt.Color(75, 110, 175));
        ct_SexoAnimal.setEnabled(false);

        jDC_FNA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 110, 175)));
        jDC_FNA.setToolTipText("");
        jDC_FNA.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ct_SexoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDC_FNA, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(ct_idAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(ct_NombreAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ct_EdadAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(ct_ColorAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ct_idAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ct_NombreAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(ct_SexoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDC_FNA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ct_EdadAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct_ColorAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(82, 82, 82))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Veterinario"));

        jLabel11.setText("ID del Veterinario:");

        jLabel12.setText("Nombre:");

        jLabel13.setText("Especialidad:");

        jLabel14.setText("Fecha de Nacimiento:");

        jLabel15.setText("Fecha de Contratación:");

        ct_idVeterinario.setEditable(false);
        ct_idVeterinario.setDisabledTextColor(new java.awt.Color(75, 110, 175));
        ct_idVeterinario.setEnabled(false);

        ct_NombreVeterinario.setEditable(false);
        ct_NombreVeterinario.setDisabledTextColor(new java.awt.Color(75, 110, 175));
        ct_NombreVeterinario.setEnabled(false);
        ct_NombreVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ct_NombreVeterinarioActionPerformed(evt);
            }
        });

        ct_EspecialidadVeterinario.setEditable(false);
        ct_EspecialidadVeterinario.setDisabledTextColor(new java.awt.Color(75, 110, 175));
        ct_EspecialidadVeterinario.setEnabled(false);

        jDC_FNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 110, 175)));
        jDC_FNV.setEnabled(false);

        jDC_FCV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 110, 175)));
        jDC_FCV.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDC_FCV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jDC_FNV, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(ct_NombreVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(ct_EspecialidadVeterinario))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(ct_idVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ct_idVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ct_NombreVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(ct_EspecialidadVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jDC_FNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDC_FCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Revisión"));

        jLabel16.setText("Fecha de Revisión:");

        jLabel17.setText("Observaciones:");

        ct_Observaciones.setEditable(false);
        ct_Observaciones.setDisabledTextColor(new java.awt.Color(75, 110, 175));
        ct_Observaciones.setEnabled(false);

        jDC_FR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 110, 175)));
        jDC_FR.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDC_FR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(26, 26, 26)
                .addComponent(ct_Observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDC_FR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ct_Observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(ct_idRevision, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ct_idRevision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ct_idRevisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct_idRevisionActionPerformed
        //Mostrando datos de la revision
        int idexAux = ct_idRevision.getSelectedIndex();
        Date fechaRevision = (Date) revision_DB.getDatos().getValueAt(idexAux, 3);
        jDC_FR.setDate(fechaRevision);
        String observaciones = revision_DB.getDatos().getValueAt(idexAux, 4).toString();
        ct_Observaciones.setText(observaciones);
        //Mostrando datos del animal
        Animal_DB adb = new Animal_DB();
        int animalId = (int) revision_DB.getDatos().getValueAt(idexAux, 1);
        ct_idAnimal.setText(String.valueOf(animalId));
        Animal animalAux = adb.buscarAnimal(animalId);
        ct_NombreAnimal.setText(animalAux.getName());
        ct_SexoAnimal.setText(("M".equals(animalAux.getSex()) ? "Macho" : "Hembra"));
        Date fechaNA;
        try {
            fechaNA = new SimpleDateFormat("dd/MM/yyyy").parse(animalAux.getDateOfBirth());
        } catch (ParseException e) {
            System.out.println("Error en fechas...");
            return;
        }
        // Mostrar edad de animal
        jDC_FNA.setDate(fechaNA);
        LocalDate fechaActual = LocalDate.now();
        LocalDate bFAux = fechaNA.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period periodAux = Period.between(bFAux, fechaActual);
        ct_EdadAnimal.setText(periodAux.getYears() + " años, "
                + periodAux.getMonths() + " meses, "
                + periodAux.getDays() + " dias.");
        ct_ColorAnimal.setText(animalAux.getColor());   
        // Mostrando datos del veterinario
        int veterinarioId = (int) revision_DB.getDatos().getValueAt(idexAux, 2);
        ct_idVeterinario.setText(String.valueOf(veterinarioId));
        Veterinarian_DB xd = new Veterinarian_DB();
        Veterinarian veterinarioAux = xd.buscarVeterinario(veterinarioId);
        ct_NombreVeterinario.setText(veterinarioAux.getName());
        ct_EspecialidadVeterinario.setText(veterinarioAux.getSpecialization());
        // Fecha de nacimiento del veterinario
        String fechaNVString = veterinarioAux.getDateOfBirth().toString();
        Date fechaNV;
        try {
            fechaNV = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNVString);
        } catch (ParseException e) {
            System.out.println("Error en fechas.....");
            return;
        }
        jDC_FNV.setDate(fechaNV);
        // Fecha de contratacion del veterinario
        String fechaCVString = veterinarioAux.getDateOfHire().toString();
        Date fechaCV;
        try {
            fechaCV = new SimpleDateFormat("yyyy-MM-dd").parse(fechaCVString);
        } catch (ParseException e) {
            System.out.println("Error en fechas.....");
            return;
        }
        jDC_FCV.setDate(fechaCV);
    }//GEN-LAST:event_ct_idRevisionActionPerformed

    private void ct_NombreVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ct_NombreVeterinarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ct_NombreVeterinarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ct_ColorAnimal;
    private javax.swing.JTextField ct_EdadAnimal;
    private javax.swing.JTextField ct_EspecialidadVeterinario;
    private javax.swing.JTextField ct_NombreAnimal;
    private javax.swing.JTextField ct_NombreVeterinario;
    private javax.swing.JTextField ct_Observaciones;
    private javax.swing.JTextField ct_SexoAnimal;
    private javax.swing.JTextField ct_idAnimal;
    private javax.swing.JComboBox<Integer> ct_idRevision;
    private javax.swing.JTextField ct_idVeterinario;
    private com.toedter.calendar.JDateChooser jDC_FCV;
    private com.toedter.calendar.JDateChooser jDC_FNA;
    private com.toedter.calendar.JDateChooser jDC_FNV;
    private com.toedter.calendar.JDateChooser jDC_FR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
