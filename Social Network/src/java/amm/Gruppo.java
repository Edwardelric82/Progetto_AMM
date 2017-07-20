/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm;


import java.util.*;


/**
 *
 * @author pierl
 */
public class Gruppo {
    
    private String id;
    private String nome;
    private String immgr;
    private String PropUtente;
    private String descrizione;
    private List<Utenti> listautenti = new ArrayList<>();
    
    public Gruppo(){
        id ="";
        nome="";
        PropUtente="";
        descrizione="";
        
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

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
     * @return the PropUtente
     */
    public String getPropUtente() {
        return PropUtente;
    }

    /**
     * @param PropUtente the PropUtente to set
     */
    public void setPropUtente(String PropUtente) {
        this.PropUtente = PropUtente;
    }

    /**
     * @return the descrizione
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * @param descrizione the descrizione to set
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    /**
     * @return the listautenti
     */
    public List<Utenti> getListautenti() {
        return listautenti;
    }

    /**
     * @param listautenti the listautenti to set
     */
    public void setListautenti(List<Utenti> listautenti) {
        this.listautenti = listautenti;
    }

    /**
     * @return the immgr
     */
    public String getImmgr() {
        return immgr;
    }

    /**
     * @param immgr the immgr to set
     */
    public void setImmgr(String immgr) {
        this.immgr = immgr;
    }
    
    






    
}
