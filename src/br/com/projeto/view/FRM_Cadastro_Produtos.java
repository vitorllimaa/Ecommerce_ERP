/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import br.com.projeto.dao.Clientedao;
import br.com.projeto.dao.Fornecedoredao;
import br.com.projeto.dao.Produtosdao;
import br.com.projeto.modelo.Cliente;
import br.com.projeto.modelo.Fornecedores;
import br.com.projeto.modelo.Utilitarios;
import br.com.projeto.modelo.tabela_produtos;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WEB-01
 */
public class FRM_Cadastro_Produtos extends javax.swing.JFrame {

    public void listar() {

        Produtosdao dao = new Produtosdao();
        List<tabela_produtos> lista = dao.listarprodutos();
        DefaultTableModel dados = (DefaultTableModel) tabelacliente.getModel();
        dados.setNumRows(0);

        for (tabela_produtos c : lista) {

            dados.addRow(new Object[]{
                c.getId(),
                c.getNome_produto(),
                c.getPreco(),
                c.getEstoque(),
                c.getFornecedor().getNome()
                });

        }

    }

    public FRM_Cadastro_Produtos() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
          
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        paineldadospessoais = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtpreco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnome_produtos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtestoque = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        boxtxtfornecedor = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtobservação = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        btexcluir_dados = new javax.swing.JToggleButton();
        bteditar_dados = new javax.swing.JToggleButton();
        btsalvar_dados = new javax.swing.JToggleButton();
        btnovo_dados = new javax.swing.JToggleButton();
        painelconsultacliente = new javax.swing.JPanel();
        txtpesquisa = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelacliente = new javax.swing.JTable();
        btpesquisa = new javax.swing.JToggleButton();

        jTabbedPane3.setBackground(new java.awt.Color(204, 204, 204));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mega Click");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));
        jPanel1.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        paineldadospessoais.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome do Produtos");

        txtcodigo.setEditable(false);
        txtcodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        txtpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Preço:");

        txtnome_produtos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtnome_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnome_produtosActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Código:");

        txtestoque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtestoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtestoqueActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Estoque:");

        boxtxtfornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        boxtxtfornecedor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                boxtxtfornecedorAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        boxtxtfornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxtxtfornecedorActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Fornecedor:");

        txtobservação.setColumns(20);
        txtobservação.setRows(5);
        jScrollPane1.setViewportView(txtobservação);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Observação:");

