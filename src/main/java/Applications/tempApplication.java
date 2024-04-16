package Applications;

import java.util.List;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tempApplication {
	WebDriver d;
@BeforeTest
public void beforeLogin() {
	
/*	WebDriverManager.chromedriver().setup();
	ChromeOptions o=new ChromeOptions();
	o.addArguments("--remote-allow-origins=*");
	 d=new ChromeDriver(o);
	d.manage().window().maximize();*/
//	System.setProperty("Webdriver.chrome.driver", "C:\\Downloads\\chromedriver_win32 (1).zip\\chromedriver.exe");
	// d=new ChromeDriver();
	//d.manage().window().maximize();
	//d.get("http://demo.mahamining.com/login.aspx");
}
@Test
public void test() throws Exception {
	
			
			//Enter User Name
			     d.findElement(By.id("username")).sendKeys("9328754543");
			//Enter Password
			     d.findElement(By.id("password")).sendKeys("Soham@123");
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
		    //Click On Temporary Application
		         Thread.sleep(2000);
		         d.findElement(By.xpath("//*[@id=\"_Menu\"]/ul/li[2]/div/ul/li[2]/a")).click();
		         ///select dist
		     WebElement  a1=  d.findElement(By.id("ddlApplicantDistrict"));
		        Select kk=new Select(a1);
		        kk.selectByIndex(0);
		    //Enter Address
		         Thread.sleep(1000);
		      d.findElement(By.id("txtAddressIMT")).sendKeys("pune maharashtra");
		      //Click Outside 
		         Thread.sleep(1000);
		          d.findElement(By.xpath("//*[@id=\"applicationDiv\"]/div[1]/div[2]/div/div[3]/div/label[1]")).click();
		    //Enter Landline No
		         d.findElement(By.id("txtLandline")).sendKeys("65654789659"); 
		    //Enter Email id
		         Thread.sleep(2000);
		         d.findElement(By.id("txtEmail")).sendKeys("sharan@gmail.com");
		    //Click On District Drop Down
		         d.findElement(By.xpath("//*[@id=\"applicationDiv\"]/div[1]/div[2]/div/div[10]/div/div/div/button/div/div/div")).click(); 
		 		//Get Elements in List
		 		List<WebElement>s=d.findElements(By.xpath("//a[@class='dropdown-item']"));
		 		for(WebElement e:s) {
		 			if(e.getText().equals("Pune")) {
		 				e.click();
		 				
		 			}
		 		}
		  //Enter Pincode
			d.findElement(By.id("txtAddressPincode")).sendKeys("123456");
		 //Enter PAN No
		d.findElement(By.id("PanTxt")).sendKeys("BRUPJ4028H");
		 //Upload PAN Document 
		 		Thread.sleep(2000);
		 d.findElement(By.id("Pan")).sendKeys("C:\\Users\\adityak\\Desktop\\Desktp Data\\E-Auction\\1.png");
		 //Enter  Aadhar No 
			d.findElement(By.id("AadharTxt")).sendKeys("645487464646");
		 //Upload Aadhar  Document
		 		Thread.sleep(1000);
		 	   d.findElement(By.id("Aadhar")).sendKeys("C:\\\\Users\\\\adityak\\\\Desktop\\\\Desktp Data\\\\E-Auction\\\\2.png");
		  //Enter GST
		  d.findElement(By.id("GSTTxt")).sendKeys("27EJAPS0276M1ZT");
		 //Upload Document
		 	   Thread.sleep(1000);
		 	   d.findElement(By.id("GST")).sendKeys("C:\\\\Users\\\\adityak\\\\Desktop\\\\Desktp Data\\\\E-Auction\\\\3.png");
		//Scroll Down Till element Not Found
		 	     Thread.sleep(5000);
		 	   WebElement wb=d.findElement(By.xpath("//*[@id=\"PlotDetailsDocDiv\"]/tr[1]/td[2]/div"));
		 	   JavascriptExecutor s1=(JavascriptExecutor) d;
				s1.executeScript("arguments[0].scrollIntoView()",wb);
		//Click On Proposal Level Drop Down
				WebElement Level=d.findElement(By.id("ddlProposalLevel"));
				 Select s2=new Select(Level);
				 s2.selectByIndex(2);
		//Scroll Down 
				 Thread.sleep(2000);
				 JavascriptExecutor js2=(JavascriptExecutor) d;
					js2.executeScript("window.scrollBy(0,500)");
		//Click On District Drop Down
					Thread.sleep(5000);
				     d.findElement(By.xpath("//*[@id=\"applicationDiv\"]/div[4]/div[1]/div/div[4]/div/div/div/button/div/div/div")).click();
				     List<WebElement> D=d.findElements(By.xpath("//a[@class='dropdown-item']"));
				 	for(WebElement k1:D) {
				 		for(int i=0; i<=2;i++){
				 			  try{
				 				  if(k1.getText().equals("Buldhana")) {
				 					
				 						k1.click();
				 					}
				 			   
				 			     break;
				 			  }
				 			  catch(Exception e){
				 			   System.out.println(e.getMessage());
				 			  }
				 			}
				 		
				 	}
		//Click On Taluka Drop Down
			Thread.sleep(2000);
			d.findElement(By.xpath("//button[@data-id='taluka']")).click();
			 List<WebElement> T=d.findElements(By.xpath("//a[@class='dropdown-item']"));
			 	for(WebElement k2:T) {
			 		for(int i=0; i<=2;i++){
			 			  try{
			 				  if(k2.getText().equals("Buldhana")) {
			 					
			 						k2.click();
			 					}
			 			   
			 			     break;
			 			  }
			 			  catch(Exception e){
			 			   System.out.println(e.getMessage());
			 			  }
			 			}
			 		}
		//Click On Village Drop-Down
			Thread.sleep(1000);
			d.findElement(By.xpath("//*[@id=\"applicationDiv\"]/div[4]/div[1]/div/div[6]/div/div/div/button/div/div/div")).click();
			List<WebElement> V=d.findElements(By.xpath("//a[@class='dropdown-item']"));
			for(WebElement k:V) {
				for(int i=0; i<=2;i++){
					  try{
						  if(k.getText().equals("Antriteli")) {
							
								k.click();
							}
					   
					     break;
					  }
					  catch(Exception e){
					   System.out.println(e.getMessage());
					  }
					}
				
			}
		//Enter Survey No
			d.findElement(By.id("surveyNo")).sendKeys("123456");
        //Click on  the  Fetch 7/21 button
			d.findElement(By.xpath("//button[@id='fetchSurveyBtn']")).click();
			//Click on the close button
			Thread.sleep(5000);
			d.findElement(By.xpath("/html/body/div[3]/div/main/div[2]/div[2]/div[5]/div/div/div/div[1]")).click();
		//Upload Document 
			Thread.sleep(2000);
			d.findElement(By.id("documentType1")).sendKeys("C:\\\\\\\\Users\\\\\\\\adityak\\\\\\\\Desktop\\\\\\\\Desktp Data\\\\\\\\E-Auction\\\\\\\\4.png");
		//Scroll Down
			Thread.sleep(1000);
			JavascriptExecutor jc=(JavascriptExecutor) d;
			jc.executeScript("window.scrollBy(0,600)");
		//Scroll Down
			Thread.sleep(1000);
			d.findElement(By.id("documentType2")).sendKeys("C:\\\\Users\\\\adityak\\\\Desktop\\\\Desktp Data\\\\E-Auction\\\\4.png");
		//click On Add Button
			Thread.sleep(1000);
			d.findElement(By.id("btnAddSurvey")).click();
		//Click On Map ICon
		Thread.sleep(1000);
		  d.findElement(By.xpath("//button[@class='btn btn-link p-0 d-flex']")).click();
		//Enter Location
		  Thread.sleep(1000);
		 
		   d.findElement(By.xpath("//input[@id='pac-input']")).sendKeys("pune");
		   //Click On Add
		  Thread.sleep(1000);
		 List<WebElement>button= d.findElements(By.xpath("//button[@class='btn btn-secondary btn-sm']"));
		 for(WebElement i:button) {
			 if(i.getText().equals("Add")) {
				 i.click();
			 }
		 }
		 //Click On Mineral Drop Down
		 Thread.sleep(1000);
		 d.findElement(By.xpath("//*[@id=\"applicationDiv\"]/div[4]/div[3]/div/div[3]/div/div/div/button/div/div/div")).click();
		 List<WebElement>Mineral=d.findElements(By.xpath("//a[@class='dropdown-item']"));
		 for(WebElement m:Mineral) {
			 if(m.getText().equals("Sand")) {
				 m.click();
			 }
		 }
		//Enter plot Area
		d.findElement(By.id("area")).sendKeys("5.7");
		//Enter Quantity
		d.findElement(By.id("txtQuantity")).sendKeys("8");
		//Enter Lifting Period
		d.findElement(By.id("txtLiftingPeriod")).sendKeys("90");
		//Enter reason For Apply
		Thread.sleep(1000);
		d.findElement(By.id("txtReasonApply")).sendKeys("Sand Is reuired To home");
		//Scroll Down 
		Thread.sleep(2000);
		JavascriptExecutor jc1=(JavascriptExecutor) d;
		jc.executeScript("window.scrollBy(0,400)");
		//Upload plot Photos
	//	Thread.sleep(1000);
		//d.findElement(By.id("pic0")).sendKeys("C:\\Users\\adityak\\Desktop\\Desktp Data\\Sand plot registration and Stock yard Registration error\\1.png");
		//Thread.sleep(100);
		//d.findElement(By.id("pic1")).sendKeys("C:\\\\Users\\\\adityak\\\\Desktop\\\\Desktp Data\\\\Sand plot registration and Stock yard Registration error\\\\2.png");
		//Thread.sleep(1000);
		//d.findElement(By.id("pic2")).sendKeys("C:\\\\Users\\\\adityak\\\\Desktop\\\\Desktp Data\\\\Sand plot registration and Stock yard Registration error\\\\3.png");
		//Thread.sleep(1000);
		//d.findElement(By.id("pic3")).sendKeys("C:\\\\Users\\\\adityak\\\\Desktop\\\\Desktp Data\\\\Sand plot registration and Stock yard Registration error\\\\4.png");
		//Click On Demand Note  Office Name  dropdown
		Thread.sleep(3000);
		d.findElement(By.xpath("/html/body/div[3]/div/main/div[2]/div[2]/div[1]/div/div/div/div/div[5]/div[2]/div/div[1]/div/div[2]")).click();
		//Select Office
		Thread.sleep(1000);
		List<WebElement> DM=d.findElements(By.xpath("//a[@class='dropdown-item']"));
		for(WebElement k3:DM) {
			for(int i=0; i<=2;i++){
				  try{
					  if(k3.getText().equals("SDO Buldhana")) {
						
							k3.click();
						}
				   
				     break;
				  }
				  catch(Exception e){
				   System.out.println(e.getMessage());
				  }
				}
		//Select GRAS Office Name 
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@title='Select GRAS Office Name']")).click();
		Thread.sleep(1000);
		List<WebElement> gras=d.findElements(By.xpath("//a[@class='dropdown-item']"));
		for(WebElement k2:gras) {
				for(int i=0; i<=2;i++){
					  try{
						  if(k2.getText().equals("SDO BULDHANA")) {
							
								k2.click();
							}
					   
					     break;
					  }
					  catch(Exception e){
					   System.out.println(e.getMessage());
					  }
					}
		//Select Office DM Note
		Thread.sleep(5000);
		d.findElement(By.xpath("/html/body/div[3]/div/main/div[2]/div[2]/div[1]/div/div/div/div/div[5]/div[2]/div/div[1]/div/div[2]/div/div/button/div/div/div")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("/html/body/div[3]/div/main/div[2]/div[2]/div[1]/div/div/div/div/div[5]/div[2]/div/div[1]/div/div[2]/div/div/div/div/ul/li[2]/a")).click();
		//Select Grass Office
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"applicationDiv\"]/div[5]/div[2]/div/div[2]/div/div[2]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("/html/body/div[3]/div/main/div[2]/div[2]/div[1]/div/div/div/div/div[5]/div[2]/div/div[2]/div/div[2]/div/div/div/ul/li[2]/a/span")).click();

		//Scroll Down 
			Thread.sleep(2000);
		    JavascriptExecutor jc2=(JavascriptExecutor) d;
			jc.executeScript("window.scrollBy(0,200)");
		//Upload NOC Document
			 //Public Works Department
			Thread.sleep(1000);
			d.findElement(By.id("documentType3")).sendKeys("C:\\Users\\adityak\\Desktop\\Desktp Data\\West bengal\\1.png");
			//MSEB
			Thread.sleep(1000);
			d.findElement(By.id("documentType4")).sendKeys("C:\\\\Users\\\\adityak\\\\Desktop\\\\Desktp Data\\\\West bengal\\\\2.png");
			//MPCB
			Thread.sleep(1000);
			d.findElement(By.id("documentType5")).sendKeys("C:\\\\Users\\\\adityak\\\\Desktop\\\\Desktp Data\\\\West bengal\\\\3.png");
			//Forest
			Thread.sleep(1000);
			d.findElement(By.id("documentType6")).sendKeys("C:\\\\Users\\\\adityak\\\\Desktop\\\\Desktp Data\\\\West bengal\\\\4.png");
			//Gram Panchayat
			Thread.sleep(1000);
			d.findElement(By.id("documentType7")).sendKeys("C:\\\\Users\\\\adityak\\\\Desktop\\\\Desktp Data\\\\West bengal\\\\5.png");
		//Click On Excavation Document 
			Thread.sleep(1000);
			d.findElement(By.id("ExcaviationDocuments-tab")).click();
		//Upload Document 
			//LandMutaion Document
			Thread.sleep(1000);
			d.findElement(By.id("documentType45")).sendKeys("C:\\Users\\adityak\\Desktop\\Desktp Data\\CB Img\\1.png");
			//IOD Certificate
				Thread.sleep(1000);
				d.findElement(By.id("documentType46")).sendKeys("C:\\Users\\adityak\\Desktop\\Desktp Data\\CB Img\\2.png");
			//LOI
				Thread.sleep(1000);
				d.findElement(By.id("documentType47")).sendKeys("C:\\\\Users\\\\adityak\\\\Desktop\\\\Desktp Data\\\\CB Img\\\\3.png");
			//IOD approved building plan :
				Thread.sleep(1000);
			  d.findElement(By.id("documentType48")).sendKeys("C:\\\\Users\\\\adityak\\\\Desktop\\\\Desktp Data\\\\CB Img\\\\4.png");	
			//Measurement of earth work :
				Thread.sleep(1000);
				d.findElement(By.id("documentType49")).sendKeys("C:\\\\Users\\\\adityak\\\\Desktop\\\\Desktp Data\\\\CB Img\\\\5.png");
		   //Scroll Down 
			  Thread.sleep(1000);
			 JavascriptExecutor j= (JavascriptExecutor) d;
			 j.executeScript("window.scrollBy(0,300)");
		    //Bore Log
			    Thread.sleep(1000);
				 d.findElement(By.id("documentType50")).sendKeys("C:\\\\Users\\\\adityak\\\\Desktop\\\\Desktp Data\\\\CB Img\\\\6.png");
			//DP Remarks
					Thread.sleep(1000);
			     d.findElement(By.id("documentType51")).sendKeys("C:\\\\Users\\\\adityak\\\\Desktop\\\\Desktp Data\\\\CB Img\\\\7.png");	
			//Development Agreement/power of attorney :
					Thread.sleep(1000);
					d.findElement(By.id("documentType52")).sendKeys("C:\\\\Users\\\\adityak\\\\Desktop\\\\Desktp Data\\\\CB Img\\\\8.png");
		  
			  //Form P
					 Thread.sleep(1000);
					 d.findElement(By.id("documentType53")).sendKeys("C:\\\\Users\\\\adityak\\\\Desktop\\\\Desktp Data\\\\CB Img\\\\9.png");
		    //Scroll Toward Other Document Tab
					JavascriptExecutor j1= (JavascriptExecutor) d;
					j1.executeScript("window.scrollBy(0,-250)");		
			//Click On Other Document 
					 Thread.sleep(1000);
					 d.findElement(By.xpath("/html/body/div[3]/div/main/div[2]/div[2]/div[1]/div/div/div/div/div[6]/div[2]/div/nav/div/a[3]")).click();
			//Enter Document name 
					 Thread.sleep(1000);
					 d.findElement(By.id("txtDocName")).sendKeys("Aadhar No");
		   //Enter Document No
					 d.findElement(By.id("otherDocTxt")).sendKeys("683443343434");
		   //Upload Document 
					 d.findElement(By.id("otherDoc")).sendKeys("C:\\Users\\adityak\\Desktop\\Desktp Data\\E-Auction\\1.png");
		   //Click On Add Button 
					 Thread.sleep(1000);
					 d.findElement(By.id("btnAddOtherDocs")).click();
	       //Click on the Submit Button
					 Thread.sleep(1000);
					 d.findElement(By.id("btnSubmit")).click();
	        //Click on The ok message
					 Thread.sleep(2000);
				d.switchTo().alert().accept();
		    //Click on The Ok button
				Thread.sleep(5000);
				d.findElement(By.xpath("//*[@id=\"submitModal\"]/div/div/div/div[2]/button")).click();
					
		   }
       }
   }
}




