<%-- 
    Document   : index
    Created on : Feb 3, 2024, 7:59:48 PM
    Author     : dewmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="LoginServlet" method="post" >
            <table border="0">
                <tbody>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="uname"></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pwd"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" name="Submit"></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