        btexcluir_dados.setText("Excluir");
        btexcluir_dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluir_dadosActionPerformed(evt);
            }
        });

        bteditar_dados.setText("Editar");
        bteditar_dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditar_dadosActionPerformed(evt);
            }
        });

        btsalvar_dados.setText("Salvar");
        btsalvar_dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvar_dadosActionPerformed(evt);
            }
        });

        btnovo_dados.setText("+ Novo");
        btnovo_dados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovo_dadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paineldadospessoaisLayout = new javax.swing.GroupLayout(paineldadospessoais);
        paineldadospessoais.setLayout(paineldadospessoaisLayout);
        paineldadospessoaisLayout.setHorizontalGroup(
            paineldadospessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineldadospessoaisLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(paineldadospessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paineldadospessoaisLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addGap(73, 73, 73))
                    .addGroup(paineldadospessoaisLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(paineldadospessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paineldadospessoaisLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paineldadospessoaisLayout.createSequentialGroup()
                                .addGroup(paineldadospessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(paineldadospessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paineldadospessoaisLayout.createSequentialGroup()
                                        .addComponent(txtnome_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(115, 115, 115)
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boxtxtfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paineldadospessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtestoque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                        .addComponent(txtpreco, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(paineldadospessoaisLayout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(btnovo_dados, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btsalvar_dados, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bteditar_dados, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btexcluir_dados, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 404, Short.MAX_VALUE))
        );
        paineldadospessoaisLayout.setVerticalGroup(
            paineldadospessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paineldadospessoaisLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(paineldadospessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(paineldadospessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnome_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(boxtxtfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(paineldadospessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paineldadospessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtestoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(90, 90, 90)
                .addGroup(paineldadospessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(paineldadospessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsalvar_dados)
                    .addComponent(bteditar_dados)
                    .addComponent(btexcluir_dados)
                    .addComponent(btnovo_dados))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados Produtos", paineldadospessoais);

        painelconsultacliente.setBackground(new java.awt.Color(204, 204, 204));

        txtpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpesquisaActionPerformed(evt);
            }
        });
        txtpesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpesquisaKeyReleased(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome" }));
        jComboBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox4ItemStateChanged(evt);
            }
        });
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        tabelacliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome do Produto", "Preço", "Quantidade", "Fornecedor"
            }
        ));
        tabelacliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaclienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelacliente);

        btpesquisa.setText("Pesquisar");
        btpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelconsultaclienteLayout = new javax.swing.GroupLayout(painelconsultacliente);
        painelconsultacliente.setLayout(painelconsultaclienteLayout);
        painelconsultaclienteLayout.setHorizontalGroup(
            painelconsultaclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelconsultaclienteLayout.createSequentialGroup()
                .addGroup(painelconsultaclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelconsultaclienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(painelconsultaclienteLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 473, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelconsultaclienteLayout.setVerticalGroup(
            painelconsultaclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelconsultaclienteLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(painelconsultaclienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btpesquisa)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jTabbedPane1.addTab("Consulta de Produtos", painelconsultacliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecoActionPerformed

    private void txtnome_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnome_produtosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnome_produtosActionPerformed

    private void txtestoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtestoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtestoqueActionPerformed
    //salvar dados
    private void btsalvar_dadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvar_dadosActionPerformed

        try {

            tabela_produtos obj = new tabela_produtos();

            obj.setNome_produto(txtnome_produtos.getText());
            obj.setEstoque(Integer.parseInt(txtestoque.getText()));
            obj.setPreco(Double.parseDouble(txtpreco.getText()));
            
           
            
            Fornecedores f = new Fornecedores();
            f = (Fornecedores) boxtxtfornecedor.getSelectedItem();
            obj.setFornecedor(f);

            Produtosdao dao = new Produtosdao();
            dao.Cadastrarproduto(obj);
            new Utilitarios().limpatela(paineldadospessoais);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"erro :" + e);
        }


    }//GEN-LAST:event_btsalvar_dadosActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
        boxtxtfornecedor.removeAll();
    }//GEN-LAST:event_formWindowActivated

    private void tabelaclienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaclienteMouseClicked
        jTabbedPane1.setSelectedIndex(0);
        txtcodigo.setText(tabelacliente.getValueAt(tabelacliente.getSelectedRow(), 0).toString());
        txtnome_produtos.setText(tabelacliente.getValueAt(tabelacliente.getSelectedRow(), 1).toString());
        txtpreco.setText(tabelacliente.getValueAt(tabelacliente.getSelectedRow(), 2).toString());
        txtestoque.setText(tabelacliente.getValueAt(tabelacliente.getSelectedRow(), 3).toString());
        
        Fornecedores f = new Fornecedores();
        Fornecedoredao dao = new Fornecedoredao();
        
        f = dao.consultanome(tabelacliente.getValueAt(tabelacliente.getSelectedRow(), 4).toString());
        
        boxtxtfornecedor.setSelectedItem(f);
       boxtxtfornecedor.removeAllItems();
        
    }//GEN-LAST:event_tabelaclienteMouseClicked

    private void bteditar_dadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditar_dadosActionPerformed
    
        try {
            
        
            tabela_produtos obj = new tabela_produtos();

            obj.setNome_produto(txtnome_produtos.getText());
            obj.setPreco(Double.parseDouble(txtpreco.getText()));
            obj.setEstoque(Integer.parseInt(txtestoque.getText()));
            
            obj.setId(Integer.parseInt(txtcodigo.getText()));

            Fornecedores f = new Fornecedores();
            f = (Fornecedores)boxtxtfornecedor.getSelectedItem();
            
            obj.setFornecedor(f);
            Produtosdao dao = new Produtosdao();

            dao.alterarProduto(obj);
            
            new Utilitarios().limpatela(paineldadospessoais);
} catch (Exception e) {
    JOptionPane.showMessageDialog(null,"erro :" + e);
        }

        
    }//GEN-LAST:event_bteditar_dadosActionPerformed

    private void btexcluir_dadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluir_dadosActionPerformed
         try {

           tabela_produtos obj = new tabela_produtos();

            
            obj.setId(Integer.parseInt(txtcodigo.getText()));

             Produtosdao dao = new Produtosdao();

            dao.excluircliente(obj);
            new Utilitarios().limpatela(paineldadospessoais);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"erro :" + e);
        }
    }//GEN-LAST:event_btexcluir_dadosActionPerformed

    private void btpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpesquisaActionPerformed
        try {
            
       
 String nome = "%"+txtpesquisa.getText()+"%";
       
        Produtosdao dao = new Produtosdao();
        List<tabela_produtos> lista = dao.Buscaproduto(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelacliente.getModel();
        dados.setNumRows(0);

        for (tabela_produtos c : lista) {

            dados.addRow(new Object[]{
                c.getId(),
                c.getNome_produto(),
                c.getPreco(),
                c.getEstoque(),
                c.getFornecedor().getNome()
                
                });

        }
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "erro: " +e);
        }
    }//GEN-LAST:event_btpesquisaActionPerformed

    private void txtpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpesquisaActionPerformed
        
    }//GEN-LAST:event_txtpesquisaActionPerformed

    private void txtpesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpesquisaKeyReleased
