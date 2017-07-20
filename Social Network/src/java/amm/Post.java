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
public class Post {
    
    
    private String post;
    private String immagine;
    private String link;
    private int id;
    private Utenti utente;
    private int idUtenteBacheca;
    
    
    public enum PostType {
        POST_TESTO, POST_IMMAGINE,
    };

    

    public Post() {
        id = 0;
        utente = null;
        post = "";
        
        

    }

    /**
     * @return the post
     */
    public String getPost() {
        return post;
    }

    /**
     * @param post the post to set
     */
    public void setPost(String post) {
        this.post = post;
    }

    /**
     * @return the immagine
     */
    public String getImmagine() {
        return immagine;
    }

    /**
     * @param immagine the immagine to set
     */
    public void setImmagine(String immagine) {
        this.immagine = immagine;
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
     * @return the utente
     */
    public Utenti getUtente() {
        return utente;
    }

    /**
     * @param utente the utente to set
     */
    public void setUtente(Utenti utente) {
        this.utente = utente;
    }

    /**
     * @return the idUtenteBacheca
     */
    public int getIdUtenteBacheca() {
        return idUtenteBacheca;
    }

    /**
     * @param idUtenteBacheca the idUtenteBacheca to set
     */
    public void setIdUtenteBacheca(int idUtenteBacheca) {
        this.idUtenteBacheca = idUtenteBacheca;
    }

    /**
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link the link to set
     */
    public void setLink(String link) {
        this.link = link;
    }
    
    
    
}

