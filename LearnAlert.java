package chromedriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Alert.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
	
	Alert alert=driver.switchTo().alert();
	alert.accept();
	
	driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	//Thread.sleep(2000);
	Alert alert1=driver.switchTo().alert();
	alert1.accept();
	driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	driver.switchTo().alert().sendKeys("Aravind");
	driver.switchTo().alert().accept();
 
	
	
	
	
	
	
		
		
		

	}

}
