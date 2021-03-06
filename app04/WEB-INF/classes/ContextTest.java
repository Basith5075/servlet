import jakarta.servlet.*;
import java.io.*;
import java.util.*;

public class ContextTest extends GenericServlet
{
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{
		
		ServletContext context = getServletConfig().getServletContext();

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String display = context.getServletContextName();
		String favFruit = context.getInitParameter("Favourite Fruit");
		String bestShow = context.getInitParameter("Best Show");
		String bestPlayer = context.getInitParameter("Best Player");
		String configParam1 = getServletConfig().getInitParameter("ContextServlet1");
		String configParam2 = getServletConfig().getInitParameter("ConfigServlet2");
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println("Getting Info from Context paramaters by using ServletContext servlet 1 object <hr></h2><br>");
		out.println("Servlet Display Name	: "+display+"<br>");
		out.println("Favourite Fruit		: "+favFruit+"<br>");
		out.println("Best Show				: "+bestShow+"<br>");
		out.println("Best Player			: "+bestPlayer+"<br><hr>");
		out.println("Config Param1			: "+configParam1+"<br> ||");
		out.println("Config Param2			: "+configParam2);
		out.println("</body></html>");		
	}	
}
