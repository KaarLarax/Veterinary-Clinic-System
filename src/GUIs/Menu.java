/**
 * @author Sandro Martínez Pérez
 * @author Fernando David Gómez Gutierrez
 * @author Carlos Alberto Lara Hernández
 */

package GUIs;

import Conexion.Class_Conecction;
import GUIs.Alta.PanelAltaAve;
import GUIs.Alta.PanelAltaRevision;
import GUIs.Alta.PanelAltaMamifero;
import GUIs.Alta.PanelAltaVeterinario;
import GUIs.Listar.PanelListarAves;
import GUIs.Listar.PanelListarMamiferos;
import GUIs.Listar.PanelListarRevisiones;
import GUIs.Listar.PanelListarVeterinarios;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Menu extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    public Menu() {
        this.setContentPane(fondo);
        initComponents();
        bienvenida();  
    }

    public void bienvenida(){
        PanelBienvenida alta1 = new PanelBienvenida();
        alta1.setSize(1100, 600);
        alta1.setLocation(0, 0);
        
        PanelContent.removeAll();
        PanelContent.add(alta1, BorderLayout.CENTER);
        PanelContent.revalidate();
        PanelContent.repaint();
        b_Regresar.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContent = new javax.swing.JPanel();
        b_Regresar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Op_AltaMamifero = new javax.swing.JMenuItem();
        Op_AltaAve = new javax.swing.JMenuItem();
        Op_AltaVeterinario = new javax.swing.JMenuItem();
        Op_AltaRevision = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Op_ListarMamiferos = new javax.swing.JMenuItem();
        Op_ListarAves = new javax.swing.JMenuItem();
        Op_ListarVeterinarios = new javax.swing.JMenuItem();
        Op_ListarRevisiones = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Op_DetalleRevision = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PanelContentLayout = new javax.swing.GroupLayout(PanelContent);
        PanelContent.setLayout(PanelContentLayout);
        PanelContentLayout.setHorizontalGroup(
            PanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        PanelContentLayout.setVerticalGroup(
            PanelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        b_Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir2.JPG"))); // NOI18N
        b_Regresar.setText("Regresar");
        b_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_RegresarActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Semilight", 1, 24))); // NOI18N
        jMenuBar1.setForeground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N

        jMenu1.setBackground(new java.awt.Color(102, 102, 102));
        jMenu1.setForeground(new java.awt.Color(51, 51, 51));
        jMenu1.setText("Alta");
        jMenu1.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        Op_AltaMamifero.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        Op_AltaMamifero.setForeground(new java.awt.Color(51, 51, 51));
        Op_AltaMamifero.setText("Alta de un mamífero");
        Op_AltaMamifero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op_AltaMamiferoActionPerformed(evt);
            }
        });
        jMenu1.add(Op_AltaMamifero);

        Op_AltaAve.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        Op_AltaAve.setForeground(new java.awt.Color(51, 51, 51));
        Op_AltaAve.setText("Alta de un ave");
        Op_AltaAve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op_AltaAveActionPerformed(evt);
            }
        });
        jMenu1.add(Op_AltaAve);

        Op_AltaVeterinario.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        Op_AltaVeterinario.setForeground(new java.awt.Color(51, 51, 51));
        Op_AltaVeterinario.setText("Alta de un veterinario");
        Op_AltaVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op_AltaVeterinarioActionPerformed(evt);
            }
        });
        jMenu1.add(Op_AltaVeterinario);

        Op_AltaRevision.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        Op_AltaRevision.setForeground(new java.awt.Color(51, 51, 51));
        Op_AltaRevision.setText("Alta de una revisión");
        Op_AltaRevision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op_AltaRevisionActionPerformed(evt);
            }
        });
        jMenu1.add(Op_AltaRevision);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(51, 51, 51));
        jMenu2.setText("Listar");
        jMenu2.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N

        Op_ListarMamiferos.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        Op_ListarMamiferos.setForeground(new java.awt.Color(51, 51, 51));
        Op_ListarMamiferos.setText("Listar mamíferos");
        Op_ListarMamiferos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op_ListarMamiferosActionPerformed(evt);
            }
        });
        jMenu2.add(Op_ListarMamiferos);

        Op_ListarAves.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        Op_ListarAves.setForeground(new java.awt.Color(51, 51, 51));
        Op_ListarAves.setText("Listar aves");
        Op_ListarAves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op_ListarAvesActionPerformed(evt);
            }
        });
        jMenu2.add(Op_ListarAves);

        Op_ListarVeterinarios.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        Op_ListarVeterinarios.setForeground(new java.awt.Color(51, 51, 51));
        Op_ListarVeterinarios.setText("Listar veterinarios");
        Op_ListarVeterinarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op_ListarVeterinariosActionPerformed(evt);
            }
        });
        jMenu2.add(Op_ListarVeterinarios);

        Op_ListarRevisiones.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        Op_ListarRevisiones.setForeground(new java.awt.Color(51, 51, 51));
        Op_ListarRevisiones.setText("Listar revisiones");
        Op_ListarRevisiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op_ListarRevisionesActionPerformed(evt);
            }
        });
        jMenu2.add(Op_ListarRevisiones);

        jMenuBar1.add(jMenu2);

        jMenu4.setForeground(new java.awt.Color(51, 51, 51));
        jMenu4.setText("Detalles");
        jMenu4.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N

        Op_DetalleRevision.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        Op_DetalleRevision.setText("Ver a Detalle una Revisión");
        Op_DetalleRevision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op_DetalleRevisionActionPerformed(evt);
            }
        });
        jMenu4.add(Op_DetalleRevision);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b_Regresar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(PanelContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(b_Regresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Op_ListarAvesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op_ListarAvesActionPerformed
        PanelListarAves alta8 = new PanelListarAves();
        alta8.setSize(1100, 600);
        alta8.setLocation(0, 0);
        b_Regresar.setVisible(true);
        
        PanelContent.removeAll();
        PanelContent.add(alta8, BorderLayout.CENTER);
        PanelContent.revalidate();
        PanelContent.repaint();
    }//GEN-LAST:event_Op_ListarAvesActionPerformed

    private void Op_ListarRevisionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op_ListarRevisionesActionPerformed
        PanelListarRevisiones alta9 = new PanelListarRevisiones();
        alta9.setSize(1100, 600);
        alta9.setLocation(0, 0);
        b_Regresar.setVisible(true);
        
        PanelContent.removeAll();
        PanelContent.add(alta9, BorderLayout.CENTER);
        PanelContent.revalidate();
        PanelContent.repaint();
    }//GEN-LAST:event_Op_ListarRevisionesActionPerformed

    private void Op_AltaMamiferoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op_AltaMamiferoActionPerformed
        PanelAltaMamifero alta2 = new PanelAltaMamifero();
        alta2.setSize(1100, 600);
        alta2.setLocation(0, 0);
        b_Regresar.setVisible(true);
        
        PanelContent.removeAll();
        PanelContent.add(alta2, BorderLayout.CENTER);
        PanelContent.revalidate();
        PanelContent.repaint();
    }//GEN-LAST:event_Op_AltaMamiferoActionPerformed

    private void Op_AltaAveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op_AltaAveActionPerformed
        PanelAltaAve alta3 = new PanelAltaAve();
        alta3.setSize(1100, 600);
        alta3.setLocation(0, 0);
        b_Regresar.setVisible(true);
        
        PanelContent.removeAll();
        PanelContent.add(alta3, BorderLayout.CENTER);
        PanelContent.revalidate();
        PanelContent.repaint();
    }//GEN-LAST:event_Op_AltaAveActionPerformed

    private void Op_AltaVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op_AltaVeterinarioActionPerformed
        PanelAltaVeterinario alta4 = new PanelAltaVeterinario();
        alta4.setSize(1100, 600);
        alta4.setLocation(0, 0);
        b_Regresar.setVisible(true);
        
        PanelContent.removeAll();
        PanelContent.add(alta4, BorderLayout.CENTER);
        PanelContent.revalidate();
        PanelContent.repaint();
    }//GEN-LAST:event_Op_AltaVeterinarioActionPerformed

    private void Op_AltaRevisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op_AltaRevisionActionPerformed
        PanelAltaRevision alta5 = new PanelAltaRevision();
        alta5.setSize(1100, 600);
        alta5.setLocation(0, 0);
        b_Regresar.setVisible(true);
        
        PanelContent.removeAll();
        PanelContent.add(alta5, BorderLayout.CENTER);
        PanelContent.revalidate();
        PanelContent.repaint();
    }//GEN-LAST:event_Op_AltaRevisionActionPerformed

    private void Op_DetalleRevisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op_DetalleRevisionActionPerformed
        PanelDetalleRevision alta6 = new PanelDetalleRevision();
        alta6.setSize(1100, 600);
        alta6.setLocation(0, 0);
        b_Regresar.setVisible(true);
        
        PanelContent.removeAll();
        PanelContent.add(alta6, BorderLayout.CENTER);
        PanelContent.revalidate();
        PanelContent.repaint();
    }//GEN-LAST:event_Op_DetalleRevisionActionPerformed

    private void Op_ListarMamiferosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op_ListarMamiferosActionPerformed
        PanelListarMamiferos alta7 = new PanelListarMamiferos();
        alta7.setSize(1100, 600);
        alta7.setLocation(0, 0);
        b_Regresar.setVisible(true);
        
        PanelContent.removeAll();
        PanelContent.add(alta7, BorderLayout.CENTER);
        PanelContent.revalidate();
        PanelContent.repaint();
    }//GEN-LAST:event_Op_ListarMamiferosActionPerformed

    private void Op_ListarVeterinariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op_ListarVeterinariosActionPerformed
        PanelListarVeterinarios alta10 = new PanelListarVeterinarios();
        alta10.setSize(1100, 600);
        alta10.setLocation(0, 0);
        b_Regresar.setVisible(true);
        
        PanelContent.removeAll();
        PanelContent.add(alta10, BorderLayout.CENTER);
        PanelContent.revalidate();
        PanelContent.repaint();
    }//GEN-LAST:event_Op_ListarVeterinariosActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void b_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_RegresarActionPerformed
        this.bienvenida();
    }//GEN-LAST:event_b_RegresarActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Class_Conecction cn = new Class_Conecction();
        if(cn.getConnection() != null) {
            JOptionPane.showConfirmDialog(null, "Conexion correcta", "warning", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showConfirmDialog(null, "Conexion erronea", "warning", JOptionPane.WARNING_MESSAGE);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Op_AltaAve;
    private javax.swing.JMenuItem Op_AltaMamifero;
    private javax.swing.JMenuItem Op_AltaRevision;
    private javax.swing.JMenuItem Op_AltaVeterinario;
    private javax.swing.JMenuItem Op_DetalleRevision;
    private javax.swing.JMenuItem Op_ListarAves;
    private javax.swing.JMenuItem Op_ListarMamiferos;
    private javax.swing.JMenuItem Op_ListarRevisiones;
    private javax.swing.JMenuItem Op_ListarVeterinarios;
    private javax.swing.JPanel PanelContent;
    private javax.swing.JButton b_Regresar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
    class FondoPanel extends JPanel{
        private Image imagen;
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/img/fondo1.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
