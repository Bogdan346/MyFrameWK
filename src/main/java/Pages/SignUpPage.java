package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

    WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }


    By loginField = By.xpath("//*[@id='user_login']");
    By passwordField = By.xpath("//*[@id='user_password']");
    By emailField = By.xpath("//*[@id='user_email']");
    By createAccount = By.xpath("//*[@id='signup_button']");


    public void SignUp(String userName, String userEmail, String userPassword) {
        driver.findElement(loginField).sendKeys(userName);
        driver.findElement(emailField).sendKeys(userEmail);
        driver.findElement(passwordField).sendKeys(userPassword);
        driver.findElement(createAccount).click();
    }


}
