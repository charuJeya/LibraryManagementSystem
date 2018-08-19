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
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<title>Dropdowns 3: Prettying it up</title>\n");
      out.write("\t<style>\n");
      out.write("\t\t* {\n");
      out.write("\t\t\tmargin: 0;\n");
      out.write("\t\t\tpadding: 0;\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\tbody {\n");
      out.write("\t\t\tfont: 300 15px/1.5 \"Helvetica Neue\", helvetica, arial, sans-serif;\n");
      out.write("\t\t\tbackground: #333;\n");
      out.write("\t\t\tmargin: 15px;\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\tarticle {\n");
      out.write("\t\t\twidth: 800px;\n");
      out.write("\t\t\tmargin: 0 auto;\n");
      out.write("\t\t\tbackground: #000;\n");
      out.write("\t\t\tcolor: #fff;\n");
      out.write("\t\t\tborder-radius: 5px;\n");
      out.write("\t\t\tbox-shadow: 0 0 15px 2px #666;\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\tsection {\n");
      out.write("\t\t\tclear: left;\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\th1 {\n");
      out.write("\t\t\tfont-size: 45px;\n");
      out.write("\t\t\tfont-weight: 100;\n");
      out.write("\t\t\tletter-spacing: 10px;\n");
      out.write("\t\t\ttext-align: center;\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t\ta {\n");
      out.write("\t\t\tcolor: #06c;\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\t#main_nav ul {\n");
      out.write("\t\t\tbackground: white;\n");
      out.write("\t\t\tfloat: left;\n");
      out.write("\t\t\t-webkit-transition: .5s;\n");
      out.write("\t\t\ttransition: .5s;\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\t#main_nav li {\n");
      out.write("\t\t\tfloat: left;\n");
      out.write("\t\t\tposition: relative;\n");
      out.write("\t\t\twidth: 400px;\n");
      out.write("\t\t\tlist-style: none;\n");
      out.write("\t\t\t-webkit-transition: .5s;\n");
      out.write("\t\t\ttransition: .5s;\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\t#main_nav > ul > li > a, h1 {\n");
      out.write("\t\t\ttext-transform: uppercase;\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\t#main_nav a {\n");
      out.write("\t\t\tdisplay: block;\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t\tpadding: 5px 15px;\n");
      out.write("\t\t\tcolor: #000;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t#main_nav ul ul {\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\tleft: 0;\n");
      out.write("\t\t\ttop: 100%;\n");
      out.write("\t\t\tvisibility: hidden;\n");
      out.write("\t\t\topacity: 0;\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\t#main_nav ul ul ul {\n");
      out.write("\t\t\tleft: 100%;\n");
      out.write("\t\t\ttop: 0;\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\t#main_nav li:hover, #main_nav li:hover li {\n");
      out.write("\t\t\tbackground: #ddd;\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\t#main_nav li li:hover, #main_nav li li:hover li {\n");
      out.write("\t\t\tbackground: #bbb;\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\t#main_nav li li li:hover {\n");
      out.write("\t\t\tbackground: #999;\n");
      out.write("\t\t}\n");
      out.write("\t\n");
      out.write("\t\t#main_nav li:hover > ul {\n");
      out.write("\t\t\tvisibility: visible;\n");
      out.write("\t\t\topacity: 1;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("\t<!--[if lt IE 9]><script src=\"/r10/html5shiv.js\"></script><![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<article>\n");
      out.write("\t\t<h1>LIBRARY SYSTEM</h1>\n");
      out.write("\n");
      out.write("\t\t<nav id=\"main_nav\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"\">BOOKS</a>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"classificationController\">Add Book</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Search Book</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"\">Edit Book</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<a href=\"\">CLASSIFICATION</a>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"\">MainClassification</a>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"./addMain.jsp\">Add</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Edit</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"\">SubClassification</a>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"./addSub.jsp\">Add</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"\">Edit</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t</article>\n");
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
