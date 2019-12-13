package com.getTitles.writeToFile;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class getTitlesWriteToFile extends defineDriver {
	@Test(priority=2)
	public void getTitlesWriteToAfile() {
		//Get the titles
				List <WebElement> postTitles= driver.findElements(By.className("S3Uucc"));
				  for (WebElement eachTitle : postTitles) {
				    //System.out.println(eachTitle.getText());
				  	String innerText = eachTitle.getText();
					String idForTxtFile = new SimpleDateFormat("dd.MM.yyyy_HH.mm.ss").format(new Date());
					File file = new File("C:\\Temp\\InnerTextFile.txt" + idForTxtFile);
				    //Write to a file
				   try {
					  FileWriter fw = new FileWriter(file,true);
					  String lineSeparator = System.getProperty("line.separator");
					  String[] output = innerText.split ("\n");
					  
					  for (int i=0; i<=output.length-1; i++) {
						  fw.write(output[i]);
						  fw.write(lineSeparator); 
					  }
					  fw.flush();
					  fw.close();
				   }catch(Exception e) {
					  System.out.println(e);
					  e.printStackTrace();
					  System.out.println(e.getLocalizedMessage());
				 }
		    }
	}
}
