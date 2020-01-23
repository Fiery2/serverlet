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
public class Signup {
    
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        resp.setContentType("text/html");  
        var pw = resp.getWriter();
        var name = req.getParameter("user");
        var pass = req.getParameter("password");
        pw.printf("<!DOCTYPE HTML>\n");
        pw.printf("<HTML><head><meta charset=\"utf-8\"></head>");
        pw.printf("<body>");
        ArrayList<String>A = new ArrayList<String>();
        pw.printf("Give Username");
        pw.printf("Give Password");
        
        pw.printf("</body></html>");
        
    }
   
}
