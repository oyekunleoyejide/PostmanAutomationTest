package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    private WebDriver driver;

    //import chromeDriver
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        //input project URL = Postman login URL
        driver.get("https://www.postman.com/");
        //waiting for globally
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //maximise the window
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());

        //Locate Sign In button
        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul[2]/li/a")).click();

        //Locate username field
        driver.findElement(By.id("username")).sendKeys("oyejideoyekunle@gmail.com");

        //Locate password field
        driver.findElement(By.id("password")).sendKeys("holyspirit77");

        //Click on sign in button
        driver.findElement(By.xpath("//*[@id=\"sign-in-btn\"]")).click();


        Thread.sleep(10000);
        //close the  after test
        driver.quit();
    }


    //initiate the test run command
    public static void main (String[] args) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
    }

}
