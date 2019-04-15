package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class MainPage {

    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    By userName = By.xpath("//*[@id='user[login]']");
    By searchField = By.xpath("//*[@name='q']");
    By userPassword = By.xpath("//*[@id='user[password]']");
    By userEmail = By.xpath("//*[@id='user[email]']");

    By signUpForGitHubButton = By.xpath("//*[contains(@class,'text-gray-dark')]//button");
    By signInButton = By.xpath(" //*[@class='HeaderMenu-link no-underline mr-3']");

    By signUpButton = By.xpath("//*[@role='banner']//following-sibling::a[2]");

    By allGithubButton = By.xpath(" //*[@class='js-jump-to-badge-search-text-global']");


    public void singUpForGitHub(String name, String email, String password) {

        driver.findElement(userName).sendKeys(name);
        driver.findElement(userEmail).sendKeys(email);
        driver.findElement(userPassword).sendKeys(password);
        driver.findElement(signUpForGitHubButton);

    }

    public void singInClick() {
        driver.findElement(signInButton).click();
    }

    public void singUpClick() {
        driver.findElement(signUpButton).click();
    }

    public void search(String text) {
        driver.findElement(By.name("q")).sendKeys(text);
        driver.findElement(allGithubButton).click();
    }


}
