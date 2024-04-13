package test.AutomationBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsExample extends BaseDriver	 {
	
	@Test
	public void testLocators() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://www.shohoz.com/contact-us");
		//driver.get("https://member.daraz.com.bd/user/login");
		Thread.sleep(5000);
		
		//By ID
//		WebElement bus = driver.findElement(By.id("purpose"));
//		bus.click();
//		Thread.sleep(5000);
		
		//By name
//		WebElement bus = driver.findElement(By.name("purpose"));
//		bus.click();
//		Thread.sleep(5000);
		
		//By LinkText
//		WebElement launch = driver.findElement(By.linkText("Launch"));
//		launch.click();
//		Thread.sleep(3000);
		
		//Partial LinkText
//		WebElement launch1 = driver.findElement(By.partialLinkText("Laun"));
//		launch1.click();
//		Thread.sleep(3000);

		//By Class
//		WebElement login = driver.findElement(By.className("next-btn"));
//		login.click();	
//		Thread.sleep(3000);
		
		//By Class
//		WebElement send = driver.findElement(By.className("btn"));
//		send.click();	
//		Thread.sleep(3000);
		/*
		* Custom Xpath -> 
		* tagName[@attribute='value']
		* tagName[contains(text().'text')]
		*//*[contains(text().'text')]
		* //form@id=form_contact_us']/div[3]/div[1]/label/span
		*/
		//
//		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
//		email.sendKeys("test@noemail.com");	
//		Thread.sleep(3000);
		
		//css -> elementName[attributeName='attributeValue']
		//usually we don't use css
		WebElement name = driver.findElement(By.cssSelector("input[name='dest_form']"));
		name.click();
		Thread.sleep(3000);
		
		
	}

}
