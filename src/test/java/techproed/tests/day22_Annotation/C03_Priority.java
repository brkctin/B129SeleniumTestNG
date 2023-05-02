package techproed.tests.day22_Annotation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C03_Priority {


    WebDriver driver;

    @Test(priority = -3)
    public void techproedTest() {
        driver.get("https://techproeducation.com");
    }
    @Test(priority = -1)
    public void amazonTest() {
        driver.get("https://amazon.com");
    }
    @Test(priority = -2)
    public void facebookTest() {
        driver.get("https://facebook.com");
    }
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
    }
    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}


