<%-- 
    Document   : result
    Created on : Nov 24, 2018, 1:11:25 PM
    Author     : sdeshapriya
--%>

<%@page import="java.util.Iterator"%>
<%@page import="san.beer.model.BeerExpert"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Beer Selection</title>
    </head>
    <body>
        <h1>Beer Information</h1>
        <% 
            List<String> list = (List)request.getAttribute("brands");
            Iterator<String> iterator = list.iterator();
            while(iterator.hasNext())
                out.print("<br>try : "+iterator.next());
        %>
        
        <p>If you need more information contact <%=request.getAttribute("adminEmail")%></p>
                
    </body>
</html>
