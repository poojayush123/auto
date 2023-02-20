package util.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	WebDriver driver;
	
	public void Launchbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe" );
		driver	= new ChromeDriver();
		driver.get("https://www.javatpoint.com/c-program-to-print-alphabet-triangle");
		
		
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
