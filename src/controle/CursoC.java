/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;
import java.sql.ResultSet;
import modelo.CursoM;

/**
 *
 * @author Farezi
 */
public class CursoC {
    BancoDados base=new BancoDados();
    public ResultSet consulta;
    
    /**Metodo do controle de cursos
     * , recebe os parametros necessarios para a database no servidor SQL e insere-os.
     * @param prof
     */
    public void InsereCurso(CursoM prof){
        try{
            base.conexao();                                   
            String sql="insert into curso values('"+prof.getCodCurso()+"','"+prof.getNome()+"',"
                    + "'"+prof.getNumSemestre()+"','"+prof.getCH()+"','"+prof.getTurno()+"')";
            base.getStatement().execute(sql);
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "Curso Cadastrado");
            base.desconecta();
        }catch(Exception erro){
            erro.getMessage();
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "ERRO");
        } 
    }
    
    /**Metodo do controle de cursos
     * , recebe o codigo de um curso e o remove da database.
     * @param cod
     */
    public void RemoveCurso(int cod){
       
       try{
            base.conexao();
            String sql="delete from curso where cod = '"+cod+"'";
            base.getStatement().execute(sql);
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "Curso removido");
            base.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "Erro");
        } 
    }
    
    /**Metodo do controle de cursos
     * , retorna todos os cursos registrados a database.
     * @return
     */
    public ResultSet BuscaCurso(){
        try{
            base.conexao();
            String sql="select * from curso";
            consulta=base.getStatement().executeQuery(sql);
            base.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }        
        return consulta;
    }
    
    /**Metodo do controle de cursos
     * , retorna o curso registrado na database com o codigo (cod) fornecido a funcao.
     * @param cod
     * @return
     */
    public ResultSet BuscaCodCurso(int cod){
        try{
            base.conexao();
            String sql="select * from curso where cod = '"+cod+"'";
            consulta=base.getStatement().executeQuery(sql);
            base.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }        
        return consulta;
    }
}
