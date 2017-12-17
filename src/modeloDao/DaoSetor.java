/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloConexao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.beans.ModSetor;


/**
 *
 * @author wamberto
 */
public class DaoSetor {
    ConexaoBD conex = new ConexaoBD();
    ModSetor setor = new ModSetor();
    
    public void Salvar(ModSetor setor){
        conex.conexao();
        try {
            PreparedStatement prep = conex.con.prepareStatement ("insert into tabsetor(nome_setor,nome_resp,posto_grad,nome_guerra) values(?,?,?,?)");
            prep.setString(1,setor.getNomeSetor());
            prep.setString(2,setor.getNomeResp());
            prep.setString(3,setor.getPostoGrad());
            prep.setString(4,setor.getNomeGuerra());
            prep.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados./n  Erro:" +ex);
 }
        
        //conex.desconecta();
    
}
    public ModSetor buscaSetor(ModSetor setor){
        conex.conexao();
        String sql = "select * from tabsetor where nome_setor like ?";
              try{
             PreparedStatement prep = conex.con.prepareStatement (sql);
             ResultSet resp;
             prep.setString(1,setor.getNomeSetor());
             resp = prep.executeQuery();
            
             setor.setNomeResp(conex.resp.getString("nome_resp"));
             setor.setPostoGrad(conex.resp.getString("posto_grad"));
             setor.setNomeGuerra(conex.resp.getString("nome_guerra"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro pesquisa setor./n  Erro:" +ex);
 }
        conex.desconecta();
        return setor;
    }
}
