package Yago;

import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yagov
 */
public class trabalho extends javax.swing.JFrame {
        static String curso;
        static int quantCurso;
        static int quantAlunos;
        static int horas;
    /**
     * Creates new form trabalho
     */
    public trabalho() {
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
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelFundo = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        Curso = new javax.swing.JTextField();
        jLabelQtdDisciplinas = new javax.swing.JLabel();
        QuantCurso = new javax.swing.JTextField();
        jLabelQtdAlunos = new javax.swing.JLabel();
        Alunos = new javax.swing.JTextField();
        But = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Horas = new javax.swing.JTextField();

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caddastro de Curso");
        setResizable(false);

        jLabelTitulo.setBackground(new java.awt.Color(0, 51, 102));
        jLabelTitulo.setFont(new java.awt.Font("Louis George Café Light", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 51, 102));
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo Cefet - Copia.png"))); // NOI18N
        jLabelTitulo.setText("CADASTRO DE CURSO");

        jPanelFundo.setBackground(new java.awt.Color(0, 51, 102));

        jLabelNome.setFont(new java.awt.Font("Louis George Café Light", 1, 18)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome do Curso:");

        Curso.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                CursoInputMethodTextChanged(evt);
            }
        });

        jLabelQtdDisciplinas.setFont(new java.awt.Font("Louis George Café Light", 1, 18)); // NOI18N
        jLabelQtdDisciplinas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQtdDisciplinas.setText("Quantidade de Disciplinas:");

        QuantCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantCursoActionPerformed(evt);
            }
        });

        jLabelQtdAlunos.setFont(new java.awt.Font("Louis George Café Light", 1, 18)); // NOI18N
        jLabelQtdAlunos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQtdAlunos.setText("Quantidade de Alunos:");

        But.setFont(new java.awt.Font("Louis George Café Light", 1, 14)); // NOI18N
        But.setText("Enviar");
        But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Louis George Café Light", 1, 14)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setToolTipText("");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Louis George Café Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Carga Horaria:");

        javax.swing.GroupLayout jPanelFundoLayout = new javax.swing.GroupLayout(jPanelFundo);
        jPanelFundo.setLayout(jPanelFundoLayout);
        jPanelFundoLayout.setHorizontalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(But, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelQtdDisciplinas)
                    .addComponent(jLabelQtdAlunos)
                    .addComponent(jLabel1))
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFundoLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFundoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Curso, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                            .addComponent(QuantCurso)
                            .addComponent(Alunos)
                            .addComponent(Horas))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanelFundoLayout.setVerticalGroup(
            jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFundoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome))
                .addGap(18, 18, 18)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQtdDisciplinas)
                    .addComponent(QuantCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQtdAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Alunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Horas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(But)
                    .addComponent(jButtonLimpar))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButActionPerformed
        // TODO add your handling code here:
        curso = Curso.getText();
        quantCurso = Integer.parseInt(QuantCurso.getText());
        quantAlunos =Integer.parseInt(Alunos.getText());
        horas = Integer.parseInt(Horas.getText());
        Disciplinas disciplinas = new Disciplinas();
        disciplinas.setVisible(true);
        disciplinas.pack();
        disciplinas.setLocationRelativeTo(null);
        disciplinas.setDefaultCloseOperation(trabalho.EXIT_ON_CLOSE);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_ButActionPerformed

    
//    GETTERS AND SETTERS
    public static String getCurso() {
        return curso;
    }

    public static int getQuantCurso() {
        return quantCurso;
    }

    public static int getQuantAlunos() {
        return quantAlunos;
    }

    public void setAlunos(JTextField Alunos) {
        this.Alunos = Alunos;
    }

    public void setCurso(JTextField Curso) {
        this.Curso = Curso;
    }

    public void setQuantCurso(JTextField QuantCurso) {
        this.QuantCurso = QuantCurso;
    }

    public static int getHoras() {
        return horas;
    }

 
    private void CursoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_CursoInputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CursoInputMethodTextChanged

    private void QuantCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantCursoActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
//      LIMPA OS CAMPOS (NAO RECEBE VALOR NENHUM)
        
        Curso.setText("");
        QuantCurso.setText("");
        Alunos.setText("");
//        RETORNA O FOCO PARA O jTEXTFIELD INDICADO
        Curso.requestFocus();   
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
            java.util.logging.Logger.getLogger(trabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trabalho().setVisible(true);
                String curso;
                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alunos;
    private javax.swing.JButton But;
    private javax.swing.JTextField Curso;
    private javax.swing.JTextField Horas;
    private javax.swing.JTextField QuantCurso;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelQtdAlunos;
    private javax.swing.JLabel jLabelQtdDisciplinas;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
