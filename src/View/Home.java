/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ExemplarController;
import Controller.UsuarioController;
import Model.Exemplar;
import Model.Usuario;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class Home extends javax.swing.JFrame {
    
    UsuarioController controleUser;
    ExemplarController controleExemplar;
    
    public Home() {
        initComponents();
        controleUser = new UsuarioController();
        controleExemplar = new ExemplarController();
        controleUser.preencheTabela(tabelaClientes);
        controleExemplar.preencheTabelaExemplares(tabelaExemplar);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        PanelUsers = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnNovoEmprestimo = new javax.swing.JButton();
        btnDev = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        BtnNovoUser = new javax.swing.JButton();
        btnRemoveUser = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        pesquisaUsers = new javax.swing.JTextField();
        btnEditarUser = new javax.swing.JButton();
        opUserCli = new javax.swing.JRadioButton();
        opUserAdm = new javax.swing.JRadioButton();
        opUserTodos = new javax.swing.JRadioButton();
        btnVerUser = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaExemplar = new javax.swing.JTable();
        btnEditarExemplar = new javax.swing.JButton();
        btnRemoveExemplar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pesquisaExemplares = new javax.swing.JTextField();
        btnNovoExemplar = new javax.swing.JButton();
        opExemplarTodos = new javax.swing.JRadioButton();
        opExemplarLiv = new javax.swing.JRadioButton();
        opExemplarArt = new javax.swing.JRadioButton();
        btnVerExemplar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNovoEmprestimo.setText("Novo Empréstimo");
        btnNovoEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoEmprestimoActionPerformed(evt);
            }
        });

        btnDev.setText("Realizar Devolução");
        btnDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovoEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDev, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnNovoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDev, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        PanelUsers.addTab("Home", jPanel3);

        BtnNovoUser.setText("Cadastrar Novo");
        BtnNovoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovoUserActionPerformed(evt);
            }
        });

        btnRemoveUser.setText("Remover Selecionado");
        btnRemoveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveUserActionPerformed(evt);
            }
        });

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nome"
            }
        ));
        jScrollPane3.setViewportView(tabelaClientes);

        jLabel4.setText("Pesquisar:");

        pesquisaUsers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisaUsersKeyReleased(evt);
            }
        });

        btnEditarUser.setText("Editar Selecionado");
        btnEditarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUserActionPerformed(evt);
            }
        });

        buttonGroup1.add(opUserCli);
        opUserCli.setText("Clientes");
        opUserCli.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opUserCliStateChanged(evt);
            }
        });

        buttonGroup1.add(opUserAdm);
        opUserAdm.setText("Administradores");
        opUserAdm.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opUserAdmStateChanged(evt);
            }
        });

        buttonGroup1.add(opUserTodos);
        opUserTodos.setSelected(true);
        opUserTodos.setText("todos");
        opUserTodos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opUserTodosStateChanged(evt);
            }
        });
        opUserTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opUserTodosActionPerformed(evt);
            }
        });

        btnVerUser.setText("Ver Selecionado");
        btnVerUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(BtnNovoUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(btnEditarUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveUser))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(opUserTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opUserCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opUserAdm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisaUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(opUserCli)
                        .addComponent(opUserAdm)
                        .addComponent(opUserTodos))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pesquisaUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarUser)
                    .addComponent(btnRemoveUser)
                    .addComponent(BtnNovoUser)
                    .addComponent(btnVerUser))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        PanelUsers.addTab("Usuários", jPanel4);

        tabelaExemplar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nome"
            }
        ));
        jScrollPane4.setViewportView(tabelaExemplar);

        btnEditarExemplar.setText("Editar Selecionado");
        btnEditarExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarExemplarActionPerformed(evt);
            }
        });

        btnRemoveExemplar.setText("Remover Selecionado");
        btnRemoveExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveExemplarActionPerformed(evt);
            }
        });

        jLabel5.setText("Pesquisar:");

        pesquisaExemplares.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisaExemplaresKeyReleased(evt);
            }
        });

        btnNovoExemplar.setText("Cadastrar Novo");
        btnNovoExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoExemplarActionPerformed(evt);
            }
        });

        buttonGroup2.add(opExemplarTodos);
        opExemplarTodos.setSelected(true);
        opExemplarTodos.setText("Todos");
        opExemplarTodos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opExemplarTodosStateChanged(evt);
            }
        });

        buttonGroup2.add(opExemplarLiv);
        opExemplarLiv.setText("Livros");
        opExemplarLiv.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opExemplarLivStateChanged(evt);
            }
        });

        buttonGroup2.add(opExemplarArt);
        opExemplarArt.setText("Artigos");
        opExemplarArt.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                opExemplarArtStateChanged(evt);
            }
        });

        btnVerExemplar.setText("Ver Selecionado");
        btnVerExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerExemplarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(opExemplarTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opExemplarLiv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opExemplarArt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisaExemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNovoExemplar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarExemplar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerExemplar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoveExemplar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pesquisaExemplares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opExemplarTodos)
                    .addComponent(opExemplarLiv)
                    .addComponent(opExemplarArt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarExemplar)
                    .addComponent(btnRemoveExemplar)
                    .addComponent(btnNovoExemplar)
                    .addComponent(btnVerExemplar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        PanelUsers.addTab("Exemplares", jPanel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Bem - vindo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PanelUsers)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoEmprestimoActionPerformed
        JFrame n = new NovoEmprestimo(); 
        n.setVisible(true);
        n.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_btnNovoEmprestimoActionPerformed

    private void btnDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevActionPerformed
        JFrame n = new NovoEmprestimo(1); 
        n.setVisible(true);
        n.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_btnDevActionPerformed

    private void BtnNovoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovoUserActionPerformed
        JFrame n = new NovoUsuario(); 
        n.setVisible(true);
        n.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        n.addWindowListener(new WindowListener() {

            @Override
            public void windowClosing(WindowEvent e) {
                controleUser.preencheTabela(tabelaClientes);
            }

            @Override
            public void windowOpened(WindowEvent we) {
               
            }

            @Override
            public void windowClosed(WindowEvent we) {
                
            }

            @Override
            public void windowIconified(WindowEvent we) {
                
            }

            @Override
            public void windowDeiconified(WindowEvent we) {}

            @Override
            public void windowActivated(WindowEvent we) {}

            @Override
            public void windowDeactivated(WindowEvent we) {
                controleUser.preencheTabela(tabelaClientes);
            }
        });

    }//GEN-LAST:event_BtnNovoUserActionPerformed

    private void btnNovoExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoExemplarActionPerformed
        JFrame n = new NovoExemplar(); 
        n.setVisible(true);
        n.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
       n.addWindowListener(new WindowListener() {

            @Override
            public void windowClosing(WindowEvent e) {
                controleExemplar.preencheTabelaExemplares(tabelaExemplar);
            }

            @Override
            public void windowOpened(WindowEvent we) {
            }

            @Override
            public void windowClosed(WindowEvent we) {
                
            }

            @Override
            public void windowIconified(WindowEvent we) {
                
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
                
            }

            @Override
            public void windowActivated(WindowEvent we) {
                
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
                controleExemplar.preencheTabelaExemplares(tabelaExemplar);
            }
        });
        
    }//GEN-LAST:event_btnNovoExemplarActionPerformed

    private void btnEditarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUserActionPerformed
        try{
            int linha = tabelaClientes.getSelectedRow();
            int l = tabelaClientes.getSelectedRowCount();
            String cod = (String) tabelaClientes.getValueAt(linha, 0); //codigo
            if(l == 0){  throw new Exception("Nenhuma linha selecionada.");}
            if(l > 1){ throw new Exception("Mais de uma linha selecionada.");}
            System.out.printf("id: %s", cod);
            Usuario u = new Usuario();
            u = controleUser.buscarUsuario(cod);
            
            JFrame n = new NovoUsuario(cod); 
            n.setVisible(true);
            n.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            
             n.addWindowListener(new WindowListener() {

                @Override
                public void windowClosing(WindowEvent e) {
                    controleUser.preencheTabela(tabelaClientes);
                }

                @Override
                public void windowOpened(WindowEvent we) {
                   
                }

                @Override
                public void windowClosed(WindowEvent we) {
                }

                @Override
                public void windowIconified(WindowEvent we) {
                }

                @Override
                public void windowDeiconified(WindowEvent we) {
                }

                @Override
                public void windowActivated(WindowEvent we) {
                }

                @Override
                public void windowDeactivated(WindowEvent we) {
                   controleUser.preencheTabela(tabelaClientes);
                }
            });
        
        }catch(Exception err){
           JOptionPane.showMessageDialog(null,err.getMessage());
        }
    }//GEN-LAST:event_btnEditarUserActionPerformed

    private void btnEditarExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarExemplarActionPerformed
       
        try{
            String cod = (String) tabelaExemplar.getValueAt(tabelaExemplar.getSelectedRow(), 0);
            int l = tabelaExemplar.getSelectedRowCount();   
            if(l == 0){  throw new Exception("Nenhuma linha selecionada.");}
            if(l > 1){ throw new Exception("Mais de uma linha selecionada.");}
            
            Exemplar ex = new Exemplar();
            ex = controleExemplar.buscarExemplar(cod);
            
            JFrame n = new NovoExemplar(cod); 
            n.setVisible(true);
            n.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

            n.addWindowListener(new WindowListener() {

                @Override
                public void windowClosing(WindowEvent e) {
                    controleExemplar.preencheTabelaExemplares(tabelaExemplar);
                }

                @Override
                public void windowOpened(WindowEvent we) {
                }

                @Override
                public void windowClosed(WindowEvent we) {
                }

                @Override
                public void windowIconified(WindowEvent we) {
                }

                @Override
                public void windowDeiconified(WindowEvent we) {
                    
                }

                @Override
                public void windowActivated(WindowEvent we) {
                    
                }

                @Override
                public void windowDeactivated(WindowEvent we) {
                    controleExemplar.preencheTabelaExemplares(tabelaExemplar);
                }
            });
        }catch(Exception err){
            JOptionPane.showMessageDialog(null,err.getMessage());
        }
    }//GEN-LAST:event_btnEditarExemplarActionPerformed

    private void btnRemoveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveUserActionPerformed
        try{
            int linha = tabelaClientes.getSelectedRow();
            int l = tabelaClientes.getSelectedRowCount();
            String cod = (String) tabelaClientes.getValueAt(linha, 0); //codigo
            if(l == 0){  throw new Exception("Nenhuma linha selecionada.");}
            if(l > 1){ throw new Exception("Mais de uma linha selecionada.");}
            System.out.printf("id: %s", cod);
            controleUser.removeUsuario(cod);
            controleUser.preencheTabela(tabelaClientes);
        }catch(Exception err){
            JOptionPane.showMessageDialog(null,err.getMessage());
        }
        
    }//GEN-LAST:event_btnRemoveUserActionPerformed

    private void btnRemoveExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveExemplarActionPerformed
              
            try{
                
                int l = tabelaExemplar.getSelectedRowCount();
                String cod = (String) tabelaExemplar.getValueAt(tabelaExemplar.getSelectedRow(), 0);
                
                if(l == 0){  throw new Exception("Nenhuma linha selecionada.");}
                if(l > 1){ throw new Exception("Mais de uma linha selecionada.");}
                controleExemplar.removeExemplar(cod);

            }catch(Exception err){
                JOptionPane.showMessageDialog(null,err.getMessage());
            }
    }//GEN-LAST:event_btnRemoveExemplarActionPerformed

    private void opUserTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opUserTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opUserTodosActionPerformed

    private void opUserTodosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opUserTodosStateChanged
        if(opUserTodos.isSelected()){
            controleUser.filter(tabelaClientes, "");
        }
    }//GEN-LAST:event_opUserTodosStateChanged

    private void opUserCliStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opUserCliStateChanged
        if(opUserCli.isSelected()){
            controleUser.filter(tabelaClientes, "Cliente");
        }
    }//GEN-LAST:event_opUserCliStateChanged

    private void opUserAdmStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opUserAdmStateChanged
        if(opUserAdm.isSelected()){
            controleUser.filter(tabelaClientes, "Administrador");
        }
    }//GEN-LAST:event_opUserAdmStateChanged

    private void opExemplarTodosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opExemplarTodosStateChanged
        if(opExemplarTodos.isSelected()){
            controleExemplar.filter(tabelaExemplar, "");
        }
    }//GEN-LAST:event_opExemplarTodosStateChanged

    private void opExemplarLivStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opExemplarLivStateChanged
        if(opExemplarLiv.isSelected()){
            controleExemplar.filter(tabelaExemplar, "Livro");
        }
    }//GEN-LAST:event_opExemplarLivStateChanged

    private void opExemplarArtStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_opExemplarArtStateChanged
        if(opExemplarArt.isSelected()){
            controleExemplar.filter(tabelaExemplar, "Artigo"); 
        }
    }//GEN-LAST:event_opExemplarArtStateChanged

    private void pesquisaUsersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaUsersKeyReleased
        controleUser.filter(tabelaClientes, pesquisaUsers.getText());
    }//GEN-LAST:event_pesquisaUsersKeyReleased

    private void pesquisaExemplaresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisaExemplaresKeyReleased
        controleExemplar.filter(tabelaExemplar, pesquisaExemplares.getText());
    }//GEN-LAST:event_pesquisaExemplaresKeyReleased

    private void btnVerUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerUserActionPerformed
            
            try{
                String cod = (String) tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 0);
                int l = tabelaClientes.getSelectedRowCount();
                System.err.println("l: "+l);
                if(l == 0){  throw new Exception("Nenhuma linha selecionada.");}
                if(l > 1){ throw new Exception("Mais de uma linha selecionada.");}
                 
                JFrame n = new NovoUsuario(cod,1); 
                n.setVisible(true);
                n.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }catch(Exception err){
                JOptionPane.showMessageDialog(null,err.getMessage());
            }
    }//GEN-LAST:event_btnVerUserActionPerformed

    private void btnVerExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerExemplarActionPerformed
            
            try{
                String cod = (String) tabelaExemplar.getValueAt(tabelaExemplar.getSelectedRow(), 0);
                int l = tabelaExemplar.getSelectedRowCount();
                if(l == 0){  throw new Exception("Nenhuma linha selecionada.");}
                if(l > 1){ throw new Exception("Mais de uma linha selecionada.");}

                JFrame n = new NovoExemplar(cod,1); 
                n.setVisible(true);
                n.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            }catch(Exception err){
                JOptionPane.showMessageDialog(null,err.getMessage());
            }

    }//GEN-LAST:event_btnVerExemplarActionPerformed

    public void mousePressed(MouseEvent mouseEvent) {
        tabelaClientes =(JTable) mouseEvent.getSource();
        tabelaExemplar = (JTable) mouseEvent.getSource();
        Point point = mouseEvent.getPoint();
        int row = tabelaClientes.rowAtPoint(point);
        
        // Duplo cllique na tabela users/clientes
        if (mouseEvent.getClickCount() == 2 && tabelaClientes.getSelectedRowCount() != 0) {
            String cod = (String) tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 0);
            
            JFrame n = new NovoUsuario(cod,1); 
            n.setVisible(true);
            n.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        
        // Duplo clique na tabela  exemplar
        if (mouseEvent.getClickCount() == 2 && tabelaExemplar.getSelectedRowCount() != 0) {
            String cod = (String) tabelaExemplar.getValueAt(tabelaExemplar.getSelectedRow(), 0);
            
            JFrame m = new NovoExemplar(cod,1); 
            m.setVisible(true);
            m.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNovoUser;
    private javax.swing.JTabbedPane PanelUsers;
    private javax.swing.JButton btnDev;
    private javax.swing.JButton btnEditarExemplar;
    private javax.swing.JButton btnEditarUser;
    private javax.swing.JButton btnNovoEmprestimo;
    private javax.swing.JButton btnNovoExemplar;
    private javax.swing.JButton btnRemoveExemplar;
    private javax.swing.JButton btnRemoveUser;
    private javax.swing.JButton btnVerExemplar;
    private javax.swing.JButton btnVerUser;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JRadioButton opExemplarArt;
    private javax.swing.JRadioButton opExemplarLiv;
    private javax.swing.JRadioButton opExemplarTodos;
    private javax.swing.JRadioButton opUserAdm;
    private javax.swing.JRadioButton opUserCli;
    private javax.swing.JRadioButton opUserTodos;
    private javax.swing.JTextField pesquisaExemplares;
    private javax.swing.JTextField pesquisaUsers;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTable tabelaExemplar;
    // End of variables declaration//GEN-END:variables
}
