/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

import Controller.ProdutosController;
import Model.ProdutosModel;



/**
 *
 * @author gesse
 */
public class JframeProdutos extends javax.swing.JFrame {
    MaskFormatter formatoData;
    ProdutosModel produtosModel;
    ProdutosController produtosController;
    
    public JframeProdutos() {
        this.setLocationRelativeTo(null);
        initComponents();
        habilitar(false);
        produtosModel = new ProdutosModel();
        produtosController = new ProdutosController();
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
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        try {
            formatoData = new MaskFormatter("##/##/####");
        } catch (Exception e) {
            //TODO: handle exception
            JOptionPane.showMessageDialog(null, "formato invalido", "Erro", 0, new ImageIcon(
                "C:\\Users\\gesse\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoCrudQ2\\src\\Imagens\\btn_sair.png"));

    }
    txtData = new JFormattedTextField(formatoData);
    ;
    jLabel4 = new javax.swing.JLabel();
    txtQdt = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    txtVunitario = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    txtValorTot = new javax.swing.JTextField();
    jSeparator1 = new javax.swing.JSeparator();
    jLabel7 = new javax.swing.JLabel();
    txtLocalizar = new javax.swing.JTextField();
    btn_consulta = new javax.swing.JButton();
    jSeparator2 = new javax.swing.JSeparator();
    jScrollPane1 = new javax.swing.JScrollPane();
    tabela = new javax.swing.JTable();
    jSeparator3 = new javax.swing.JSeparator();
    btn_novo = new javax.swing.JButton();
    btn_save = new javax.swing.JButton();
    btn_save1 = new javax.swing.JButton();
    btn_delete = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Código:");

    txtCodigo.setEnabled(false);

    jLabel2.setText("Nome:");

    jLabel3.setText("Data de Validade:");

    jLabel4.setText("Quantidade:");

    jLabel5.setText("Valor Unitário:");

    jLabel6.setText("Valor Total:");

    txtValorTot.setEnabled(false);

    jLabel7.setText("Localizar:");

    btn_consulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/buscar pequeno.png"))); // NOI18N
    btn_consulta.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_consultaActionPerformed(evt);
        }
    });

    tabela.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Código", "Nome", "Data Validade", "Quantidade", "Valor Unitário", "Valor Total"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    tabela.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mousePressed(java.awt.event.MouseEvent evt) {
            tabelaMousePressed(evt);
        }
    });
    jScrollPane1.setViewportView(tabela);

    btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/inserir.png"))); // NOI18N
    btn_novo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btn_novo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btn_novo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_novoActionPerformed(evt);
        }
    });

    btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
    btn_save.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btn_save.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btn_save.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_saveActionPerformed(evt);
        }
    });

    btn_save1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
    btn_save1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btn_save1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btn_save1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_save1ActionPerformed(evt);
        }
    });

    btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/deletar.png"))); // NOI18N
    btn_delete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btn_delete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    btn_delete.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_deleteActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        .addComponent(jSeparator2)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtQdt)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtVunitario)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtData))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(txtValorTot))))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtLocalizar)
                    .addGap(18, 18, 18)
                    .addComponent(btn_consulta)
                    .addGap(39, 39, 39))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(39, 39, 39)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btn_save1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 13, Short.MAX_VALUE)))
            .addContainerGap())
        .addComponent(jSeparator3)
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(25, 25, 25)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(txtQdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5)
                .addComponent(txtVunitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6)
                .addComponent(txtValorTot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(btn_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_novo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addComponent(btn_save1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(66, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_consultaActionPerformed

    private void tabelaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaMousePressed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        habilitar(true);
        produtosController.proximoProduto();
        txtCodigo.setText(produtosController.proximoProduto());

       
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
    

    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save1ActionPerformed
       
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_save1ActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
       

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(JframeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframeProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframeProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consulta;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_save1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtLocalizar;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQdt;
    private javax.swing.JTextField txtValorTot;
    private javax.swing.JTextField txtVunitario;
    // End of variables declaration//GEN-END:variables
 final void habilitar(boolean valor)
 {
     txtNome.setEnabled(valor);
     txtData.setEnabled(valor);
     txtQdt.setEnabled(valor);
     txtQdt.setEnabled(valor);
     txtVunitario.setEnabled(valor);
     txtLocalizar.setEnabled(valor);
 }
}
