package Applications;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class approval_process  {
	WebDriver d;
	public static void main(String[] args) throws Exception {
		approval_process as=new approval_process();
		as.clerk_Login();
		
	}
@Test
public void clerk_Login() throws Exception {
	System.setProperty("Webdriver.chrome.driver", "C:\\Downloads\\chromedriver_win32 (1).zip\\chromedriver.exe");
	 d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("http://demo.mahamining.com/login.aspx");
	//super.test();
	
	//click on the User Name
	//d.findElement(By.xpath("//a[@id='userNmae']")).click();
	//Click on the Logout
	//Thread.sleep(2000);
	//d.findElement(By.xpath("//i[@class='fas fa-sign-out-alt mr-1']")).click();
	//Click on the Login For Clerk 
	Thread.sleep(2000);
	//d.findElement(By.id("lnkLoginNew")).click();
	Thread.sleep(3000);
    d.findElement(By.id("username")).sendKeys("6100000025");
//Enter Password
    d.findElement(By.id("password")).sendKeys("Aa@126024");
//Enter Captcha
  String Captcha=JOptionPane.showInputDialog("Enter Your Captcha");;
  d.findElement(By.id("captcha")).sendKeys(Captcha);
//Click On Login
   d.findElement(By.id("loginuser")).click();
//Move Mouse side bar
   Thread.sleep(2000);
   WebElement w= d.findElement(By.xpath("/html/body/div[3]/div/nav/div/div[3]/div/div[1]/div/ul/li[11]"));
   Actions a=new Actions(d);
   a.moveToElement(w).perform();
//Click On The Approval
   d.findElement(By.xpath("/html/body/div[3]/div/nav/div/div[3]/div/div[1]/div/ul/li[11]")).click();
//Click on the Temporary Application
   d.findElement(By.xpath("/html/body/div[3]/div/nav/div/div[3]/div/div[1]/div/ul/li[11]/div/ul/li[1]/a")).click();
 //Click on the Application No
   Thread.sleep(5000);
 d.findElement(By.xpath("/html/body/div[3]/div/main/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]/table/tbody/tr[1]/td[3]")).click();
 //Enter Remark
 //scroll down till element not found
 Thread.sleep(10000);
 JavascriptExecutor js=(JavascriptExecutor) d;sdfsdfsdfsdfsdfsd
 js.executeScript("window.ScrollBy(0,600)", "" );sdsdfsdf

 //click on the approve/proceed button
 //d.findElement(By.xpath("/html/body/div[3]/div/main/div[2]/div[2]/div[1]/div/div/button[3]")).click();
}
}
