/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectscms;

import modeloConexao.ConexaoBD;
import modeloDao.DaoSetor;
import modelo.beans.ModMaterial;

/**
 *
 * @author wamberto
 */
public class FormMaterial extends javax.swing.JFrame {
    ModMaterial material = new ModMaterial();
    DaoSetor control = new DaoSetor();
    ConexaoBD conex = new ConexaoBD(); 
    
}
