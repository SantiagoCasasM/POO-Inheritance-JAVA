/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionorientadaobjetos;

/**
 *
 * @author Santiago
 */
public class jffPOO extends javax.swing.JFrame {

    /**
     * Creates new form jffPOO
     */
    public jffPOO() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfN1 = new javax.swing.JTextField();
        jtfN2 = new javax.swing.JTextField();
        jbtnSumar = new javax.swing.JButton();
        jbtnSumarHerencia = new javax.swing.JButton();
        jbtnSobreCargaHerencia = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jlblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Programacion Orientado a Objetos");

        jLabel2.setText("Numero 1:");

        jLabel3.setText("Numero 2:");

        jtfN1.setText("0");

        jtfN2.setText("0");

        jbtnSumar.setText("Sumar");
        jbtnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSumarActionPerformed(evt);
            }
        });

        jbtnSumarHerencia.setText("SumarHerencia");
        jbtnSumarHerencia.setToolTipText("");
        jbtnSumarHerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSumarHerenciaActionPerformed(evt);
            }
        });

        jbtnSobreCargaHerencia.setText("SobreCargaHerencia");
        jbtnSobreCargaHerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSobreCargaHerenciaActionPerformed(evt);
            }
        });

        jLabel4.setText("Resultados");

        jlblResultado.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jbtnSumar))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtfN2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                .addComponent(jtfN1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnSumarHerencia)
                                .addGap(44, 44, 44)
                                .addComponent(jbtnSobreCargaHerencia)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(108, 108, 108))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnSumar)
                    .addComponent(jbtnSumarHerencia)
                    .addComponent(jbtnSobreCargaHerencia))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jlblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSumarActionPerformed
        
        jcClase1 oClase1 = new jcClase1();
        jlblResultado.setText(
        String.valueOf(
        oClase1.Suma(Integer.valueOf(jtfN1.getText()),
                Integer.valueOf(jtfN2.getText()))));
    }//GEN-LAST:event_jbtnSumarActionPerformed

    private void jbtnSumarHerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSumarHerenciaActionPerformed
        jcClase2 oClase2 = new jcClase2();
        jlblResultado.setText(
        String.valueOf(
        oClase2.Suma(Integer.valueOf(jtfN1.getText()),
                Integer.valueOf(jtfN2.getText()))));            
    }//GEN-LAST:event_jbtnSumarHerenciaActionPerformed

    private void jbtnSobreCargaHerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSobreCargaHerenciaActionPerformed
        jcClase3 oClase3 = new jcClase3();
        jlblResultado.setText(
        String.valueOf(
        oClase3.Suma(Integer.valueOf(jtfN1.getText()),
                Integer.valueOf(jtfN2.getText()))));  
    }//GEN-LAST:event_jbtnSobreCargaHerenciaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(jffPOO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jffPOO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jffPOO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jffPOO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jffPOO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtnSobreCargaHerencia;
    private javax.swing.JButton jbtnSumar;
    private javax.swing.JButton jbtnSumarHerencia;
    private javax.swing.JLabel jlblResultado;
    private javax.swing.JTextField jtfN1;
    private javax.swing.JTextField jtfN2;
    // End of variables declaration//GEN-END:variables
}
