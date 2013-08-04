/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.gui;

import br.com.okaynet.andare.conexao.Conexao;
import br.com.okaynet.andare.conexao.HibernateConfiguration;
import br.com.okaynet.andare.daos.DaoOrdemServico;
import br.com.okaynet.andare.model.Pessoa;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class JDialogCriacaoBase extends javax.swing.JDialog {

    /**
     * Creates new form JDialogCadastroClienteFisico
     */
    public JDialogCriacaoBase(java.awt.Frame parent, boolean modal, Pessoa pessoa) {
        super(parent, modal);
        initComponents();
        jButton1.setVisible(false);
        criarBanco(jButton1);
        
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(460, 170));
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Criando a Base de Dados Por Favor Aguarde.");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/ajax-loader.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    public static void criarBanco(final JButton botao) {
        new Thread() {
            @Override
            public void run() {
                int flag = 0;
                while (flag == 0) {

                    try {
                        sleep(10000);
                        Connection conexao;
                        try {
                            conexao = Conexao.getConnection();
                            conexao.createStatement().execute("use " + HibernateConfiguration.getBase());

                            HibernateConfiguration.criarSchema();
                            conexao.createStatement().execute("INSERT INTO usuarios VALUES (1,'ehrick@vista.aero','ZXSACBDFEGIHOJML','63a9f0ea7bb98050796b649e85481845','Okaynet')");
                            botao.doClick();
                            flag=+1;
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(JDialogCriacaoBase.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        }.start();
        
    }
}