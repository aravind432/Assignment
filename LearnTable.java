package chromedriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.ENTER);
	    driver.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement>ele=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr//td[2]"));
		int size=ele.size();
		List<String> TrainName=new ArrayList<String>();
		System.out.println(size);
		for (int i=0; i < size; i++) {
			String text=ele.get(i).getText();
			System.out.println(text);
			
		}
		
		
		
		

	}

}
