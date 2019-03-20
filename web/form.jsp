<%-- 
    Document   : form
    Created on : Nov 25, 2018, 9:46:12 AM
    Author     : sdeshapriya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>
            <h1>Beer Selection page</h1>
            <form method="POST" action="BeerSelection.do">
                <p>Select beer characteristics</p>
                <p><b>Color :</b></p>
                <select name="color" size="1">
                    <option>Red</option>
                    <option>Green</option>
                    <option>Yellow</option>
                    <option>Black</option>
                    <option>White</option>
                    <option>Pink</option>
                </select> 
                <center>
                    <input type="submit">
                </center>
            </form>
        </div>
    </body>
</html>