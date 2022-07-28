import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text_get_attribute {
    public WebDriver driver;

    public static void main(String[] args) {
        Get_text_get_attribute obj =new Get_text_get_attribute();
        obj.launchBrowser();
        obj.login();
        obj.navigateTOMyInfo();

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
    void navigateTOMyInfo() {
        WebElement MyInfo=driver.findElement(By.linkText("My Info"));
        MyInfo.click();
       // driver.findElement(By.id("menu_pim_viewMyDetails")).click();
       // driver.findElement(By.id("btnSave")).click();
        WebElement ssnNO= driver.findElement(By.xpath("//label[text()='SSN Number']"));
        String ssnText= ssnNO.getText();
        System.out.println("Text from getText :"+ssnText);

        WebElement EmployeeId=driver.findElement(By.xpath("//label[text()='Employee Id']"));
        String EmployeeIdText=EmployeeId.getText();
        System.out.println("Text from getText :"+EmployeeIdText);

        WebElement FullName=driver.findElement(By.xpath("//label[text()='Full Name']"));
        String FullNameText=FullName.getText();
        System.out.println("Text from getText:"+FullNameText);



       WebElement employeeId= driver.findElement(By.id("personal_txtEmployeeId"));
       String empId=employeeId.getAttribute("value");
       System.out.println("From get Attribute :"+empId);

       WebElement DriversLicenseNumber=driver.findElement(By.id("personal_txtLicenNo"));
       String DriversLicenseNumber1=DriversLicenseNumber.getAttribute("value");
       System.out.println("From get Attribute :"+DriversLicenseNumber1);

      WebElement SSNNumber=driver.findElement(By.id("personal_txtNICNo"));
      String SSNNumber1=SSNNumber.getAttribute("name");
       System.out.println("FROM GET ATTRIBUTE:"+SSNNumber1);

       String name=employeeId.getAttribute("name");
       System.out.println("Name  :"+name);




    }
    }

