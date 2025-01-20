package pages.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Factory;
import pages.base.BasePage;
import pages.base.WebApp;
import utils.WaitTool;

import java.time.Duration;

public class Forms extends BasePage {

    @FindBy (xpath = "//a[contains(@class, 'cu-form__report-abuse-link ng-tns-')]")
    private WebElement reportAbuse;

    @FindBy (id = "cu-form-control-0")
    private WebElement nameFieldLastPage;

    private static final String URLforms = "https://forms.clickup.com/2314027/p/f/26ktb-6387/56LKNUZ9BDYXSC73SY/unlock-your-automation-potentialwitha-free-framework-assessment";

    public Forms(WebDriver driver) {
        super(driver);
    }

    public void goToForms() {
        driver.get(URLforms);
    }

    public void clickReportAbuse() {
        WaitTool.waitForPageLoad(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class, 'cu-form__report-abuse-link ng-tns-')]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", reportAbuse);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class, 'cu-form__report-abuse-link ng-tns-')]")));
        WaitTool.waitForElement(driver, (By) reportAbuse, 10);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", reportAbuse);
//        clickElement(reportAbuse);
    }

    public void type(String text) {
////        WaitTool.waitForElementRefresh(driver, (By) nameFieldLastPage, 10);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://forms.clickup.com/2314027/p/f/26ktb-6387/56LKNUZ9BDYXSC73SY/unlock-your-automation-potentialwitha-free-framework-assessment"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nameFieldLastPage);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", nameFieldLastPage);
        writeText(nameFieldLastPage, text);

    }

}
