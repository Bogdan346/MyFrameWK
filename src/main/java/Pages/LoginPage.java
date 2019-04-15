package Pages;

import WebDriverSetting.WebDriverSetting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }


    By userName = By.xpath("//*[@id='login_field']");
    By userPassword  = By.xpath("//*[@id='password']");
    By signInButton = By.xpath("//*[@value='Sign in']");


    public void logIn(String login , String password){
 driver.findElement(userName).sendKeys(login);
 driver.findElement(userPassword).sendKeys(password);
 driver.findElement(signInButton).click();
    }


}
