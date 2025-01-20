package pages.admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.base.WebApp;

public class Ultimateqa extends BasePage {

    @FindBy (xpath = "//a[@class='et_pb_button et_pb_button_0 et_pb_bg_layout_light']")
    private WebElement session;

    public Ultimateqa(WebDriver driver) {
        super(driver);
    }

    public void clickDiscoverySession(){
        clickElement(session);
    }

}
