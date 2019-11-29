/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Yago;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yagov
 */
public class Recuperacao extends javax.swing.JFrame {
    int qtm = trabalho.getQuantCurso();
    Recuperados[] recuperados = new Recuperados[qtm];
    double notaR;
    double media;
    int a=0,m=0;
    int pos,cfrm=6;
    int cf =5;
    int teste=0;
           
    

    /**
     * Creates new form Recuperacao
     */
    public Recuperacao() {
        initComponents();
        for(int i=0;i<qtm;i++){
        recuperados[i] = new Recuperados();
        recuperados[i].nome = Notas.materia[i].nome;
        Notas.materia[i].Contar();
        recuperados[i].PosRecuperados = Notas.materia[i].Recupera();
        recuperados[i].posMateria = i;
        recuperados[i].quantRec = Notas.materia[i].quantRecuperacao;
            System.out.println(recuperados[i].quantRec);
        recuperados[i].Nomes(i);
        }
        cf = JOptionPane.showConfirmDialog(null, "Continuar?","Confirmacao",JOptionPane.YES_OPTION);
        if(cf==0){
            if (recuperados[m].quantRec==0){
            for(int i=0;i<trabalho.quantCurso;i++){
                if(recuperados[i].quantRec==1){
                    teste++;
                }
            }
            if(teste==0){
                this.setVisible(false);
                try {
                    saida exit = new saida();
                    exit.setVisible(true);
                    
                } catch (IOException ex) {
                    Logger.getLogger(Recuperacao.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
 
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

        jPanelFundo = new javax.swing.JPanel();
        jLabelNota = new javax.swing.JLabel();
        jTextFieldNota = new javax.swing.JTextField();
        jButtonEnviar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recuperacao");
        setResizable(false);

        jPanelFundo.setBackground(new java.awt.Color(0, 51, 102));

        jLabelNota.setFont(new java.awt.Font("Louis George Café Light", 1, 18)); // NOI18N
        jLabelNota.setForeground(new java.awt.Color(250, 250, 250));
        jLabelNota.setText("Nota da Recuperacao:");

        jTextFieldNota.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jButtonEnviar.setFont(new java.awt.Font("Louis George Café Light", 1, 14)); // NOI18N
        jButtonEnviar.setText("Enviar");
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Louis George Café Light", 1, 14)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFundoLayout = new javax.swing.GroupLayout(jPanelFundo);
        jPanelFundo.setLayout(jPanelFundoLayout);
        jPanelFundoLayout.setHorizontalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFundoLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabelNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNota, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jButtonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNota)
                    .addComponent(jTextFieldNota, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEnviar)
                    .addComponent(jButtonLimpar))
                .addGap(21, 21, 21))
        );

        jLabelTitulo.setBackground(new java.awt.Color(0, 51, 102));
        jLabelTitulo.setFont(new java.awt.Font("Louis George Café Light", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 102));
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo Cefet - Copia.png"))); // NOI18N
        jLabelTitulo.setText("Recuperaçao");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        // TODO add your handling code here:


        System.out.println(recuperados[m].quantRec);
        if (recuperados[m].quantRec==0){
            while((recuperados[m].quantRec==0)&&(m!=trabalho.getQuantCurso())){
            a=0;
            m++;
            
            
            
        }
        }
        System.out.println(m);

        if(a==recuperados[m].quantRec-1){             
                pos = recuperados[m].PosRecuperados[a];
                notaR =Integer.parseInt(jTextFieldNota.getText());
                
                media = ((Notas.materia[m].notasA[pos] + Notas.materia[m].notasB[pos]/2) + notaR)/2;
                if(media>=5){
                    Notas.materia[m].status[pos] = "APROVADO";
                }
                else{
                    Notas.materia[m].status[pos] = "REPROVADO";
                }
                Notas.materia[m].notasR[pos] = notaR;
                System.out.println(Notas.materia[m].status[0]);
                System.out.println("aqui");
                a=0;
                m++;
        }        
            if(m==trabalho.getQuantCurso()){
            cfrm = JOptionPane.showConfirmDialog(null, "Dados Corretos?", "Notas Cadastradas",JOptionPane.YES_NO_OPTION);
            if(cfrm==0){
                this.setVisible(false);
                try {
                    saida exit = new saida();
                    exit.setVisible(true);
                    this.setVisible(false);
                } catch (IOException ex) {
                    Logger.getLogger(Recuperacao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "REINSIRA OS DADOS","DADOS INCORRETOS",JOptionPane.ERROR_MESSAGE);
                m=0;
                a=0;
                return;
            }
        }
        else{
                notaR = Integer.parseInt(jTextFieldNota.getText());
                pos = recuperados[m].PosRecuperados[a];
                media = ((Notas.materia[m].notasA[pos] + Notas.materia[m].notasB[pos]/2) + notaR)/2;
                if(media>=5){
                    Notas.materia[m].status[pos] = "APROVADO";
                }
                else{
                    Notas.materia[m].status[pos] = "REPROVADO";
                }
                System.out.println("la");
                System.out.println(Notas.materia[m].status[0]);
                a++;
                
            
            }
        
        
        

    }//GEN-LAST:event_jButtonEnviarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        
        jTextFieldNota.setText("");
        jTextFieldNota.requestFocus();
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

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
            java.util.logging.Logger.getLogger(Recuperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recuperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recuperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recuperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recuperacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabelNota;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JTextField jTextFieldNota;
    // End of variables declaration//GEN-END:variables
}
