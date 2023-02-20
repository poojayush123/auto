package util.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	WebDriver driver;
	
	public void Launchbrowser() {
		System.setProperty("webdriver.chrome.driver","C:/Users/HP/Downloads/chromedriver_win32 (2)/chromedriver.exe" );
		driver	= new ChromeDriver();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.id("ap_email")).sendKeys("123456");
		driver.findElement(By.id("continue")).click();//password
		driver.findElement(By.id("ap_password")).sendKeys("1234@123");
		
		////*[@id="signInSubmit"]
		//driver.findElement(By.id("//*[@id=\"signInSubmit\"]")).click();
		driver.findElement(By.id("signInSubmit")).click();
		/*driver.findElement(By.id("nav-hamburger-menu")).click();
		driver.findElement(By.linkText("Electronics")).click();
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[9]/a")).click();
		//driver.findElement(By.partialLinkText("Hedapho")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div[1]/h2/a")).click();
		
		driver.findElement(By.name("submit.add-to-cart")).click();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("proceedToRetailCheckout")).click();*/
		
		//nav-hamburger-menu
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("jbl");
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.id("btnLogin")).click();
		//driver.navigate().back();
		//driver.close();
		//driver.findElement(By.id("w-input-search")).sendKeys("course");
		//driver.findElement(By.xpath("/html/body/header/div/a/button")).click();
		///html/body/header/div/a
		//blinkingText
		//  //*[@id="identifierNext"]/div/button
		
	}
	/*
	 * public void SearchProduct() { driver = new ChromeDriver();
	 * driver.findElement(By.id("twotabsearchtextbox")); }
	 */
	
//C:\Users\HP\Downloads\chromedriver_win32C:\Users\HP\Downloads\chromedriver_win32 (2)
	public static void main(String[] args) {
		
		test t1= new test();
		t1.Launchbrowser();
		//t1.SearchProduct();
	}

}
