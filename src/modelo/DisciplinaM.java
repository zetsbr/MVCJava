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
public class DisciplinaM {
    
    private int codDisciplina;
    private String nomeDisciplina;
    private int semestreDisciplina;
    private int cargaHorariaDisciplina;
    
    
    public DisciplinaM(int codDisciplina, String nomeDisciplina, int semestreDisciplina, int cargaHorariaDisciplina) {
        if(codDisciplina==0){ //janelas de erro se nao estiver preenchido
            JOptionPane.showMessageDialog(null, "Preencha o codigo!", "Aviso!", 0);
        }
        if(nomeDisciplina.equals("")){ //.equals para comparar strings
            JOptionPane.showMessageDialog(null, "Preencha o nome!", "Aviso!", 0);
        }
        if(semestreDisciplina==0){
            JOptionPane.showMessageDialog(null, "Preencher semestre", "Aviso", 0);
        }
        if(cargaHorariaDisciplina==0){
            JOptionPane.showMessageDialog(null, "Preencher Carga Horaria", "Aviso", 0);
        }
        
        this.codDisciplina = codDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.semestreDisciplina = semestreDisciplina;
        this.cargaHorariaDisciplina = cargaHorariaDisciplina;
    }

    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getSemestreDisciplina() {
        return semestreDisciplina;
    }

    public void setSemestreDisciplina(int semestreDisciplina) {
        this.semestreDisciplina = semestreDisciplina;
    }

    public int getCargaHorariaDisciplina() {
        return cargaHorariaDisciplina;
    }

    public void setCargaHorariaDisciplina(int cargaHorariaDisciplina) {
        this.cargaHorariaDisciplina = cargaHorariaDisciplina;
    }
   
}
