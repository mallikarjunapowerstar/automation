import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
    public WebDriver driver;

    public static void main(String[] args) {
     Login login=new Login();
     login.launchBrowser();
     login.login();
     login.MyInfo();
    }
    void launchBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
     void login() {
         WebElement userName = driver.findElement(By.id("txtUsername"));
         userName.sendKeys("Admin");
         WebElement password = driver.findElement(By.id("txtPassword"));
         password.sendKeys("admin123");
         WebElement login = driver.findElement(By.id("btnLogin"));
         login.click();
     }
      void MyInfo() {
        WebElement MyInfo=driver.findElement(By.linkText("My Info"));
        MyInfo.click();
        WebElement edit=driver.findElement(By.id("btnSave"));
        edit.click();
        WebElement Firstname =driver.findElement(By.id("personal_txtEmpFirstName"));
        Firstname.clear();
        Firstname.sendKeys("POWER");
        WebElement Middlename=driver.findElement(By.id("personal_txtEmpMiddleName"));
        Middlename.sendKeys("STAR");
        WebElement lastName=driver.findElement(By.xpath("//input[@*='personal_txtEmpLastName']"));
        lastName.sendKeys("work");

        WebElement NationalityDropdown =driver.findElement(By.id("personal_cmbNation"));
       Select select=new Select(NationalityDropdown);
        select.selectByVisibleText("Indian");
        WebElement MartialStatusDropDown=driver.findElement(By.id("personal_cmbMarital"));
        Select select1=new Select(MartialStatusDropDown);
        select1.selectByValue("Single");


       WebElement Recruitment= driver.findElement(By.linkText("Recruitment"));
       Recruitment.click();


    }}







