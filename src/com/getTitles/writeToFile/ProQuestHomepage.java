package com.getTitles.writeToFile;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProQuestHomepage extends defineDriver {
	@Test(priority=1)
	public void ProQuestHome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("ProQuest\n");
	}
}