/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila.view;


import fila.model.Fila;
import static java.lang.String.valueOf;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class UsingFila extends javax.swing.JFrame {
    Fila fila = new Fila(10);
   
    public UsingFila() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPassou = new javax.swing.JLabel();
        lblPrimeiro = new javax.swing.JLabel();
        lblProximo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSenhas = new javax.swing.JTable();
        btnDequeue = new javax.swing.JButton();
        lblFilaCheia = new javax.swing.JLabel();
        btnGerarSenha1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel da Fila");

        jLabel2.setText("Já passou:");

        jLabel3.setText("Primeiro:");

        jLabel4.setText("Próximo:");

        lblPassou.setBackground(new java.awt.Color(204, 204, 204));
        lblPassou.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPassou.setForeground(new java.awt.Color(102, 0, 0));
        lblPassou.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassou.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblPrimeiro.setBackground(new java.awt.Color(204, 204, 204));
        lblPrimeiro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPrimeiro.setForeground(new java.awt.Color(0, 51, 255));
        lblPrimeiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrimeiro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblProximo.setBackground(new java.awt.Color(204, 204, 204));
        lblProximo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProximo.setForeground(new java.awt.Color(0, 0, 0));
        lblProximo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProximo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblProximo.setMaximumSize(new java.awt.Dimension(64, 28));
        lblProximo.setMinimumSize(new java.awt.Dimension(64, 28));

        tblSenhas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblSenhas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nª", "Senhas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSenhas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblSenhas);
        if (tblSenhas.getColumnModel().getColumnCount() > 0) {
            tblSenhas.getColumnModel().getColumn(0).setResizable(false);
            tblSenhas.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        btnDequeue.setText("Dequeue");
        btnDequeue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDequeueActionPerformed(evt);
            }
        });

        lblFilaCheia.setForeground(new java.awt.Color(255, 51, 51));
        lblFilaCheia.setToolTipText("");
        lblFilaCheia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblFilaCheia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblFilaCheia.setName(""); // NOI18N

        btnGerarSenha1.setText("Gerar Senha");
        btnGerarSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarSenha1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel3)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblPassou, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblFilaCheia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDequeue, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGerarSenha1)))
                        .addGap(129, 129, 129)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPassou, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGerarSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDequeue, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(lblFilaCheia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDequeueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDequeueActionPerformed
        try{
            if(!fila.isEmpty()){
            fila.dequeue();
            lblPassou.setText(valueOf(fila.front()));
            }else{
                JOptionPane.showMessageDialog(null,"Lista fazia");
                
            }
        }catch(Exception ex){
            
        }    
    }//GEN-LAST:event_btnDequeueActionPerformed

    private void btnGerarSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarSenha1ActionPerformed
        try {
            if(!fila.isFull()){
                Random senha = new Random();
                int aleatorio = senha.nextInt(9999)+1000;
                fila.enqueue(aleatorio);
                
                lblPrimeiro.setText(valueOf(fila.front()));
                lblProximo.setText(valueOf(fila.getProx()));
            }else{
                lblFilaCheia.setText("Fila Cheia Aguarde até abrir vaga.");
                
            }
        } catch (Exception ex) {
            Logger.getLogger(UsingFila.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }//GEN-LAST:event_btnGerarSenha1ActionPerformed

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
            java.util.logging.Logger.getLogger(UsingFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsingFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsingFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsingFila.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsingFila().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDequeue;
    public javax.swing.JButton btnGerarSenha1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblFilaCheia;
    public javax.swing.JLabel lblPassou;
    public javax.swing.JLabel lblPrimeiro;
    public javax.swing.JLabel lblProximo;
    public javax.swing.JTable tblSenhas;
    // End of variables declaration//GEN-END:variables
   
}
