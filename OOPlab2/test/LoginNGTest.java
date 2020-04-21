/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.CookieHandler;
import java.net.CookieManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.eclipse.jetty.util.log.AbstractLogger;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.StdErrLog;

/**
 *
 * @author mdibb
 */
public class LoginNGTest {
    
    public LoginNGTest() {
    }
static CookieManager cookieManager = new CookieManager();
@BeforeClass
public static void setupSession(){
    CookieHandler.setDefault(cookieManager);
}
   @BeforeClass
public static void startJetty() throws Exception {
    String[] args = new String[]{
        "jetty.home=../jetty",
        "STOP.PORT=2021", "STOP.KEY=AutomaticTofu"
    };
    var LG = new StdErrLog();
    LG.setLevel(AbstractLogger.LEVEL_OFF);
    Log.setLog(LG);
    org.eclipse.jetty.start.Main.main(args);
}
 @AfterClass
public static void stopJetty() throws Exception {
    String[] args = new String[]{ "jetty.home=../jetty",
        "STOP.PORT=2021", "STOP.KEY=AutomaticTofu",
        "--stop"
    };
    org.eclipse.jetty.start.Main.main(args);
}
    
    @BeforeMethod
    public void clearCookies() {
        cookieManager.getCookieStore().removeAll();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of doGet method, of class Login.
     */
    @Test
public void testLogin1() throws Exception{
    String txt0 = utility.fetch( "/srv/signup?user=bob&password=word" ) ;
    String txt = utility.fetch( "/srv/login?user=bob&password=word" ) ;
    assertTrue( txt.contains("Logged in as bob"));
    
}
@Test
public void testLogin2() throws Exception{
   String txt0 = utility.fetch( "/srv/signup?user=bob&password=word" ) ;
    String txt = utility.fetch( "/srv/login?user=bob&password=word" ) ;
    assertFalse( txt.contains("Logged out")); 
}
    
}
