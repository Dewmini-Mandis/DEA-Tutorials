import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HeaderPrintServlet")
public class HeaderPrintServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        StringBuilder htmlTable = new StringBuilder();
        htmlTable.append("<table>");
        htmlTable.append("<tr><th>Header Name</th><th>Header Value</th></tr>");

        // Retrieve all request headers
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            htmlTable.append("<tr><td>").append(headerName).append("</td><td>").append(headerValue).append("</td></tr>");
        }

        htmlTable.append("</table>");

        response.setContentType("text/html");
        response.getWriter().write(htmlTable.toString());
    }
}
