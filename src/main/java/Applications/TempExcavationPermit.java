package Applications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TempExcavationPermit {
@Test
public static void applicantlogin() {
	System.setProperty("webdriver.chrome.driver", "Z:\\Chrome Driver\\chromedriver_win32 (3)\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://demo.mahamining.com/ApplicantApplicationStatus.aspx?appId=nCUIfHnGGKlAmcAr2E3nN4D2tUrK+aevtHcevEeH3qY=");
}
}
