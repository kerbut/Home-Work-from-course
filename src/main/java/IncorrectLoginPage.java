import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IncorrectLoginPage {

    WebDriver driver;

    public IncorrectLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By error = By.xpath("//div[text()='Неверный логин или пароль']");




    public String getErrorText(){
        return driver.findElement(error).getText();
    }

}
