package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelAndShoesPage {

    private WebDriver driver;
    public ApparelAndShoesPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//h2/a[text()='Blue Jeans']")
    private WebElement jeansBtn;

    @FindBy(css="input#addtocart_36_EnteredQuantity")
    private WebElement qtyOfjeans;

    @FindBy(css ="input#add-to-cart-button-36")
    private WebElement addToCartBtn;

    @FindBy(css="#bar-notification>p")
    private WebElement message;

    public void clickOnJeansBtn(){
        jeansBtn.click();
    }

    public void enterQtyOfJeans(int  number){
        qtyOfjeans.sendKeys(String.valueOf(number));
    }

    public void clickOnAddToCartBtn(){
        addToCartBtn.click();
    }

    public String getTheAddToCartMessage(){
        return message.getText();
    }

}


