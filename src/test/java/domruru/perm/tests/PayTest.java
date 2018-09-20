package domruru.perm.tests;

import domruru.perm.pages.PayPage;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import javax.swing.tree.VariableHeightLayoutCache;
import java.util.concurrent.TimeUnit;

public class PayTest extends BaseTest {


    @BeforeMethod
    public void setup() throws Exception {
        setupDriver().get("https://perm.domru.ru/payments");
    }

    @Test
    public void payCorrectTest(){
        payPage.inputPhone("9194411688");
        payPage.inputAmount("500");
        payPage.inputEmail("angelikan.2012@yandex.ru");
        payPage.clickSubmitButton();
        switchWindow();
        Assert.assertTrue(driver.findElement(By.cssSelector(".payments-frame__button")).isDisplayed());
    }

    @AfterMethod
    public void quitTest() throws Exception{
        super.tearDown();
    }

}
