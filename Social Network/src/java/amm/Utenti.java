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
public class Utenti {
    
    private int id;
    private String nome;
    private String cognome;
    private String data;
    private String sesso;
    private String immprofilo;
    private String descrizione;
    private String password;
    private String email;
    
    public Utenti(){
        
        this.nome="";
        this.cognome="";
        this.immprofilo="";
        this.data="";
        this.descrizione="";
        this.password="";
        this.id=0;
        
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
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
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the immprofilo
     */
    public String getImmprofilo() {
        return immprofilo;
    }

    /**
     * @param immprofilo the immprofilo to set
     */
    public void setImmprofilo(String immprofilo) {
        this.immprofilo = immprofilo;
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the sesso
     */
    public String getSesso() {
        return sesso;
    }

    /**
     * @param sesso the sesso to set
     */
    public void setSesso(String sesso) {
        this.sesso = sesso;
    }
    
    
    
    
    
}
