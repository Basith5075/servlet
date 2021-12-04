import jakarta.servlet.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.ResultSet;
import java.sql.Statement;

public class WelcomeServlet extends GenericServlet{
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>");
		out.println("Welcome to basith Website</h1>");
		out.println("</h1></body></html>");
	}
}