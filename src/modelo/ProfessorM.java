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
public class ProfessorM {
    private int codDocente;
    private String Pnome;
    private String Snome;
    private char Titulacao;
    private String formacao;

    public ProfessorM(int codDocente, String Pnome, String Snome, char Titulacao, String formacao) {
        if(codDocente==0){
            JOptionPane.showMessageDialog(null, "Preencher Codigo docente", "Aviso", 0);

        }
        if(Pnome==""){
            JOptionPane.showMessageDialog(null, "Preencher Primeiro Nome", "Aviso", 0);
        }
        if(Snome==""){
            JOptionPane.showMessageDialog(null, "Preencher ultimo nome", "Aviso", 0);
        }
        if(Titulacao=='F'){
            JOptionPane.showMessageDialog(null, "Preencher Titulo", "Aviso", 0);
        }
        if(formacao==""){
            JOptionPane.showMessageDialog(null, "Preencher formacao", "Aviso", 0);
        }
        
        this.codDocente = codDocente;
        this.Pnome = Pnome;
        this.Snome = Snome;
        this.Titulacao = Titulacao;
        this.formacao = formacao;
    }

    public int getCodDocente() {
        return codDocente;
    }

    public void setCodDocente(int codDocente) {
        this.codDocente = codDocente;
    }

    public String getPnome() {
        return Pnome;
    }

    public void setPnome(String Pnome) {
        this.Pnome = Pnome;
    }

    public String getSnome() {
        return Snome;
    }

    public void setSnome(String Snome) {
        this.Snome = Snome;
    }

    public char getTitulacao() {
        return Titulacao;
    }

    public void setTitulacao(char Titulacao) {
        this.Titulacao = Titulacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
            
    
}
