import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


    public class ZipCodeTest {

        @Test
        public void zipCode4Digits() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.sharelane.com/cgi-bin/register.py");
            driver.findElement(By.name("zip_code")).sendKeys("1234");
            driver.findElement(By.cssSelector("[value=Continue]")).click();
            String error = driver.findElement(By.cssSelector("[class=error_message]")).getText();
            assertEquals(error, "Oops, error on page. ZIP code should have 5 digits", "Zip code error message is incorrect");
            driver.quit();
        }

        @Test
        public void zipCode5Digits() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.sharelane.com/cgi-bin/register.py");
            driver.findElement(By.name("zip_code")).sendKeys("12345");
            driver.findElement(By.cssSelector("[value=Continue]")).click();
            boolean isOpened = driver.findElement(By.cssSelector("[value=Register")).isDisplayed();
            assertTrue(isOpened, "Sign up page was not opened");
            driver.quit();
        }

        @Test
        public void zipCode6Digits() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.sharelane.com/cgi-bin/register.py");
            driver.findElement(By.name("zip_code")).sendKeys("123456");
            driver.findElement(By.cssSelector("[value=Continue]")).click();
            boolean isOpened = driver.findElement(By.cssSelector("[value=Register")).isDisplayed();
            assertTrue(isOpened, "Sign up page was not opened");
            driver.quit();
        }
    }