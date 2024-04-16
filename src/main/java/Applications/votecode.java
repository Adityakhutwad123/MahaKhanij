package Applications;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class votecode
{
	 public WebDriver d;
@Test()
public void testIFrameHandling() throws InterruptedException {
      WebDriverManager.chromedriver().setup();
	
	System.setProperty("webdriver.http.factory", "jdk-http-client");
	d=new ChromeDriver();
	String url ="https://exhibition.skoch.in/exhibition-voting/";
	d.get(url);
	d.manage().deleteAllCookies();
	d.manage().window().maximize();
	Thread.sleep(3000);			
	
	WebElement ifra= d.findElement(By.tagName("iframe"));
	d.switchTo().frame(ifra);
	Thread.sleep(500);
	WebElement Name = d.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/input"));
	Name.sendKeys("Sandip");
	Thread.sleep(500);
	WebElement LastName = d.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[1]/input"));
	LastName.sendKeys("kadam");
	Thread.sleep(500);
	WebElement Desi = d.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[4]/div/div/div[2]/div/div[1]/div/div[1]/input"));
	Desi.sendKeys("PA");
	Thread.sleep(500);
	WebElement Email = d.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[5]/div/div/div[2]/div/div[1]/div/div[1]/input"));
	Email.sendKeys("tahasildarkarjat2014@gmail.com");
	Thread.sleep(500);
	WebElement OrgName = d.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[6]/div/div/div[2]/div/div[1]/div/div[1]/input"));
	OrgName.sendKeys("Sandip Bhoir industries");
	Thread.sleep(500);
	WebElement OrgCity = d.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[7]/div/div/div[2]/div/div[1]/div/div[1]/input"));
	OrgCity.sendKeys("Bhoirwadi");
	Thread.sleep(500);
	WebElement OrgState = d.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[8]/div/div/div[2]/div/div/span/div/div[21]/label/div/div[2]/div/span"));
	JavascriptExecutor js = (JavascriptExecutor)d;
	js.executeScript("arguments[0].click();", OrgState);
	Thread.sleep(500);
	
	WebElement Mobnumber = d.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[9]/div/div/div[2]/div/div[1]/div/div[1]/input"));
	Mobnumber.sendKeys("9325762777");
	Thread.sleep(500);
	
	WebElement Listofprjct = d.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[10]/div/div/div[2]/div/div/span/div/div[2]/label/div/div[2]/div/span"));
	Listofprjct.click();
	Thread.sleep(500);
	
	WebElement accptterms = d.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[12]/div/div/div[2]/div/div/span/div/div/label/div/div[2]/div/span"));
	JavascriptExecutor js2 = (JavascriptExecutor)d;
	js.executeScript("arguments[0].click();", accptterms);
	Thread.sleep(500);
	
	WebElement Submit = d.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[3]/div[1]/div[1]/div/span/span"));

	JavascriptExecutor js1 = (JavascriptExecutor)d;
	js.executeScript("arguments[0].click();", Submit);
	
	Thread.sleep(500);
	
	//d.switchTo().defaultContent();
	
  Thread.sleep(2000);
}

}


