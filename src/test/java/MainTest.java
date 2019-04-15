import Pages.LoginPage;
import Pages.MainPage;
import Pages.SignUpPage;
import WebDriverSetting.WebDriverSetting;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class MainTest {


WebDriver driver=WebDriverSetting.getInstance();

    @Ignore
    @Test
    public void  TestCreateNewAcc(){
        SignUpPage signUpPage =  new SignUpPage(driver);
        MainPage mainPage =  new MainPage(driver);
        driver.get("https://github.com");
        mainPage.singUpClick();
        signUpPage.SignUp("testLoginName","testUsErMail@.com","testPassword1");


 }

 @Test
 public void signInOnGitHub(){
     MainPage mainPage =  new MainPage(driver);
     LoginPage loginPage  =   new LoginPage(driver);
     driver.get("https://github.com");
     mainPage.singInClick();
     loginPage.logIn("testLoginName","testPassword1");
     driver.close();

    }


}
