import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailPage {
    WebDriver driver;

    public MailPage(WebDriver driver) {
        this.driver = driver;
    }

    private By newMail = By.xpath("//p/a[text()='Создать письмо']");
    private By inBox = By.xpath("//a[text()='Входящие']");
    private By sendBox = By.xpath("//a[text()='Отправленные']");
    private By deleteButton = By.xpath("//*[@id=\"fieldset1\"]//span[text()='Удалить']");
    private By lastMail = By.xpath("//form[@name='aform']/div[1]");
    private By subjectLastMail = By.xpath("//form[@name='aform']/div[1]//span[@class='sbj']/span");
    private By labelMail = By.xpath("//span[@class='sn_menu_title']");




    public String getLabel(){
        return driver.findElement(labelMail).getText();
    }
}
