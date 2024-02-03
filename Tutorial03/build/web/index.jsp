<%-- 
    Document   : index
    Created on : Feb 3, 2024, 9:50:53 PM
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
        <form action="SignupServlet" method="post">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="uname"></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="em"></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pwd"></td>
                    </tr>
                    <tr>
                        <td>Confirm Password</td>
                        <td><input type="password" name="cpwd"></td>
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
