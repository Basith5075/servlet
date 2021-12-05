import jakarta.servlet.*;
import java.io.*;
import java.util.*;

public class ServletConfigDemo extends GenericServlet
{
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{
		
		ServletConfig config = getServletConfig();

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String logicalName = config.getServletName();
		String driver = config.getInitParameter("driver");
		String url = config.getInitParameter("URL");
		String userName = config.getInitParameter("UserName");
		String password = config.getInitParameter("Password");
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println("Getting Info from Init paramaters by using ServletConfig object <hr></h2><br>");
		out.println("Servlet Logical Name	: "+logicalName+"<br>");
		out.println("Driver Name			: "+driver+"<br>");
		out.println("URL					: "+url+"<br>");
		out.println("UserName				: "+userName+"<br>");
		out.println("Password				: "+password+"<br><hr>");
		out.println("</body></html>");		
	}	
}
