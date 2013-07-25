/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.okaynet.andare.gui;

import br.com.okaynet.andare.bibliotecas.Util;
import br.com.okaynet.andare.conexao.Data;
import br.com.okaynet.andare.conexao.TransactionManager;
import br.com.okaynet.andare.daos.DaoClienteFisico;
import br.com.okaynet.andare.daos.DaoOrdemServico;
import br.com.okaynet.andare.model.ClienteFisico;
import br.com.okaynet.andare.model.Endereco;
import br.com.okaynet.andare.model.OrdemServico;
import br.com.okaynet.andare.model.Usuarios;
import java.awt.Color;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick
 */
public class JDialogCadastroClienteFisicoPopUp extends javax.swing.JDialog {

    /**
     * Creates new form JDialogCadastroClienteFisico
     */
    public JDialogCadastroClienteFisicoPopUp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencher();
        Usuarios autenticado = (Usuarios) Data.hash.get("usuario");
        int indexOf = autenticado.getPermissoes().indexOf("B");
        if (indexOf > 0) {
            jMenu3.setEnabled(true);
        } else {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldCod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxTipoLogradouro = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldComplemento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxCidade = new javax.swing.JComboBox();
        jTextFieldDataCadastro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldPrimeiraReferencia = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldSegundaReferencia = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldTerceiraReferencia = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jFormattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone3 = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone1 = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone2 = new javax.swing.JFormattedTextField();
        jFormattedTextFieldNumero = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCep = new javax.swing.JFormattedTextField();
        jTextFieldRg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente Físico");
        setMinimumSize(new java.awt.Dimension(608, 380));
        setModal(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCod.setEditable(false);
        getContentPane().add(jTextFieldCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("Nome* :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("Código:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setText("1º Telefone* :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setText("2º Telefone:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText("3º Telefone:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, 10));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setText("E-mail:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, 10));
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 170, 20));
        getContentPane().add(jTextFieldEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 240, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("Endereço* :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jComboBoxTipoLogradouro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rua", "Avenida" }));
        getContentPane().add(jComboBoxTipoLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setText("Numero* :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));
        getContentPane().add(jTextFieldComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 170, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel11.setText("Complemento:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel12.setText("CEP* :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        getContentPane().add(jTextFieldBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 130, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel13.setText("Bairro* :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel14.setText("Cidade* :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        jComboBoxCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Abatiá", "Adrianópolis", "Agudos do Sul", "Almirante Tamandaré", "Altamira do Paraná", "Alto Paraíso", "Alto Paraná", "Alto Piquiri", "Altônia", "Alvorada do Sul", "Amaporã", "Ampére", "Anahy", "Andirá", "Ângulo", "Antonina", "Antônio Olinto", "Apucarana", "Arapongas", "Arapoti", "Arapuã", "Araruna", "Araucária", "Ariranha do Ivaí", "Assaí", "Assis Chateaubriand", "Astorga", "Atalaia", "Balsa Nova", "Bandeirantes", "Barbosa Ferraz", "Barra do Jacaré", "Barracão", "Bela Vista da Caroba", "Bela Vista do Paraíso", "Bituruna", "Boa Esperança", "Boa Esperança do Iguaçu", "Boa Ventura de São Roque", "Boa Vista da Aparecida", "Bocaiuva do Sul", "Bom Jesus do Sul", "Bom Sucesso", "Bom Sucesso do Sul", "Borrazópolis", "Braganey", "Brasilândia do Sul", "Cafeara", "Cafelândia", "Cafezal do Sul", "Califórnia", "Cambará", "Cambé", "Cambira", "Campina da Lagoa", "Campina do Simão", "Campina Grande do Sul", "Campo Bonito", "Campo do Tenente", "Campo Largo", "Campo Magro", "Campo Mourão", "Cândido de Abreu", "Candói", "Cantagalo", "Capanema", "Capitão Leônidas Marques", "Carambeí", "Carlópolis", "Cascavel", "Castro", "Catanduvas", "Centenário do Sul", "Cerro Azul", "Céu Azul", "Chopinzinho", "Cianorte", "Cidade Gaúcha", "Clevelândia", "Colombo", "Colorado", "Congonhinhas", "Conselheiro Mairinck", "Contenda", "Corbélia", "Cornélio Procópio", "Coronel Domingos Soares", "Coronel Vivida", "Corumbataí do Sul", "Cruz Machado", "Cruzeiro do Iguaçu", "Cruzeiro do Oeste", "Cruzeiro do Sul", "Cruzmaltina", "Curitiba", "Curiúva", "Diamante do Norte", "Diamante do Sul", "Diamante d'Oeste", "Dois Vizinhos", "Douradina", "Doutor Camargo", "Doutor Ulysses", "Enéas Marques", "Engenheiro Beltrão", "Entre Rios do Oeste", "Esperança Nova", "Espigão Alto do Iguaçu", "Farol", "Faxinal", "Fazenda Rio Grande", "Fênix", "Fernandes Pinheiro", "Figueira", "Flor da Serra do Sul", "Floraí", "Floresta", "Florestópolis", "Flórida", "Formosa do Oeste", "Foz do Iguaçu", "Foz do Jordão", "Francisco Alves", "Francisco Beltrão", "General Carneiro", "Godoy Moreira", "Goioerê", "Goioxim", "Grandes Rios", "Guaíra", "Guairaçá", "Guamiranga", "Guapirama", "Guaporema", "Guaraci", "Guaraniaçu", "Guarapuava", "Guaraqueçaba", "Guaratuba", "Honório Serpa", "Ibaiti", "Ibema", "Ibiporã", "Icaraíma", "Iguaraçu", "Iguatu", "Imbaú", "Imbituva", "Inácio Martins", "Inajá", "Indianópolis", "Ipiranga", "Iporã", "Iracema do Oeste", "Irati", "Iretama", "Itaguajé", "Itaipulândia", "Itambaracá", "Itambé", "Itapejara d'Oeste", "Itaperuçu", "Itaúna do Sul", "Ivaí", "Ivaiporã", "Ivaté", "Ivatuba", "Jaboti", "Jacarezinho", "Jaguapitã", "Jaguariaíva", "Jandaia do Sul", "Janiópolis", "Japira", "Japurá", "Jardim Alegre", "Jardim Olinda", "Jataizinho", "Jesuítas", "Joaquim Távora", "Jundiaí do Sul", "Juranda", "Jussara", "Kaloré", "Lapa", "Laranjal", "Laranjeiras do Sul", "Leópolis", "Lidianópolis", "Lindoeste", "Loanda", "Lobato", "Londrina", "Luiziana", "Lunardelli", "Lupionópolis", "Mallet", "Mamborê", "Mandaguaçu", "Mandaguari", "Mandirituba", "Manfrinópolis", "Mangueirinha", "Manoel Ribas", "Marechal Cândido Rondon", "Maria Helena", "Marialva", "Marilândia do Sul", "Marilena", "Mariluz", "Maringá", "Mariópolis", "Maripá", "Marmeleiro", "Marquinho", "Marumbi", "Matelândia", "Matinhos", "Mato Rico", "Mauá da Serra", "Medianeira", "Mercedes", "Mirador", "Miraselva", "Missal", "Moreira Sales", "Morretes", "Munhoz de Melo", "Nossa Senhora das Graças", "Nova Aliança do Ivaí", "Nova América da Colina", "Nova Aurora", "Nova Cantu", "Nova Esperança", "Nova Esperança do Sudoeste", "Nova Fátima", "Nova Laranjeiras", "Nova Londrina", "Nova Olímpia", "Nova Prata do Iguaçu", "Nova Santa Bárbara", "Nova Santa Rosa", "Nova Tebas", "Novo Itacolomi", "Ortigueira", "Ourizona", "Ouro Verde do Oeste", "Paiçandu", "Palmas", "Palmeira", "Palmital", "Palotina", "Paraíso do Norte", "Paranacity", "Paranaguá", "Paranapoema", "Paranavaí", "Pato Bragado", "Pato Branco", "Paula Freitas", "Paulo Frontin", "Peabiru", "Perobal", "Pérola", "Pérola d'Oeste", "Piên", "Pinhais", "Pinhal de São Bento", "Pinhalão", "Pinhão", "Piraí do Sul", "Pitanga", "Pitangueiras", "Planaltina do Paraná", "Planalto", "Ponta Grossa", "Pontal do Paraná", "Porecatu", "Porto Amazonas", "Porto Barreiro", "Porto Rico", "Porto Vitória", "Prado Ferreira", "Pranchita", "Presidente Castelo Branco", "Primeiro de Maio", "Prudentópolis", "Prudentópolis", "Quarto Centenário", "Quatiguá", "Quatro Barras", "Quatro Pontes", "Quedas do Iguaçu", "Querência do Norte", "Quinta do Sol", "Quitandinha", "Ramilândia", "Rancho Alegre", "Rancho Alegre d'Oeste", "Realeza", "Rebouças", "Renascença", "Reserva", "Reserva do Iguaçu", "Ribeirão Claro", "Ribeirão do Pinhal", "Rio Azul", "Rio Bom", "Rio Bonito do Iguaçu", "Rio Branco do Ivaí", "Rio Branco do Sul", "Rio Negro", "Rolândia", "Roncador", "Rondon", "Rosário do Ivaí", "Sabáudia", "Salgado Filho", "Salto do Itararé", "Salto do Lontra", "Santa Amélia", "Santa Cecília do Pavão", "Santa Cruz de Monte Castelo", "Santa Fé", "Santa Helena", "Santa Inês", "Santa Isabel do Ivaí", "Santa Izabel do Oeste", "Santa Lúcia", "Santa Maria do Oeste", "Santa Mariana", "Santa Mônica", "Santa Tereza do Oeste", "Santa Terezinha de Itaipu", "Santana do Itararé", "Santo Antônio da Platina", "Santo Antônio do Caiuá", "Santo Antônio do Paraíso", "Santo Antônio do Sudoeste", "Santo Inácio", "São Carlos do Ivaí", "São Jerônimo da Serra", "São João", "São João do Caiuá", "São João do Ivaí", "São João do Triunfo", "São Jorge do Ivaí", "São Jorge do Patrocínio", "São Jorge d'Oeste", "São José da Boa Vista", "São José das Palmeiras", "São José dos Pinhais", "São Manoel do Paraná", "São Mateus do Sul", "São Miguel do Iguaçu", "São Pedro do Iguaçu", "São Pedro do Ivaí", "São Pedro do Paraná", "São Sebastião da Amoreira", "São Tomé", "Sapopema", "Sarandi", "Saudade do Iguaçu", "Sengés", "Serranópolis do Iguaçu", "Sertaneja", "Sertanópolis", "Siqueira Campos", "Sulina", "Tamarana", "Tamboara", "Tapejara", "Tapira", "Teixeira Soares", "Telêmaco Borba", "Terra Boa", "Terra Rica", "Terra Roxa", "Tibagi", "Tijucas do Sul", "Toledo", "Tomazina", "Três Barras do Paraná", "Tunas do Paraná", "Tuneiras do Oeste", "Tupãssi", "Turvo", "Ubiratã", "Umuarama", "União da Vitória", "Uniflor", "Uraí", "Ventania", "Vera Cruz do Oeste", "Verê", "Virmond", "Vitorino", "Wenceslau Braz", "Xambrê" }));
        getContentPane().add(jComboBoxCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 120, -1));

        jTextFieldDataCadastro.setEditable(false);
        getContentPane().add(jTextFieldDataCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 120, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel15.setText("Data de Cadastro* :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel16.setText("Data de Nascimento* :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));
        getContentPane().add(jTextFieldPrimeiraReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 130, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel17.setText("1º Referencia:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));
        getContentPane().add(jTextFieldSegundaReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 120, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel18.setText("2º Referencia:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));
        getContentPane().add(jTextFieldTerceiraReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 120, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel19.setText("3º Referencia:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        try {
            jFormattedTextFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextFieldDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, -1));

        try {
            jFormattedTextFieldTelefone3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextFieldTelefone3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 120, -1));

        try {
            jFormattedTextFieldTelefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextFieldTelefone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, -1));

        try {
            jFormattedTextFieldTelefone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextFieldTelefone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 120, -1));

        jFormattedTextFieldNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jFormattedTextFieldNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 60, -1));

        try {
            jFormattedTextFieldCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextFieldCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, -1));
        getContentPane().add(jTextFieldRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("RG* :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextFieldCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setText("CPF* :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        jMenuBar1.setMinimumSize(new java.awt.Dimension(56, 31));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(396, 31));

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

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        if (jMenu3.isEnabled()) {
            if (Util.mostraMensagemEmTela("Deseja realmente excluir?")) {
                deletar();
            }
        }

    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
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
            java.util.logging.Logger.getLogger(JDialogCadastroClienteFisicoPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroClienteFisicoPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroClienteFisicoPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroClienteFisicoPopUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogCadastroClienteFisicoPopUp dialog = new JDialogCadastroClienteFisicoPopUp(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox jComboBoxCidade;
    private javax.swing.JComboBox jComboBoxTipoLogradouro;
    private javax.swing.JFormattedTextField jFormattedTextFieldCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldNumero;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone1;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone2;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldDataCadastro;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPrimeiraReferencia;
    private javax.swing.JTextField jTextFieldRg;
    private javax.swing.JTextField jTextFieldSegundaReferencia;
    private javax.swing.JTextField jTextFieldTerceiraReferencia;
    // End of variables declaration//GEN-END:variables

    private void preencher() {
        if (Data.hash.get("clienteFisico") == null) {
            JOptionPane.showMessageDialog(this, "Aconteceu um problema ao obter os dados.");
        } else {
            if (Data.hash.get("clienteFisico") instanceof ClienteFisico) {
                ClienteFisico cliente = (ClienteFisico) Data.hash.get("clienteFisico");
                Data.hash.remove("clienteFisico");
                if (cliente == null) {
                    JOptionPane.showMessageDialog(this, "Aconteceu um problema ao obter os dados.");
                } else {
                    jTextFieldCod.setText(String.valueOf(cliente.getId()));
                    jTextFieldNome.setText(cliente.getNome());
                    jTextFieldRg.setText(cliente.getRg());
                    jFormattedTextFieldCpf.setText(cliente.getCpf());

                    jTextFieldEndereco.setText(cliente.getEndereco().getLogradouro());
                    jFormattedTextFieldTelefone1.setText(cliente.getEndereco().getTelefone1());
                    jFormattedTextFieldTelefone2.setText(cliente.getEndereco().getTelefone2());
                    jFormattedTextFieldTelefone3.setText(cliente.getEndereco().getTelefone3());


                    jFormattedTextFieldNumero.setText(String.valueOf(cliente.getEndereco().getNumero()));
                    jTextFieldComplemento.setText(cliente.getEndereco().getComplemento());
                    jFormattedTextFieldCep.setText(cliente.getEndereco().getCep());
                    jTextFieldBairro.setText(cliente.getEndereco().getBairro());
                    jFormattedTextFieldDataNascimento.setText(Util.calendarToString(cliente.getNascimento()));
                    jTextFieldDataCadastro.setText(Util.calendarToString(cliente.getDataCadastro()));
                    jTextFieldPrimeiraReferencia.setText(cliente.getReferencia1());
                    jTextFieldSegundaReferencia.setText(cliente.getReferencia2());
                    jTextFieldTerceiraReferencia.setText(cliente.getReferencia3());
                    jTextFieldEmail.setText(cliente.getEmail());

                    jComboBoxTipoLogradouro.setSelectedItem(cliente.getEndereco().getTipoLogradouro());
                    jComboBoxCidade.setSelectedItem(cliente.getEndereco().getCidade());
                }

            } else {
                JOptionPane.showMessageDialog(this, "Aconteceu um problema ao obter os dados.");
                Data.hash.remove("clienteFisico");
            }
        }
    }

    private void deletar() {

        TransactionManager.beginTransaction();

        List<OrdemServico> obterClienteID = new DaoOrdemServico().obterClientesID(Integer.parseInt(jTextFieldCod.getText()));
        if (obterClienteID.isEmpty()) {

            ClienteFisico clienteApagar = new DaoClienteFisico().obterPorId(Integer.parseInt(jTextFieldCod.getText()));
            new DaoClienteFisico().remover(clienteApagar);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Este cliente possui OS vinculadas a ele.");
        }
        TransactionManager.commit();
        this.dispose();
    }

    private void salvar() {
        if (validaCamposEmBranco()) {
            ClienteFisico cliente = new ClienteFisico();

            cliente.setId(Integer.parseInt(jTextFieldCod.getText()));
            cliente.setCpf(jFormattedTextFieldCpf.getText());
            cliente.setDataCadastro(Util.stringToCalendar(jTextFieldDataCadastro.getText()));
            cliente.setEmail(jTextFieldEmail.getText());

            cliente.setNascimento(Util.stringToCalendar(jFormattedTextFieldDataNascimento.getText()));

            cliente.setNome(jTextFieldNome.getText());
            cliente.setReferencia1(jTextFieldPrimeiraReferencia.getText());
            cliente.setReferencia2(jTextFieldSegundaReferencia.getText());
            cliente.setReferencia3(jTextFieldTerceiraReferencia.getText());
            cliente.setRg(jTextFieldRg.getText());



            Endereco endereco = new Endereco();

            endereco.setTelefone1(jFormattedTextFieldTelefone1.getText());
            if (!jFormattedTextFieldTelefone2.getText().isEmpty()) {
                endereco.setTelefone2(jFormattedTextFieldTelefone2.getText());
            }
            if (!jFormattedTextFieldTelefone3.getText().isEmpty()) {
                endereco.setTelefone3(jFormattedTextFieldTelefone3.getText());
            }

            endereco.setBairro(jTextFieldBairro.getText());
            endereco.setCep(jFormattedTextFieldCep.getText());
            endereco.setComplemento(jTextFieldComplemento.getText());
            endereco.setLogradouro(jTextFieldEndereco.getText());
            try {
                endereco.setNumero(Integer.parseInt(jFormattedTextFieldNumero.getText()));
            } catch (Exception e) {
            }
            endereco.setTipoLogradouro(jComboBoxTipoLogradouro.getSelectedItem().toString());
            endereco.setCidade(jComboBoxCidade.getSelectedItem().toString());
            cliente.setEndereco(endereco);

            TransactionManager.beginTransaction();
            try {
                new DaoClienteFisico().persistir(cliente);
                TransactionManager.commit();
                this.dispose();
            } catch (RuntimeException ex) {
                TransactionManager.rollback();
                JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro ao gravar os dados");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Contem campo(s) vazio ou tipo incorreto de dado !");
        }
    }

    private boolean validaCamposEmBranco() {

        int flag = 0;
        Color color = new Color(252, 196, 196);

        if (jTextFieldNome.getText().isEmpty()) {
            jTextFieldNome.setBackground(color);
            flag = 1;
        } else {
            if (!Pattern.matches("[^\\p{Punct}0-9]*", jTextFieldNome.getText())) {
                jTextFieldNome.setBackground(color);
                flag = 1;
            } else {
                jTextFieldNome.setBackground(Color.white);
            }
        }

        if (jTextFieldRg.getText().isEmpty()) {
            jTextFieldRg.setBackground(color);
            flag = 1;
        } else {
            jTextFieldRg.setBackground(Color.white);
        }

        if ("   .   .   -  ".equals(jFormattedTextFieldCpf.getText())) {
            jFormattedTextFieldCpf.setBackground(color);
            flag = 1;
        } else {
            jFormattedTextFieldCpf.setBackground(Color.white);
        }

        if ("(  )     -    ".equals(jFormattedTextFieldTelefone1.getText())) {
            jFormattedTextFieldTelefone1.setBackground(color);
            flag = 1;
        } else {
            jFormattedTextFieldTelefone1.setBackground(Color.white);
        }

        if (jTextFieldEndereco.getText().isEmpty()) {
            jTextFieldEndereco.setBackground(color);
            flag = 1;
        } else {
            jTextFieldEndereco.setBackground(Color.white);
        }

        if ("     -   ".equals(jFormattedTextFieldCep.getText())) {
            jFormattedTextFieldCep.setBackground(color);
            flag = 1;
        } else {
            jFormattedTextFieldCep.setBackground(Color.white);
        }

        if (jTextFieldBairro.getText().isEmpty()) {
            jTextFieldBairro.setBackground(color);
            flag = 1;
        } else {
            jTextFieldBairro.setBackground(Color.white);
        }

        if (jFormattedTextFieldNumero.getText().isEmpty()) {
            jFormattedTextFieldNumero.setBackground(color);
            flag = 1;
        } else {
            jFormattedTextFieldNumero.setBackground(Color.white);
        }

        if ("  /  /    ".equals(jFormattedTextFieldDataNascimento.getText())) {
            jFormattedTextFieldDataNascimento.setBackground(color);
            flag = 1;
        } else {
            jFormattedTextFieldDataNascimento.setBackground(Color.white);
        }

        if (flag == 1) {
            return false;
        }
        return true;

    }
}
