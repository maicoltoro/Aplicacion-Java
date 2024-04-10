package Interfaces;

import Clases.Empleado;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Empleados extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    public Empleados() {
        initComponents();
        this.setTitle("Registro de empleados");
        this.setSize(750, 450);
        this.setLocationRelativeTo(null);

        modelo.addColumn("Nombre empleado");
        modelo.addColumn("Numero de identificacion");
        modelo.addColumn("Edad");
        modelo.addColumn("Jornada");
        modelo.addColumn("Antiguedad");
        modelo.addColumn("Descuento Tienda");
        modelo.addColumn("Descuento CC");
        modelo.addColumn("Editar");
        modelo.addColumn("Eliminar");

        refrescarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Reguistro_Empleados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NIdentidad = new javax.swing.JTextField();
        NEmpleado = new javax.swing.JTextField();
        jornada = new javax.swing.JComboBox<>();
        antiguedad = new javax.swing.JSpinner();
        edad = new javax.swing.JSpinner();
        BtnBorrar = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        Btn_Inicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tbl_Reguistro_Empleados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tbl_Reguistro_Empleados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 710, 180));

        jLabel1.setText("Numero de Identidad");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel2.setText("edad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel3.setText("Jornada");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jLabel4.setText("antiguedad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        jLabel5.setText("Nombre del Empleado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        NIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIdentidadActionPerformed(evt);
            }
        });
        getContentPane().add(NIdentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 120, 30));
        getContentPane().add(NEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 30));

        jornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diurno", "Nocturno" }));
        getContentPane().add(jornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 110, 30));
        jornada.getAccessibleContext().setAccessibleName("jornada");

        getContentPane().add(antiguedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 70, 30));
        getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 80, 30));

        BtnBorrar.setText("Vacias campos");
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 130, 50));

        BtnAgregar.setText("Guardar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 120, 50));

        Btn_Inicio.setText("Inicio");
        Btn_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_InicioActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 130, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void refrescarTabla() {

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Empleado empleado : Empleado.getinstance_Empleado()) {
            String Des_tienda = (empleado.getAntiguedad() < 1) ? "15%"
                    : (empleado.getAntiguedad() >= 1 && empleado.getAntiguedad() <= 5) ? "30%"
                    : "50%";
            String Des_CC = (empleado.getAntiguedad() < 1) ? "20%"
                    : (empleado.getAntiguedad() >= 1 && empleado.getAntiguedad() <= 5) ? "30%"
                    : "60%";
            Object a[] = new Object[9];
            a[0] = empleado.getNombre_Empleado();
            a[1] = empleado.getNumero_Identidad();
            a[2] = empleado.getEdad();
            a[3] = empleado.getJornada();
            a[4] = empleado.getAntiguedad();
            a[5] = Des_tienda;
            a[6] = Des_CC;
            a[7] = "Editar";
            a[8] = "Eliminar";
            modelo.addRow(a);
        }
        Tbl_Reguistro_Empleados.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               

                int column = Tbl_Reguistro_Empleados.getColumnModel().getColumnIndexAtX(e.getX()); // Obtiene la columna clickeada
                int row = e.getY() / Tbl_Reguistro_Empleados.getRowHeight(); // Obtiene la fila clickeada

                // Asegúrate de que el índice de la fila es válido y que el clic fue en tu columna específica
                if (row < Tbl_Reguistro_Empleados.getRowCount() && row >= 0 && column == 8) {
                    int modelRow = Tbl_Reguistro_Empleados.convertRowIndexToModel(row);
                    // Opcional: Confirma antes de eliminar
                    int confirm = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres eliminar este registro?", "Confirmar", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        // Elimina la fila del modelo
                        modelo.removeRow(modelRow);
                        Empleado.getinstance_Empleado().remove(modelRow);
                    }
                }
                if (row < Tbl_Reguistro_Empleados.getRowCount() && row >= 0 && column == 7) {
                    int filaSeleccionada = Tbl_Reguistro_Empleados.getSelectedRow();
                    editarRegistro(filaSeleccionada);
                }
            }
        });

        Tbl_Reguistro_Empleados.addMouseListener(new MouseAdapter() {

        });

        Tbl_Reguistro_Empleados.setModel(modelo);
    }

    private void NIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIdentidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NIdentidadActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        try {
            Empleado newEmpleado = new Empleado();
            newEmpleado.setNombre_Empleado(NEmpleado.getText());
            newEmpleado.setAntiguedad(Integer.parseInt(antiguedad.getValue().toString()));
            newEmpleado.setJornada(jornada.getSelectedItem().toString());
            newEmpleado.setNumero_Identidad(Integer.parseInt(NIdentidad.getText()));
            newEmpleado.setEdad((int) edad.getValue());
            Empleado.getinstance_Empleado().add(newEmpleado);
            refrescarTabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el empleado" + e);
        }
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
        NEmpleado.setText("");
        NIdentidad.setText("");
        jornada.setSelectedIndex(0);
        antiguedad.setValue(0);
        edad.setValue(0);
    }//GEN-LAST:event_BtnBorrarActionPerformed

    void editarRegistro(int filaSeleccionada) {
        if (filaSeleccionada >= 0) {
            // Obtén los valores actuales
            Object nombreEmpleado = modelo.getValueAt(filaSeleccionada, 0);
            Object numeroIdentificacion = modelo.getValueAt(filaSeleccionada, 1);
            // Continúa con los demás campos según necesites

            // Solicita nuevos valores. Aquí solo hago el ejemplo con el nombre
            String nuevoNombre = JOptionPane.showInputDialog(this, "Editar Nombre del Empleado:", nombreEmpleado);
            if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
                modelo.setValueAt(nuevoNombre, filaSeleccionada, 0);
            }

            // Por ejemplo, editar el número de identificación:
            String nuevoNumero = JOptionPane.showInputDialog(this, "Editar Número de Identificación:", numeroIdentificacion);
            if (nuevoNumero != null && !nuevoNumero.isEmpty()) {
                modelo.setValueAt(nuevoNumero, filaSeleccionada, 1);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un registro para editar");
        }
    }

    private void Btn_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InicioActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_InicioActionPerformed

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
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton Btn_Inicio;
    private javax.swing.JTextField NEmpleado;
    private javax.swing.JTextField NIdentidad;
    private javax.swing.JTable Tbl_Reguistro_Empleados;
    private javax.swing.JSpinner antiguedad;
    private javax.swing.JSpinner edad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jornada;
    // End of variables declaration//GEN-END:variables
}
