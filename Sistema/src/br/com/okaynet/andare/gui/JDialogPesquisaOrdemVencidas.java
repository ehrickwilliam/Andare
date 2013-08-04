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
import br.com.okaynet.andare.model.Usuarios;
import br.com.okaynet.andare.testes.testeParametro;
import br.com.okaynet.andare.testes.testeRelatorio;
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
 * @author Erick
 */
public class JDialogPesquisaOrdemVencidas extends javax.swing.JDialog {

    /**
     * Creates new form JDialogPesquisaCliente
     */
    private DefaultTableModel model;
    private String styleModelOrdem[] = new String[]{"ID", "Cliente", "Funcionario", "Status", "Valor", "Data de Cadastro", "Data de Vencimento"};
    private List<OrdemServico> orderns;

    public JDialogPesquisaOrdemVencidas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        popularComboCliente();
        popularComboFuncionario();
        popularTabela();
        Usuarios autenticado = (Usuarios) Data.hash.get("usuario");
        int indexOf = autenticado.getPermissoes().indexOf("G");
        if (indexOf > 0) {
            jMenu1.setEnabled(true);
            jMenu1.setEnabled(true);
        } else {
            jMenu1.setEnabled(false);
            jMenu1.setEnabled(false);
        }

        indexOf = autenticado.getPermissoes().indexOf("H");
        if (indexOf > 0) {
            jMenu3.setEnabled(true);
            jMenu3.setEnabled(true);
        } else {
            jMenu3.setEnabled(false);
            jMenu3.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOrdemServico = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxCliente = new javax.swing.JComboBox();
        jComboBoxFuncionario = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextFieldCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de Ordem Serviço");
        setMinimumSize(new java.awt.Dimension(639, 505));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 590, 300));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel16.setText("Funcionario:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel17.setText("Cliente:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Okaynet Informática LTDA ME" }));
        jComboBoxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClienteActionPerformed(evt);
            }
        });
        jComboBoxCliente.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxClientePropertyChange(evt);
            }
        });
        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 230, -1));

        jComboBoxFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Jhonatan", "André" }));
        jComboBoxFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 210, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/074.png"))); // NOI18N
        jButton1.setText("Visualizar Ordem de Serviço");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 184, 22));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/1372094443_Magnifier2.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setFocusPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 30, 30));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/1372094443_Magnifier2.png"))); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setFocusPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 30, 30));
        getContentPane().add(jTextFieldCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("Código:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jMenuBar1.setMinimumSize(new java.awt.Dimension(56, 31));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(396, 31));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/108.png"))); // NOI18N
        jMenu1.setText("Editar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/004.png"))); // NOI18N
        jMenu3.setText("Apagar");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/010.png"))); // NOI18N
        jMenu6.setText("Voltar");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/024.png"))); // NOI18N
        jMenu7.setText("Limpar Pesquisa");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

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

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        if (jMenu3.isEnabled()) {
            if (jTableOrdemServico.getSelectedRow() != -1) {
                if (Util.mostraMensagemEmTela("Deseja realmente excluir?")) {
                    deletar();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Nenhum registro selecionado!");
            }
        }
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        if (jMenu1.isEnabled()) {
            if (jTableOrdemServico.getSelectedRow() != -1) {
                Data.hash.put("ordem", orderns.get(jTableOrdemServico.getSelectedRow()));
                Util.abrirDialogCentralizado(new JDialogCadastroOrdemPopUp(null, true));
                popularTabela();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Nenhum registro selecionado!");
            }
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jTableOrdemServico.getSelectedRow() != -1) {
            Data.hash.put("ordem", orderns.get(jTableOrdemServico.getSelectedRow()));
            Util.abrirDialogCentralizado(new JDialogViewOrdemServico(null, true));
            popularTabela();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhum registro selecionado!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFuncionarioActionPerformed

    private void jComboBoxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClienteActionPerformed

    private void jComboBoxClientePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxClientePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxClientePropertyChange

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        if (jComboBoxCliente.getSelectedIndex() >= 0 && jComboBoxFuncionario.getSelectedIndex() == -1) {
            Pessoa p = (Pessoa) jComboBoxCliente.getSelectedItem();
            TransactionManager.beginTransaction();
            orderns = new DaoOrdemServico().obterVencidasClientes(p.getId());
            TransactionManager.commit();
            prencherOrdem();
        } else if (jComboBoxCliente.getSelectedIndex() >= 0 && jComboBoxFuncionario.getSelectedIndex() >= 0) {

            Pessoa p1 = (Pessoa) jComboBoxFuncionario.getSelectedItem();
            Pessoa p2 = (Pessoa) jComboBoxCliente.getSelectedItem();
            TransactionManager.beginTransaction();
            orderns = new DaoOrdemServico().obterVencidasFuncionariosClientes(p1.getId(), p2.getId());
            TransactionManager.commit();
            prencherOrdem();


        } else if (jComboBoxFuncionario.getSelectedIndex() >= 0 && jComboBoxCliente.getSelectedIndex() == -1) {
            Pessoa p = (Pessoa) jComboBoxFuncionario.getSelectedItem();
            TransactionManager.beginTransaction();
            orderns = new DaoOrdemServico().obterVencidasFuncionarios(p.getId());
            TransactionManager.commit();
            prencherOrdem();
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        TransactionManager.beginTransaction();
        orderns = new DaoOrdemServico().obterVencidasId(jTextFieldCod.getText());
        TransactionManager.commit();
        prencherOrdem();

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        popularTabela();
        jTextFieldCod.setText(null);
        jComboBoxCliente.setSelectedIndex(-1);
        jComboBoxFuncionario.setSelectedIndex(-1);
    }//GEN-LAST:event_jMenu7MouseClicked

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
            java.util.logging.Logger.getLogger(JDialogPesquisaOrdemVencidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogPesquisaOrdemVencidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogPesquisaOrdemVencidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogPesquisaOrdemVencidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogPesquisaOrdemVencidas dialog = new JDialogPesquisaOrdemVencidas(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBoxCliente;
    private javax.swing.JComboBox jComboBoxFuncionario;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOrdemServico;
    private javax.swing.JTextField jTextFieldCod;
    // End of variables declaration//GEN-END:variables

    private void popularTabela() {
        TransactionManager.beginTransaction();
        orderns = new DaoOrdemServico().obterVencidas();
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
