import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public WebDriver driver;

    public static void main(String[] args) {
        Dropdown mass = new Dropdown();
        mass.launchBrowser();
        mass.login();
        mass.MyInfo();
        mass.Drop();
        mass.Calender();
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
          WebElement MyInfo = driver.findElement(By.linkText("My Info"));
          MyInfo.click();
          WebElement edit = driver.findElement(By.id("btnSave"));
          edit.click();
          WebElement Firstname = driver.findElement(By.id("personal_txtEmpFirstName"));
          Firstname.clear();
          Firstname.sendKeys("POWER");
          WebElement MiddleName = driver.findElement(By.id("personal_txtEmpMiddleName"));
          MiddleName.clear();
          MiddleName.sendKeys("STAR");
          WebElement lastName = driver.findElement(By.xpath("//input[@*='personal_txtEmpLastName']"));
          lastName.clear();
          lastName.sendKeys("work");
          WebElement Gender = driver.findElement(By.id("personal_optGender_1"));
          Gender.click();
      }
      void Drop() {
          WebElement NationalityDropdown = driver.findElement(By.id("personal_cmbNation"));
          Select select = new Select(NationalityDropdown);
          select.selectByIndex(10);
          WebElement MartialStatusDropDown = driver.findElement(By.id("personal_cmbMarital"));
          Select select1 = new Select(MartialStatusDropDown);
          select1.selectByValue("Single");
      }
      void Calender(){

        WebElement DateOfBirth =driver.findElement(By.id("personal_DOB"));
        DateOfBirth.click();
        DateOfBirth.clear();
        WebElement Year=driver.findElement(By.className("ui-datepicker-year"));
        Select select2=new Select(Year);
        select2.selectByValue("1975");
        WebElement Month=driver.findElement(By.className("ui-datepicker-month"));
        Select select3=new Select(Month);
        select3.selectByIndex(2);
        WebElement Day=driver.findElement(By.xpath("//a[text()='17']"));
        Day.click();

        WebElement LicenseExpiryDate=driver.findElement(By.id("personal_txtLicExpDate"));
        LicenseExpiryDate.click();
        LicenseExpiryDate.clear();
        WebElement Year1=driver.findElement(By.className("ui-datepicker-year"));
        Select select4=new Select(Year1);
        select4.selectByIndex(1);
        WebElement Month1=driver.findElement(By.className("ui-datepicker-month"));
        Select select5=new Select(Month1);
       select5.selectByValue("2");
        WebElement Day1=driver.findElement(By.xpath("//*[text()='17']"));
        Day1.click();









     // WebElement Recruitment= driver.findElement(By.linkText("Recruitment"));
      // Recruitment.click();
          WebElement edit1=driver.findElement(By.id("btnSave"));
          edit1.click();
    }}







