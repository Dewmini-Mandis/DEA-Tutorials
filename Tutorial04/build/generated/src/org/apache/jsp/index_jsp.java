package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>User Registration</title>\n");
      out.write("    <style>\n");
      out.write("        table {\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            width: 50%;\n");
      out.write("            margin: auto;\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            padding: 8px;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h2>Request Headers</h2>\n");
      out.write("    <button onclick=\"fetchHeaders()\">Fetch Headers</button>\n");
      out.write("    <div id=\"headersTableDiv\"></div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function fetchHeaders() {\n");
      out.write("            var xhr = new XMLHttpRequest();\n");
      out.write("            xhr.open(\"GET\", \"HeaderPrintServlet\", true);\n");
      out.write("            xhr.onreadystatechange = function () {\n");
      out.write("                if (xhr.readyState == 4 && xhr.status == 200) {\n");
      out.write("                    document.getElementById(\"headersTableDiv\").innerHTML = xhr.responseText;\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("            xhr.send();\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("<!--        <h2>Image Upload</h2>\n");
      out.write("    <form action=\"ImageUploadServlet\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("        Select an image to upload:\n");
      out.write("        <input type=\"file\" name=\"file\" accept=\".jpeg\">\n");
      out.write("        <br>\n");
      out.write("        <button type=\"submit\">Upload Image</button>\n");
      out.write("    </form>-->\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
