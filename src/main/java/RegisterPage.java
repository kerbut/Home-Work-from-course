import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }


    private By heading = By.xpath("//h1");

    public String getHeading(){
        return driver.findElement(heading).getText();
    }

}
