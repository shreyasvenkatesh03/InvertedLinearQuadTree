package org.apache.jsp.res.JSP.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dev.dao.AdminDAO;
import com.dev.util.Utility;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE >\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" >\r\n");
      out.write("<head>\r\n");
      out.write("<title>Busy City</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"application/xhtml+xml; charset=utf-8\" />\r\n");
      out.write("<link href=\"bc-stylesheet.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("  <div id=\"header\">\r\n");
      out.write("    <div>\r\n");
      out.write("    <h1> <a href=\"#\"><font style=\"opacity:.0\"> Inverted Linear Quadtree: </font></a></h1>\r\n");
      out.write("      <ul>\r\n");
      out.write("       \r\n");
      out.write("          <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/CreateTerms?action=get\">Terms</a></li>\r\n");
      out.write("            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/UploadExcelData?action=get\">Upload Data</a></li>\r\n");
      out.write("            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/CreateDirection?action=get\">Direction</a></li>\r\n");
      out.write("        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/CreatePlace?action=get\">Places</a></li>\r\n");
      out.write("        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/CreateCenteroid?action=get\">Centeriod</a></li>\r\n");
      out.write("          <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/ConstructQuadTree\">ILQ Construct</a></li>\r\n");
      out.write("     <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/ChangePassword?submit=get\">ChangePassword</a></li>\r\n");
      out.write("        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp?no=2\">Sign Out</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("     <!--  Inverted Linear Quadtree: Efficient Top K Spatial Keyword Search -->\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"content\">\r\n");
      out.write("    <div id=\"right\">\r\n");
      out.write("     \r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"left\">\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("  <!-- It is not an imperitive that you leave a link to my site but I would be grateful if you did -->\r\n");
      out.write(" \r\n");
      out.write("</div>\r\n");

	int no=Utility.parse(request.getParameter("no"));
		if(no==1)
		{

      out.write("\r\n");
      out.write("\t\t\t<div class=\"info\" id=\"message\" style=\"position:absolute;top:300px;left:500px;Color:Blue;font-size:200%;\">\r\n");
      out.write("\t\t\t\t<p><b>Welcome to Admin page! ");
      out.print(AdminDAO.getAdminName((String)session.getAttribute("username")));
      out.write("</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t");
}
		if(no==11)
		{

      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\talert('QuadTree Process Successfull');\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t");
}

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
