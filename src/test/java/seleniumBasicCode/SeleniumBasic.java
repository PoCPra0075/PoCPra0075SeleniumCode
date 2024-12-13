package seleniumBasicCode;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBasic {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		driver.get("http://139.59.27.246:3000/");
		System.out.println(driver.getTitle());

		WebElement signinEle = driver.findElement(By.xpath("//a[normalize-space()='Sign In']"));
		signinEle.click();

		// register

//		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
//		
//		driver.findElement(By.id("userName")).sendKeys("Naveenkrp");
//		
//		driver.findElement(By.id("firstName")).sendKeys("Praveen");
//		driver.findElement(By.id("email")).sendKeys("Naveen190@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Praveen@101");
//		driver.findElement(By.xpath("(//input[@id='password'])[2]")).sendKeys("Praveen@101");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
//		Thread.sleep(4000);

		// signin

		// driver.findElement(By.xpath("//a[@id='username']")).click();
		// driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();

		driver.findElement(By.id("userNameOrEmail")).sendKeys("Naveen190@gmail.com");

		driver.findElement(By.id("password")).sendKeys("Praveen@101");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();

		// Get the all book detail (size and text of each book)

		List<WebElement> allBooks = driver.findElements(By.xpath("(//div[@class='my-3 rounded card'])"));

		System.out.println("Total number of books: " + allBooks.size());
		System.out.println(allBooks.size());

		try {
			for (WebElement allBook : allBooks) {
				System.out.println(allBook.getText());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

		driver.close();
	}
}
