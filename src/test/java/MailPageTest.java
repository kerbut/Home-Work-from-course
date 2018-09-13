import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class MailPageTest {
    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setUp(){
        System.setProperty(
                "webdriver.chrome.driver",
                new File(MainClass.class.getResource("/chromedriver.exe").getFile()).getPath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  // неявное ожидание 5 секунд
        driver.manage().window().maximize();
        driver.get("https://www.i.ua/");

        mainPage = new MainPage(driver);



    }


    @After
    public void tearDown(){
        driver.quit();
    }
}
