package admin;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.base.BasePage;

public class Tests extends BaseTest {

    @Test
    public void TrainingTests() {
        webApp.firstPageLoginAndElse().goToPage();
        webApp.firstPageLoginAndElse().clickButtonDownRight();
        webApp.firstPageLoginAndElse().writeTextInTheFieldName("Radoslav");
        webApp.firstPageLoginAndElse().emailType();
        webApp.firstPageLoginAndElse().typeInTheMessageField(":) DONE");
        webApp.firstPageLoginAndElse().typeResult("27");
        webApp.firstPageLoginAndElse().clickSubmitButton();
        webApp.firstPageLoginAndElse().loginF("thing", "1234");
        webApp.backOffice().goToSite();
        webApp.ultimateqa().clickDiscoverySession();
//        webApp.forms().goToForms();
        webApp.forms().type("Radoslav");
//        webApp.forms().clickReportAbuse();

    }

    @Test
    public void check() {
        driver.get("https://forms.clickup.com/2314027/p/f/26ktb-6387/56LKNUZ9BDYXSC73SY/unlock-your-automation-potentialwitha-free-framework-assessment");
        driver.switchTo().frame("c-1bbbpxln36qf");
        WebElement element = driver.findElement(By.id("cu-form-control-0"));
        element.click();
        driver.switchTo().defaultContent();
//        WebElement element = driver.findElement(By.id("cu-form-control-0"));
//        element.click();


    }




}
