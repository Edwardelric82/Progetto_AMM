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
public class GruppoFactory {
    
    private static GruppoFactory prova;

    public static GruppoFactory getInstance() {
        if (prova == null) {
            prova = new GruppoFactory();
        }
        return prova;
    }
    
    private String connectionString;
    
    public void setConnectionString(String s) {
        this.connectionString = s;
    }

    public String getConnectionString() {
        return this.connectionString;
    }
    
    
    
    
    
    
    
    
    private ArrayList<Gruppo> listaGruppi= new ArrayList<>();
    
    private GruppoFactory(){
        Gruppo gruppo1=new Gruppo();
        gruppo1.setId("gr1");
        gruppo1.setNome("Gamers");
        gruppo1.setImmgr("");
        
        Gruppo gruppo2=new Gruppo();
        gruppo2.setId("gr2");
        gruppo2.setNome("Anime");
        gruppo2.setImmgr("");
        
        Gruppo gruppo3=new Gruppo();
        gruppo3.setId("gr3");
        gruppo3.setNome("Manga");
        gruppo3.setImmgr("");
    }
    
    
    
    public Gruppo getGruppoById(String id) {
        for (Gruppo gruppo : this.listaGruppi) {
            if (gruppo.getId() == id) {
                return gruppo;
            }
        }
        return null;
    }
    
}
