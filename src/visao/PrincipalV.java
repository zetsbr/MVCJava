/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JInternalFrame;

/**
 *
 * @author Farezi
 */
public class PrincipalV extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalV
     */
    public PrincipalV() {
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

        desktopPane = new javax.swing.JDesktopPane();
        jMenuPrincipal = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuProfessor = new javax.swing.JMenuItem();
        jMenuCurso = new javax.swing.JMenuItem();
        jMenuDisciplina = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuCadastro.setMnemonic('f');
        jMenuCadastro.setText("Cadastro");

        jMenuProfessor.setText("Professor");
        jMenuProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaProfessor(evt);
            }
        });
        jMenuCadastro.add(jMenuProfessor);

        jMenuCurso.setText("Curso");
        jMenuCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaCurso(evt);
            }
        });
        jMenuCadastro.add(jMenuCurso);

        jMenuDisciplina.setText("Disciplina");
        jMenuDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaDisc(evt);
            }
        });
        jMenuCadastro.add(jMenuDisciplina);

        jMenuPrincipal.add(jMenuCadastro);

        setJMenuBar(jMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TelaProfessor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelaProfessor
        // TODO add your handling code here:
        JInternalFrame cadastroProf=new ProfV();
        cadastroProf.pack();
        desktopPane.add(cadastroProf);
        cadastroProf.setVisible(true);
    }//GEN-LAST:event_TelaProfessor

    private void TelaCurso(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelaCurso
        // TODO add your handling code here:
        JInternalFrame cadastroCurso=new CursoV();
        cadastroCurso.pack();
        desktopPane.add(cadastroCurso);
        cadastroCurso.setVisible(true);
    }//GEN-LAST:event_TelaCurso

    private void TelaDisc(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelaDisc
        // TODO add your handling code here:
        JInternalFrame cadastroDisc=new DiscV();
        cadastroDisc.pack();
        desktopPane.add(cadastroDisc);
        cadastroDisc.setVisible(true);
    }//GEN-LAST:event_TelaDisc

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
            java.util.logging.Logger.getLogger(PrincipalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuCurso;
    private javax.swing.JMenuItem jMenuDisciplina;
    private javax.swing.JMenuBar jMenuPrincipal;
    private javax.swing.JMenuItem jMenuProfessor;
    // End of variables declaration//GEN-END:variables

}
