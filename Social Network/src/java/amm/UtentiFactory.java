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
public class UtentiFactory {
    
    
    private static UtentiFactory prova;

    public static UtentiFactory getInstance() {
        if (getProva() == null) {
            setProva(new UtentiFactory());
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
    
    private ArrayList<Utenti> listaUtenti= new ArrayList<>();
    
    private UtentiFactory(){
        
        
        
        Utenti utente1=new Utenti();
        utente1.setId(0);
        utente1.setNome("Genoveffa");
        utente1.setCognome("Patata");
        utente1.setEmail("genoveffa@gmail.com");
        utente1.setSesso("Femmina");
        utente1.setPassword("stratatta");
        utente1.setImmprofilo("");
        
        Utenti utente2=new Utenti();
        utente2.setId(1);   
        utente2.setNome("Marco");
        utente2.setCognome("Male");
        utente2.setEmail("m.male@gmail.com");
        utente2.setSesso("Maschio");
        utente2.setPassword("polvere");
        utente2.setImmprofilo("");
        
        Utenti utente3=new Utenti();
        utente3.setId(2);
        utente3.setNome("Edward");
        utente3.setCognome("Elric");
        utente3.setEmail("edwardelric@gmail.com");
        utente3.setSesso("Maschio");
        utente3.setPassword("filosofale");
        utente3.setImmprofilo("");
        
        
        
        listaUtenti.add(utente1);
        listaUtenti.add(utente2);
        listaUtenti.add(utente3);
    
    }
    public Utenti getUtenteById(int id) {
        for (Utenti utente : this.getListaUtenti()) {
            if (utente.getId() == id) {
                return utente;
            }
        }
        return null;
    }

    /**
     * @return the prova
     */
    public static UtentiFactory getProva() {
        return prova;
    }

    /**
     * @param aProva the prova to set
     */
    public static void setProva(UtentiFactory aProva) {
        prova = aProva;
    }

    /**
     * @return the listaUtenti
     */
    public ArrayList<Utenti> getListaUtenti() {
        return listaUtenti;
    }

    /**
     * @param listaUtenti the listaUtenti to set
     */
    public void setListaUtenti(ArrayList<Utenti> listaUtenti) {
        this.listaUtenti = listaUtenti;
    }
}
