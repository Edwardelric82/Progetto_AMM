<%-- 
    Document   : login
    Created on : 20-lug-2017, 16.10.09
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
        
        <form action="pagina.php" class="input" method="post">
            
            <label for="user" style="margin-left: 5px;" ><strong>Username</strong></label>
            <br>
            <input type="user" style="margin-left: 5px;margin-bottom: 5px;width: 170px;" >
            <br>
            
            
            <label for="pswd" style=" margin-left: 5px;" ><strong>Password</strong></label>
            <br>
            <input type="password" style="margin-left: 5px;width: 170px;" >
            <br>
            
            <input type="submit" style="margin-top: 10px; margin-left: 67px;" value="Login"/>
        </form>
        
           
        
                <jsp:include page="footer.jsp"/>

        
    </body>
</html>