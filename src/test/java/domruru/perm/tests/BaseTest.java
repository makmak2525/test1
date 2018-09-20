package domruru.perm.tests;

import domruru.perm.pages.PayPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;
    protected PayPage payPage;

    protected WebDriver setupDriver(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        payPage = new PayPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;
    }

    protected WebDriver switchWindow(){
        payPage = new PayPage((WebDriver) driver.switchTo().frame("js-iframe"));
        return driver;
    }

    protected void tearDown() throws Exception {
        if(driver != null) {
            driver.quit();
        }
    }
}
