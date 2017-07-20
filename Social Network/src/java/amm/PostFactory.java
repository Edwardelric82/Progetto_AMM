/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm;


import java.util.*;
import java.sql.*;
/**
 *
 * @author pierl
 */
public class PostFactory {
    
    private static PostFactory prova;

    public static PostFactory getInstance() {
        if (getProva() == null) {
            setProva(new PostFactory());
        }
        return getProva();
    }
    
    private String connectionString;
    
    public void setConnectionString(String s) {
        this.connectionString = s;
    }

    public String getConnectionString() {
        return this.connectionString;
    }
    
    
    private ArrayList<Post> listaPost = new ArrayList<>();

    private PostFactory() {
        
        UtentiFactory utentiFactory = UtentiFactory.getInstance();

        //Creazione Post
        Post post1 = new Post();
        post1.setPost("");
        post1.setId(0);
        post1.setUtente(utentiFactory.getUtenteById(0));

        Post post2 = new Post();
        post2.setPost("");
        post2.setId(1);
        post2.setUtente(utentiFactory.getUtenteById(0));
        

        Post post3 = new Post();
        post3.setPost("");
        post3.setId(2);
        post3.setUtente(utentiFactory.getUtenteById(0));

        listaPost.add(post1);
        listaPost.add(post2);
        listaPost.add(post3);
       
    }

    public Post getPostById(int id) {
        for (Post post : this.getListaPost()) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }
/*
    public List getPostList(Utenti utente) {

        List<Post> listaPost = new ArrayList<>();

        for (Post post : this.getListaPost()) {
            if (post.getUtenti().equals(utente)) {
                listaPost.add(post);
            }
        }
        return listaPost;
    }
    /*
    public List getPostList(Gruppo group) {

        List<Post> listaPost = new ArrayList<Post>();

        for (Post post : this.getListaPost()) {
            if (post.getGroup().equals(group)) {
                listaPost.add(post);
            }
        }
        return listaPost;
    }

    /**
     * @return the prova
     */
    public static PostFactory getProva() {
        return prova;
    }

    /**
     * @param aProva the prova to set
     */
    public static void setProva(PostFactory aProva) {
        prova = aProva;
    }

    /**
     * @return the listaPost
     */
    public ArrayList<Post> getListaPost() {
        return listaPost;
    }

    /**
     * @param listaPost the listaPost to set
     */
    public void setListaPost(ArrayList<Post> listaPost) {
        this.listaPost = listaPost;
    }
    
    
}
