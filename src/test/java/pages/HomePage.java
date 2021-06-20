package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    @FindBy(xpath = "//*[contains(text(), 'Home')]")
    private WebElement title;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isHome() {
        try {
            title.isDisplayed();
            return true;
        } catch (Exception exception){
            return false;
        }
    }
}
