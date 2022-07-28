import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

 class MouseHover {
    public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        MouseHover mouseHover= new MouseHover();
        mouseHover.launchBrowser();
        mouseHover.login();
        mouseHover.handleMouseHover();
    }

    void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    void login(){

        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("admin123");
        WebElement loginButton= driver.findElement(By.xpath("//input[@class='button']"));
        loginButton.click();
    }

    void handleMouseHover() throws InterruptedException {
      //  WebElement PIM=driver.findElement(By.id("menu_pim_viewPimModule"));
      //  Actions actions=new Actions(driver);
      //  actions.moveToElement(PIM).build().perform();
      //  Thread.sleep(3000);
      //  WebElement Configuration =driver.findElement(By.id("menu_pim_Configuration"));
      //  Actions actions1=new Actions(driver);
      //  actions.moveToElement(Configuration).build().perform();
       // Thread.sleep(4000);

        WebElement performance= driver.findElement(By.id("menu__Performance"));
        Actions actions= new Actions(driver);
        actions.moveToElement(performance).build().perform();
        Thread.sleep(3000);
        WebElement configure= driver.findElement(By.id("menu_performance_Configure"));
        actions.moveToElement(configure).perform();
        Thread.sleep(3000);
        WebElement tracker= driver.findElement(By.id("menu_performance_addPerformanceTracker"));
        actions.click(tracker).perform();
        WebElement myInfo= driver.findElement(By.id("menu_pim_viewMyDetails"));
        Thread.sleep(2000);
        myInfo.click();
        driver.findElement(By.id("btnSave")).click();
        WebElement middleName= driver.findElement(By.id("personal_txtEmpMiddleName"));
        actions.sendKeys(middleName,"Testing").perform();




    }
}


