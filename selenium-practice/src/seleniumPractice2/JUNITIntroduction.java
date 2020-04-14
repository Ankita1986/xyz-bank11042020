package seleniumPractice2;

import org.junit.*;

public class JUNITIntroduction {
    @BeforeClass
    public static void connection(){
        System.out.println("Do DB connection");
    }
    @AfterClass
    public static void closeConnection(){
        System.out.println("Close connection");
    }
    @Before
    public void openBrowser() {
        System.out.println("Open Browser");
    }

    @Test
    public void verifyIShouldNavigateLoginPage() {
        System.out.println("Navigate to Login Page");
    }

    @Test
    public void doLogin() {
        System.out.println("Loigin to application");
    }

    @After
    public void closeBrowser() {
        System.out.println("Close Browser");
    }

}
