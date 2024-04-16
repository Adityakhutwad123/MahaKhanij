package Applications;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Miningplan extends tempApplication {
	WebDriver d;
@BeforeTest
public void beforeminingapplication() {
	//Connect Browser
		super.beforeLogin();
}
@Test
public void Miningapplication() throws Exception {
	d.get("https://demo.mahamining.com/login.aspx");
	//Login With User
	//Enter User Name
	     d.findElement(By.id("username")).sendKeys("6524578978");
	//Enter Password
	     d.findElement(By.id("password")).sendKeys("Test@1234");
	//Enter Captcha
	   String Captcha=JOptionPane.showInputDialog("Enter Your Captcha");;
	   d.findElement(By.id("captcha")).sendKeys(Captcha);
	//Click On Login
	    d.findElement(By.id("loginuser")).click();
	//Move Mouse To Side Bar
	     Thread.sleep(1000);
         WebElement w= d.findElement(By.xpath("//*[@id=\"_Menu\"]/ul/li[4]/a/i/img"));
         Actions a=new Actions(d);
         a.moveToElement(w).perform();
         Thread.sleep(2000);
    //Click On Online Application
         d.findElement(By.xpath("//*[@id=\"_Menu\"]/ul/li[2]/a/i/img")).click();
}
}

