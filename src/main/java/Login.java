import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
        public WebDriver driver;

        public static void main(String[] args) {
            Login mass=new Login();
            mass.launchBrowser();
            mass.login();
            mass.MyInfo();
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
        void MyInfo(){
            WebElement MyInfo=driver.findElement(By.linkText("My Info"));
            MyInfo.click();
            WebElement edit=driver.findElement(By.id("btnSave"));
            edit.click();
            WebElement Firstname =driver.findElement(By.id("personal_txtEmpFirstName"));
            Firstname.clear();
            Firstname.sendKeys("POWER");
            WebElement MiddleName=driver.findElement(By.id("personal_txtEmpMiddleName"));
            MiddleName.clear();
            MiddleName.sendKeys("STAR");
            WebElement lastName=driver.findElement(By.xpath("//input[@*='personal_txtEmpLastName']"));
            lastName.clear();
            lastName.sendKeys("work");

            WebElement EmployeeId =driver.findElement(By.id("personal_txtEmployeeId"));
            EmployeeId.clear();
            EmployeeId.sendKeys("0000");
            WebElement OtherID= driver.findElement(By.id("personal_txtOtherID"));
            OtherID.sendKeys("0001");
            WebElement DriversLicenseNumber=driver.findElement(By.xpath("//*[@id='personal_txtLicenNo']"));
            DriversLicenseNumber.clear();
            DriversLicenseNumber.sendKeys("0002");
            WebElement edit1=driver.findElement(By.id("btnSave"));
            edit1.click();


        }}
