package launch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class Send_keys_by_java_script {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement userName =driver.findElement(By.id("txtUsername"));
        JavascriptExecutor executor=  (JavascriptExecutor) driver;
        Thread.sleep(3000);
        executor.executeScript("arguments[0].value='Admin';",userName);
        WebElement password= driver.findElement(By.id("txtPassword"));
        executor.executeScript("arguments[0].value='admin123';",password);
    }
   // WebElement userName =driver.findElement(By.id("txtUsername"));       BY NORMAL SALENIUM
   // userName.sendKeys("admin");                                          BY NORMAL SALENIUM
   // Actions actions=new Actions(driver);                                 BY ACTIONS KEY
   // actions.sendKeys(userName,"admin");                                  BY ACTIONS KEY
    // executor.executeScript("arguments[0].value='Admin';",userName);      BY JAVA SCRIPT
}


