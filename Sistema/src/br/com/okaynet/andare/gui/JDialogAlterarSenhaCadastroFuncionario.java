/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.gui;

import br.com.okaynet.andare.bibliotecas.Util;
import br.com.okaynet.andare.conexao.Data;
import br.com.okaynet.andare.conexao.TransactionManager;
import br.com.okaynet.andare.daos.DaoUsuarios;
import br.com.okaynet.andare.model.Usuarios;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class JDialogAlterarSenhaCadastroFuncionario extends javax.swing.JDialog {

    /**
     * Creates new form JDialogCadastroClienteFisico
     */
    private Usuarios autenticado;

    public JDialogAlterarSenhaCadastroFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        autenticado = (Usuarios) Data.hash.get("usuario");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPasswordFieldSenha2 = new javax.swing.JPasswordField();
        jPasswordFieldSenha1 = new javax.swing.JPasswordField();
        jPasswordFieldSenha3 = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Senha");
        setMinimumSize(new java.awt.Dimension(460, 170));
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel17.setText("Senha Atual:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel18.setText("Nova Senha:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel20.setText("Confirmação de Senha:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));
        getContentPane().add(jPasswordFieldSenha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 120, -1));
        getContentPane().add(jPasswordFieldSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 120, -1));
        getContentPane().add(jPasswordFieldSenha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, -1));

        jMenuBar1.setMinimumSize(new java.awt.Dimension(56, 31));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(396, 31));

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/010.png"))); // NOI18N
        jMenu6.setText("Voltar");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/006.png"))); // NOI18N
        jMenu1.setText("Salvar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        if (Util.mostraMensagemEmTela("Deseja salvar?")) {
            salvar();
        }

    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenu6MouseClicked

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
            java.util.logging.Logger.getLogger(JDialogAlterarSenhaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogAlterarSenhaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogAlterarSenhaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogAlterarSenhaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogAlterarSenhaCadastroFuncionario dialog = new JDialogAlterarSenhaCadastroFuncionario(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPasswordField jPasswordFieldSenha1;
    private javax.swing.JPasswordField jPasswordFieldSenha2;
    private javax.swing.JPasswordField jPasswordFieldSenha3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private boolean validaCamposEmBranco() {
        int flag = 0;
        Color color = new Color(252, 196, 196);

        if (jPasswordFieldSenha2.getText().isEmpty()) {
            jPasswordFieldSenha2.setBackground(color);
            flag = 1;
        } else {
            jPasswordFieldSenha2.setBackground(Color.white);
        }

        if (jPasswordFieldSenha3.getText().isEmpty()) {
            jPasswordFieldSenha3.setBackground(color);
            flag = 1;
        } else {
            jPasswordFieldSenha3.setBackground(Color.white);
        }

        if (jPasswordFieldSenha1.getText().isEmpty()) {
            jPasswordFieldSenha1.setBackground(color);
            flag = 1;
        } else {
            jPasswordFieldSenha1.setBackground(Color.white);
        }
        if (flag == 1) {
            return false;
        }
        return true;
    }

    private void salvar() {
        if (validaCamposEmBranco()) {
            String senhaAtual = Util.md5(jPasswordFieldSenha3.getText());
            if (senhaAtual.equals(autenticado.getSenha())) {
                if (jPasswordFieldSenha1.getText().equals(jPasswordFieldSenha2.getText())) {

                    autenticado.setSenha(Util.md5(jPasswordFieldSenha2.getText()));
                    TransactionManager.beginTransaction();
                    try {
                        new DaoUsuarios().persistir(autenticado);
                        TransactionManager.commit();
                        JOptionPane.showMessageDialog(rootPane, "Senha Alterada com Sucesso");
                        this.dispose();
                    } catch (RuntimeException ex) {
                        TransactionManager.rollback();
                        JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro ao gravar os dados");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Senhas não conferem.");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Senhas Atual não confere.");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Contem campo(s) vazio ou tipo incorreto de dado !");
        }
    }
}
