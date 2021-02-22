/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;
import java.sql.ResultSet;
import modelo.DisciplinaM;

/**
 *
 * @author Farezi
 */
public class DisciplinaC {
    BancoDados base=new BancoDados();
    public ResultSet consulta;
    
    /**Metodo do controle de disciplina
     * , recebe os parametros necessarios para a database no servidor SQL e insere-os.
     * @param disc
     */
    public void InsereDisc(DisciplinaM disc){
        try{
            base.conexao();                                   
            String sql="insert into disciplina values('"+disc.getCodDisciplina()+"','"+disc.getNomeDisciplina()+"',"
                    + "'"+disc.getSemestreDisciplina()+"','"+disc.getCargaHorariaDisciplina()+"')";
            base.getStatement().execute(sql);
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "Disciplina Cadastrada");
            base.desconecta();
        }catch(Exception erro){
            erro.getMessage();
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "ERRO");
        } 
    }
    
    /**Metodo do controle da disciplina
     * , recebe o codigo de uma disciplina e o remove da database.
     * @param cod
     */
    public void RemoveDisc(int cod){
       
       try{
            base.conexao();
            String sql="delete from disciplina where cod = '"+cod+"'";
            base.getStatement().execute(sql);
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "Disciplina removida");
            base.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "Erro");
        } 
    }
    
    /**Metodo do controle de disciplinas
     * , retorna todas as disciplinas registradas a database de disciplinas.
     * @return
     */
    public ResultSet BuscaDisc(){
        try{
            base.conexao();
            String sql="select * from disciplina";
            consulta=base.getStatement().executeQuery(sql);
            base.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }        
        return consulta;
    }
    
    /**Metodo do controle de disciplinas
     * , retorna a disciplina registrada na database de disciplinas com o codigo (cod) fornecido a funcao.
     * @param cod
     * @return
     */
    public ResultSet BuscaCodDisc(int cod){
        try{
            base.conexao();
            String sql="select * from disciplina where cod = '"+cod+"'";
            consulta=base.getStatement().executeQuery(sql);
            base.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }        
        return consulta;
    }
}
