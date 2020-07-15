/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.ControllerTesouraria;
import Model.bean.Celula;
import javax.swing.JOptionPane;

/**
 *
 * @author 4001109296
 */
public class TelaCadCelula extends javax.swing.JFrame {
    ControllerTesouraria ct= new ControllerTesouraria();
    Celula celula=new Celula();
    
    public TelaCadCelula() {
        initComponents();
    }

    public boolean ValidarCampos(){
    if(!txtcelula.getText().equals("")&& !txtlider.getText().equals("")){ //campos diferentes de vazio cadastra, retorna verdadeiro
      return true;   
    }
    else { // senao, nao cadastra e exibe a mensagem
    JOptionPane.showMessageDialog(this, "Preencher os campos obrigatórios!");
         txtcelula.requestFocus();
         return false;
     } 
     }
    
    public void cadastrar(){
       
        celula.setNome(txtcelula.getText());
        celula.setLider(txtlider.getText());
   
        ct.cadastrarCelula(celula);
        JOptionPane.showMessageDialog(null,"Dados cadatrados com sucesso");
        
        txtcelula.setText("");
        txtlider.setText("");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPfundo = new javax.swing.JPanel();
        jpCadastrarUsuario = new javax.swing.JPanel();
        jLdadoscelula = new javax.swing.JLabel();
        jLcelula = new javax.swing.JLabel();
        txtcelula = new javax.swing.JTextField();
        jLlider = new javax.swing.JLabel();
        txtlider = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btListar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLdadoscelula1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Células");
        setLocation(new java.awt.Point(350, 50));
        setResizable(false);

        jPfundo.setBackground(new java.awt.Color(85, 153, 151));
        jPfundo.setPreferredSize(new java.awt.Dimension(750, 342));

        jpCadastrarUsuario.setBackground(new java.awt.Color(204, 204, 204));
        jpCadastrarUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpCadastrarUsuario.setAlignmentX(10.0F);
        jpCadastrarUsuario.setMaximumSize(null);

        jLdadoscelula.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLdadoscelula.setText("Cadastro de Células");

        jLcelula.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLcelula.setText("NOME DA CÉLULA:");

        jLlider.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLlider.setText("LÍDER:");

        btCadastrar.setBackground(new java.awt.Color(204, 204, 204));
        btCadastrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar1.jpg"))); // NOI18N
        btCadastrar.setText("CADASTRAR");
        btCadastrar.setBorder(null);
        btCadastrar.setInheritsPopupMenu(true);
        btCadastrar.setOpaque(false);
        btCadastrar.setRequestFocusEnabled(false);
        btCadastrar.setRolloverEnabled(false);
        btCadastrar.setVerifyInputWhenFocusTarget(false);
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btListar.setBackground(new java.awt.Color(204, 204, 204));
        btListar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Listar1.jpg"))); // NOI18N
        btListar.setText("LISTAR");
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });

        btCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btCancelar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fechar_2.jpg"))); // NOI18N
        btCancelar.setText("CANCELAR");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        jLdadoscelula1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLdadoscelula1.setText("Dados da Célula");

        javax.swing.GroupLayout jpCadastrarUsuarioLayout = new javax.swing.GroupLayout(jpCadastrarUsuario);
        jpCadastrarUsuario.setLayout(jpCadastrarUsuarioLayout);
        jpCadastrarUsuarioLayout.setHorizontalGroup(
            jpCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastrarUsuarioLayout.createSequentialGroup()
                .addGroup(jpCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadastrarUsuarioLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar))
                    .addGroup(jpCadastrarUsuarioLayout.createSequentialGroup()
                        .addGroup(jpCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCadastrarUsuarioLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jpCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLcelula)
                                    .addGroup(jpCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtcelula, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLlider, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtlider, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jpCadastrarUsuarioLayout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(jLdadoscelula)))
                        .addGap(0, 130, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jpCadastrarUsuarioLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLdadoscelula1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpCadastrarUsuarioLayout.setVerticalGroup(
            jpCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadastrarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLdadoscelula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLdadoscelula1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLcelula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcelula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLlider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtlider, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jpCadastrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btListar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPfundoLayout = new javax.swing.GroupLayout(jPfundo);
        jPfundo.setLayout(jPfundoLayout);
        jPfundoLayout.setHorizontalGroup(
            jPfundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPfundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPfundoLayout.setVerticalGroup(
            jPfundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPfundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPfundo, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPfundo, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
     if(ValidarCampos()){
            cadastrar();
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
        TelaListarCelula tc= new TelaListarCelula();
        tc.setVisible(true);
    }//GEN-LAST:event_btListarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btCancelarActionPerformed
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btListar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLcelula;
    private javax.swing.JLabel jLdadoscelula;
    private javax.swing.JLabel jLdadoscelula1;
    private javax.swing.JLabel jLlider;
    private javax.swing.JPanel jPfundo;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpCadastrarUsuario;
    private javax.swing.JTextField txtcelula;
    private javax.swing.JTextField txtlider;
    // End of variables declaration//GEN-END:variables

    

 
   
}

