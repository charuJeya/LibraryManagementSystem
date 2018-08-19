package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addBook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    align-content: center;\n");
      out.write("}\n");
      out.write("f{\n");
      out.write("    align-content: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text], select, textarea {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    resize: vertical;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("    padding: 12px 12px 12px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    float:contour;\n");
      out.write("}\n");
      out.write(".button {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 50%;\n");
      out.write("}\n");
      out.write("button[type=reset]{\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    float:contour; \n");
      out.write("}\n");
      out.write(".button {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("input[type=reset]:hover {\n");
      out.write("    background-color: #45a049;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    border-radius: 10px;\n");
      out.write("    background-color: #f2f2f2;\n");
      out.write("    padding: 20px;\n");
      out.write("    margin: auto;\n");
      out.write("    padding: 20px;\n");
      out.write("    width: 50%\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-25 {\n");
      out.write("    float: left;\n");
      out.write("    width: 25%;\n");
      out.write("    margin-top: 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-75 {\n");
      out.write("    float: left;\n");
      out.write("    width: 75%;\n");
      out.write("    margin-top: 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats after the columns */\n");
      out.write(".row:after {\n");
      out.write("    content: \"\";\n");
      out.write("    display: table;\n");
      out.write("    clear: both;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */\n");
      out.write("@media screen and (max-width: 600px) {\n");
      out.write("    .col-25, .col-75, input[type=submit] {\n");
      out.write("        width: 50%;\n");
      out.write("        margin-top: 0;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("      <div>\n");
      out.write("        <h style=\"font-size:40px;\"><center>ADD BOOK</center></h>\n");
      out.write("           </div>\n");
      out.write("       <div>\n");
      out.write("           \n");
      out.write("<div class=\"container\">\n");
      out.write("    <form action=\"bookController\" method=\"post\" class=\"f\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"BookId\">Book Id</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("          <input type=\"text\" id=\"BookId\" name=\"BookId\" placeholder=\"Book Id...\" maxlength=\"20\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\t<div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"Title\">Title</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("          <input type=\"text\" id=\"Title\" name=\"Title\" placeholder=\"Book Title...\" maxlength=\"45\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\t<div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"Author\">Author</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("          <input type=\"text\" id=\"Author\" name=\"Author\" placeholder=\"Book Author...\" maxlength=\"45\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"Main Classification\">Main Classification</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <select class=\"form-control\" name=\"mainClassificationId\" >\n");
      out.write("                            <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mainclassificationList}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"mainstatus\">\n");
      out.write("                                <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mainstatus}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mainstatus}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                            </c:forEach>\n");
      out.write("                        </select>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"SubClassification\">Sub Classification</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <select class=\"form-control\" name=\"subClassificationId\" >\n");
      out.write("                            <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subclassificationList}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"substatus\">\n");
      out.write("                                <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${substatus}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${substatus}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                            </c:forEach>\n");
      out.write("                        </select>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"Year Of Publishing\">Year Of Publishing</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"YearOfPublishing\" name=\"YearOfPublishing\" placeholder=\"Year Of Publishing...\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"Last Printed Year\">Last Printed Year</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"LastPrintedYear\" name=\"LastPrintedYear\" placeholder=\"Last Printed Year...\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"ISBN NO\">ISBN NO</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"ISBNNO\" name=\"ISBNNO\" placeholder=\"ISBN NO...\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("      <div class=\"col-25\">\n");
      out.write("        <label for=\"No Of Pages\">No Of Pages</label>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-75\">\n");
      out.write("        <input type=\"text\" id=\"NoOfPages\" name=\"NoOfPages\" placeholder=\"No Of Pages...\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"row\">\n");
      out.write("      <input type=\"SUBMIT\" value=\"SUBMIT\">\n");
      out.write("      <button type=\"reset\">RESET</button>\n");
      out.write("    </div>\n");
      out.write("          </form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write(" </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
