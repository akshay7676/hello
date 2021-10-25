package hello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.facebook.com/");
		
		// = dr.findElement(By.xpath("//input[@id= 'email']"));
		
		//el.sendKeys("9742462670");
		
		WebElement el = dr.findElement(By.id("pass"));
		el.sendKeys("9742462670");
		
		//dr.findElement(By.id("u_0_d_/D"));
		//el.click();

	}

}
