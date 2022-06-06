package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import chromedriver.Chromedriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintestleaf {


public static void main(String[] args) {
		// TODO Auto-generated method stub
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Aravind");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("aravind");
        driver.findElement(By.xpath("//input[@id='createLeadForm_personalTitle']")).sendKeys("abc");
        driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("automation");
        driver.findElement(By.xpath("//input[@id='createLeadForm_annualRevenue']")).sendKeys("20000");
        driver.findElement(By.xpath("//input[@id='createLeadForm_sicCode']")).sendKeys("200");
        driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("automation");
        driver.findElement(By.xpath("//textarea[@id='createLeadForm_importantNote']")).sendKeys("java");
        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']")).sendKeys("20");
        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("4343");
        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneExtension']")).sendKeys("9962");
        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("aravind17166@gamil.com");
        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9962606879");
        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAskForName']")).sendKeys("anand");
        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryWebUrl']")).sendKeys("faf");
        driver.findElement(By.xpath("//input[@id='createLeadForm_generalToName']")).sendKeys("Aravind");
        driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress1']")).sendKeys("dahfgs");
        driver.findElement(By.xpath("//input[@id='createLeadForm_generalCity']")).sendKeys("ahsj");
        driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("600020");
        driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCodeExt']")).sendKeys("200");
        driver.findElement(By.xpath("//input[@id='createLeadForm_generalAttnName']")).sendKeys("Aravind");
        driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress2']")).sendKeys("faffaf");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("anand");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("anand");
        driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Software");
        driver.findElement(By.xpath("//input[@id='createLeadForm_tickerSymbol']")).sendKeys("sdhjd");
        driver.findElement(By.xpath("//input[@id='createLeadForm_numberEmployees']")).sendKeys("1000");
        
        
        Select dd1=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']")));
        dd1.selectByValue("IND_DISTRIBUTION");
        
        Select dd2=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']")));
        dd2.selectByValue("OWN_PARTNERSHIP");
        
        Select dd3=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']")));
        dd3.selectByValue("LEAD_CONFERENCE");
		
        Select dd4=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']")));
        dd4.selectByValue("CATRQ_AUTOMOBILE");
        
        Select dd5=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']")));
        dd5.selectByValue("IND");
        
        Select dd6=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_currencyUomId']")));
        dd6.selectByValue("INR");
        
        Select dd7=new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']")));
        dd7.selectByValue("IN-TN");
		 
        driver.findElement(By.className("smallSubmit")).click();
		
		String text1=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text1);

        
      
	}

}
