package org.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91956\\eclipse-workspace\\JavaScript\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
//		WebElement linkAddress = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
//		js.executeScript("arguments[0].scrollIntoView(true)",linkAddress);
//		
//		String text = linkAddress.getText();
//		System.out.println(text);

//		WebElement linkSharePage = driver.findElement(By.xpath("//div[@class='share-link-description']"));
//		js.executeScript("arguments[0].scrollIntoView(true)", linkSharePage);
//		Thread.sleep(3000);
//		
//		WebElement linkLatestTutorials = driver.findElement(By.xpath("(//div[@class='wpb_wrapper'])[2]"));
//		js.executeScript("arguments[0].scrollIntoView(false)", linkLatestTutorials);
		
//		WebElement linkFramework = driver.findElement(By.xpath("(//div[@class='card'])[130]"));
//		js.executeScript("arguments[0].scrollIntoView(true)", linkFramework);
		
		
//		WebElement textUserName = driver.findElement(By.id("email"));
//		js.executeScript("arguments[0].setAttribute('value','robert.oral1')", textUserName);
//		
//		WebElement textPassword = driver.findElement(By.id("pass"));
//		js.executeScript("arguments[0].setAttribute('value','Robert123#')", textPassword);
//		
//		WebElement btnLogin = driver.findElement(By.name("login"));
//		js.executeScript("arguments[0].click()", btnLogin);
		
		
//		WebElement textUser = driver.findElement(By.id("username"));
//		js.executeScript("arguments[0].setAttribute('value','robert.oral1')", textUser);
//		
//		WebElement textPass = driver.findElement(By.id("password"));
//		js.executeScript("arguments[0].setAttribute('value','password')", textPass);
//		
//		WebElement btnLogin = driver.findElement(By.id("login"));
//		js.executeScript("arguments[0].click()", btnLogin);
//		
//		
		
		
		WebElement textUseName = driver.findElement(By.xpath("(//div[@class='IiD88i _351hSN'])[1]"));
		js.executeScript("arguments[0].setAttribute('value','robert68@gmail.com')", textUseName);
		
		Thread.sleep(5000);
		
		WebElement textPassword = driver.findElement(By.xpath("(//div[@class='IiD88i _351hSN'])[2]"));
		js.executeScript("arguments[0].setAttribute('value','robert')", textPassword);
		Thread.sleep(5000);
		WebElement btnLogin = driver.findElement(By.xpath("//button [@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		js.executeScript("arguments[0].click()", btnLogin);
		Thread.sleep(5000);
		String attribute = textUseName.getAttribute("value");
		System.out.println(attribute);
		
		String attribute2 = textPassword.getAttribute("value");
		System.out.println(attribute2);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
