package test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import element.Metroelement;



public class metrotest {
	@Test
	public void metroTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "webdrivers//chromedriver.exe");
		 ChromeDriver chromedriver = new ChromeDriver();
			chromedriver.manage().window().maximize();
			Metroelement obj = new Metroelement(chromedriver);
			
			//metro page login
			chromedriver.get("https://metrotarkari.com/");
			Thread.sleep(2000);

			//locate the menu to hover over using its xpath
		       WebElement menu = chromedriver.findElement(By.xpath("/html/body/header/div[2]/div[2]/div/div/div/div/nav/ul/li[2]/a[text()[contains(.,'Categories')]]"));
		     //Initiate mouse action using Actions class
		       Actions builder = new Actions(chromedriver);
		    // move the mouse to the earlier identified menu option
		       builder.moveToElement(menu).build().perform();
		       Thread.sleep(2000);

		 
		     
//			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/header/div[2]/div[2]/div/div/div/div/nav/ul/li[2]/ul/li[1]/a")));
		     //locate the menu to hover over using its xpath
		       WebElement element2 = chromedriver.findElement(By.xpath("/html/body/header/div[2]/div[2]/div/div/div/div/nav/ul/li[2]/ul/li[1]/a"));
		       //Initiate mouse action using Actions class
		       Actions builder1= new Actions(chromedriver);
			    // move the mouse to the earlier identified menu option
		       builder1.moveToElement(element2).build().perform();
		       Thread.sleep(2000);
//		       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='main-menu']//nav//ul//li[@class='menu-item-has-children']//ul[@class='sub-menu']//li[@class='menu-item-has-children']//ul[@class='sub-menu']//li//a[contains(text(),'Fresh Vegetables')]")));
		       obj.vegetableselement();
		       Thread.sleep(3000);
		       chromedriver.quit();
	}
	
	

}
