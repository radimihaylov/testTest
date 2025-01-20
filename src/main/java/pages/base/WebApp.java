package pages.base;

import org.openqa.selenium.WebDriver;
import pages.admin.BackOffice;
import pages.admin.FirstPageLoginAndElse;
import pages.admin.Forms;
import pages.admin.Ultimateqa;

public class WebApp {

    private WebDriver driver;
    private FirstPageLoginAndElse firstPageLoginAndElse;
    private BackOffice backOffice;
    private Ultimateqa ultimateqa;
    private Forms forms;

    public WebApp(WebDriver driver) {
        this.driver=driver;
    }

    public FirstPageLoginAndElse firstPageLoginAndElse() {
        if (firstPageLoginAndElse == null) {
            firstPageLoginAndElse = new FirstPageLoginAndElse(driver);
        }
        return firstPageLoginAndElse;
    }

    public BackOffice backOffice () {
       if (backOffice == null) {
           backOffice = new BackOffice(driver);
       }
       return backOffice;
    }

    public Ultimateqa ultimateqa() {
        if (ultimateqa == null) {
            ultimateqa = new Ultimateqa(driver);
        }
    return ultimateqa;
    }
    public Forms forms() {
        if (forms == null) {
            forms = new Forms(driver);
        }
    return forms;
    }



}
