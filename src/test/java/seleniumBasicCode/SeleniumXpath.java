package seleniumBasicCode;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;
import java.awt.Robot;
import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumXpath {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/books");

		System.out.println("Title of the DemoQa Page: " + driver.getTitle());

//		driver.findElement(By.xpath("(//div[@class='header-wrapper'])[1]")).click();
//
//		// Text Box
//		driver.findElement(By.xpath("(//li[@id='item-0'])[1]")).click();
//		driver.findElement(By.id("userName")).sendKeys("arjun");
//		driver.findElement(By.id("userEmail")).sendKeys("arjun123@gmail.com");
//
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0, 650);");
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("(//button[normalize-space()='Submit'])[1]"));
//		Thread.sleep(2000);
//
//		// Check Box
//
//		driver.findElement(By.xpath("(//li[@id='item-1'])[1]")).click();
//		JavascriptExecutor jss = (JavascriptExecutor) driver;
//		jss.executeScript("window.scrollTo(0, 300);");
//		Actions action = new Actions(driver);
//		driver.findElement(By.xpath("//span[@class='rct-checkbox']//*[name()='svg']"));
//		action.click();
//		Thread.sleep(4000);
//
//		// Radio Button
//
//		driver.findElement(By.xpath("(//li[@id='item-2'])[1]")).click();
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("window.scrollTo(0, 300);");
//		driver.findElement(By.xpath("(//label[text()='Impressive'])[1]")).click();
//		Thread.sleep(2000);
//
//		// Web Tables
//
//		driver.findElement(By.xpath("(//li[@id='item-3'])[1]")).click();
//		Thread.sleep(2000);
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		js2.executeScript("window.scrollTo(0, 300);");
//		List<WebElement> webTables = driver.findElements(By.xpath("//div[@role='grid']"));
//		System.out.println(webTables.size());
//
//		for (WebElement webTable : webTables) {
//			System.out.println(webTable.getText());
//			Thread.sleep(2000);
//		}
//
//		// Buttons
//
//		driver.findElement(By.xpath("(//li[@id='item-4'])[1]")).click();
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		js3.executeScript("window.scrollTo(0, 400);");
//
//		Thread.sleep(3000);
//		WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
//		Actions action1 = new Actions(driver);
//		action1.doubleClick(button).perform();
//		Thread.sleep(2000);
//
//		WebElement rightclickbutton = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
//		Actions act = new Actions(driver);
//		act.contextClick(rightclickbutton).perform();
//		Thread.sleep(2000);
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement clickbutton = wait.until(
//				ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space()='Click Me'])[1]")));
//		clickbutton.click();
//		Thread.sleep(2000);
//
//		// Links
//
//		driver.findElement(By.xpath("(//li[@id='item-5'])[1]")).click();
//
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollTo(0,400);");
//		// Home Link
////		driver.findElement(By.xpath("(//a[text()='Home'])[1]")).click();
////		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
////		driver.switchTo().window(tabs.get(1));
////		System.out.println("Title of the Home Link tab: " + driver.getTitle());
////		driver.close();
////		driver.switchTo().window(tabs.get(0));
////		System.out.println("Back to original tab: " + driver.getTitle());
//
//		// Home3KuZ0 Link
//		driver.findElement(By.xpath("//a[@id='dynamicLink']")).click();
//		ArrayList<String> tab2 = new ArrayList<>(driver.getWindowHandles());
//		driver.switchTo().window(tab2.get(1));
//		Thread.sleep(3000);
//		System.out.println("Title of the Home3KuZ0 Link tab: " + driver.getTitle());
//		driver.close();
//		driver.switchTo().window(tab2.get(0));
//		System.out.println("Back to original tab: " + driver.getTitle());
//		
//		// DynamicProperties
//
//		driver.findElement(By.xpath("(//li[@id='item-8'])[1]")).click();
//		JavascriptExecutor jsee = (JavascriptExecutor) driver;
//		jsee.executeScript("window.scrollTo(0,400);");
//		driver.findElement(By.xpath("//button[@id='enableAfter']")).click();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@id='colorChange']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@id='visibleAfter']")).click();
//		Thread.sleep(3000);
		
		
		//Forms
		driver.findElement(By.xpath("(//div[@class='header-wrapper'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Praveen");
		driver.findElement(By.id("lastName")).sendKeys("Reddy");
		JavascriptExecutor jsee = (JavascriptExecutor) driver;
		jsee.executeScript("window.scrollTo(0,400);");
		driver.findElement(By.id("userEmail")).sendKeys("praveen@gmail.com");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("8972109123");
		JavascriptExecutor jsee1 = (JavascriptExecutor) driver;
		jsee1.executeScript("window.scrollTo(0,400);");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		driver.findElement(By.xpath("(//div[@aria-label='Choose Sunday, December 1st, 2024'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("I am Praveen");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//label[normalize-space()='Sports'])[1]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\Qapitol QA\\Downloads\\Selenium Full Material");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("I am Praveen Kumar Reddy");
		JavascriptExecutor jsee2 = (JavascriptExecutor) driver;
		jsee2.executeScript("window.scrollTo(0,300);");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//div[text()='Uttar Pradesh'])[1]")).click();
		//driver.findElement(By.xpath("(//button[normalize-space()='Submit'])[1]")).click();
		
		driver.quit();
	}
}
