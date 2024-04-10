package Interfaces;

import Clases.Inventario;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
        this.setTitle("Bienvenido");
        this.setSize(750, 450);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Btn_Agregar_Trabajador = new javax.swing.JButton();
        Btn_Agregar_Producto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Btn_Grafica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\maicol\\OneDrive\\Documentos\\NetBeansProjects\\Inventario-Tienda\\src\\main\\java\\Imagenes\\Logo-removebg-preview.png")); // NOI18N

        Btn_Agregar_Trabajador.setText("Agregar Trabajador");
        Btn_Agregar_Trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Agregar_TrabajadorActionPerformed(evt);
            }
        });

        Btn_Agregar_Producto.setText("Agregar Producto");
        Btn_Agregar_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Agregar_ProductoActionPerformed(evt);
            }
        });

        jLabel2.setText("Jesus castiblanco");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\maicol\\OneDrive\\Documentos\\NetBeansProjects\\Inventario-Tienda\\src\\main\\java\\Imagenes\\iconos_usuario2.png")); // NOI18N

        Btn_Grafica.setText("Grafica");
        Btn_Grafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GraficaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_Agregar_Trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(Btn_Agregar_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(Btn_Grafica, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_Agregar_Trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Agregar_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Grafica, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Agregar_TrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Agregar_TrabajadorActionPerformed
        Empleados Empleado = new Empleados();
        Empleado.setVisible(true);
        Empleado.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_Agregar_TrabajadorActionPerformed

    private void Btn_Agregar_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Agregar_ProductoActionPerformed
        V_inventario inventario = new V_inventario();
        inventario.setVisible(true);
        inventario.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_Btn_Agregar_ProductoActionPerformed

    private void Btn_GraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GraficaActionPerformed

        DefaultPieDataset datos = new DefaultPieDataset();
        for (Inventario inventario : Inventario.getinstance_Inventario()) {
            datos.setValue(inventario.getNom_producto(), inventario.getNum_unidades());
        }
//        datos.setValue("hola", 123);
//        datos.setValue("hola2", 123);
//        datos.setValue("hol3", 123);

        JFreeChart grafico = ChartFactory.createPieChart(
                "Cantidad de productos",
                datos,
                true, // Mostrar leyenda
                true, // Mostrar tooltips
                false // No mostrar URL
        );

                ChartPanel panel = new ChartPanel(grafico);
        panel.setPreferredSize(new Dimension(400, 200));

        // Crea un JPanel para contener el gráfico
        JPanel panelGrafico = new JPanel();
        panelGrafico.setLayout(new BorderLayout());

        // Agrega el panel al panelGrafico
        panelGrafico.add(panel, BorderLayout.CENTER);

        // Crea un JFrame para mostrar el panelGrafico
        JFrame frame = new JFrame("Mi aplicación");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Agrega el panelGrafico al JFrame
        frame.getContentPane().add(panelGrafico, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
        
    }//GEN-LAST:event_Btn_GraficaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Agregar_Producto;
    private javax.swing.JButton Btn_Agregar_Trabajador;
    private javax.swing.JButton Btn_Grafica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
