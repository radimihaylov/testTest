package pages.admin;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;
import pages.base.WebApp;
import utils.WaitTool;

import java.time.Duration;

public class FirstPageLoginAndElse extends BasePage {

    @FindBy (xpath = "//a[@class='et_pb_button et_pb_button_11 et_pb_bg_layout_light']")
    private WebElement buttonDownRight;

    @FindBy (id = "et_pb_contact_name_0")
    private WebElement nameField;

    @FindBy (id = "et_pb_contact_email_0")
    private WebElement emailField;
    
    @FindBy (id = "et_pb_contact_message_0")
    private WebElement messageField;

    @FindBy (xpath = "(//input[@class='input et_pb_contact_captcha'])[1]")
    private WebElement resultField;

    @FindBy (xpath = "(//button[@name='et_builder_submit_button'])[1]")
    private WebElement submitButton;

    @FindBy (css = "[id *= 'user_login_']")
    private WebElement usernameLoginField;

    @FindBy (css = "[id *= 'user_pass_']")
    private WebElement passwordLoginField;

    @FindBy (xpath = "(//button[@class='et_pb_newsletter_button et_pb_button'])[1]")
    private WebElement loginButton;

    private static final String URL = "https://ultimateqa.com/complicated-page";

    public FirstPageLoginAndElse(WebDriver driver) {
        super(driver);
    }

    public void goToPage() {
        driver.get(URL);
    }

    public void clickButtonDownRight(){
        clickElement(buttonDownRight);
    }

    public void writeTextInTheFieldName(String nameFieldType) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WaitTool.waitForPageLoad(driver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nameField);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("et_pb_contact_name_0")));
        writeText(nameField, nameFieldType);
    }

    public void emailType() {
        String randomPrefix = RandomStringUtils.secure().nextAlphabetic(7);
        String randomDomain = RandomStringUtils.secure().nextAlphabetic(5);

        String randomMail = randomPrefix + "@" + randomDomain + ".com";
        writeText(emailField, randomMail);
    }

    public void typeInTheMessageField(String messageText) {
        writeText(messageField, messageText);
    }

    public void typeResult(String resultFieldtype) {
        writeText(resultField, resultFieldtype);
    }

    public void clickSubmitButton () {
        clickElement(submitButton);
    }

    public void loginF(String user, String password) {
        writeText(usernameLoginField, user);
        writeText(passwordLoginField, password);
        clickElement(loginButton);
    }

    public void loginButtonNew() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginButton);
//        clickElement(loginButton);
    }


}
