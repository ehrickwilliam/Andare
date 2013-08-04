/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.gui;

import br.com.okaynet.andare.bibliotecas.Util;
import br.com.okaynet.andare.conexao.Conexao;
import br.com.okaynet.andare.conexao.Data;
import br.com.okaynet.andare.conexao.HibernateConfiguration;
import br.com.okaynet.andare.conexao.TransactionManager;
import br.com.okaynet.andare.daos.DaoClienteFisico;
import br.com.okaynet.andare.daos.DaoClienteJuridico;
import br.com.okaynet.andare.daos.DaoFuncionario;
import br.com.okaynet.andare.daos.DaoOrdemServico;
import br.com.okaynet.andare.model.ClienteFisico;
import br.com.okaynet.andare.model.ClienteJuridico;
import br.com.okaynet.andare.model.Funcionario;
import br.com.okaynet.andare.model.OrdemServico;
import br.com.okaynet.andare.model.Pessoa;
import br.com.okaynet.andare.testes.testeParametro;
import br.com.okaynet.andare.testes.testeRelatorio;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author paulo
 */
public class JDialogPesquisaOrdemTodas extends javax.swing.JDialog {

    /**
     * Creates new form JDialogPesquisaOrdemTodas1
     */
    private DefaultTableModel model;
    private String styleModelOrdem[] = new String[]{"ID", "Cliente", "Funcionario", "Status", "Valor", "Data de Cadastro", "Data de Vencimento"};
    private List<OrdemServico> orderns;

