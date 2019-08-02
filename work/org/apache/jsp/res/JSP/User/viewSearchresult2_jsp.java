package org.apache.jsp.res.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dev.dao.AdminDAO;
import com.dev.util.Utility;
import com.dev.dao.AdminDAO;
import com.dev.util.Utility;
import java.sql.ResultSet;

public final class viewSearchresult2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE >\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" >\r\n");
      out.write("<head>\r\n");
      out.write("<title>ILQ</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"application/xhtml+xml; charset=utf-8\" />\r\n");
      out.write("<link href=\"bc-stylesheet.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"tablecss/tabcss/style.css\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"css/pagenationcss.css\" rel=\"stylesheet\">\r\n");
      out.write(" \r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/pagenation.js\"></script>\r\n");

	ResultSet rs=(ResultSet)Utility.parse2(request.getAttribute("rs"));

      out.write(" \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("  <div id=\"header\">\r\n");
      out.write("    <div>\r\n");
      out.write("    <h1> <a href=\"#\"><font style=\"opacity:.0\"> Inverted Linear Quadtree: </font></a></h1>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/UserHome\" class=\"on\">Home</a></li>\r\n");
      out.write("          \r\n");
      out.write("        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Search?action=get\">Search</a></li>\r\n");
      out.write("       \r\n");
      out.write("        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/ChangePasswordUser?submit=get\">ChangePassword</a></li>   \r\n");
      out.write("        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/index2.jsp?no=2\">Sign Out</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("   \r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"content\">\r\n");
      out.write("    <div id=\"left\">\r\n");
      out.write("    <form name=\"myForm\" action=\"");
      out.print(request.getContextPath());
      out.write("/CreatePlace\" >\t\r\n");
      out.write("\r\n");
      out.write("<h2>View Search Results</h2>\r\n");
      out.write("\r\n");
      out.write("<div style=\"position:relative;width:600px;height:375px;\">\r\n");
      out.write("\r\n");
      out.write("<div style=\"position: relative;top: -15px;left: 325px;\">\r\n");
      out.write("\t \r\n");
      out.write("\t\r\n");
      out.write("</div> \r\n");
      out.write("\r\n");
      out.write("<table id=\"keywords\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- <td colspan=\"6\" align=\"center\">\r\n");
      out.write("\t\t\t<font color=\"#000000\" style=\"font-style: bold\" size=\"5\">Available Files To Download</font>\r\n");
      out.write("\t\t\t</td> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t <thead>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>SlNo</th>\r\n");
      out.write("\t\t<th>Place</th>\r\n");
      out.write("\t\t<th>Keyword</th>\r\n");
      out.write("\t\t<th>Distance</th>\r\n");
      out.write("\t\t<th>Direction</th>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t <tbody>\r\n");
      out.write("\r\n");
 
	
    if(rs != null)
    {
    	int count=1;
	    while(rs.next())
		{
			

      out.write("\r\n");
      out.write("\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(count++);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<td>");
      out.print(rs.getString(6));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(AdminDAO.gettname(rs.getString(5)));
      out.write("</td>\r\n");
      out.write("\t\t        <td>");
      out.print(rs.getString(9));
      out.write("&nbsp;Kms</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(AdminDAO.getDirectionname(rs.getString(10)));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");

		}
    
}

      out.write("\r\n");
      out.write("</tbody>\r\n");
      out.write("  \t </table>\r\n");
      out.write("\r\n");
      out.write("<div id=\"pageNavPosition\" style=\"position:relative;top:10px;left:75px;cursor:hand; color: black\"></div>\r\n");
      out.write("<script type=\"text/javascript\"><!--\r\n");
      out.write("        var pager = new Pager('keywords',6); \r\n");
      out.write("        pager.init(); \r\n");
      out.write("        pager.showPageNav('pager', 'pageNavPosition'); \r\n");
      out.write("        pager.showPage(1);\r\n");
      out.write("    //--></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\t\r\n");

	int no=Utility.parse(request.getParameter("no"));
		
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\" id=\"pageNavPosition\" style=\"cursor:hand\"></div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("</form>\r\n");
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
