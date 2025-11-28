import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumTest {

    @Test
    public void test_001() {

        // SET DRIVER
        System.setProperty("webdriver.gecko.driver",
                System.getProperty("user.dir") + "/driver/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        // 1. BUKA WEBSITE
        driver.get("https://www.saucedemo.com/");

        // 2. LOGIN
        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id='login-button']")).click();

        // 3. VALIDASI PRODUK MUNCUL (BERHASIL LOGIN)
        WebElement productList = driver.findElement(By.xpath("//*[@id='inventory_container']"));
        Assert.assertTrue(productList.isDisplayed(), "Gagal login!");

        // 4. ADD TO CART BARANG PERTAMA
        driver.findElement(By.xpath("(//button[contains(text(),'Add to cart')])[1]")).click();

        // 5. BUKA CART
        driver.findElement(By.xpath("//*[@id='shopping_cart_container']")).click();

        // 6. VALIDASI CART PAGE
        WebElement cartTitle = driver.findElement(By.xpath("//*[text()='Your Cart']"));
        Assert.assertTrue(cartTitle.isDisplayed(), "Tidak berhasil masuk cart!");

        // 7. CLICK CHECKOUT
        driver.findElement(By.xpath("//*[@id='checkout']")).click();

        // 8. ISI FORM CHECKOUT
        driver.findElement(By.xpath("//*[@id='first-name']")).sendKeys("Dafit");
        driver.findElement(By.xpath("//*[@id='last-name']")).sendKeys("QA");
        driver.findElement(By.xpath("//*[@id='postal-code']")).sendKeys("12345");

        // 9. CONTINUE
        driver.findElement(By.xpath("//*[@id='continue']")).click();

        // 10. FINISH ORDER
        driver.findElement(By.xpath("//*[@id='finish']")).click();

        // 11. VALIDASI ORDER BERHASIL
        WebElement successMsg = driver.findElement(By.xpath("//*[contains(text(),'Thank you for your order!')]"));
        Assert.assertTrue(successMsg.isDisplayed(), "Order tidak berhasil!");

        // 12. QUIT
        driver.quit();
    }
}