//       String nome = "%"+txtpesquisa.getText()+"%";
//       
//        Produtosdao dao = new Produtosdao();
//        List<tabela_produtos> lista = dao.Buscaproduto(nome);
//        DefaultTableModel dados = (DefaultTableModel) tabelacliente.getModel();
//        dados.setNumRows(0);
//
//        for (tabela_produtos c : lista) {
//
//            dados.addRow(new Object[]{
//                c.getId(),
//                c.getNome_produto(),
//                c.getPreco(),
//                c.getEstoque(),
//                c.getFornecedor().getNome()
//                
//                });
//
//        }
    }//GEN-LAST:event_txtpesquisaKeyReleased

    private void btnovo_dadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovo_dadosActionPerformed
      new Utilitarios().limpatela(paineldadospessoais);
    }//GEN-LAST:event_btnovo_dadosActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox4ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ItemStateChanged

    private void boxtxtfornecedorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_boxtxtfornecedorAncestorAdded
        Fornecedoredao dao = new Fornecedoredao();
        List<Fornecedores> listaf = dao.listarFornecedores();
        boxtxtfornecedor.removeAll();
        
        for(Fornecedores s : listaf){
            boxtxtfornecedor.addItem(s);
        }
        
        
    }//GEN-LAST:event_boxtxtfornecedorAncestorAdded

    private void boxtxtfornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxtxtfornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxtxtfornecedorActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
      
    }//GEN-LAST:event_jTabbedPane1MouseClicked

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
            java.util.logging.Logger.getLogger(FRM_Cadastro_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Cadastro_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Cadastro_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Cadastro_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Cadastro_Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxtxtfornecedor;
    private javax.swing.JToggleButton bteditar_dados;
    private javax.swing.JToggleButton btexcluir_dados;
    private javax.swing.JToggleButton btnovo_dados;
    private javax.swing.JToggleButton btpesquisa;
    private javax.swing.JToggleButton btsalvar_dados;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JPanel painelconsultacliente;
    private javax.swing.JPanel paineldadospessoais;
    private javax.swing.JTable tabelacliente;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtestoque;
    private javax.swing.JTextField txtnome_produtos;
    private javax.swing.JTextArea txtobservação;
    private javax.swing.JTextField txtpesquisa;
    private javax.swing.JTextField txtpreco;
    // End of variables declaration//GEN-END:variables
 private void setIcon() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Ícone.png")));
    }


}
