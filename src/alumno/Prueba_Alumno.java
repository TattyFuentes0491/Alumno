/*
10. Se  conoce  de  un alumno: cédula, nombre y  tres  notas  parciales  (nota1,  nota2,  nota3).
Desarrolle  una  aplicación  en  java  que  permita  crear  5  estudiantes  e  imprimir:  cédula, nombre, nota final e 
indique con un mensaje si el alumno aprobó (nota final >= 48) o no aprobó (nota final < 48) la asignatura.
 */
package alumno;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Prueba_Alumno extends javax.swing.JFrame {
    //instanciamos la clase alumno
    Alumno alm = new Alumno();
    
    public Prueba_Alumno() {
        initComponents();
        jBtnActualizar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuAlumno = new javax.swing.JPopupMenu();
        jMenuItemModificar = new javax.swing.JMenuItem();
        jMenuItemEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumno = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTxtFldCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtFldNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtFldNota_1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtFldNota_2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtFldNota_3 = new javax.swing.JTextField();
        jBtnCalcular = new javax.swing.JButton();
        jBtnActualizar = new javax.swing.JButton();
        jBtnExportar = new javax.swing.JButton();

        jMenuItemModificar.setText("Modificar");
        jMenuItemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarActionPerformed(evt);
            }
        });
        jPopupMenuAlumno.add(jMenuItemModificar);

        jMenuItemEliminar.setText("Eliminar");
        jMenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarActionPerformed(evt);
            }
        });
        jPopupMenuAlumno.add(jMenuItemEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("                                                  Notas Alumnos");

        jTableAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Nota_1", "Nota_2", "Nota_3", "Nota_Final", "¿Aprobó?"
            }
        ));
        jTableAlumno.setComponentPopupMenu(jPopupMenuAlumno);
        jScrollPane1.setViewportView(jTableAlumno);
        if (jTableAlumno.getColumnModel().getColumnCount() > 0) {
            jTableAlumno.getColumnModel().getColumn(0).setMaxWidth(70);
            jTableAlumno.getColumnModel().getColumn(1).setMaxWidth(200);
            jTableAlumno.getColumnModel().getColumn(2).setMaxWidth(60);
            jTableAlumno.getColumnModel().getColumn(3).setMaxWidth(60);
            jTableAlumno.getColumnModel().getColumn(4).setMaxWidth(60);
            jTableAlumno.getColumnModel().getColumn(5).setMaxWidth(70);
            jTableAlumno.getColumnModel().getColumn(6).setMaxWidth(80);
        }

        jLabel2.setText("Cédula del Alumno");

        jLabel3.setText("Nombre del Alumno");

        jLabel4.setText("Nota_1");

        jLabel5.setText("Nota_2");

        jTxtFldNota_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFldNota_2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Nota_3");

        jTxtFldNota_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFldNota_3ActionPerformed(evt);
            }
        });

        jBtnCalcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnCalcular.setText("Calcular");
        jBtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalcularActionPerformed(evt);
            }
        });

        jBtnActualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnActualizar.setText("Actualizar");
        jBtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActualizarActionPerformed(evt);
            }
        });

        jBtnExportar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnExportar.setText("Exportar");
        jBtnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtFldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtFldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtFldNota_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtFldNota_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtFldNota_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtFldCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtFldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtFldNota_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtFldNota_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtFldNota_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnActualizar)
                    .addComponent(jBtnExportar)
                    .addComponent(jBtnCalcular))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtFldNota_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFldNota_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFldNota_2ActionPerformed

    private void jTxtFldNota_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFldNota_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFldNota_3ActionPerformed

    private void jBtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalcularActionPerformed
        // añadimos registro a la tabla  
        String ced,nom;
        double n1,n2,n3;
        ced=jTxtFldCedula.getText();
        nom=jTxtFldNombre.getText();
        n1=Double.parseDouble(jTxtFldNota_1.getText());
        n2=Double.parseDouble(jTxtFldNota_2.getText());
        n3=Double.parseDouble(jTxtFldNota_3.getText());
        //llenamos la tabla con la información
        alm.llenarTabla(ced,nom,n1,n2,n3,jTableAlumno);
        limpiarCajaTexto();
    }//GEN-LAST:event_jBtnCalcularActionPerformed

    private void jBtnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExportarActionPerformed
        //exportar datos a un archivo de texto
        alm.crearArchivo(jTableAlumno);
    }//GEN-LAST:event_jBtnExportarActionPerformed

    private void jMenuItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarActionPerformed
        //instanciamos la tabla
        DefaultTableModel tb = (DefaultTableModel) jTableAlumno.getModel();
        if (jTableAlumno.getSelectedRow()>=0){ // nos paramos ne la fila seleccionada
            //reasignamos en las cajas de texto los valores de la tabla
            jTxtFldCedula.setText(jTableAlumno.getValueAt(jTableAlumno.getSelectedRow(), 0).toString());
            jTxtFldNombre.setText(jTableAlumno.getValueAt(jTableAlumno.getSelectedRow(), 1).toString());
            jTxtFldNota_1.setText(jTableAlumno.getValueAt(jTableAlumno.getSelectedRow(), 2).toString());
            jTxtFldNota_2.setText(jTableAlumno.getValueAt(jTableAlumno.getSelectedRow(), 3).toString());
            jTxtFldNota_3.setText(jTableAlumno.getValueAt(jTableAlumno.getSelectedRow(), 4).toString());
        jBtnActualizar.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemModificarActionPerformed

    private void jMenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarActionPerformed
        // eliminar un registro
        alm.eliminaRegistro(jTableAlumno);
    }//GEN-LAST:event_jMenuItemEliminarActionPerformed

    private void jBtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActualizarActionPerformed
        //creamos atributos
        String ced,nom;
        double n1,n2,n3;
        ced=jTxtFldCedula.getText();
        nom=jTxtFldNombre.getText();
        n1=Double.parseDouble(jTxtFldNota_1.getText());
        n2=Double.parseDouble(jTxtFldNota_2.getText());
        n3=Double.parseDouble(jTxtFldNota_3.getText());
        //guaradr datos modificados
        int filaSelec=0;
        filaSelec= jTableAlumno.getSelectedRow();
        alm.guardarDatosModificados(jTableAlumno,filaSelec,ced,nom,n1,n2,n3);
        limpiarCajaTexto();
    }//GEN-LAST:event_jBtnActualizarActionPerformed

    private void limpiarCajaTexto(){
        //limpiamos las cajas de texto
        jTxtFldCedula.setText(null);
        jTxtFldNombre.setText(null);
        jTxtFldNota_1.setText(null);
        jTxtFldNota_2.setText(null);
        jTxtFldNota_3.setText(null);
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Prueba_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prueba_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prueba_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prueba_Alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prueba_Alumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnActualizar;
    private javax.swing.JButton jBtnCalcular;
    private javax.swing.JButton jBtnExportar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItemEliminar;
    private javax.swing.JMenuItem jMenuItemModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenuAlumno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlumno;
    private javax.swing.JTextField jTxtFldCedula;
    private javax.swing.JTextField jTxtFldNombre;
    private javax.swing.JTextField jTxtFldNota_1;
    private javax.swing.JTextField jTxtFldNota_2;
    private javax.swing.JTextField jTxtFldNota_3;
    // End of variables declaration//GEN-END:variables
}
