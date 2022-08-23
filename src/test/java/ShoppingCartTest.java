import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ShoppingCartTest {
    WebDriver driver;

    @Test
    public void Discount20Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("19");
        driver.findElement(By.cssSelector("[value=Update]"));
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "0", "Discount incorrect");


    }

    @Test
    public void Discount50Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("25");
        driver.findElement(By.cssSelector("[value=Update]"));
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "2", "Discount incorrect");


    }

    @Test
    public void Discount100Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("85");
        driver.findElement(By.cssSelector("[value=Update]"));
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "3", "Discount incorrect");


    }

    @Test
    public void Discount500Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("278");
        driver.findElement(By.cssSelector("[value=Update]"));
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "4", "Discount incorrect");

    }

    @Test
    public void Discount1000Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("797");
        driver.findElement(By.cssSelector("[value=Update]"));
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "5", "Discount incorrect");

    }

    @Test
    public void Discount5000Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("3986");
        driver.findElement(By.cssSelector("[value=Update]"));
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "6", "Discount incorrect");

    }

    @Test
    public void Discount9999Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("8967");
        driver.findElement(By.cssSelector("[value=Update]"));
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "7", "Discount incorrect");

    }

    @Test
    public void Discount10001Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=10");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=10']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("10023");
        driver.findElement(By.cssSelector("[value=Update]"));
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        assertEquals(discountPercent, "8", "Discount incorrect");
    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        driver.quit();
    }
}