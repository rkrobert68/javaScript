package org.JavaScript;


import java.util.ArrayList;
import java.util.Set;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91956\\eclipse-workspace\\JavaScript\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
//		
////		WebElement textSearch = driver.findElement(By.xpath("//input[@class='col-xs-20 searchformInput keyword']"));
////		textSearch.sendKeys("Iphones 7");
////		
////		WebElement btnSearch = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
////		btnSearch.click();
////		
////		WebElement linkIphones = driver.findElement(By.xpath("(//div[@class='product-tuple-description '])[1]"));
////		linkIphones.click();
////		
////		Set<String> allWid = driver.getWindowHandles();
////		
////		List<String> li=new ArrayList<String>();
////		li.addAll(allWid);
////		
////		driver.switchTo().window(li.get(1));
////		
////		WebElement linkAdd = driver.findElement(By.xpath("//div[@class='mmm col-xs-6 btn btn-xl btn-theme-secondary rippleWhite buyLink']"));
////		linkAdd.click();
////		
////		WebElement linkMoney = driver.findElement(By.xpath("//div[@class='you-pay']"));
////		
////		String text = linkMoney.getText();
////		System.out.println(text);
//
//		
//		
//		WebElement textSearch = driver.findElement(By.id("twotabsearchtextbox"));
//		textSearch.sendKeys("Iphones");
//		
//		WebElement btnSearch = driver.findElement(By.id("nav-search-submit-button"));
//		btnSearch.click();
//		
//		WebElement linkIphones = driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal'])[2]"));
//		
//		
//		Actions a=new Actions(driver);
//		
//a.contextClick(linkIphones).perform();
//	
//		Robot r=new Robot();
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
//		Thread.sleep(10000);
//		
//		Set<String> allWid = driver.getWindowHandles();
//		
//		
//		List<String> li =new ArrayList<String>();
//		
//		li.addAll(allWid);
//		
//		
//		
//		driver.switchTo().window(li.get(1));
//		
//		WebElement linkPrice = driver.findElement(By.id("priceblock_dealprice"));
//		
//		String text = linkPrice.getText();
//		System.out.println(text);
//		
//		
		
		
		
		String pWid = driver.getWindowHandle();
		System.out.println(pWid);
		
		
		Set<String> allWid = driver.getWindowHandles();
		for (String s : allWid) {
		System.out.println(s);	
		}
		
		
		
		
		
		
		
	}

}
