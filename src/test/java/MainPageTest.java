import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class MainPageTest {
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

    @Test
    @Ignore
    public void register(){
        RegisterPage registerPage = mainPage.clichRegister();
        String heading = registerPage.getHeading();

        Assert.assertEquals("Регистрация пользователя",heading);
    }

    @Test
    @Ignore
    public void logInFailTest(){
        IncorrectLoginPage incorrectLoginPage = mainPage.incorrecLogin("test", "test");
        String errorText = incorrectLoginPage.getErrorText();
        Assert.assertEquals("Неверный логин или пароль",errorText);

    }

    @Test
    public void  logIn (){
        MailPage mailPage = mainPage.login("testkerb", "80505756489");
        String labelMail = mailPage.getLabel();
        Assert.assertEquals("testkerb@i.ua", labelMail);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
