/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Farezi
 */
public class CursoM {
    private int codCurso;
    private String nome;
    private int numSemestre;
    private int CH;
    private char Turno;

    
    public CursoM(int codCurso, String nome, int numSemestre, int CH, char Turno) {
        if(codCurso==0){
            JOptionPane.showMessageDialog(null, "Preencher o codigo", "Aviso", 0);
        }
        if(nome==""){
            JOptionPane.showMessageDialog(null, "Preencher nome", "Aviso", 0);
        }
        if(numSemestre==0){
            JOptionPane.showMessageDialog(null, "Preencher o semestre", "Aviso", 0);
        }
        if(CH==0){
            JOptionPane.showMessageDialog(null, "Preencher a CH", "Aviso", 0);
        }
        if(Turno=='F'){
        JOptionPane.showMessageDialog(null, "Preencher Turno", "Aviso", 0);
    }
        
        this.codCurso = codCurso;
        this.nome = nome;
        this.numSemestre = numSemestre;
        this.CH = CH;
        this.Turno = Turno;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumSemestre() {
        return numSemestre;
    }

    public void setNumSemestre(int numSemestre) {
        this.numSemestre = numSemestre;
    }

    public int getCH() {
        return CH;
    }

    public void setCH(int CH) {
        this.CH = CH;
    }

    public char getTurno() {
        return Turno;
    }

    public void setTurno(char Turno) {
        this.Turno = Turno;
    }
}
