/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jack & Mike
 */
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns={"/home"})
public class Home extends HttpServlet {
    
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        resp.setContentType("text/html");
        var pw = resp.getWriter();
        pw.printf("<!DOCTYPE HTML>\n");
        pw.printf("<HTML><head><meta charset=\"utf-8\"></head>");
        pw.printf("<body>");
        pw.printf("This is a Home Page");
        if( req.getSession().getAttribute("name") == null)
        {
            pw.printf("You are not logged in\nClick to Login: ");
            pw.printf("<a href=\"http://localhost:2020/srv/login\">Login</a>");
             pw.printf("\n\tor\t\nIf you dont have an account\n Click to Signup: ");
            pw.printf("<a href=\"http://localhost:2020/srv/signup\">Signup</a>");
        }
        else
        {
            pw.printf("You are logged in\n Click to Logout: ");
            pw.printf("<a href=\"http://localhost:2020/srv/logout\">\bLogout</a>");
        }
       
        
        pw.printf("</body></html>");
    
    }
}
