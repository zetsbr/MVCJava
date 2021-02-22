/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.BancoDados;
import controle.CursoC;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import modelo.CursoM;

/**
 *
 * @author Farezi
 */
public class CursoV extends javax.swing.JInternalFrame {
    DefaultTableModel campos=new DefaultTableModel();
    BancoDados bd = new BancoDados();
    public ResultSet dados;
    /**
     * Creates new form CursoV
     */
    public CursoV() {
        initComponents();
        campos.addColumn("CodCurso");
        campos.addColumn("Nome");
        campos.addColumn("N. Semestres");
        campos.addColumn("Carga Horaria");
        campos.addColumn("Turno");
        jtbCurso.setModel(campos);
        jtbCurso.getColumnModel().getColumn(0).setPreferredWidth(70);
        jtbCurso.getColumnModel().getColumn(1).setPreferredWidth(50);
        jtbCurso.getColumnModel().getColumn(2).setPreferredWidth(70);
        jtbCurso.getColumnModel().getColumn(3).setPreferredWidth(65);
        jtbCurso.getColumnModel().getColumn(4).setPreferredWidth(30);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtCodCurso = new javax.swing.JTextField();
        jtNomeCurso = new javax.swing.JTextField();
        jtNumSem = new javax.swing.JTextField();
        jtCH = new javax.swing.JTextField();
        jcbTurno = new javax.swing.JComboBox<>();
        jbExcluir = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbBusca = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbCurso = new javax.swing.JTable();
        jbBuscaCod = new javax.swing.JButton();

        jLabel1.setText("Codigo Curso");

        jLabel2.setText("Nome do curso");

        jLabel3.setText("Numero de semestres");

        jLabel4.setText("Carga Horaria");

        jLabel5.setText("Turno");

        jcbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "V", "N", "I" }));

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

        jtbCurso.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtbCurso);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtCodCurso)
                            .addComponent(jtNomeCurso)
                            .addComponent(jtNumSem)
                            .addComponent(jtCH))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbBusca)
                                .addGap(55, 55, 55)
                                .addComponent(jbBuscaCod)
                                .addGap(58, 58, 58)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtCodCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNumSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBusca)
                    .addComponent(jbBuscaCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Excluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excluir
        if(jtCodCurso.getText().trim().equals("")){
           System.out.println("Codigo nao especificado.");
       }
       else{
           CursoC pc=new CursoC();
           String sCod=jtCodCurso.getText();
           int cod=Integer.parseInt(sCod);
           pc.RemoveCurso(cod);
       }
    }//GEN-LAST:event_Excluir

    private void Cadastro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastro
        String sCod=jtCodCurso.getText();
        String sPnome=jtNomeCurso.getText();
        String sSem=jtNumSem.getText();
        char turno=jcbTurno.getSelectedItem().toString().charAt(0);
        String sCH=jtCH.getText();
        int cod=Integer.parseInt(sCod);
        int ch=Integer.parseInt(sCH);
        int sem=Integer.parseInt(sSem);
        
        CursoM cm=new CursoM(cod, sPnome, sem, ch, turno);
        CursoC cc=new CursoC();
        cc.InsereCurso(cm);
    }//GEN-LAST:event_Cadastro

    private void BuscaCod(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscaCod
        CursoC cc=new CursoC();
        String sCod=jtCodCurso.getText();
        int cod=Integer.parseInt(sCod);
        try{
                bd.conexao();
                dados=cc.BuscaCodCurso(cod);
                int linha = 0;
        while(dados.next()){
                campos.setNumRows(linha+1);
                for (int coluna=1;coluna<=5;coluna++){
                        if(coluna==2 || coluna == 5){
                                jtbCurso.setValueAt(dados.getString(coluna),linha,coluna-1);
                        } else {
                                jtbCurso.setValueAt(dados.getInt(coluna),linha,coluna-1);

                        }
                }
                linha++;
        }
        bd.desconecta();
        }catch (Exception erro){
                erro.printStackTrace();
        }
    }//GEN-LAST:event_BuscaCod

    private void Busca(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Busca
        CursoC cc=new CursoC();
        try{
                bd.conexao();
                dados=cc.BuscaCurso();
                int linha = 0;
        while(dados.next()){
                campos.setNumRows(linha+1);
                for (int coluna=1;coluna<=5;coluna++){
                        if(coluna==2 || coluna == 5){
                                jtbCurso.setValueAt(dados.getString(coluna),linha,coluna-1);
                        } else {
                                jtbCurso.setValueAt(dados.getInt(coluna),linha,coluna-1);

                        }
                }
                linha++;
        }
        bd.desconecta();
        }catch (Exception erro){
                erro.printStackTrace();
        }
    }//GEN-LAST:event_Busca

    private void Limpar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpar
        jtCodCurso.setText("");
        jtNomeCurso.setText("");
        jtCH.setText("");
        jtNumSem.setText("");
    }//GEN-LAST:event_Limpar


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbBusca;
    private javax.swing.JButton jbBuscaCod;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbTurno;
    private javax.swing.JTextField jtCH;
    private javax.swing.JTextField jtCodCurso;
    private javax.swing.JTextField jtNomeCurso;
    private javax.swing.JTextField jtNumSem;
    private javax.swing.JTable jtbCurso;
    // End of variables declaration//GEN-END:variables
}