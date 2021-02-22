/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.BancoDados;
import controle.DisciplinaC;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import modelo.DisciplinaM;

/**
 *
 * @author Farezi
 */
public class DiscV extends javax.swing.JInternalFrame {

    DefaultTableModel campos=new DefaultTableModel();
    BancoDados bd = new BancoDados();
    public ResultSet dados;
    /**
     * Creates new form DiscV
     */
    public DiscV() {
        initComponents();
        campos.addColumn("CodCurso");
        campos.addColumn("Nome");
        campos.addColumn("N. Semestres");
        campos.addColumn("Carga Horaria");
        jtbDisc.setModel(campos);
        jtbDisc.getColumnModel().getColumn(0).setPreferredWidth(30);
        jtbDisc.getColumnModel().getColumn(1).setPreferredWidth(70);
        jtbDisc.getColumnModel().getColumn(2).setPreferredWidth(70);
        jtbDisc.getColumnModel().getColumn(3).setPreferredWidth(50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabelCod = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelSem = new javax.swing.JLabel();
        jLabelCH = new javax.swing.JLabel();
        jtCodDisc = new javax.swing.JTextField();
        jtNomeDisc = new javax.swing.JTextField();
        jtSemDisc = new javax.swing.JTextField();
        jtCH = new javax.swing.JTextField();
        jbExcluir = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbBusca = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbDisc = new javax.swing.JTable();
        jbBuscaCod = new javax.swing.JButton();

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

        jLabelCod.setText("Codigo Disc");

        jLabelNome.setText("Nome Disc");

        jLabelSem.setText("Semestres Disc");

        jLabelCH.setText("Carga Horaria");

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Excluir(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpar(evt);
            }
        });

        jbBusca.setText("Busca Geral");
        jbBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Busca(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastro(evt);
            }
        });

        jtbDisc.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtbDisc);

        jbBuscaCod.setText("Busca via Codigo");
        jbBuscaCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscaCod(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbBusca)
                                .addGap(61, 61, 61)
                                .addComponent(jbBuscaCod))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCod)
                                    .addComponent(jLabelNome)
                                    .addComponent(jLabelSem)
                                    .addComponent(jLabelCH))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtCH, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(jtSemDisc)
                                    .addComponent(jtNomeDisc)
                                    .addComponent(jtCodDisc))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbExcluir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbLimpar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbSalvar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCod)
                    .addComponent(jtCodDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jtNomeDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSem)
                    .addComponent(jtSemDisc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCH)
                    .addComponent(jtCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBusca)
                    .addComponent(jbBuscaCod))
                .addGap(1, 1, 1)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Excluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excluir
        if(jtCodDisc.getText().trim().equals("")){
           System.out.println("Codigo nao especificado.");
       }
       else{
           DisciplinaC pc=new DisciplinaC();
           String sCod=jtCodDisc.getText();
           int cod=Integer.parseInt(sCod);
           pc.RemoveDisc(cod);
       }
    }//GEN-LAST:event_Excluir

    private void Cadastro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastro
        // TODO add your handling code here:
        String sCod=jtCodDisc.getText();
        String sCh=jtCH.getText();
        String sSem=jtSemDisc.getText();
        String sNome=jtNomeDisc.getText();
        int cod=Integer.parseInt(sCod);
        int ch=Integer.parseInt(sCh);
        int sem=Integer.parseInt(sSem);

        DisciplinaM dm=new DisciplinaM(cod, sNome, sem, ch);
        DisciplinaC dc=new DisciplinaC();
        dc.InsereDisc(dm);
    }//GEN-LAST:event_Cadastro

    private void Limpar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpar
        jtCodDisc.setText("");
        jtNomeDisc.setText("");
        jtCH.setText("");
        jtSemDisc.setText("");
    }//GEN-LAST:event_Limpar

    private void Busca(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busca
        DisciplinaC dc=new DisciplinaC();
        try{
                bd.conexao();
                dados=dc.BuscaDisc();
                int linha = 0;
        while(dados.next()){
                campos.setNumRows(linha+1);
                for (int coluna=1;coluna<=4;coluna++){
                        if(coluna==2){
                                jtbDisc.setValueAt(dados.getString(coluna),linha,coluna-1);
                        } else {
                                jtbDisc.setValueAt(dados.getInt(coluna),linha,coluna-1);

                        }
                }
                linha++;
        }
        bd.desconecta();
        }catch (Exception erro){
                erro.printStackTrace();
        }
    }//GEN-LAST:event_Busca

    private void BuscaCod(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaCod
        DisciplinaC dc=new DisciplinaC();
        String sCod=jtCodDisc.getText();
        int cod=Integer.parseInt(sCod);
        try{
                bd.conexao();
                dados=dc.BuscaCodDisc(cod);
                int linha = 0;
        while(dados.next()){
                campos.setNumRows(linha+1);
                for (int coluna=1;coluna<=4;coluna++){
                        if(coluna==2){
                                jtbDisc.setValueAt(dados.getString(coluna),linha,coluna-1);
                        } else {
                                jtbDisc.setValueAt(dados.getInt(coluna),linha,coluna-1);

                        }
                }
                linha++;
        }
        bd.desconecta();
        }catch (Exception erro){
                erro.printStackTrace();
        }
    }//GEN-LAST:event_BuscaCod


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCH;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSem;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbBusca;
    private javax.swing.JButton jbBuscaCod;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTextField jtCH;
    private javax.swing.JTextField jtCodDisc;
    private javax.swing.JTextField jtNomeDisc;
    private javax.swing.JTextField jtSemDisc;
    private javax.swing.JTable jtbDisc;
    // End of variables declaration//GEN-END:variables
}