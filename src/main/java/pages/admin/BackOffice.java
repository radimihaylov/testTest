package pages.admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.base.WebApp;
import utils.WaitTool;

public class BackOffice extends BasePage {

    @FindBy (css = "#backtoblog >a")
    WebElement goTo;

    public BackOffice(WebDriver driver) {
        super(driver);
    }

    public void goToSite() {
        WaitTool.waitForPageLoad(driver);
        clickElement(goTo);
    }





}
