/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rf5974
 */
public class BancoDados {
    
     // Objeto de COnexÃ£o com BD
    public Connection conn;
    // Objeto de Consulta SQL
    public Statement stmt;
    // Objeto com dados SQL
    private ResultSet res;
    
    /**
     *Classe para banco de dados, cria uma conexao com o servidor PostgeSQL utilizando o driver JDBC.
     * Como referencia, localhost:"ip da database"/"nome da database" , "*nome de usuario*", "*senha*" .
     * O conn eh utilizado para verificar a conexao com o servidor apos o primeiro Try catch.
     * stmt retorna o sucesso ou falha da conexao.
     */
    public void conexao(){
       try
       {
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(
               "jdbc:postgresql://localhost:5432/ies","postgres", "123456"); //localhost:"ip da database"/"nome da database" , "*nome de usuario*", "*senha*"
        System.out.println("Conectado ao PostGreSQL.");        
        }catch(Exception e){
            System.out.println("Falha ao tentar a conexão");
            e.printStackTrace();
        }
       
       try{
           stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);      
       }catch(Exception e){
           System.out.println("Falha no Cursor de Execução");
           e.printStackTrace();
       }
    }
    
    /** Eh utilizado na conexao, para verificar se uma conexao foi realmente estabelecida.
     *
     * @return
     */
    public Connection getConnection(){
        return conn;
    }
    
    /** Usado para interagir com o Query Tool do PostgreSQL ou pgAdmin 4v,
     * retornando uma query ou comando para o console SQL.
     *
     * @return
     */
    public Statement getStatement(){
        return stmt;
    }
    
    /** Classe de controle que fecha a conexao com o servidor.
     *
     */
    public void desconecta(){
        if(conn != null){
            try{
                conn.close();
            }catch(SQLException erro){
                erro.printStackTrace();
            }
            
        }
    }
    
}
