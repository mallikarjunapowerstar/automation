package launch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_without_web_driver {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement userName= driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
       WebElement password= driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");
       WebElement login= driver.findElement(By.id("btnLogin"));
        login.click();
      // WebElement Forgotpassword= driver.findElement(By.id("forgotPasswordLink"));
       // Forgotpassword.click();
        WebDriverManager.edgedriver().setup();
       WebDriver driver1= new EdgeDriver();
        driver1.get("https://opensource-demo.orangehrmlive.com/");
        WebElement userName1= driver1.findElement(By.id("txtUsername"));
        userName1.sendKeys("Admin");
        WebElement password1= driver1.findElement(By.id("txtPassword"));
        password1.sendKeys("admin123");
         WebElement login1= driver1.findElement(By.id("btnLogin"));
        login1.click();
    }
}


