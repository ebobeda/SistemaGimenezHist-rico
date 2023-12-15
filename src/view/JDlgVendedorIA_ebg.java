/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VendedorEbg;
import dao.Vendedor_DAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util_ebg;

/**
 *
 * @author user
 */
public class JDlgVendedorIA_ebg extends javax.swing.JDialog {
    private MaskFormatter mascaraCPF, mascaraCelular, mascaraDataexpediente, mascaraComissao;
    /**
     * Creates new form JDlgCaixaNovoIA
     */
    public JDlgVendedorIA_ebg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Inclusão");
        setLocationRelativeTo(null);
        
        try {
            mascaraCPF = new MaskFormatter("###.###.###-##");
            mascaraCelular = new MaskFormatter("(##)####-####");
            mascaraDataexpediente = new MaskFormatter("##/##/####");
            mascaraComissao = new MaskFormatter("###,##");
        } catch (ParseException ex) {
            Logger.getLogger(JDlgVendedorIA_ebg.class.getName()).log(Level.SEVERE, null, ex);
        }
          
         jFmtCpf_ebg.setFormatterFactory(new DefaultFormatterFactory(mascaraCPF));
         jFmtCelular_ebg.setFormatterFactory(new DefaultFormatterFactory(mascaraCelular));
         jFmtDataexpediente_ebg.setFormatterFactory(new DefaultFormatterFactory(mascaraDataexpediente));
    }

    public VendedorEbg viewBean() {
        VendedorEbg vendedorEbg = new VendedorEbg();
        
        vendedorEbg.setIdvendedorEbg(Util_ebg.strInt(jTxtCodigo_ebg.getText()));
        vendedorEbg.setNomeEbg(jTxtNome_ebg.getText());
        vendedorEbg.setCpfEbg(jFmtCpf_ebg.getText());
        vendedorEbg.setCelularEbg(jFmtCelular_ebg.getText());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            vendedorEbg.setDataexpedienteEbg (formato.parse(jFmtDataexpediente_ebg.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(JDlgVendedor_ebg.class.getName()).log(Level.SEVERE, null, ex);
        }
        vendedorEbg.setComissaoEbg(Util_ebg.strDouble(jTxtComissao_ebg.getText()));
        
        return vendedorEbg;
    }
    
    public void beanView (VendedorEbg vendedorEbg){
        String id = String.valueOf(vendedorEbg.getIdvendedorEbg());
        
        jTxtCodigo_ebg.setText(id);
        jTxtNome_ebg.setText(vendedorEbg.getNomeEbg());
        jFmtCpf_ebg.setText(vendedorEbg.getCpfEbg());
        jFmtCelular_ebg.setText(vendedorEbg.getCelularEbg());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jFmtDataexpediente_ebg.setText(formato.format(vendedorEbg.getDataexpedienteEbg()));
        jTxtComissao_ebg.setText(Util_ebg.doubleStr(vendedorEbg.getComissaoEbg()));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFmtDataexpediente_ebg = new javax.swing.JFormattedTextField();
        jFmtCelular_ebg = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtNome_ebg = new javax.swing.JTextField();
        jFmtCpf_ebg = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtCodigo_ebg = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jBtnOk_ebg = new javax.swing.JButton();
        jBtnCancelar_ebg = new javax.swing.JButton();
        jTxtComissao_ebg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jFmtCelular_ebg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCelular_ebgActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel4.setText("CPF");

        try {
            jFmtCpf_ebg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFmtCpf_ebg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtCpf_ebgActionPerformed(evt);
            }
        });

        jLabel2.setText("Data do expediente");

        jLabel7.setText("Celular");

        jLabel3.setText("Comissão");

        jLabel5.setText("Código");

        jTxtCodigo_ebg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtCodigo_ebgActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.TRAILING));

        jBtnOk_ebg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/05 - ok.png"))); // NOI18N
        jBtnOk_ebg.setText("OK");
        jBtnOk_ebg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOk_ebgActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnOk_ebg);

        jBtnCancelar_ebg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/02 - excluir.png"))); // NOI18N
        jBtnCancelar_ebg.setText("Cancelar");
        jBtnCancelar_ebg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelar_ebgActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnCancelar_ebg);

        jTxtComissao_ebg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtComissao_ebgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jTxtCodigo_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jTxtNome_ebg)))
                        .addComponent(jFmtCelular_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jFmtCpf_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jFmtDataexpediente_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTxtComissao_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNome_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCodigo_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFmtCpf_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFmtCelular_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jFmtDataexpediente_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTxtComissao_ebg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(79, 79, 79)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFmtCelular_ebgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCelular_ebgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCelular_ebgActionPerformed

    private void jFmtCpf_ebgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtCpf_ebgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtCpf_ebgActionPerformed

    private void jTxtCodigo_ebgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtCodigo_ebgActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTxtCodigo_ebgActionPerformed

    private void jBtnOk_ebgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOk_ebgActionPerformed
    VendedorEbg vendedorEbg = viewBean();
    Vendedor_DAO vendedor_DAO = new Vendedor_DAO();
    vendedor_DAO.insert(vendedorEbg);
    
    Util_ebg.limparCampos(jTxtCodigo_ebg, jTxtNome_ebg, jFmtCpf_ebg, jFmtCelular_ebg, jFmtDataexpediente_ebg, jTxtComissao_ebg);
    Util_ebg.mensagem("Incluido com sucesso!");
    setVisible(false);
    }//GEN-LAST:event_jBtnOk_ebgActionPerformed

    private void jBtnCancelar_ebgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelar_ebgActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Util_ebg.mensagem("Operação Cancelada!");
    }//GEN-LAST:event_jBtnCancelar_ebgActionPerformed

    private void jTxtComissao_ebgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtComissao_ebgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtComissao_ebgActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendedorIA_ebg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedorIA_ebg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedorIA_ebg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedorIA_ebg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendedorIA_ebg dialog = new JDlgVendedorIA_ebg(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnCancelar_ebg;
    private javax.swing.JButton jBtnOk_ebg;
    private javax.swing.JFormattedTextField jFmtCelular_ebg;
    private javax.swing.JFormattedTextField jFmtCpf_ebg;
    private javax.swing.JFormattedTextField jFmtDataexpediente_ebg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtCodigo_ebg;
    private javax.swing.JTextField jTxtComissao_ebg;
    private javax.swing.JTextField jTxtNome_ebg;
    // End of variables declaration//GEN-END:variables
}
