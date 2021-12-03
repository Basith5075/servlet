import java.io.*;  
import jakarta.servlet.*;  
import jakarta.servlet.http.*;  
import java.sql.*;  
    
public class Display extends HttpServlet  
{    
     public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
      {  
         PrintWriter out = res.getWriter();  
         res.setContentType("text/html");  
         out.println("<html><body>");  
         try 
         {  
             Class.forName("com.mysql.cj.jdbc.Driver");  
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/example","root","Trimax@123");  
             Statement stmt = con.createStatement();  
             ResultSet rs = stmt.executeQuery("select * from menu");  
             out.println("<table border=1 width=50% height=50%>");  
             out.println("<tr><th>SNO</th><th>Dish</th><th>Price</th><tr>");  
             while (rs.next()) 
             {  
                 int n = rs.getInt("sno");  
                 String nm = rs.getString("dish");  
                 int s = rs.getInt("price");   
                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td></tr>");   
             }  
             out.println("</table>");  
             out.println("</html></body>");  
             con.close();  
            }  
             catch (Exception e) 
            {  
             out.println("error");  
         }  
     }  
 }  