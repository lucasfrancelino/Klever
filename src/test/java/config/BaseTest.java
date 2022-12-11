package config;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {

    private static WebDriver driver;
    String url = "https://klever.io/";
    String path = "C:\\Python39\\chromedriver.exe";

    @Before
    public void abrirBrowser(){
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(url);
    }
    public void fecharBrowser(){
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
