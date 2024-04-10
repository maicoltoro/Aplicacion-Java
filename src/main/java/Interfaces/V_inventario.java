package Interfaces;

import Clases.Inventario;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class V_inventario extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    public V_inventario() {
        initComponents();
        this.setTitle("Registro de producto");
        this.setSize(750, 450);
        this.setLocationRelativeTo(null);
        // Columnas de la tabla 
        modelo.addColumn("Nombre producto");
        modelo.addColumn("tipo de producto");
        modelo.addColumn("Unidades");
        modelo.addColumn("Valor Unidad");
        modelo.addColumn("Iva");
        modelo.addColumn("Valor Total");
        modelo.addColumn("Editar");
        modelo.addColumn("Eliminar");
        refrescarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Reguistro_Inventario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NProducto = new javax.swing.JTextField();
        Tipo_producto = new javax.swing.JComboBox<>();
        valor = new javax.swing.JSpinner();
        Btn_Inicio = new javax.swing.JButton();
        BtnAgregar = new javax.swing.JButton();
        Num_unidades = new javax.swing.JSpinner();
        BtnBorrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tbl_Reguistro_Inventario.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tbl_Reguistro_Inventario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 710, 180));

        jLabel1.setText("TIpo de producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel2.setText("Numero de unidades");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel3.setText("Valor unitario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        jLabel5.setText("Nombre del producto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        getContentPane().add(NProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 30));

        Tipo_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aseo", "Papeleria", "Viveres", "Productos para mascota", "Otros", " " }));
        getContentPane().add(Tipo_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 110, 30));
        getContentPane().add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 120, 30));

        Btn_Inicio.setText("Inicio");
        Btn_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_InicioActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 120, 50));

        BtnAgregar.setText("Guardar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 120, 50));
        getContentPane().add(Num_unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 110, 30));

        BtnBorrar1.setText("Vaciar campos");
        BtnBorrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBorrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 120, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void refrescarTabla() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        for (Inventario inventario : Inventario.getinstance_Inventario()) {
            // Valida el Iva que se debe poner a cada prtoducto
            String iva = (inventario.getTipo_producto().equals("Aseo")) ? "19%"
                    : (inventario.getTipo_producto().equals("Papeleria")) ? "9%"
                    : (inventario.getTipo_producto().equals("Viveres")) ? "15%"
                    : (inventario.getTipo_producto().equals("Productos para mascota")) ? "16%"
                    : "10%";
            int valor_total = (int) inventario.getNum_unidades() * (int) inventario.getValor_unitario();
            Object a[] = new Object[8];
            a[0] = inventario.getNom_producto();
            a[1] = inventario.getTipo_producto();
            a[2] = inventario.getNum_unidades();
            a[3] = inventario.getValor_unitario();
            a[4] = iva;
            a[5] = valor_total;
            a[6] = "Editar";
            a[7] = "Eliminar";
            modelo.addRow(a);
        }        
        //Metodo para eliminar 
        Tbl_Reguistro_Inventario.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int column = Tbl_Reguistro_Inventario.getColumnModel().getColumnIndexAtX(e.getX()); // Obtiene la columna clickeada
                int row = e.getY() / Tbl_Reguistro_Inventario.getRowHeight(); // Obtiene la fila clickeada

                // Asegúrate de que el índice de la fila es válido y que el clic fue en tu columna específica
                if (row < Tbl_Reguistro_Inventario.getRowCount() && row >= 0 && column == 7) {
                    int modelRow = Tbl_Reguistro_Inventario.convertRowIndexToModel(row);
                    // Opcional: Confirma antes de eliminar
                    int confirm = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres eliminar este registro?", "Confirmar", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        // Elimina la fila del modelo
                        modelo.removeRow(modelRow);
                        Inventario.getinstance_Inventario().remove(modelRow);
                    }
                }
                if (row < Tbl_Reguistro_Inventario.getRowCount() && row >= 0 && column == 7) {
                    int filaSeleccionada = Tbl_Reguistro_Inventario.getSelectedRow();
                    editarRegistro(filaSeleccionada);
                }
            }
        });
        Tbl_Reguistro_Inventario.setModel(modelo);
    }

    private void Btn_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InicioActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_InicioActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        try {
            //Agrega los datos a la tabla 
            Inventario newProdcuto = new Inventario();
            newProdcuto.setNom_producto(NProducto.getText());
            newProdcuto.setTipo_producto(Tipo_producto.getSelectedItem().toString());
            newProdcuto.setValor_unitario(Integer.parseInt(valor.getValue().toString()));
            newProdcuto.setNum_unidades((int) Num_unidades.getValue());

            Inventario.getinstance_Inventario().add(newProdcuto);

            refrescarTabla();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el empleado");
        }
    }//GEN-LAST:event_BtnAgregarActionPerformed

    void editarRegistro(int filaSeleccionada) {
        if (filaSeleccionada >= 0) {
            // Obtén los valores actuales
            Object nombreEmpleado = modelo.getValueAt(filaSeleccionada, 0);
            Object numeroIdentificacion = modelo.getValueAt(filaSeleccionada, 1);
            // Continúa con los demás campos según necesites

            // Solicita nuevos valores. Aquí solo hago el ejemplo con el nombre
            String nuevoNombre = JOptionPane.showInputDialog(this, "Editar Nombre del Producto:", nombreEmpleado);
            if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
                modelo.setValueAt(nuevoNombre, filaSeleccionada, 0);
            }

            // Por ejemplo, editar el número de identificación:
            String nuevoNumero = JOptionPane.showInputDialog(this, "Editar Cantidad:", numeroIdentificacion);
            if (nuevoNumero != null && !nuevoNumero.isEmpty()) {
                modelo.setValueAt(nuevoNumero, filaSeleccionada, 2);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un registro para editar");
        }
    }
    private void BtnBorrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrar1ActionPerformed
        //Vacia los campos del formulario
        NProducto.setText("");
        valor.setValue(0);
        Num_unidades.setValue(0);
        Tipo_producto.setSelectedIndex(0);
    }//GEN-LAST:event_BtnBorrar1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_inventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBorrar1;
    private javax.swing.JButton Btn_Inicio;
    private javax.swing.JTextField NProducto;
    private javax.swing.JSpinner Num_unidades;
    private javax.swing.JTable Tbl_Reguistro_Inventario;
    private javax.swing.JComboBox<String> Tipo_producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner valor;
    // End of variables declaration//GEN-END:variables
}
