/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;
import java.sql.ResultSet;
import modelo.ProfessorM;

/**
 *
 * @author Farezi
 */
public class ProfessorC {
    
    BancoDados base=new BancoDados();
    public ResultSet consulta;
    
    /**Metodo do controle do professor ou docente
     * , recebe os parametros necessarios para a database no servidor SQL e insere-os.
     * @param prof
     */
    public void InsereProf(ProfessorM prof){
        try{
            base.conexao();                                   
            String sql="insert into professor values('"+prof.getCodDocente()+"','"+prof.getPnome()+"',"
                    + "'"+prof.getSnome()+"','"+prof.getTitulacao()+"','"+prof.getFormacao()+"')";
            base.getStatement().execute(sql);
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "Professor Cadastrado");
            base.desconecta();
        }catch(Exception erro){
            erro.getMessage();
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "ERRO");
        } 
    }
    
    /**Metodo do controle do professor ou docente
     * , recebe o codigo de um docente e o remove da database.
     * @param cod
     */
    public void RemoveProf(int cod){
       
       try{
            base.conexao();
            String sql="delete from professor where cod = '"+cod+"'";
            base.getStatement().execute(sql);
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "Professor removido");
            base.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
            javax.swing.JOptionPane aviso = new javax.swing.JOptionPane();
            aviso.showMessageDialog(null, "Erro");
        } 
    }
    
    /**Metodo do controle do professor ou docente
     * , retorna todos os docentes registrados a database de professores.
     * @return
     */
    public ResultSet BuscaProf(){
        try{
            base.conexao();
            String sql="select * from professor";
            consulta=base.getStatement().executeQuery(sql);
            base.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }        
        return consulta;
    }
    
    /**Metodo do controle do professor ou docente
     * , retorna o docente registrado na database de professores com o codigo (cod) fornecido a funcao.
     * @param cod
     * @return
     */
    public ResultSet BuscaCodProf(int cod){
        try{
            base.conexao();
            String sql="select * from professor where cod = '"+cod+"'";
            consulta=base.getStatement().executeQuery(sql);
            base.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }        
        return consulta;
    }
  
    /**Metodo do controle do professor ou docente
     * , retorna o docente registrado na database de professores com o titulo (tit) fornecido a funcao.
     * @param tit
     * @return
     */
    public ResultSet BuscaTitProf(char tit){
        try{
            base.conexao();
            String sql="select * from professor where titulo = '"+tit+"'";
            consulta=base.getStatement().executeQuery(sql);
            base.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }        
        return consulta;
    }
    
    /**Metodo do controle do professor ou docente
     * , atualiza o titulo (tit) do docente fornecido via o codigo (cod).
     * @param cod
     * @param tit
     */
    public void Atualiza(int cod, char tit, String snome){
     try{
            base.conexao();
            String sql="update professor set titulo = '"+tit+"', snome = '"+snome+"' where cod = '"+cod+"'";
            base.getStatement().execute(sql);
            base.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        } 
    }
}