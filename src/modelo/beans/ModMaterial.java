/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.beans;
    
import java.sql.Date;
/**mport java.sql.Date;
 *
 * @author wamberto
 */
public class ModMaterial {

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nrficha
     */
    public int getNrficha() {
        return nrficha;
    }

    /**
     * @param nrficha the nrficha to set
     */
    public void setNrficha(int nrficha) {
        this.nrficha = nrficha;
    }

    /**
     * @return the nee
     */
    public int getNee() {
        return nee;
    }

    /**
     * @param nee the nee to set
     */
    public void setNee(int nee) {
        this.nee = nee;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the qtdgeral
     */
    public int getQtdgeral() {
        return qtdgeral;
    }

    /**
     * @param qtdgeral the qtdgeral to set
     */
    public void setQtdgeral(int qtdgeral) {
        this.qtdgeral = qtdgeral;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the valortotal
     */
    public double getValortotal() {
        return valortotal;
    }

    /**
     * @param valortotal the valortotal to set
     */
    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    /**
     * @return the contacont
     */
    public int getContacont() {
        return contacont;
    }

    /**
     * @param contacont the contacont to set
     */
    public void setContacont(int contacont) {
        this.contacont = contacont;
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
    private String nome;
    private int nrficha;
    private int nee;
    private int quantidade;
    private int qtdgeral;
    private double valor;
    private double valortotal;
    private int contacont;
    private Date cadDetentor;
}
