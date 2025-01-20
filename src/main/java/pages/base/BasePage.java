package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void clickElement (WebElement element) {
        element.click();
    }

    public void writeText (WebElement element, String writeText) {
        element.sendKeys(writeText);
    }

}
