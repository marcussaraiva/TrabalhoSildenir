/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Yago;

import javax.swing.JOptionPane;

/**
 *
 * @author yagov
 */

public class Notas extends javax.swing.JFrame {
    int m=0,a=0,cfrm=6,x=1;
    static int qt = trabalho.getQuantAlunos();
    static int qtm = trabalho.getQuantCurso();
    String[] aluno = Alunos.getAlunos();
    static String[] materias = Disciplinas.getMaterias();
    static Materias[] materia = new Materias[qtm];
    

        
   
    
    

    /**
     * Creates new form Notas
     */
    public Notas() {
        for(int i=0;i<qtm;i++){
        materia[i] = new Materias();
        materia[i].nome = materias[i];
                
        }
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

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelFundo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelNota1 = new javax.swing.JLabel();
        NotaA = new javax.swing.JTextField();
        jLabelNota2 = new javax.swing.JLabel();
        NotaB = new javax.swing.JTextField();
        jLabelFaltas = new javax.swing.JLabel();
        Falta = new javax.swing.JTextField();
        Confirm = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Notas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Louis George Café Light", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 102));
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo Cefet - Copia.png"))); // NOI18N
        jLabelTitulo.setText("Cadastro Notas e Frequencias");

        jPanelFundo.setBackground(new java.awt.Color(0, 51, 102));
        jPanelFundo.setPreferredSize(new java.awt.Dimension(430, 319));

        jLabel3.setFont(new java.awt.Font("Louis George Café Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Aluno: "+aluno[a]+"   Disciplina: "+materias[m]);

        jLabelNota1.setFont(new java.awt.Font("Louis George Café Light", 1, 18)); // NOI18N
        jLabelNota1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNota1.setText("Nota 1:");

        NotaA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NotaAFocusGained(evt);
            }
        });
        NotaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotaAActionPerformed(evt);
            }
        });

        jLabelNota2.setFont(new java.awt.Font("Louis George Café Light", 1, 18)); // NOI18N
        jLabelNota2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNota2.setText("Nota 2:");

        NotaB.setFont(new java.awt.Font("Louis George Café Light", 0, 12)); // NOI18N
        NotaB.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NotaBFocusGained(evt);
            }
        });

        jLabelFaltas.setFont(new java.awt.Font("Louis George Café Light", 1, 18)); // NOI18N
        jLabelFaltas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFaltas.setText("Faltas:");

        Falta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FaltaFocusGained(evt);
            }
        });
        Falta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FaltaActionPerformed(evt);
            }
        });

        Confirm.setFont(new java.awt.Font("Louis George Café Light", 1, 18)); // NOI18N
        Confirm.setForeground(new java.awt.Color(255, 255, 255));
        Confirm.setToolTipText("Nota do Aluno, Inserida");

        jButton1.setFont(new java.awt.Font("Louis George Café Light", 1, 14)); // NOI18N
        jButton1.setText("Enviar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Louis George Café Light", 1, 14)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLimparMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelFundoLayout = new javax.swing.GroupLayout(jPanelFundo);
        jPanelFundo.setLayout(jPanelFundoLayout);
        jPanelFundoLayout.setHorizontalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelFundoLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelFaltas)
                                .addComponent(jLabelNota2)
                                .addComponent(jLabelNota1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NotaB, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Falta, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NotaA, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFundoLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFundoLayout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonLimpar)))
                    .addGroup(jPanelFundoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFundoLayout.createSequentialGroup()
                        .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NotaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNota1))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNota2))
                    .addComponent(NotaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Falta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFaltas))
                .addGap(30, 30, 30)
                .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButtonLimpar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabelTitulo)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FaltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FaltaActionPerformed

    private void NotaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotaAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NotaAActionPerformed

    private void NotaAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NotaAFocusGained
        // TODO add your handling code here:

        NotaA.setText(null);
    }//GEN-LAST:event_NotaAFocusGained

    private void FaltaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FaltaFocusGained
        // TODO add your handling code here:
        Falta.setText(null);
    }//GEN-LAST:event_FaltaFocusGained

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:

        
        if(m==trabalho.getQuantCurso()){
            cfrm = JOptionPane.showConfirmDialog(null, "Dados Corretos?", "Notas Cadastradas",JOptionPane.YES_NO_OPTION);
            if(cfrm == 0){
                for(int i=0;i<materia.length;i++){
                    materia[i].Avaliar();
                    
                }
                Recuperacao recuperacao = new Recuperacao();
                recuperacao.setVisible(true);
                recuperacao.pack();
                recuperacao.setLocationRelativeTo(null);
                recuperacao.setDefaultCloseOperation(trabalho.EXIT_ON_CLOSE);
                this.setVisible(false);
            }
            else{
                m=0;
                a=0;
                Confirm.setText("REINSIRA OS DADOS");
                
                return;
                
            }
        }
        if(a==trabalho.getQuantAlunos()-1){
            materia[m].notasA[a] = Double.parseDouble(NotaA.getText());
            materia[m].notasB[a] = Double.parseDouble(NotaB.getText());
            materia[m].faltas[a] = Integer.parseInt(Falta.getText());
            Confirm.setText("Nota de "+materia[m].alunos[a]+ " Cadastrada");
            System.out.println(materia[m].notasA[a]);
            System.out.println(materia[m].alunosjLabelTitulo            a=0;
            m++;
            jLabel3.setText("Aluno: "+aluno[a]+"   Disciplina: "+materias[m]);
            return;
            
        }else{
        materia[m].notasA[a] = Double.parseDouble(NotaA.getText());
        materia[m].notasB[a] = Double.parseDouble(NotaB.getText());
        materia[m].faltas[a] = Integer.parseInt(Falta.getText()); 
        Confirm.setText("Nota de "+materia[m].alunos[a]+ " Cadastrada");
        
        System.out.println(materia[m].notasA[a]);
        System.out.println(materia[m].alunos[a]);
        
        a++;
        jLabel3.setText("Aluno: "+aluno[a]+"   Disciplina: "+materias[m]);
            
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void NotaBFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NotaBFocusGained
        // TODO add your handling code here:
        NotaB.setText(null);
    }//GEN-LAST:event_NotaBFocusGained

    private void jButtonLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLimparMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLimparMouseClicked

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
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notas().setVisible(true);
                

            }
            
        });
        
        

    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Confirm;
    private javax.swing.JTextField Falta;
    private javax.swing.JTextField NotaA;
    private javax.swing.JTextField NotaB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFaltas;
    private javax.swing.JLabel jLabelNota1;
    private javax.swing.JLabel jLabelNota2;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFundo;
    // End of variables declaration//GEN-END:variables
}
