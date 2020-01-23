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
 
@WebServlet(urlPatterns={"/login"})
public class Login extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        resp.setContentType("text/plain");
        var pw = resp.getWriter();
        var name = req.getParameter("user");
        var pass = req.getParameter("password");
        if( name == null || Main.A.contains(name)){
            pw.printf("No/ Wrong username provided");
        } else if(pass == null|| Main.A.contains(pass)){
            pw.printf("No/Wrong password provided");
        }
        else {
            var sess = req.getSession();
            sess.setAttribute("name", name );
            pw.printf("Logged in as "+name);
        }
    }

}
