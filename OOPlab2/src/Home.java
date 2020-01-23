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
public class Home extends HttpServlet {
    
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        resp.setContentType("text/html");
        var pw = resp.getWriter();
        pw.printf("<!DOCTYPE HTML>\n");
        pw.printf("<HTML><head><meta charset=\"utf-8\"></head>");
        pw.printf("<body>");
        pw.printf("This is a Home Page");
        if( request.getSession().getAttribute("name") == null)
        {
             pw.printf("login");
        }
        else
        {
            pw.printf("logout link: http://localhost:2020/srv/logout");
        }
       
        
        pw.printf("</body></html>");
    
    }
}
