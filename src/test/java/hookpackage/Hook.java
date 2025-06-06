package hookpackage;

import base.InitDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

    private InitDriver initDriver;
    private String browserName= "chrome";

    @Before(order= 1)
    public void launchBrowser(String browserName){
        initDriver=new InitDriver();
        initDriver.selectBrowser(browserName);
    }
    @After(order =0)
    public void tearDown(){

        InitDriver.getDriver().quit();
    }
}
