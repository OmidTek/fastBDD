package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText="Log in")
    private WebElement loginBtn;

    @FindBy(xpath="//div[@class='header-links']//a[@class='account']")
    private WebElement myAccountLogin;

    @FindBy(xpath="//ul[@class='top-menu']//a[contains (text(),'Apparel & Shoes')]")
    private WebElement ApparelShoesBtn;


    public void loginPageBtnClick(){
        loginBtn.click();
    }

    public String getLogAccountName (){
        return myAccountLogin.getText();
    }

   public void ApparelShoesClick (){
       ApparelShoesBtn.click();
   }



}
