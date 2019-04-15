package WebDriverSetting;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverSetting {
    private static WebDriver instance;
    private WebDriver driver;

    private WebDriverSetting(){

    }

    public static WebDriver getInstance(){
        if(instance==null){
            instance = new ChromeDriver() {
            };
        }
        return instance;
    }


@After
    public void close(){
        driver.quit();
}



}
