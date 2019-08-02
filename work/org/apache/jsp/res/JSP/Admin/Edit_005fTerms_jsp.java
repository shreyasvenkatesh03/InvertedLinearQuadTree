package org.apache.jsp.res.JSP.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dev.dao.AdminDAO;
import com.dev.util.Utility;
import java.sql.ResultSet;

public final class Edit_005fTerms_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


	ResultSet rs = null;
	String code=null;
	int id=0;
	String p_name="",p_type="",p_lat="",p_lon="";

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
      out.write("\r\n");
      out.write("<!DOCTYPE >\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" >\r\n");
      out.write("<head>\r\n");
      out.write("<title>ILQ</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"application/xhtml+xml; charset=utf-8\" />\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/res/CSS/form1.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/res/CSS/message.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/res/CSS/easyui.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/res/CSS/icon.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/res/CSS/popup.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/res/JS/jquery-1.8.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/res/JS/jquery.easyui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/res/JS/map.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/res/JS/script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("src=\"http://maps.googleapis.com/maps/api/js?key=AIzaSyDY0kkJiTPVd2U7aTOAwhc9ySH6oHxOIYM&sensor=false\">\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t\r\n");
      out.write("#file\r\n");
      out.write("{\r\n");
      out.write("\t-webkit-border-radius: 3px;\r\n");
      out.write("\t-moz-border-radius: 3px;\r\n");
      out.write("\t-ms-border-radius: 3px;\r\n");
      out.write("\t-o-border-radius: 3px;\r\n");
      out.write("\tborder-radius: 3px;\r\n");
      out.write("\t-webkit-box-shadow: 0 1px 0 #fff, 0 -2px 5px rgba(0,0,0,0.08) inset;\r\n");
      out.write("\t-moz-box-shadow: 0 1px 0 #fff, 0 -2px 5px rgba(0,0,0,0.08) inset;\r\n");
      out.write("\t-ms-box-shadow: 0 1px 0 #fff, 0 -2px 5px rgba(0,0,0,0.08) inset;\r\n");
      out.write("\t-o-box-shadow: 0 1px 0 #fff, 0 -2px 5px rgba(0,0,0,0.08) inset;\r\n");
      out.write("\tbox-shadow: 0 1px 0 #fff, 0 -2px 5px rgba(0,0,0,0.08) inset;\r\n");
      out.write("\t-webkit-transition: all 0.5s ease;\r\n");
      out.write("\t-moz-transition: all 0.5s ease;\r\n");
      out.write("\t-ms-transition: all 0.5s ease;\r\n");
      out.write("\t-o-transition: all 0.5s ease;\r\n");
      out.write("\ttransition: all 0.5s ease;\r\n");
      out.write("\t\r\n");
      out.write("\tborder: 1px solid #c8c8c8;\r\n");
      out.write("\tcolor: #777;\r\n");
      out.write("\tfont: 13px Helvetica, Arial, sans-serif;\r\n");
      out.write("\tmargin: 0 0 10px;\r\n");
      out.write("\tpadding: 5px 1px 5px 1px;\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"bc-stylesheet.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"tablecss/tabcss/style.css\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"css/pagenationcss.css\" rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction confirm()\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar chks = document.getElementsByName(\"chk\");\r\n");
      out.write("\t\t\t//alert(\"Value : \" + chks.length)\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar hasChecked = false;\r\n");
      out.write("\t\t\tfor (var i = 0; i < chks.length; i++)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tif (chks[i].checked)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\thasChecked = true;\r\n");
      out.write("\t\t\t\t\tbreak;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif (hasChecked == false)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tjAlert(\"Please Select Atleast One Record To Delete.\",'Alert Dialog');\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(hasChecked == true)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tvar selected=\"\";\r\n");
      out.write("\t\t\t\tfor (var i = 0; i < chks.length; i++)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tif (chks[i].checked)\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\tselected += chks[i].value+\",\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t//Deleting The Last char\r\n");
      out.write("\t\t\t\tselected = selected.substring(0, selected.length - 1);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tjConfirm('Do You Want To Delete?\\nplaces(s) Having place Name   : '+selected, 'Confirmation Dialog', function(r) \r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t//jAlert('Confirmed: ' + r, 'Delete Confirmation');\r\n");
      out.write("\t\t\t\t\t\tif(r)\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t//Submmiting The form\r\n");
      out.write("\t\t\t\t\t\t\tdocument.myForm.submit();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\telse\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t//Unchecking The Checked Check Boxes\r\n");
      out.write("\t\t\t\t\t\t\tfor (var i = 0; i < chks.length; i++)\r\n");
      out.write("\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\tif (chks[i].checked)\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tchks[i].checked = false;\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	ResultSet rs=(ResultSet)Utility.parse2(request.getAttribute("rs"));
	if(rs != null)
	{
		if(rs.next())
		{
			id=rs.getInt(1);
			p_name = rs.getString(2);
			
			
	   		
		}
	}

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("  <div id=\"header\">\r\n");
      out.write("    <div>\r\n");
      out.write("     <h1> <a href=\"#\"><font style=\"opacity:.0\"> Inverted Linear Quadtree: </font></a></h1>\r\n");
      out.write("            <ul>\r\n");
      out.write("      \r\n");
      out.write("           <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/CreateTerms?action=get\">Terms</a></li>\r\n");
      out.write("             <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/UploadExcelData?action=get\">Upload Excel Data</a></li>\r\n");
      out.write("            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/CreateDirection?action=get\">Direction</a></li>\r\n");
      out.write("        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/CreatePlace?action=get\">Places</a></li>\r\n");
      out.write("        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/CreateCenteroid?action=get\">Centeriod</a></li>\r\n");
      out.write("\r\n");
      out.write("        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/ConstructQuadTree\">ILQ Construct</a></li>\r\n");
      out.write("     <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/ChangePassword?submit=get\">ChangePassword</a></li>\r\n");
      out.write("        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp?no=2\">Sign Out</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div id=\"content\">\r\n");
      out.write("    <div id=\"left\">\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <form name=\"frm\" action=\"");
      out.print(request.getContextPath());
      out.write("/CreateTerms\" method=\"get\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t<h1>Update Terms Details</h1>\r\n");
      out.write("\t<table style=\"width: 500px;text-align: center;\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr align=\"center\">\r\n");
      out.write("\t        <td>\r\n");
      out.write("\t        \t\tTerms Name<font color=\"red\" size=\"4\">*</font>\r\n");
      out.write("\t        </td>\r\n");
      out.write("\t        \r\n");
      out.write("\t        <td width=\"11px\">:</td>\r\n");
      out.write("\t        \r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"t_no\" value=");
      out.print(id );
      out.write(">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"termname\"  value=\"");
      out.print(p_name);
      out.write("\" class=\"easyui-validatebox\" required=\"required\" autofocus required  title=\"Please,Enter The Place.\"/>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td width=\"15px\"></td>\r\n");
      out.write("\t\t<tr>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr tr align=\"center\">\r\n");
      out.write("\t\t\t\t<td colspan=\"3\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" name=\"action\" value=\"Edit\" style=\"left: 201px;\"/>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t    <input type=\"hidden\" name=\"Edit\" value=\"YES\" />\r\n");
      out.write("\t\t\t\t\t     <input type=\"hidden\" name=\"p_no\" value=\"");
      out.print(id);
      out.write("\"></input>  \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("  \r\n");
      out.write("\t<div id=\"light\" class=\"white_content\" > \r\n");
      out.write("\t\t<a href = \"javascript:void(0)\" onclick = \"closelightbox()\" style=\"float:right\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/res/Images/close.gif\" alt=\"\" /></a>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t<div  id=\"googleMap\" style=\"width:710px;height:510px;\"></div>\r\n");
      out.write("\t\t\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"fade\" class=\"black_overlay\"></div>\r\n");
      out.write("\t \r\n");
      out.write("\t");
      out.write("  \r\n");
      out.write("\t</form>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("   \r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- <div id=\"footer\">\r\n");
      out.write("  It is not an imperitive that you leave a link to my site but I would be grateful if you did\r\n");
      out.write(" \r\n");
      out.write("</div>\r\n");
      out.write(" -->\r\n");

	if(Utility.parse(request.getParameter("no"))==1)
	{

      out.write("\r\n");
      out.write("\t\t<div class=\"info\" id=\"message\" style=\"position:absolute;top:421px;left:11px\">\t\r\n");
      out.write("\t\t\t<p>Place Details Updated Successfully......</p>\r\n");
      out.write("\t\t</div>\t\t\t\r\n");

	}
	
	if(Utility.parse(request.getParameter("no"))==2)
	{

      out.write("\r\n");
      out.write("\t\t<div class=\"error\" id=\"message\" style=\"position:absolute;top:421px;left:11px\">\t\r\n");
      out.write("\t\t\t<p>Opps,Something Went Wrong Try Again Latter!!!!!</p>\r\n");
      out.write("\t\t</div>\t\t\t\r\n");

	}
	if(Utility.parse(request.getParameter("no"))==3)
	{

      out.write("\r\n");
      out.write("\t\t<div class=\"error\" id=\"message\" style=\"position:absolute;top:421px;left:11px\">\t\r\n");
      out.write("\t\t\t<p>Sorry,This place is already exist!!!!!</p>\r\n");
      out.write("\t\t</div>\t\t\t\r\n");

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
