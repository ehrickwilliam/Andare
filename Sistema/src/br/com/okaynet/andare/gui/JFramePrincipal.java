/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.gui;

import br.com.okaynet.andare.bibliotecas.ReportManage;
import br.com.okaynet.andare.bibliotecas.Util;
import br.com.okaynet.andare.conexao.Conexao;
import br.com.okaynet.andare.conexao.Data;
import br.com.okaynet.andare.conexao.HibernateConfiguration;
import br.com.okaynet.andare.conexao.TransactionManager;
import br.com.okaynet.andare.daos.DaoClienteFisico;
import br.com.okaynet.andare.daos.DaoClienteJuridico;
import br.com.okaynet.andare.daos.DaoFuncionario;
import br.com.okaynet.andare.model.ClienteFisico;
import br.com.okaynet.andare.model.ClienteJuridico;
import br.com.okaynet.andare.model.Funcionario;
import br.com.okaynet.andare.model.Pessoa;
import br.com.okaynet.andare.model.Usuarios;
import br.com.okaynet.andare.testes.testeParametro;
import br.com.okaynet.andare.testes.testeRelatorio;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ehrick
 */
public class JFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {

        initComponents();
        Util.iniciarRelogio(this.jLabelDate);
        Util.buscaAtendimentos(this.jLabelAtendimentos);
        Usuarios autenticado = (Usuarios) Data.hash.get("usuario");
        jLabelAdmin.setText(autenticado.getUsuario());

