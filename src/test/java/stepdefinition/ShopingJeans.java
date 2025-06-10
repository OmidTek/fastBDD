package stepdefinition;

import base.InitDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ApparelAndShoesPage;
import pages.MainPage;

public class ShopingJeans {
    MainPage mainPage;
    ApparelAndShoesPage apparelAndShoesPage;

    @When("user clicks on the top menu Apparel & Shoes")
    public void user_clicks_on_the_top_menu_apparel_shoes() {
        mainPage=new MainPage(InitDriver.getDriver());
        apparelAndShoesPage=new ApparelAndShoesPage(InitDriver.getDriver());
        mainPage.ApparelShoesClick();
    }


    @When("user clicks on Blue Jeans")
    public void user_clicks_on_Blue_Jeans() {
        apparelAndShoesPage.clickOnJeansBtn();
    }
    @When("user enters quantity {int} in the quantity textbox")
    public void user_enters_quantity_in_the_quantity_textbox(Integer int1) {
        apparelAndShoesPage.enterQtyOfJeans(int1);
    }
    @When("user clicks on the Add to cart button")
    public void user_clicks_on_the_Add_to_cart_button() {
        apparelAndShoesPage.clickOnAddToCartBtn();
    }
    @Then("verify the {string} success message is displayed")
    public void verify_the_success_message_is_displayed(String string) {
      //  Assert.assertEquals("The product has been added to your", apparelAndShoesPage.getTheAddToCartMessage());
        Assert.assertTrue(apparelAndShoesPage.getTheAddToCartMessage().contains("The product has been added to your"));
    }
}
