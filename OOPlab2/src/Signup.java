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
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns={"/signup"})
public class Signup extends HttpServlet {
       

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        resp.setContentType("text/html");  
        var pw = resp.getWriter();
        var Uname = (String)req.getParameter("user");
        var pass = (String)req.getParameter("password");
        User u = new User();
        
        pw.printf("<!DOCTYPE HTML>\n");
        pw.printf("<HTML><head><meta charset=\"utf-8\"></head>");
        pw.printf("<body>");
        
        if( Uname == null  ){
            pw.printf("No username provided");
        } else if(pass == null){
            pw.printf("No password provided");
        }
        else{
            pw.printf("Give Username");
            u.name = Uname;
            pw.printf("<br>Give Password");
            u.password = pass;
            Main.A.add(u);
        }
        pw.printf("</body></html>");
        
    }
   
}
