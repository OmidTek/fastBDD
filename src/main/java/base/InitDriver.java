package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;


public class InitDriver {


    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public void selectBrowser(String browser){

        ChromeOptions options;

        switch (browser){
            case ("chrome"):
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                break;
            case ("edge"):
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;
            case("firefox") :
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                break;
        }

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
    }

}
