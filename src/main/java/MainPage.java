import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private By singInButton = By.xpath("//input[@title='Вход на почту']");
    private By login = By.xpath("//input[@name='login']");
    private By pass = By.xpath("//input[@name='pass']");
    private By checkBox = By.xpath("//input[@name='pass']");
    private By registerLink = By.xpath("//div/a[text()='Регистрация']");





    public MailPage clickSignIn(){
        driver.findElement(singInButton).click();
        return new MailPage(driver);
    }


    public RegisterPage clichRegister(){
        driver.findElement(registerLink).click();
        return new RegisterPage(driver);
    }

    public MainPage tupeUserName (String username){
        driver.findElement(login).sendKeys(username);
        return this;
    }

    public MainPage tupePassworld (String passworld){
        driver.findElement(this.pass).sendKeys(passworld);
        return this;
    }



    public MailPage login (String login, String passworld){

        this.tupeUserName(login);
        this.tupePassworld(passworld);
        this.clickSignIn();
        return new MailPage(driver);

    }

    public IncorrectLoginPage incorrecLogin (String login, String passworld){
        this.tupeUserName(login);
        this.tupePassworld(passworld);
        this.clickSignIn();
        return new IncorrectLoginPage(driver);
    }

}
