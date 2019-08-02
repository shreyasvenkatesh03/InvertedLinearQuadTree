package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dev.util.Utility;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html >\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title></title>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/normalize.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel='stylesheet prefetch' href='http://fonts.googleapis.com/css?family=Roboto+Slab'>\r\n");
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("      /* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */\r\n");
      out.write("      * {\r\n");
      out.write("  margin: 0;\r\n");
      out.write("  padding: 0;\r\n");
      out.write("  box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("html, body {\r\n");
      out.write("  height: 100%;\r\n");
      out.write("\r\n");
      out.write("  font-family: \"Roboto Slab\", serif;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".preload * {\r\n");
      out.write("  transition: none !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("label {\r\n");
      out.write("  display: block;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("  font-size: small;\r\n");
      out.write("  text-transform: uppercase;\r\n");
      out.write("  font-size: 0.7em;\r\n");
      out.write("  margin-bottom: 0.35em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=\"text\"], input[type=\"password\"] {\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  border: none;\r\n");
      out.write("  padding: 0.5em;\r\n");
      out.write("  border-radius: 2px;\r\n");
      out.write("  margin-bottom: 0.5em;\r\n");
      out.write("  color: #333;\r\n");
      out.write("}\r\n");
      out.write("input[type=\"text\"]:focus, input[type=\"password\"]:focus {\r\n");
      out.write("  outline: none;\r\n");
      out.write("  box-shadow: inset -1px -1px 3px rgba(0, 0, 0, 0.3);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("button {\r\n");
      out.write("  padding-left: 1.5em;\r\n");
      out.write("  padding-right: 1.5em;\r\n");
      out.write("  padding-bottom: 0.5em;\r\n");
      out.write("  padding-top: 0.5em;\r\n");
      out.write("  border: none;\r\n");
      out.write("  border-radius: 2px;\r\n");
      out.write("  background-color: #7E5AF1;\r\n");
      out.write("  text-shadow: 1px 1px 3px rgba(0, 0, 0, 0.25);\r\n");
      out.write("  color: white;\r\n");
      out.write("  box-shadow: 1px 1px 3px rgba(0, 0, 0, 0.45);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("small {\r\n");
      out.write("  font-size: 1em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login--login-submit {\r\n");
      out.write("  float: absolute;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login--container {\r\n");
      out.write("float: left\r\n");
      out.write("  width: 500px;\r\n");
      out.write("  background-color: #4d4dff;\r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  margin: 0 auto;\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".login--username-container, .login--password-container {\r\n");
      out.write("  float: left;\r\n");
      out.write("  background-color: #F15A5C;\r\n");
      out.write("  width: 40%;\r\n");
      out.write("  height: 100px;\r\n");
      out.write("  padding: 0.7em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login--username-container {\r\n");
      out.write("  transform-origin: 100% 0%;\r\n");
      out.write("  background-color: #F15A5C;\r\n");
      out.write("  backface-visibility: hidden;\r\n");
      out.write("}\r\n");
      out.write(".login--active .login--username-container {\r\n");
      out.write(" \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  bottom: 12px;\r\n");
      out.write("  left: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("        <script src=\"js/prefixfree.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("        function validateEmail(emailField)\r\n");
      out.write("        {\r\n");
      out.write("        var reg = /^([A-Za-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,4})$/;\r\n");
      out.write("\r\n");
      out.write("        if (reg.test(emailField.value) == false) \r\n");
      out.write("        {\r\n");
      out.write("            alert('Invalid Email Address');\r\n");
      out.write("            emailField.value = null;\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        return true;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
      out.write("         <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("function isNumber(evt) {\r\n");
      out.write("    evt = (evt) ? evt : window.event;\r\n");
      out.write("    var charCode = (evt.which) ? evt.which : evt.keyCode;\r\n");
      out.write("    if (charCode > 31 && (charCode < 48 || charCode > 57)) {\r\n");
      out.write("    \talert('Only Numbers should be filled out');\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write(" \r\n");
      out.write("    return true;\r\n");
      out.write("}\r\n");
      out.write("</script>   \r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    \tfunction ValidateAlpha(evt)\r\n");
      out.write("        {\r\n");
      out.write("    \t\t var keyCode = (evt.which) ? evt.which : evt.keyCode\r\n");
      out.write("    \t\t\t        if ((keyCode < 65 || keyCode > 90) && (keyCode < 97 || keyCode > 123) && keyCode != 32)\r\n");
      out.write("    \t\t\t        \t{\r\n");
      out.write("    \t\t\t        \t\r\n");
      out.write("    \t\t\t        \talert('Numbers not allowed');\r\n");
      out.write("    \t\t\t        \t return false;\r\n");
      out.write("    \t\t\t        \t}    \t\t\t        \t\r\n");
      out.write("    \t\t\t       \r\n");
      out.write("    \t\t\t            return true;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \t\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("function checkForm(msg)\r\n");
      out.write("{\r\n");
      out.write("    var pass = document.getElementById(\"password\").value;\r\n");
      out.write("   \r\n");
      out.write("    var repass = document.getElementById(\"repassword\").value;\r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    if(pass==repass)\r\n");
      out.write("\t{\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("else\r\n");
      out.write("\t{\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t alert(\"Passwords is not matching\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t    \t\r\n");
      out.write("\t   \t\r\n");
      out.write("\t}\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body background=\"back.png\">\r\n");
      out.write("  <div \tstyle=\"position: centre;  left: -10px;\"\t>\r\n");
      out.write("\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/header.png\" width=100%></img>  \r\n");
      out.write("</div>\r\n");
      out.write("  <div style=\"position:absolute;top:250px; left: 50%\">\r\n");
      out.write("<form  action=\"");
      out.print(request.getContextPath());
      out.write("/Registration\" method=\"post\" > \r\n");
      out.write("    <div class='preload login--container'>\r\n");
      out.write("  <div class='login--form'>\r\n");
      out.write("  \r\n");
      out.write("    <div class='login--username-container'>\r\n");
      out.write("   \r\n");
      out.write("      <label>User ID</label>\r\n");
      out.write("      <input autofocus placeholder='User ID'  name=\"userid\" type='text' required=\"required\">\r\n");
      out.write("    </div>\r\n");
      out.write("     <div class='login--username-container'>\r\n");
      out.write("   \r\n");
      out.write("      <label>User Name</label>\r\n");
      out.write("      <input autofocus placeholder='User Name'  name=\"username\" type='text' onKeyPress=\"return ValidateAlpha(event);\" required=\"required\">\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("    <div class='login--password-container'>\r\n");
      out.write("    \r\n");
      out.write("      <label>Password</label>\r\n");
      out.write("      <input placeholder='Password' name=\"password\" type='password' required=\"required\">\r\n");
      out.write("     \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class='login--password-container'>\r\n");
      out.write("    \r\n");
      out.write("      <label>Re type Password</label>\r\n");
      out.write("      <input placeholder='Re Type Password' name=\"repassword\" type='password' required=\"required\">\r\n");
      out.write("     \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("     <div class='login--username-container'>\r\n");
      out.write("   \r\n");
      out.write("      <label>Phone</label>\r\n");
      out.write("      <input autofocus placeholder='Phone'  name=\"phone\" type='text' onkeypress=\"return isNumber(event)\" required=\"required\">\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("     <div class='login--username-container'>\r\n");
      out.write("   \r\n");
      out.write("      <label>Email</label>\r\n");
      out.write("      <input autofocus placeholder='Email'  name=\"email\" type='text' onblur=\"validateEmail(this);\" required=\"required\">\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("     <div class='login--password-container'>\r\n");
      out.write("    \r\n");
      out.write("      <label>Address</label>\r\n");
      out.write("      <input placeholder='Address' name=\"address\" type='text' required=\"required\">\r\n");
      out.write("    \r\n");
      out.write("      <button onclick=\"return checkForm('Please fill mandatory feilds')\" >Signup</button>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("     <div class='login--username-container'>\r\n");
      out.write("   \r\n");
      out.write("      <label>City</label>\r\n");
      out.write("      <input autofocus placeholder='City'  name=\"city\" type='text' required=\"required\">\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div style=\"position:absolute;top:80px; left: -500px\">\r\n");
      out.write("<button><a href=\"index.jsp\" >Home</a></button>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("  \r\n");
      out.write("  <script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);}}(document, 'script', 'twitter-wjs');</script>\r\n");
      out.write("</footer>\r\n");
      out.write("    <script src='js/jquery.min.js'></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/index.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    ");

	int no=Utility.parse(request.getParameter("no"));
		
		if(no==1)
		{

      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\talert('User Registration Successfull');\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t");
}
		if(no==2)
		{

      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\talert('Confirm Password is not Matching');\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t");
}
		if(no==3)
		{

      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\talert('UserID already Exists');\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t");
}
		if(no==4)
		{

      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\talert('Ooops ...! Something went wrong...');\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t");
}
		

      out.write("\r\n");
      out.write("    \r\n");
      out.write("  </body>\r\n");
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
