import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;
import pages.LoginPage;

public class Main {
    public static void main(String[] args) {
        String baseUrl = "http://localhost:8080/";
        String driverPath = System.getProperty("user.dir") + "/src/test/resources/geckodriver";
        System.setProperty("webdriver.gecko.driver", driverPath);

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.login("test", "123456");

        if(homePage.isHome())
            System.out.println("Login exitoso");
        else
            System.out.println("Login fallido");

        driver.close();
    }
}
