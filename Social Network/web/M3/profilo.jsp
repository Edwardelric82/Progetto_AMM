<%-- 
    Document   : profilo
    Created on : 20-lug-2017, 16.13.11
    Author     : pierl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>NerdBook</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="social,network,nerd,book,nerdbook,amici,socializzare,">
        <meta name="description" content="Nerdbook è il nuovo social network che permette agli utenti di stringere amicizie e di creare e gestire dei gruppi di nerd!">
        <meta name="author" content="Lorrai Pierluigi">
        
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <jsp:include page="barralaterale.jsp"/>
        
        
        <div class="profilo">
        <form action="pagina.php"  method="post">
            
            <label for="nome">Nome</label>
            
            <input type="nome" class="inlabel">
            <br>
            
            <label for="cognome">Cognome</label>
            
            <input type="cognome" class="inlabel"> 
            <br>
            
            <label for="profile_image">Immagine Profilo</label>
            
            <input type="url" class="inlabel"> 
            <br>
            
            <label for="descrizione">Frase di Presentazione</label>
            
            <textarea  class="inlabel" name="descrizione" >
            </textarea>
            <br>
            
            <label for="date">Data di Nascita</label>
            
            <input type="date" class="inlabel"> 
            <br>
            
            <label for="pswd">Password</label>
            
            <input type="password" class="inlabel"> 
            <br>
            
            <label for="pswd">Conferma Password</label>
            
            <input type="password" class="inlabel"> 
            <br>
            
            <input type="submit" value="Aggiorna" class="inlabel"/>
            
        
        </form>
        </div>    
        
                <jsp:include page="footer.jsp"/>

        
    </body>
</html>
