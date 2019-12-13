package com.search.getScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.getTitles.writeToFile.defineDriver;

public class searchGetScreenshot extends defineDriver {
	@Test(priority=3)
	public void searchQAGetScreenshot() throws IOException {
		//Click ProQuest link
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/div/cite")).click();
		//Click search button, type QA and search
		driver.findElement(By.xpath("//*[@id=\"main-navbar-collapse\"]/ul[1]/li[8]/a/i")).click();
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/div/span[1]/input[2]")).sendKeys("QA");
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/div/span[2]/button/i")).click();
		//Take a screenshot
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Temp\\ProQuestQA.jpg"));
		//Close browser
		driver.close();
	}
}
