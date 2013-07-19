package br.com.okaynet.andare.gui;

import br.com.okaynet.andare.bibliotecas.Util;
import br.com.okaynet.andare.conexao.Data;
import br.com.okaynet.andare.conexao.HibernateConfiguration;
import br.com.okaynet.andare.daos.DaoUsuarios;
import br.com.okaynet.andare.model.Usuarios;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Erick
 */
public class JFrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form JFrameLogin
     */
    public JFrameLogin() {
        initComponents();
        //mudarFavicon();
        jTextUser.setBackground(new Color(58, 96, 99));
        jPassword.setBackground(new Color(58, 96, 99));

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
            System.out.println(ex);
        }

        HibernateConfiguration.setBase("andare");
        HibernateConfiguration.setHost("127.0.0.1:3306");
        HibernateConfiguration.setPass("root");
        HibernateConfiguration.setUser("root");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextUser = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Andare Adesivos Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextUser.setBackground(new java.awt.Color(204, 204, 204));
        jTextUser.setForeground(new java.awt.Color(51, 51, 51));
        jTextUser.setText("root");
        jTextUser.setToolTipText("");
        jTextUser.setBorder(null);
        jTextUser.setCaretColor(new java.awt.Color(153, 153, 153));
        jTextUser.setOpaque(false);
        getContentPane().add(jTextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 200, 20));

        jPassword.setBackground(new java.awt.Color(204, 204, 204));
        jPassword.setForeground(new java.awt.Color(51, 51, 51));
        jPassword.setText("root");
        jPassword.setBorder(null);
        jPassword.setCaretColor(new java.awt.Color(153, 153, 153));
        jPassword.setOpaque(false);
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 200, 23));

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 100, 30));

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/login.jpg"))); // NOI18N
        jLabelLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 620, 420));

        getAccessibleContext().setAccessibleDescription("Login");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:

        verificarLogin(jTextUser.getText(), jPassword.getText());
    }//GEN-LAST:event_jLabel1MouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextUser;
    // End of variables declaration//GEN-END:variables

    private void mudarFavicon() {
//        URL url = this.getClass().getResource("/br/edu/utfpr/cm/tsi/pi/unknownexpress/icons/favicon.png");
//        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
//        this.setIconImage(imagemTitulo);
    }

    private void verificarLogin(String usuario, String senha) {

        Usuarios autenticado = new DaoUsuarios().autenticarUsuario(usuario, Util.md5(senha));
        if (autenticado != null) {
            Data.hash.put("usuario", autenticado);
            Util.abrirDialogCentralizadoForm(new JFramePrincipal());
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
        }

    }
}