    public JDialogPesquisaOrdemTodas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        popularTabela();
        popularComboCliente();
        popularComboFuncionario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipo = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jButtonPesquisaID = new javax.swing.JButton();
        jFormattedTextFieldDataCadastro = new javax.swing.JFormattedTextField();
        jButtonPesquisaDataCadastro = new javax.swing.JButton();
        jFormattedTextFieldDataVencimento = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jButtonPesquisaDataVencimento = new javax.swing.JButton();
        jRadioButtonVencidas = new javax.swing.JRadioButton();
        jRadioButtonComPrazo = new javax.swing.JRadioButton();
        jRadioButtonTodas = new javax.swing.JRadioButton();
        jComboBoxFuncionario = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxCliente = new javax.swing.JComboBox();
        jButtonVisualizarOS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOrdemServico = new javax.swing.JTable();
        jButtonPesquisaFuncionarioCliente = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuEditar = new javax.swing.JMenu();
        jMenuApagar = new javax.swing.JMenu();
        jMenuVoltar = new javax.swing.JMenu();
        jMenuLimpar = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(639, 505));
        setPreferredSize(new java.awt.Dimension(639, 505));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("Código:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setText("Data Cadastro:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));
        getContentPane().add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, -1));

        jButtonPesquisaID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/1372094443_Magnifier2.png"))); // NOI18N
        jButtonPesquisaID.setBorderPainted(false);
        jButtonPesquisaID.setFocusPainted(false);
        jButtonPesquisaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaIDActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 30, 30));

        try {
            jFormattedTextFieldDataCadastro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataCadastro.setToolTipText("");
        jFormattedTextFieldDataCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextFieldDataCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 90, -1));

        jButtonPesquisaDataCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/1372094443_Magnifier2.png"))); // NOI18N
        jButtonPesquisaDataCadastro.setBorderPainted(false);
        jButtonPesquisaDataCadastro.setFocusPainted(false);
        jButtonPesquisaDataCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaDataCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisaDataCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 30, 30));

        try {
            jFormattedTextFieldDataVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextFieldDataVencimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 90, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setText("Data Vencimento:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jButtonPesquisaDataVencimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/1372094443_Magnifier2.png"))); // NOI18N
        jButtonPesquisaDataVencimento.setBorderPainted(false);
        jButtonPesquisaDataVencimento.setFocusPainted(false);
        jButtonPesquisaDataVencimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaDataVencimentoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisaDataVencimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 30, 30));

        buttonGroupTipo.add(jRadioButtonVencidas);
        jRadioButtonVencidas.setText("Vencidas");
        jRadioButtonVencidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonVencidasActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonVencidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        buttonGroupTipo.add(jRadioButtonComPrazo);
        jRadioButtonComPrazo.setText("Com prazo");
        jRadioButtonComPrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonComPrazoActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonComPrazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        buttonGroupTipo.add(jRadioButtonTodas);
        jRadioButtonTodas.setSelected(true);
        jRadioButtonTodas.setText("Todas");
        jRadioButtonTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTodasActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonTodas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        jComboBoxFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Jhonatan", "André" }));
        getContentPane().add(jComboBoxFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel16.setText("Funcionario:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel17.setText("Cliente:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Okaynet Informática LTDA ME" }));
        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 160, -1));

        jButtonVisualizarOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/074.png"))); // NOI18N
        jButtonVisualizarOS.setText("Visualizar Ordem de Serviço");
        jButtonVisualizarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisualizarOSActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVisualizarOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 210, 22));

        jTableOrdemServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "D. Cadastro", "D. Vencimento", "Status", "Cliente", "Funcionario", "Valor"
            }
        ));
        jScrollPane1.setViewportView(jTableOrdemServico);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 590, 270));

        jButtonPesquisaFuncionarioCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/1372094443_Magnifier2.png"))); // NOI18N
        jButtonPesquisaFuncionarioCliente.setBorderPainted(false);
        jButtonPesquisaFuncionarioCliente.setFocusPainted(false);
        jButtonPesquisaFuncionarioCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPesquisaFuncionarioClienteMouseClicked(evt);
            }
        });
        jButtonPesquisaFuncionarioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaFuncionarioClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisaFuncionarioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 30, 30));

        jMenuBar1.setMinimumSize(new java.awt.Dimension(56, 31));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(500, 31));

        jMenuEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/108.png"))); // NOI18N
        jMenuEditar.setText("Editar");
        jMenuEditar.setMinimumSize(new java.awt.Dimension(56, 31));
        jMenuEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuEditarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuEditar);

        jMenuApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/004.png"))); // NOI18N
        jMenuApagar.setText("Apagar");
        jMenuApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuApagarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuApagar);

        jMenuVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/010.png"))); // NOI18N
        jMenuVoltar.setText("Voltar");
        jMenuVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuVoltarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuVoltar);

        jMenuLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/024.png"))); // NOI18N
        jMenuLimpar.setText("Limpar Pesquisa");
        jMenuLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLimparMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuLimpar);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/026.png"))); // NOI18N
        jMenu2.setText("Gerar Nota");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuEditarMouseClicked
        // TODO add your handling code here:
        if (jTableOrdemServico.getSelectedRow() != -1) {
            Data.hash.put("ordem", orderns.get(jTableOrdemServico.getSelectedRow()));
            Util.abrirDialogCentralizado(new JDialogCadastroOrdemPopUp(null, true));
            popularTabela();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhum registro selecionado!");
        }
    }//GEN-LAST:event_jMenuEditarMouseClicked

    private void jMenuApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuApagarMouseClicked
        // TODO add your handling code here:
        if (jTableOrdemServico.getSelectedRow() != -1) {
            if (Util.mostraMensagemEmTela("Deseja realmente excluir?")) {
                deletar();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhum registro selecionado!");
        }
    }//GEN-LAST:event_jMenuApagarMouseClicked

    private void jMenuVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuVoltarMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuVoltarMouseClicked

    private void jMenuLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLimparMouseClicked
        // TODO add your handling code here:
        limparFormulario();
    }//GEN-LAST:event_jMenuLimparMouseClicked

    private void jButtonPesquisaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaIDActionPerformed
        // TODO add your handling code here:
        pesquisarPorID();
    }//GEN-LAST:event_jButtonPesquisaIDActionPerformed

    private void jButtonPesquisaDataCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaDataCadastroActionPerformed
        // TODO add your handling code here:
        pesquisarPorDataCadastro();
    }//GEN-LAST:event_jButtonPesquisaDataCadastroActionPerformed

    private void jButtonPesquisaDataVencimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaDataVencimentoActionPerformed
        // TODO add your handling code here:
        pesquisaPorDataVencimento();
    }//GEN-LAST:event_jButtonPesquisaDataVencimentoActionPerformed

    private void jRadioButtonVencidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonVencidasActionPerformed
        // TODO add your handling code here:
        pesquisarPorVencidas();
    }//GEN-LAST:event_jRadioButtonVencidasActionPerformed

    private void jRadioButtonComPrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonComPrazoActionPerformed
        // TODO add your handling code here:
        pesquisarPorDentroDoPrazo();
    }//GEN-LAST:event_jRadioButtonComPrazoActionPerformed

    private void jButtonVisualizarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisualizarOSActionPerformed
        // TODO add your handling code here:
        if (jTableOrdemServico.getSelectedRow() != -1) {
            Data.hash.put("ordem", orderns.get(jTableOrdemServico.getSelectedRow()));
            Util.abrirDialogCentralizado(new JDialogViewOrdemServico(null, true));
            popularTabela();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhum registro selecionado!");
        }
    }//GEN-LAST:event_jButtonVisualizarOSActionPerformed

    private void jRadioButtonTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTodasActionPerformed
        // TODO add your handling code here:
        pesquisarPorTodas();
    }//GEN-LAST:event_jRadioButtonTodasActionPerformed

    private void jButtonPesquisaFuncionarioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaFuncionarioClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPesquisaFuncionarioClienteActionPerformed

    private void jButtonPesquisaFuncionarioClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPesquisaFuncionarioClienteMouseClicked
        // TODO add your handling code here:
        pesquisarPorOSComClienteEFuncionario();
    }//GEN-LAST:event_jButtonPesquisaFuncionarioClienteMouseClicked

    private void jFormattedTextFieldDataCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataCadastroActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        if (jTableOrdemServico.getSelectedRow() != -1) {
            orderServicoNota();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhum registro selecionado!");
        }
    }//GEN-LAST:event_jMenu2MouseClicked

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
            java.util.logging.Logger.getLogger(JDialogPesquisaOrdemTodas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogPesquisaOrdemTodas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogPesquisaOrdemTodas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogPesquisaOrdemTodas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogPesquisaOrdemTodas dialog = new JDialogPesquisaOrdemTodas(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroupTipo;
    private javax.swing.JButton jButtonPesquisaDataCadastro;
    private javax.swing.JButton jButtonPesquisaDataVencimento;
    private javax.swing.JButton jButtonPesquisaFuncionarioCliente;
    private javax.swing.JButton jButtonPesquisaID;
    private javax.swing.JButton jButtonVisualizarOS;
    private javax.swing.JComboBox jComboBoxCliente;
    private javax.swing.JComboBox jComboBoxFuncionario;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataCadastro;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataVencimento;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuApagar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenu jMenuLimpar;
    private javax.swing.JMenu jMenuVoltar;
    private javax.swing.JRadioButton jRadioButtonComPrazo;
    private javax.swing.JRadioButton jRadioButtonTodas;
    private javax.swing.JRadioButton jRadioButtonVencidas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOrdemServico;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables

    private void popularTabela() {
        TransactionManager.beginTransaction();
        orderns = new DaoOrdemServico().obter();
        TransactionManager.commit();

        prencherOrdem();
    }

    private void prencherOrdem() {
        if (orderns != null && !orderns.isEmpty()) {
            model = new DefaultTableModel();
            model.setColumnIdentifiers(styleModelOrdem);
            for (OrdemServico ordem : orderns) {
                model.addRow(new Object[]{ordem.getId(), ordem.getCliente(), ordem.getFuncionario(), ordem.getStatus(), ordem.getValorTotal(), Util.calendarToString(ordem.getDataCadastro()), Util.calendarToString(ordem.getDataVencimento())});
            }
            jTableOrdemServico.setModel(model);
        } else {
            model = new DefaultTableModel();
            model.setColumnIdentifiers(styleModelOrdem);
            jTableOrdemServico.setModel(model);
        }
    }

    private void deletar() {
        TransactionManager.beginTransaction();
        new DaoOrdemServico().remover(orderns.get(jTableOrdemServico.getSelectedRow()));
        TransactionManager.commit();
        popularTabela();
    }

    private void pesquisarPorID() {
        if (verificarSeENumero(jTextFieldID.getText())) {
            TransactionManager.beginTransaction();
            orderns = new DaoOrdemServico().obterOSPorId(Integer.parseInt(jTextFieldID.getText()));
            TransactionManager.commit();
            prencherOrdem();
        }
    }

    private boolean verificarSeENumero(String text) {
        try {
            int opcao = Integer.parseInt(text);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "ID inválido!");
            return false;
        }
    }

    private void pesquisarPorDataCadastro() {
        TransactionManager.beginTransaction();
        if (!jFormattedTextFieldDataCadastro.getText().equals("  /  /    ")) {
            orderns = new DaoOrdemServico().obterDataCad(Util.stringToCalendar(jFormattedTextFieldDataCadastro.getText()));
            TransactionManager.commit();
            prencherOrdem();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhum registro encontrado!");
        }
    }

    private void pesquisaPorDataVencimento() {
        TransactionManager.beginTransaction();
        if (!jFormattedTextFieldDataVencimento.getText().equals("  /  /    ")) {
            orderns = new DaoOrdemServico().obterDataVencimento(Util.stringToCalendar(jFormattedTextFieldDataVencimento.getText()));
            TransactionManager.commit();
            prencherOrdem();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhum registro encontrado!");
        }
    }

    private void pesquisarPorVencidas() {
        TransactionManager.beginTransaction();
        orderns = new DaoOrdemServico().obterVencidas();
        TransactionManager.commit();
        prencherOrdem();
    }

    private void pesquisarPorDentroDoPrazo() {
        TransactionManager.beginTransaction();
        orderns = new DaoOrdemServico().obterAVencer();
        TransactionManager.commit();
        prencherOrdem();
    }

    private void pesquisarPorTodas() {
        popularTabela();
    }

    private void popularComboCliente() {
        List<Pessoa> pessoa = new ArrayList<Pessoa>();
        TransactionManager.beginTransaction();
        List<ClienteFisico> clientesF = new DaoClienteFisico().listar("", "nome");
        List<ClienteJuridico> clientesJ = new DaoClienteJuridico().listar("", "razaoSocial");
        TransactionManager.commit();

        for (ClienteJuridico clienteJuridico : clientesJ) {
            pessoa.add(clienteJuridico);
        }

        for (ClienteFisico clienteFisico : clientesF) {
            pessoa.add(clienteFisico);
        }

        jComboBoxCliente.removeAllItems();
        for (Pessoa funAgora : pessoa) {
            jComboBoxCliente.addItem(funAgora);
        }
        jComboBoxCliente.setSelectedIndex(-1);
    }

    private void popularComboFuncionario() {
        TransactionManager.beginTransaction();
        List<Funcionario> fun = new DaoFuncionario().listar("", "nome");
        TransactionManager.commit();
        jComboBoxFuncionario.removeAllItems();
        for (Funcionario funAgora : fun) {
            jComboBoxFuncionario.addItem(funAgora);
        }
        jComboBoxFuncionario.setSelectedIndex(-1);
    }

    private void pesquisarPorOSComClienteEFuncionario() {
        if (jComboBoxCliente.getSelectedIndex() >= 0 && jComboBoxFuncionario.getSelectedIndex() == -1) {
            Pessoa p = (Pessoa) jComboBoxCliente.getSelectedItem();
            TransactionManager.beginTransaction();
            orderns = new DaoOrdemServico().obterClientes(p.getId());
            TransactionManager.commit();
            prencherOrdem();
        } else if (jComboBoxCliente.getSelectedIndex() >= 0 && jComboBoxFuncionario.getSelectedIndex() >= 0) {

            Pessoa p1 = (Pessoa) jComboBoxFuncionario.getSelectedItem();
            Pessoa p2 = (Pessoa) jComboBoxCliente.getSelectedItem();
            TransactionManager.beginTransaction();
            orderns = new DaoOrdemServico().obterFuncionariosClientes(p1.getId(), p2.getId());
            TransactionManager.commit();
            prencherOrdem();

        } else if (jComboBoxFuncionario.getSelectedIndex() >= 0 && jComboBoxCliente.getSelectedIndex() == -1) {
            Pessoa p = (Pessoa) jComboBoxFuncionario.getSelectedItem();
            TransactionManager.beginTransaction();
            orderns = new DaoOrdemServico().obterFuncionarios(p.getId());
            TransactionManager.commit();
            prencherOrdem();
        }
    }

    private void limparFormulario() {
        popularTabela();
        jTextFieldID.setText(null);
        jComboBoxCliente.setSelectedIndex(-1);
        jComboBoxFuncionario.setSelectedIndex(-1);
        jFormattedTextFieldDataCadastro.setText(null);
        jFormattedTextFieldDataVencimento.setText(null);
        jRadioButtonTodas.setSelected(true);
    }
    
    private void orderServicoNota() {
        OrdemServico orderView = orderns.get(jTableOrdemServico.getSelectedRow());
        Connection conexao;
        try {
            conexao = Conexao.getConnection();
            conexao.createStatement().execute("use " + HibernateConfiguration.getBase());
            ResultSet executeQuery = conexao.createStatement().executeQuery("SELECT\n"
                    + "     endereco.`id` AS endereco_id,\n"
                    + "     endereco.`bairro` AS endereco_bairro,\n"
                    + "     endereco.`cep` AS endereco_cep,\n"
                    + "     endereco.`cidade` AS endereco_cidade,\n"
                    + "     endereco.`complemento` AS endereco_complemento,\n"
                    + "     endereco.`logradouro` AS endereco_logradouro,\n"
                    + "     endereco.`numero` AS endereco_numero,\n"
                    + "     endereco.`telefone1` AS endereco_telefone1,\n"
                    + "     endereco.`telefone2` AS endereco_telefone2,\n"
                    + "     endereco.`telefone3` AS endereco_telefone3,\n"
                    + "     endereco.`tipoLogradouro` AS endereco_tipoLogradouro,\n"
                    + "     ordemservico.`id` AS ordemservico_id,\n"
                    + "     ordemservico.`banco` AS ordemservico_banco,\n"
                    + "     ordemservico.`dataCadastro` AS ordemservico_dataCadastro,\n"
                    + "     ordemservico.`dataVencimento` AS ordemservico_dataVencimento,\n"
                    + "     ordemservico.`item1` AS ordemservico_item1,\n"
                    + "     ordemservico.`item2` AS ordemservico_item2,\n"
                    + "     ordemservico.`item3` AS ordemservico_item3,\n"
                    + "     ordemservico.`item4` AS ordemservico_item4,\n"
                    + "     ordemservico.`juros` AS ordemservico_juros,\n"
                    + "     ordemservico.`parcelas` AS ordemservico_parcelas,\n"
                    + "     ordemservico.`parcelasRestantes` AS ordemservico_parcelasRestantes,\n"
                    + "     ordemservico.`status` AS ordemservico_status,\n"
                    + "     ordemservico.`tipoCheque` AS ordemservico_tipoCheque,\n"
                    + "     ordemservico.`valor1` AS ordemservico_valor1,\n"
                    + "     ordemservico.`valor2` AS ordemservico_valor2,\n"
                    + "     ordemservico.`valor3` AS ordemservico_valor3,\n"
                    + "     ordemservico.`valor4` AS ordemservico_valor4,\n"
                    + "     ordemservico.`valorPorExtenso` AS ordemservico_valorPorExtenso,\n"
                    + "     ordemservico.`valorTotal` AS ordemservico_valorTotal,\n"
                    + "     ordemservico.`cliente_id` AS ordemservico_cliente_id,\n"
                    + "     ordemservico.`endereco_id` AS ordemservico_endereco_id,\n"
                    + "     ordemservico.`funcionario_id` AS ordemservico_funcionario_id,\n"
                    + "     pessoa.`DTYPE` AS pessoa_DTYPE,\n"
                    + "     pessoa.`id` AS pessoa_id,\n"
                    + "     pessoa.`dataCadastro` AS pessoa_dataCadastro,\n"
                    + "     pessoa.`email` AS pessoa_email,\n"
                    + "     pessoa.`cpf` AS pessoa_cpf,\n"
                    + "     pessoa.`nascimento` AS pessoa_nascimento,\n"
                    + "     pessoa.`nome` AS pessoa_nome,\n"
                    + "     pessoa.`rg` AS pessoa_rg,\n"
                    + "     pessoa.`sobrenome` AS pessoa_sobrenome,\n"
                    + "     pessoa.`cnpj` AS pessoa_cnpj,\n"
                    + "     pessoa.`inscricao` AS pessoa_inscricao,\n"
                    + "     pessoa.`razaoSocial` AS pessoa_razaoSocial,\n"
                    + "     pessoa.`responsavel` AS pessoa_responsavel,\n"
                    + "     pessoa.`referencia1` AS pessoa_referencia1,\n"
                    + "     pessoa.`referencia2` AS pessoa_referencia2,\n"
                    + "     pessoa.`referencia3` AS pessoa_referencia3,\n"
                    + "     pessoa.`endereco_id` AS pessoa_endereco_id\n"
                    + "FROM\n"
                    + "     pessoa, ordemservico, endereco\n"
                    + "WHERE\n"
                    + "     ordemservico.`id` = " + +orderView.getId() + " AND pessoa.`id` = ordemservico.`cliente_id` AND endereco.`id` = ordemservico.`endereco_id`");


            JRResultSetDataSource jrRS = new JRResultSetDataSource(executeQuery);


            String jasperPrint;
            try {
                JDialog viewer = new JDialog(new javax.swing.JFrame(), "Visualização da Ordem " + orderView.getId(), true);
                viewer.setSize(900, 600);
                viewer.setLocationRelativeTo(null);
                URL url = this.getClass().getResource("/br/com/okaynet/andare/icons/faststone.png");
                Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
                viewer.setIconImage(imagemTitulo);
                if (orderView.getCliente() instanceof ClienteFisico) {
                    jasperPrint = JasperFillManager.fillReportToFile("C:\\Okaynet\\Andare\\images\\OrdemServicoComplexaFisico.jasper", null, jrRS); //Aqui vc chama o relatório
                } else {
                    jasperPrint = JasperFillManager.fillReportToFile("C:\\Okaynet\\Andare\\images\\OrdemServicoComplexaJuridico.jasper", null, jrRS); //Aqui vc chama o relatório
                }

                JasperViewer jrviewer = new JasperViewer(jasperPrint, false, false);

                viewer.getContentPane().add(jrviewer.getContentPane());
                viewer.setVisible(true);
            } catch (JRException ex) {
                Logger.getLogger(testeParametro.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(testeRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
