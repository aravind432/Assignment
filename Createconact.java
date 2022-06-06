package selenium;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createconact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Aravind");
		driver.findElement(By.id("lastNameField")).sendKeys("Anand");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Aravind");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("anand");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Aeronautical");
		driver.findElement(By.id("createContactForm_description")).sendKeys("aero");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("aravind17166@gmail.com");
	    WebElement dropdown1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select d1=new Select(dropdown1);
		d1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("work");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println(driver.getTitle());
	
	}

}
