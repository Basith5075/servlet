import jakarta.servlet.*;
import java.io.*;

public class WelcomeServlet implements Servlet
{
	
	public void init(ServletConfig config) throws ServletException {}

	public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException{
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>");
		out.println("<font color='red'>");
		out.println("<b>");
		out.printf("The sum of %d and %d is %d ",a,b,(a+b));
		out.println("</b></font></h1></body></html>");
	}
	public ServletConfig getServletConfig()	{
		return null;	
	}
	public String getServletInfo(){
		return " ";
	}
	public void destroy(){
		
	}
}