package Applications;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logins {
	WebDriver d;
	XSSFWorkbook w;
	XSSFSheet s;
	XSSFCell c;
	XSSFRow r;
	File f;
	FileInputStream fis;
	FileOutputStream fos;
	int i,j;
	
@BeforeTest
public void BeforeAllLogins() throws  Exception {
	WebDriverManager.chromedriver().setup();
	 d=new ChromeDriver();
	d.manage().window().maximize();
}
@Test
public void WriteLogin() throws  Exception {
	 f=new File("Z:\\aditya salanium\\chromedriver store\\writelogins.xlsx");
	 fos=new FileOutputStream(f);
	  w=new XSSFWorkbook();
	 s= w.createSheet("sheet1");
     for(i=0;i<4;i++);
     {
    	r=s.createRow(i);
    		d.get("https://demo.mahamining.com/home.html");
    		d.findElement(By.id("lnkLoginNew")).click();
    		d.findElement(By.id("signUp-tab")).click();
    		d.findElement(By.id("name")).sendKeys("Virat");
    		d.findElement(By.id("MobileNumber")).sendKeys("9309784911");
    		Thread.sleep(1000);
    		d.findElement(By.xpath("//button[@id='submituser']")).click();
    		Thread.sleep(3000);
    		for(int l=0;l<6;l++) {
    			if(l==0) {
    		String OTP1=JOptionPane.showInputDialog("Enter Your OTP");
    		d.findElement(By.id("otp1")).sendKeys(OTP1);
    			}
    			if(l==1) {
    	    		String OTP1=JOptionPane.showInputDialog("Enter Your OTP");
    	    		d.findElement(By.id("otp2")).sendKeys(OTP1);
    	    			}
    			if(l==2) {
    	    		String OTP1=JOptionPane.showInputDialog("Enter Your OTP");
    	    		d.findElement(By.id("otp3")).sendKeys(OTP1);
    	    			}
    			if(l==3) {
    	    		String OTP1=JOptionPane.showInputDialog("Enter Your OTP");
    	    		d.findElement(By.id("otp4")).sendKeys(OTP1);
    	    			}
    			if(l==4) {
    	    		String OTP1=JOptionPane.showInputDialog("Enter Your OTP");
    	    		d.findElement(By.id("otp5")).sendKeys(OTP1);
    	    			}
                                  }
    		//Click On Submit button
    		d.findElement(By.id("submituser")).click();
    	Thread.sleep(2000);
    		//enter New Password
            d.findElement(By.xpath("NewPassword")).sendKeys("Virat@123");
            //Enter Confirm Password
            d.findElement(By.name("Submit")).click();
            for(j=0;j<4;j++);{
            	if(j==0) {
            	c=r.createCell(j);
            	c.setCellValue("9309784911");
            }
            	if(j==1) {
            		c=r.createCell(j);
                	c.setCellValue("Virat@123");
            	}
            }
           
    		
    	}
     }
		  
	  
}


