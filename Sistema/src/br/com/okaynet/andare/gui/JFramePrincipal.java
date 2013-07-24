/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.gui;

import br.com.okaynet.andare.bibliotecas.Util;
import br.com.okaynet.andare.conexao.Data;
import br.com.okaynet.andare.model.Usuarios;
import javax.swing.JButton;

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
        jToolBar1 = new javax.swing.JToolBar();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelAdmin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelAtendimentos = new javax.swing.JLabel();
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
        jMenuItemUserCom = new javax.swing.JMenuItem();
        jMenuItemAddUser = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem5.setText("jMenuItem5");

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/cliente_bar.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/cliente_pesquisa_bar.png"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/entrada_bar.png"))); // NOI18N
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/produtos_bar.png"))); // NOI18N
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/balanco_bar.png"))); // NOI18N
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/atendimento_bar.png"))); // NOI18N
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/estoque_bar.png"))); // NOI18N
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton7);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/distribuidor_bar.png"))); // NOI18N
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton9);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/venda_bar.png"))); // NOI18N
        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton10);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Olá");

        jLabelAdmin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelAdmin.setText("Administrador");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/user_male_16.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/exit.png"))); // NOI18N
        jLabel4.setText("Sair");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Ordens de Serviços Para Cobrança:");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabelAtendimentos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelAtendimentos.setForeground(new java.awt.Color(255, 0, 0));
        jLabelAtendimentos.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAtendimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAtendimentos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabelAdmin)
                        .addComponent(jLabel4)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jToolBar1.add(jPanel2);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 50));

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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 970, 490));

        jMenuBar1.setToolTipText("Menu Princípal");

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/cliente_fun.png"))); // NOI18N
        jMenu6.setText("Clientes");
        jMenu6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jMenuItemTodosClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/book.png"))); // NOI18N
        jMenuItemTodosClientes.setText("Todos os Clientes");
        jMenuItemTodosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTodosClientesActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemTodosClientes);

        jMenuItemNovoClienteJuridico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/book_add.png"))); // NOI18N
        jMenuItemNovoClienteJuridico.setText("Adicionar Novo Cliente Juridico");
        jMenuItemNovoClienteJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoClienteJuridicoActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItemNovoClienteJuridico);

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

        jMenuItemTodosFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/building.png"))); // NOI18N
        jMenuItemTodosFuncionarios.setText("Todos os Funcionarios");
        jMenuItemTodosFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTodosFuncionariosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemTodosFuncionarios);

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

        jMenuItemOsMes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/okaynet/andare/icons/application_form.png"))); // NOI18N
        jMenuItemOsMes.setText("Todas as OS do mês");
        jMenuItemOsMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOsMesActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemOsMes);

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

        jMenuItemVencidas.setText("OS Vencidas");
        jMenuItemVencidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVencidasActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemVencidas);

        jMenuItemOsMesAdmin.setText("Todas as OS do Mês");
        jMenuItemOsMesAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOsMesAdminActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemOsMesAdmin);

        jMenuItemTodasOsAdmin.setText("Todas as OS");
        jMenuItemTodasOsAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTodasOsAdminActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemTodasOsAdmin);

        jMenuItemUserCom.setText("Todos os Usuários ");
        jMenuItemUserCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUserComActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemUserCom);

        jMenuItemAddUser.setText("Novo Usuário");
        jMenuItemAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddUserActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemAddUser);

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

        jMenuItem15.setText("Total de OS do mês ");
        jMenuRelatorios.add(jMenuItem15);

        jMenuItem16.setText("Total Arrecadado no mês");
        jMenuRelatorios.add(jMenuItem16);

        jMenuItem17.setText("Total de OS geral");
        jMenuRelatorios.add(jMenuItem17);

        jMenuItem18.setText("Clientes em Debito");
        jMenuRelatorios.add(jMenuItem18);

        jMenuBar1.add(jMenuRelatorios);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        jLabelStatus.setText(((JButton) evt.getSource()).getToolTipText());
    }//GEN-LAST:event_jButton8MouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (jLabel2.isEnabled()) {
            Util.abrirDialogCentralizado(new JDialogPesquisaOrdemVencidas(this, true));
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jMenuItemTodosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTodosClientesActionPerformed
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogPesquisaCliente(this, true, null));
    }//GEN-LAST:event_jMenuItemTodosClientesActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Data.hash.remove("usuario");
        Util.abrirDialogCentralizadoForm(new JFrameLogin());
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
        Util.abrirDialogCentralizado(new JDialogCadastroOrdem(this, true));
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogCadastroClienteJuridico(this, true));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogPesquisaCliente(this, rootPaneCheckingEnabled, null));
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAdmin;
    private javax.swing.JLabel jLabelAtendimentos;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem5;
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
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
