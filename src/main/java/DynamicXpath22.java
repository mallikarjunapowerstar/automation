import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicXpath22 {
    public static WebDriver driver;

    static void selectDate(int day,String monthValue,String yearValue) throws InterruptedException {
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.id("btnSave")).click();
        driver.findElement(By.id("personal_txtLicExpDate")).click();
        WebElement year= driver.findElement(By.className("ui-datepicker-year"));
        Select select1= new Select(year);
        select1.selectByValue(yearValue);
        Thread.sleep(2000);
        WebElement month= driver.findElement(By.className("ui-datepicker-month"));
        Select select2= new Select(month);
        Thread.sleep(2000);
        select2.selectByValue(monthValue);
//        *[@class='ui-state-default' and text()='28']
        driver.findElement(By.xpath("//*[@class='ui-state-default' and text()='"+day+"']")).click();
        //            System.out.println("//*[@class='ui-state-default' and text()='"+day+"']");


    }
    static void launch(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    static void login(String userName, String password){
        WebElement userNameField= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        WebElement passwordField= driver.findElement(By.xpath("//*[@*='txtPassword']"));
        WebElement loginBtn= driver.findElement(By.xpath("//*[@class='button']"));
        userNameField.sendKeys(userName);
        passwordField.sendKeys(password);
        loginBtn.click();
    }

    public static void main(String[] args) throws InterruptedException {
        launch();
        login("Admin","admin123");
        selectDate(26,"7","1986");

    }
}


