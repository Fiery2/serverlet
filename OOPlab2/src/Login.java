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
        var Uname = req.getParameter("user");
        var pass = req.getParameter("password");/*
        User tmp = new User();
        tmp.name = Uname;
        tmp.password = pass;*/
        if( Uname == null  ){
            pw.printf("No username provided");
        } else if(pass == null){
            pw.printf("No password provided");
        }
        else{ 
            
            for(int i=0;i<Main.A.size();i++){
                if (Main.A.get(i).name.equals(Uname)){ 
                    if(Main.A.get(i).password.equals(pass)){       
                        var sess = req.getSession();
                        sess.setAttribute("name", Uname );
                        pw.printf("Logged in as "+Uname);
                    }
                    else{
                        pw.printf("Wrong password");
                    }
                
            }
            else{
                pw.printf("Wrong user and/or Password");
            }
            }
    }
    }
}
