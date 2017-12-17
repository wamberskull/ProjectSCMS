/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.beans;

import java.sql.Date;

/**
 *
 * @author wamberto
 */
public class ModSetor {

 
    private String nomeSetor;
    private String nomeResp;
    private String nomeGuerra;
    private String postoGrad;
    private Date cadDetentor; 
    private String pesquisa;
    /**
     * @return the nomeSetor
     */
    public String getNomeSetor() { 
        return nomeSetor;
    }

    /**
     * @param nomeSetor the nomeSetor to set
     */
    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    /**
     * @return the respSetor
     */
    public String getNomeResp() {
        return nomeResp;
    }

    /**
     * @param nomeResp the nomeResp to set
     */
    public void setNomeResp(String nomeResp) {
        this.nomeResp = nomeResp;
    }

    /**
     * @return the nomeGuerra
     */
    public String getNomeGuerra() {
        return nomeGuerra;
    }

    /**
     * @param nomeGuerra the nomeGuerra to set
     */
    public void setNomeGuerra(String nomeGuerra) {
        this.nomeGuerra = nomeGuerra;
    }

    /**
     * @return the cpf
     */
    public String getPostoGrad() {
        return postoGrad;
    }

    /**
     * @param postoGrad the postoGrad to set
     */
    public void setPostoGrad(String postoGrad) {
        this.postoGrad = postoGrad;
    }

    /**
     * @return the cadDetentor
     */
    public Date getCadDetentor() {
        return cadDetentor;
    }

    /**
     * @param cadDetentor the cadDetentor to set
     */
    public void setCadDetentor(Date cadDetentor) {
        this.cadDetentor = cadDetentor;
    }
       /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
}
