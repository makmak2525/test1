package domruru.perm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayPage {

    public PayPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(id = "selectcontractform-phone")
    private WebElement loginPhone;

    @FindBy(id = "selectcontractform-amount")
    private WebElement selectAmount;

    @FindBy(id = "selectcontractform-contactemailmanual")
    private WebElement contactEmail;

    @FindBy(id = "selectcontractform-submitbutton")
    private WebElement SubmitButton;

    @FindBy(id = "buttonPayment")
    public WebElement PaymentButton;

//    @FindBy(id = "description")
//    private WebElement descriptionText;

    public void inputPhone(String phone){
        loginPhone.sendKeys(phone);
    }

    public void inputAmount(String amount) {
        selectAmount.sendKeys(amount);
    }

    public void inputEmail(String email){
        contactEmail.sendKeys(email);
    }

    public void clickSubmitButton(){
        SubmitButton.click();
    }
//
//    public static formPayment(){
//
//    }
//    public String getDesriptionText(){
//        String DescText = descriptionText.getText();
//        return DescText;
//    }
}
