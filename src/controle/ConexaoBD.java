/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author wamberto
 */
public class ConexaoBD {
    public Statement scms;
    public ResultSet resp;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/SCMS";
    private String usuario = "postgres";
    private String senha = "wamber!@#";
    public Connection con;
    
public void conexao(){   
    try {
         System.setProperty("jdbc:Drivers", driver);
         con=DriverManager.getConnection(caminho, usuario, senha);
         JOptionPane.showMessageDialog(null,"Conexão efetuada com sucesso!");
     } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao se conectar com o banco de dados!\n"+ex.getMessage());
        }
}

public void desconecta (){
    try{
        con.close();
         JOptionPane.showMessageDialog(null,"BD desconectado com sucesso!\n");
     } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fechar banco de dados!\n"+ex.getMessage());
     }
}
    
}
