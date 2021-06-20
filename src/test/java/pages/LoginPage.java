package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(id = "user")
    private WebElement userInput;
    @FindBy(id = "pass")
    private WebElement passwordInput;
    @FindBy(id = "submit")
    private WebElement loginSubmit;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage login(String user, String pass) {
        userInput.sendKeys(user);
        passwordInput.sendKeys(pass);
        loginSubmit.click();
        return new HomePage(this.driver);
    }
}
