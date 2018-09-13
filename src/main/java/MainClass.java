import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class MainClass {

    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty(
                "webdriver.gecko.driver",
                new File(MainClass.class.getResource("/geckodriver.exe").getFile()).getPath());
        System.setProperty(
                "webdriver.chrome.driver",
                new File(MainClass.class.getResource("/chromedriver.exe").getFile()).getPath());
            driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  // неявное ожидание 5 секунд
        driver.manage().window().maximize();

        driver.get("https://www.i.ua/");

        MainPage mainPage = new MainPage(driver);
       // MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.login("testkerb", "80505756489");



    }
}
