package cadastroclientes;

import java.text.ParseException;

public class LayoutCadastroClientes extends javax.swing.JFrame {

    public LayoutCadastroClientes() {
        initComponents();
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblFraseTitulo = new javax.swing.JLabel();
        lblDataEHora = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNomeFornecedor = new javax.swing.JLabel();
        ftxtNomeFornecedor = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        ftxtCPF = new javax.swing.JTextField();
        lblPrincipalProduto = new javax.swing.JLabel();
        ftxtPrincipalProduto = new javax.swing.JTextField();
        btnPessoaFisica = new javax.swing.JRadioButton();
        btnPessoaJuridica = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        lblCelular = new javax.swing.JLabel();
        lblTelFixo = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTelComercial = new javax.swing.JLabel();
        lblTelRecado = new javax.swing.JLabel();
        lblNomeContato = new javax.swing.JLabel();
        ftxtCelular = new javax.swing.JTextField();
        ftxtTelFixo = new javax.swing.JTextField();
        ftxtEmail = new javax.swing.JTextField();
        ftxtTelComercial = new javax.swing.JTextField();
        ftxtTelRecado = new javax.swing.JTextField();
        ftxtNomeContato = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        txtDadosAdicionais = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnAtualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGOTIPO.png"))); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro de Fornecedores");

        lblFraseTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        lblFraseTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFraseTitulo.setText("Cadastre e edite os dados dos seus fornecedores e parceiros de negócios!");
        lblFraseTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblDataEHora.setText("Data + Hora");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFraseTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDataEHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataEHora, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblFraseTitulo))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Básicos:"));

        lblNomeFornecedor.setText("Nome do fornecedor:");

        ftxtNomeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtNomeFornecedorActionPerformed(evt);
            }
        });

        lblCPF.setText("CPF:");

        ftxtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtCPFActionPerformed(evt);
            }
        });

        lblPrincipalProduto.setText("Principal Produto Fornecido:");

        btnPessoaFisica.setText("Pessoa Física");
        btnPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessoaFisicaActionPerformed(evt);
            }
        });

        btnPessoaJuridica.setText("Pessoa Jurídica");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftxtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnPessoaFisica)
                        .addGap(117, 117, 117)
                        .addComponent(btnPessoaJuridica))
                    .addComponent(lblNomeFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftxtCPF)
                    .addComponent(ftxtPrincipalProduto)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCPF)
                            .addComponent(lblPrincipalProduto))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeFornecedor)
                    .addComponent(lblCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrincipalProduto)
                            .addComponent(btnPessoaJuridica))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftxtPrincipalProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPessoaFisica)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Contado:"));

        lblCelular.setText("Celular:");

        lblTelFixo.setText("Tel. Fixo:");

        lblEmail.setText("Email:");

        lblTelComercial.setText("Tel. comercial:");

        lblTelRecado.setText("Tel. Recado:");

        lblNomeContato.setText("Nome Contato:");

        ftxtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtCelularActionPerformed(evt);
            }
        });

        ftxtTelFixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtTelFixoActionPerformed(evt);
            }
        });

        ftxtTelComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtTelComercialActionPerformed(evt);
            }
        });

        ftxtTelRecado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtTelRecadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblTelComercial)
                        .addComponent(ftxtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addComponent(ftxtTelComercial))
                    .addComponent(lblCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelFixo)
                    .addComponent(lblTelRecado)
                    .addComponent(ftxtTelRecado, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(ftxtTelFixo))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(lblNomeContato)
                        .addGap(56, 56, 56))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(ftxtNomeContato)
                            .addComponent(ftxtEmail))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular)
                    .addComponent(lblTelFixo)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtTelFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelComercial)
                    .addComponent(lblTelRecado)
                    .addComponent(lblNomeContato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxtTelComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtTelRecado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Endereço:"));

        jLabel1.setText("Cep:");

        jLabel2.setText("Bairro:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("Número:");

        jLabel5.setText("Cidade:");

        jLabel6.setText("Estado:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel5))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField3)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados adicionais:"));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDadosAdicionais, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDadosAdicionais, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/UPLOAD.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtualizar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CANCELAR.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/REMOVER.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRemover.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRemover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LISTAR.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnListar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/NOVO.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SALVAR.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SAIR.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
            .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ftxtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtCPFActionPerformed

    private void btnPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoaFisicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPessoaFisicaActionPerformed

    private void ftxtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtCelularActionPerformed

    private void ftxtTelFixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtTelFixoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtTelFixoActionPerformed

    private void ftxtTelComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtTelComercialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtTelComercialActionPerformed

    private void ftxtTelRecadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtTelRecadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtTelRecadoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void ftxtNomeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtNomeFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtNomeFornecedorActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(LayoutCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LayoutCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LayoutCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LayoutCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LayoutCadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JRadioButton btnPessoaFisica;
    private javax.swing.JRadioButton btnPessoaJuridica;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField ftxtCPF;
    private javax.swing.JTextField ftxtCelular;
    private javax.swing.JTextField ftxtEmail;
    private javax.swing.JTextField ftxtNomeContato;
    private javax.swing.JTextField ftxtNomeFornecedor;
    private javax.swing.JTextField ftxtPrincipalProduto;
    private javax.swing.JTextField ftxtTelComercial;
    private javax.swing.JTextField ftxtTelFixo;
    private javax.swing.JTextField ftxtTelRecado;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblDataEHora;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFraseTitulo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNomeContato;
    private javax.swing.JLabel lblNomeFornecedor;
    private javax.swing.JLabel lblPrincipalProduto;
    private javax.swing.JLabel lblTelComercial;
    private javax.swing.JLabel lblTelFixo;
    private javax.swing.JLabel lblTelRecado;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtDadosAdicionais;
    // End of variables declaration//GEN-END:variables
}
