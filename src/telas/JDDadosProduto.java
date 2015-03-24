/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

//import javax.swing.JFrame;
import modelo.Produto;

/**
 *
 * @author Marcos
 */
public class JDDadosProduto extends javax.swing.JDialog {

    public boolean sucesso = false;

//    private ControleProduto pProduto;

        public void setDados(Produto p, String cod){
            txtCODCli.setText((p==null)?cod:p.getCOD());
            txtNomeProduto.setText((p==null)?"":p.getNome());
            txtQtdProduto.setText((String) ((p==null)?"":p.getQuantidade()));
            txtValorProduto.setText((String) ((p==null)?"":p.getValor()));
            txtCODCli.setEditable(false);
    }

      public Produto getDados(){
        return new Produto(
            txtCODCli.getText(),
            txtNomeProduto.getText(),
            txtQtdProduto.getText(),
            txtValorProduto.getText());
    }
    
  
    
    /**
     * Creates new form JDDadosProduto
     * @param parent
     * @param modal
     */
    public JDDadosProduto(java.awt.Frame parent, boolean modal      ) {
            super(parent, modal);
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

        lblNomeProduto = new javax.swing.JLabel();
        lblQtdProduto = new javax.swing.JLabel();
        lblValorProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        txtQtdProduto = new javax.swing.JTextField();
        txtValorProduto = new javax.swing.JTextField();
        btmConfirmar = new javax.swing.JButton();
        lblCODProduto = new javax.swing.JLabel();
        btmCancelar = new javax.swing.JButton();
        txtCODCli = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();

        lblNomeProduto.setText("Nome");

        lblQtdProduto.setText("Qtd");

        lblValorProduto.setText("Valor");

        txtNomeProduto.setText("jTextField2");

        txtQtdProduto.setText("jTextField3");

        txtValorProduto.setText("jTextField4");

        btmConfirmar.setText("Confirmar");
        btmConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmConfirmarActionPerformed(evt);
            }
        });

        lblCODProduto.setText("COD");

        btmCancelar.setText("Cancelar");
        btmCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCancelarActionPerformed(evt);
            }
        });

        txtCODCli.setEditable(false);
        txtCODCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCODCli.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorProduto)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQtdProduto)
                                    .addComponent(lblNomeProduto)
                                    .addComponent(lblCODProduto))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btmConfirmar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btmCancelar))
                                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(txtQtdProduto)
                                    .addComponent(txtValorProduto)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCODCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtCODCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCODProduto)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProduto)
                    .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdProduto)
                    .addComponent(txtQtdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorProduto)
                    .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btmConfirmar)
                    .addComponent(btmCancelar))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmConfirmarActionPerformed
        sucesso = true;
        setVisible(false);
    }//GEN-LAST:event_btmConfirmarActionPerformed

    private void btmCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCancelarActionPerformed
        sucesso = false;
        setVisible(false);
    }//GEN-LAST:event_btmCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(JDDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDDadosProduto dialog = new JDDadosProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmCancelar;
    private javax.swing.JButton btmConfirmar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel lblCODProduto;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblQtdProduto;
    private javax.swing.JLabel lblValorProduto;
    private javax.swing.JTextField txtCODCli;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtQtdProduto;
    private javax.swing.JTextField txtValorProduto;
    // End of variables declaration//GEN-END:variables
}
