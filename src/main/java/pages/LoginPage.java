package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="#Email")
    private WebElement userNameBox;

    @FindBy (css=".password")
    private WebElement passwordBox;

    @FindBy(xpath="//*[@type='submit'][ @value='Log in']")
    private WebElement loginSubmitBtn;

    public void enterUserName(String userName){
        userNameBox.sendKeys(userName);
    }

    public void enterPassword(String password){
        passwordBox.sendKeys(password);
    }

    public void submitLogin(){
        loginSubmitBtn.click();
    }
}
