//for HTML
<form action="LoginServlet" method="post">
  Username: <input type="text" name="username"><br>
  Password: <input type="password" name="password"><br>
  <input type="submit" value="Login">
</form>

//For java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String user = request.getParameter("username");
    String pass = request.getParameter("password");

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    if ("admin".equals(user) && "1234".equals(pass)) {
      out.println("<h2>Welcome, " + user + "!</h2>");
    } else {
      out.println("<h2>Invalid login</h2>");
    }
  }
}