        if (autenticado.getPermissoes() != null && autenticado.getPermissoes().length() > 0) {
            int indexOf = autenticado.getPermissoes().indexOf("A");
            if (indexOf > 0) {
                jMenuItemNovoClienteFisico.setEnabled(true);
                jMenuItemNovoClienteJuridico.setEnabled(true);
            } else {
                jMenuItemNovoClienteFisico.setEnabled(false);
                jMenuItemNovoClienteJuridico.setEnabled(false);
            }
            indexOf = autenticado.getPermissoes().indexOf("C");
            if (indexOf > 0) {
                jMenuItemTodosClientes.setEnabled(true);
            } else {
                jMenuItemTodosClientes.setEnabled(false);
            }

            indexOf = autenticado.getPermissoes().indexOf("D");
            if (indexOf > 0) {
                jMenuItemNovoFuncionario.setEnabled(true);
            } else {
                jMenuItemNovoFuncionario.setEnabled(false);
            }

            indexOf = autenticado.getPermissoes().indexOf("F");
            if (indexOf > 0) {
                jMenuItemTodosFuncionarios.setEnabled(true);
            } else {
                jMenuItemTodosFuncionarios.setEnabled(false);
            }

            indexOf = autenticado.getPermissoes().indexOf("G");
            if (indexOf > 0) {
                jMenuItemNovaOs.setEnabled(true);
            } else {
                jMenuItemNovaOs.setEnabled(false);
            }
            
            indexOf = autenticado.getPermissoes().indexOf("U");
            if (indexOf > 0) {
                jMenuItem6.setEnabled(true);
            } else {
                jMenuItem6.setEnabled(false);
            }

            indexOf = autenticado.getPermissoes().indexOf("I");
            if (indexOf > 0) {
                jMenuItemOsMes.setEnabled(true);
                jMenuItemOsMesAdmin.setEnabled(true);
                jMenuItemVencidas.setEnabled(true);
                jLabel2.setEnabled(true);

            } else {
                jMenuItemOsMes.setEnabled(false);
                jMenuItemOsMesAdmin.setEnabled(false);
                jMenuItemVencidas.setEnabled(false);
                jLabel2.setEnabled(false);
            }

            indexOf = autenticado.getPermissoes().indexOf("O");
            if (indexOf > 0) {
                jMenuRelatorios.setEnabled(true);
            } else {
                jMenuRelatorios.setEnabled(false);
            }

            indexOf = autenticado.getPermissoes().indexOf("S");
            if (indexOf > 0) {
                jMenuItemTodasOsAdmin.setEnabled(true);
            } else {
                jMenuItemTodasOsAdmin.setEnabled(false);
            }

            indexOf = autenticado.getPermissoes().indexOf("J");
            if (indexOf > 0) {
                jMenuItemAddUser.setEnabled(true);
            } else {
                jMenuItemAddUser.setEnabled(false);
            }

            indexOf = autenticado.getPermissoes().indexOf("M");
            if (indexOf > 0) {
                jMenuItemUserCom.setEnabled(true);
            } else {
                jMenuItemUserCom.setEnabled(false);
            }
        }
        mudarFavicon();



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
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabelAdmin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelAtendimentos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelDate = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenuItemTodosClientes = new javax.swing.JMenuItem();
        jMenuItemNovoClienteJuridico = new javax.swing.JMenuItem();
        jMenuItemNovoClienteFisico = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemTodosFuncionarios = new javax.swing.JMenuItem();
        jMenuItemNovoFuncionario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemOsMes = new javax.swing.JMenuItem();
        jMenuItemNovaOs = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemVencidas = new javax.swing.JMenuItem();
        jMenuItemOsMesAdmin = new javax.swing.JMenuItem();
        jMenuItemTodasOsAdmin = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemUserCom = new javax.swing.JMenuItem();
        jMenuItemAddUser = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Andare Adesivos - Gerenciamento");
        setMinimumSize(new java.awt.Dimension(970, 610));
        setName("FramePrincipal"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setToolTipText("");

        jButton8.setToolTipText("Lucro / Debidos do Mês");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
        });
        jToolBar1.add(jButton8);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/user_male_16.png"))); // NOI18N

        jLabelAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelAdmin.setText("Administrador");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Olá");

        jLabelAtendimentos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelAtendimentos.setForeground(new java.awt.Color(255, 0, 0));
        jLabelAtendimentos.setText("0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Ordens de Serviços Para Cobrança:");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAtendimentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 613, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAdmin)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabelAtendimentos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.add(jPanel2);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 30));

        jLabelDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(102, 102, 102));
        jLabelDate.setText("00/00/0000 00:00:00");

        jLabelStatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(102, 102, 102));
        jLabelStatus.setText("Andare Adesivos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 728, Short.MAX_VALUE)
                .addComponent(jLabelDate)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelStatus, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 970, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/main_bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 970, 500));

        jMenuBar1.setToolTipText("Menu Princípal");

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/cliente_fun.png"))); // NOI18N
        jMenu6.setText("Clientes");
        jMenu6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItemTodosClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemTodosClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/book.png"))); // NOI18N
        jMenuItemTodosClientes.setText("Todos os Clientes");
        jMenuItemTodosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTodosClientesActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemTodosClientes);

        jMenuItemNovoClienteJuridico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemNovoClienteJuridico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/book_add.png"))); // NOI18N
        jMenuItemNovoClienteJuridico.setText("Adicionar Novo Cliente Juridico");
        jMenuItemNovoClienteJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoClienteJuridicoActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemNovoClienteJuridico);

        jMenuItemNovoClienteFisico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemNovoClienteFisico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/book_add.png"))); // NOI18N
        jMenuItemNovoClienteFisico.setText("Adicionar Novo Cliente Fisico");
        jMenuItemNovoClienteFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoClienteFisicoActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemNovoClienteFisico);

        jMenuBar1.add(jMenu6);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/user_male_16.png"))); // NOI18N
        jMenu1.setText("Funcionarios");

        jMenuItemTodosFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemTodosFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/building.png"))); // NOI18N
        jMenuItemTodosFuncionarios.setText("Todos os Funcionarios");
        jMenuItemTodosFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTodosFuncionariosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemTodosFuncionarios);

        jMenuItemNovoFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemNovoFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/building_add.png"))); // NOI18N
        jMenuItemNovoFuncionario.setText("Adicionar Novo Funcionario");
        jMenuItemNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemNovoFuncionario);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/ordem.png"))); // NOI18N
        jMenu2.setText("Ordem de Serviço (OS)");

        jMenuItemOsMes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemOsMes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/application_form.png"))); // NOI18N
        jMenuItemOsMes.setText("Todas as OS do mês");
        jMenuItemOsMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOsMesActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemOsMes);

        jMenuItemNovaOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemNovaOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/application_form_add.png"))); // NOI18N
        jMenuItemNovaOs.setText("Nova OS");
        jMenuItemNovaOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovaOsActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemNovaOs);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/administrativo.png"))); // NOI18N
        jMenu3.setText("Administrativo");

        jMenuItemVencidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/015.png"))); // NOI18N
        jMenuItemVencidas.setText("OS Vencidas");
        jMenuItemVencidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVencidasActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemVencidas);

        jMenuItemOsMesAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/038.png"))); // NOI18N
        jMenuItemOsMesAdmin.setText("Todas as OS do Mês");
        jMenuItemOsMesAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOsMesAdminActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemOsMesAdmin);

        jMenuItemTodasOsAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/057.png"))); // NOI18N
        jMenuItemTodasOsAdmin.setText("Todas as OS");
        jMenuItemTodasOsAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTodasOsAdminActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemTodasOsAdmin);
        jMenu3.add(jSeparator1);

        jMenuItemUserCom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/136.png"))); // NOI18N
        jMenuItemUserCom.setText("Todos os Usuários ");
        jMenuItemUserCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUserComActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemUserCom);

        jMenuItemAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/132.png"))); // NOI18N
        jMenuItemAddUser.setText("Novo Usuário");
        jMenuItemAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddUserActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemAddUser);
        jMenu3.add(jSeparator3);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/027.png"))); // NOI18N
        jMenuItem6.setText("BackUp do Sistema");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);
        jMenu3.add(jSeparator2);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_8, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/068.png"))); // NOI18N
        jMenuItem13.setText("Alterar Minha Senha");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuBar1.add(jMenu3);

        jMenuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/relatorios.png"))); // NOI18N
        jMenuRelatorios.setText("Relatórios");

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/026.png"))); // NOI18N
        jMenuItem15.setText("Todas OS do mês ");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItem15);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/008.png"))); // NOI18N
        jMenuItem17.setText("Todas OS geral");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItem17);

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/137.png"))); // NOI18N
        jMenuItem18.setText("Todos os Clientes Físicos");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItem18);

        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/137.png"))); // NOI18N
        jMenuItem19.setText("Todos os Clientes Juridicos");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItem19);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/137.png"))); // NOI18N
        jMenuItem2.setText("Todos os Funcionarios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItem2);

        jMenuBar1.add(jMenuRelatorios);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/023.png"))); // NOI18N
        jMenu5.setText("Sobre");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_0, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/022.png"))); // NOI18N
        jMenuItem3.setText("Sobre o Sistema");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuBar1.add(jMenu5);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/png/003.png"))); // NOI18N
        jMenu4.setText("Sair");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemTodosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTodosClientesActionPerformed
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogPesquisaCliente(this, true, null));
    }//GEN-LAST:event_jMenuItemTodosClientesActionPerformed

    private void jMenuItemNovoClienteJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoClienteJuridicoActionPerformed
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogCadastroClienteJuridico(this, true));
    }//GEN-LAST:event_jMenuItemNovoClienteJuridicoActionPerformed

    private void jMenuItemNovoClienteFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoClienteFisicoActionPerformed
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogCadastroClienteFisico(this, true));
    }//GEN-LAST:event_jMenuItemNovoClienteFisicoActionPerformed

    private void jMenuItemNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoFuncionarioActionPerformed
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogCadastroFuncionario(this, true));
    }//GEN-LAST:event_jMenuItemNovoFuncionarioActionPerformed

    private void jMenuItemTodosFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTodosFuncionariosActionPerformed
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogPesquisaFuncionario(this, true));
    }//GEN-LAST:event_jMenuItemTodosFuncionariosActionPerformed

    private void jMenuItemOsMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOsMesActionPerformed
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogPesquisaOrdemMes(this, true));
    }//GEN-LAST:event_jMenuItemOsMesActionPerformed

    private void jMenuItemNovaOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovaOsActionPerformed
        // TODO add your handling code here:
        TransactionManager.beginTransaction();
        List<Funcionario> fun = new DaoFuncionario().listar("", "nome");
        TransactionManager.commit();

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

        if (!fun.isEmpty() && !pessoa.isEmpty()) {
            Util.abrirDialogCentralizado(new JDialogCadastroOrdem(this, true));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Você não realizou o cadastro de clientes e funcionarios.");
        }
    }//GEN-LAST:event_jMenuItemNovaOsActionPerformed

    private void jMenuItemAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddUserActionPerformed
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogCadastroUsuario(this, true));
    }//GEN-LAST:event_jMenuItemAddUserActionPerformed

    private void jMenuItemUserComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUserComActionPerformed
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogPesquisaUsuarios(this, true));
    }//GEN-LAST:event_jMenuItemUserComActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogAlterarSenhaCadastroFuncionario(this, true));
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItemVencidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVencidasActionPerformed
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogPesquisaOrdemVencidas(this, true));
    }//GEN-LAST:event_jMenuItemVencidasActionPerformed

    private void jMenuItemOsMesAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOsMesAdminActionPerformed
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogPesquisaOrdemMes(this, true));
    }//GEN-LAST:event_jMenuItemOsMesAdminActionPerformed

    private void jMenuItemTodasOsAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTodasOsAdminActionPerformed
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogPesquisaOrdemTodas(this, true));
    }//GEN-LAST:event_jMenuItemTodasOsAdminActionPerformed

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        jLabelStatus.setText(((JButton) evt.getSource()).getToolTipText());
    }//GEN-LAST:event_jButton8MouseEntered

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        Util.abrirDialogCentralizadoForm(new JFrameLogin());
        Data.hash.remove("usuario");
        this.dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (jLabel2.isEnabled()) {
            Util.abrirDialogCentralizado(new JDialogPesquisaOrdemVencidas(this, true));
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogSobre(this, true));
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:

        ReportManage report = new ReportManage();

        try {
            report.relatorioPronto("reportClientesFisico", "Relatório de clientes");
        } catch (JRException ex) {
            Logger.getLogger(testeRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(testeRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
        ReportManage report = new ReportManage();

        try {
            report.relatorioPronto("reportClientesJuridico", "Relatório de clientes");
        } catch (JRException ex) {
            Logger.getLogger(testeRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(testeRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        // TODO add your handling code here:

        ReportManage report = new ReportManage();

        try {
            report.relatorioPronto("reportFuncionario", "Relatório de Funcionarios");
        } catch (JRException ex) {
            Logger.getLogger(testeRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(testeRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        ReportManage report = new ReportManage();

        try {

            report.relatorioPronto("reportTodasOs", "Relatório de Funcionarios");

        } catch (JRException ex) {
            Logger.getLogger(testeRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(testeRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM");
        String dataFormatada = formatador.format(data);
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
                    + "     pessoa.`id` = ordemservico.`cliente_id` AND endereco.`id` = ordemservico.`endereco_id` AND ordemservico.`dataCadastro` LIKE '%" + dataFormatada + "%'ORDER BY ordemservico.id");


            JRResultSetDataSource jrRS = new JRResultSetDataSource(executeQuery);


            String jasperPrint;
            try {
                JDialog viewer = new JDialog(new javax.swing.JFrame(), "Visualização Relatório do Mês ", true);
                viewer.setSize(900, 600);
                viewer.setLocationRelativeTo(null);
                URL url = this.getClass().getResource("/br/com/okaynet/andare/icons/faststone.png");
                Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
                viewer.setIconImage(imagemTitulo);
                jasperPrint = JasperFillManager.fillReportToFile("C:\\Okaynet\\Andare\\images\\reportOsMes.jasper", null, jrRS); //Aqui vc chama o relatório


                JasperViewer jrviewer = new JasperViewer(jasperPrint, false, false);

                viewer.getContentPane().add(jrviewer.getContentPane());
                viewer.setVisible(true);
            } catch (JRException ex) {
                Logger.getLogger(testeParametro.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(testeRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        backupDoSistema();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAdmin;
    private javax.swing.JLabel jLabelAtendimentos;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItemAddUser;
    private javax.swing.JMenuItem jMenuItemNovaOs;
    private javax.swing.JMenuItem jMenuItemNovoClienteFisico;
    private javax.swing.JMenuItem jMenuItemNovoClienteJuridico;
    private javax.swing.JMenuItem jMenuItemNovoFuncionario;
    private javax.swing.JMenuItem jMenuItemOsMes;
    private javax.swing.JMenuItem jMenuItemOsMesAdmin;
    private javax.swing.JMenuItem jMenuItemTodasOsAdmin;
    private javax.swing.JMenuItem jMenuItemTodosClientes;
    private javax.swing.JMenuItem jMenuItemTodosFuncionarios;
    private javax.swing.JMenuItem jMenuItemUserCom;
    private javax.swing.JMenuItem jMenuItemVencidas;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    private void mudarFavicon() {
        URL url = this.getClass().getResource("/br/com/okaynet/andare/icons/faststone.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

    private void backupDoSistema() {
        Date data = new Date();
        SimpleDateFormat formatadorTotal = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
        String dataFormatadaNormal = formatadorTotal.format(data);
        try {
            String comando = "C:\\Arquivos de programas\\MySQL\\MySQL Server 5.0\\bin\\mysqldump.exe";
            ProcessBuilder pb = new ProcessBuilder(comando, "--user=" + HibernateConfiguration.getUser(), "--password=" + HibernateConfiguration.getPass(), HibernateConfiguration.getBase(), "--result-file=C:\\Okaynet\\Andare\\Backup\\Backup_" + dataFormatadaNormal + ".sql");
            pb.start();
            JOptionPane.showMessageDialog(null, "Backup criado com sucesso !");
            try {
                Runtime.getRuntime().exec("explorer C:\\Okaynet\\Andare\\Backup\\");
            } catch (java.io.IOException ex) {
                JOptionPane.showMessageDialog(null, "Aconteceu algo inesperado ao executar o Backup!");
            }
        } catch (Exception exc) {
            JOptionPane.showMessageDialog(null, "Aconteceu algo inesperado ao executar o Backup!");
        }
    }
}
