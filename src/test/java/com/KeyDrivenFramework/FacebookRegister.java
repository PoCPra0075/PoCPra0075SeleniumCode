package com.KeyDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookRegister {

	public static WebDriver driver = null;

	public static XSSFSheet readExcelSheet(String path) throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("FacebookCreateAccount");

		return sheet;
	}

	public static WebElement getElement(String locatorType, String locatorValue) {
		WebElement element = null;

		switch (locatorType) {
		case "id":
			element = driver.findElement(By.id(locatorValue));
			break;
		case "name":
			element = driver.findElement(By.name(locatorValue));
			break;
		case "xpath":
			element = driver.findElement(By.xpath(locatorValue));
		case "NA":
			break;
		default:
			System.out.println("Invalid Locator Type");
			break;
		}
		return element;
	}

	public static void main(String[] args) throws IOException {

		System.out.println("hello");

		String path = "C:\\Users\\Qapitol QA\\Desktop\\KeyDriven\\Book.xlsx";

		XSSFSheet sheet = readExcelSheet(path);
		
		int rowCount = sheet.getPhysicalNumberOfRows();

		for (int i = 1; i < rowCount; i++) {

			Row row = sheet.getRow(i);

			String keyword = row.getCell(0).getStringCellValue();

			String locatorType = row.getCell(1).getStringCellValue();

			String locatorValue = row.getCell(2).getStringCellValue();

			String data = row.getCell(3).getStringCellValue();

			switch (keyword) {

			case "openBrowser":
				if (data.equalsIgnoreCase("chrome")) {
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				} else if (data == "firefox") {
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
				} else {
					System.out.println("invalid Browser");
				}
				break;
			case "navigate":
				driver.get(data);
				break;
			case "enterTextFirstName":
				WebElement element = getElement(locatorType, locatorValue);
				element.sendKeys(data);
				break;
			case "enterTextLastName":
				WebElement element1 = getElement(locatorType, locatorValue);
				element1.sendKeys(data);
				break;
			case "clickDay":
				getElement(locatorType, locatorValue).click();
				break;
			case "clickMonth":
				getElement(locatorType, locatorValue).click();
				break;
			case "clickYear":
				getElement(locatorType, locatorValue).click();
				break;
			case "clickMale":
				getElement(locatorType, locatorValue).click();
				break;
			case "enterEmail":
				WebElement element2 = getElement(locatorType, locatorValue);
				element2.sendKeys(data);
				break;
			case "enterPassword":
				WebElement element3 = getElement(locatorType, locatorValue);
				element3.sendKeys(data);
				break;
			default:
				System.out.println("Invalid Keyword");
				break;
			}
			
		}
		System.out.println("Facebook Creating the account is completed");
		driver.quit();
	}

}