package test;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testbaidu {
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.baidu.com");
		driver.findElement(By.cssSelector("#kw")).sendKeys("hello world");
		driver.findElement(By.xpath("//*[@id=\"su\"]")).click();

	}
}
