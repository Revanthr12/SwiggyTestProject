package com.excel;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainpage {
	
public  void home(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String url ="https://www.swiggy.com/";
	driver.get(url);
}
public  void loc(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("location")).click();
	driver.findElement(By.id("location")).sendKeys("Cessna business park");
	driver.findElement(By.xpath("//span[contains(@class,'icon-location')]//parent::button")).click();
	
}
public  void search(WebDriver driver){
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div/div/ul/li[5]/div/a/span[2]")).click();
	driver.findElement(By.xpath("//*[@class=\"_2FkHZ\"]")).sendKeys("noodles");
	driver.findElement(By.xpath("//*[@class=\"_1VxLu\"]//parent::button")).click();	
}

public  ArrayList<String> item(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	List<WebElement> prod = driver.findElements(By.xpath("//div[contains(@class,'styles_containerInner')]//h3[contains(@class,'styles_itemNameText')]"));
    ArrayList<String> namelist = new ArrayList<String>();
	for(WebElement Prod : prod) {
        String name = Prod.getText();
        namelist.add(name);
        System.out.println(name);
    }
	return namelist;
}
public ArrayList<String> price (WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 List<WebElement> price = driver.findElements(By.xpath("//div[contains(@class,'styles_containerInner')]//span[contains(@class,'styles_price')]//span[contains(@class,'rup')]"));
     
     ArrayList<String> pricelist = new ArrayList<String>();
        for(WebElement Price :price) {
            String prices = Price.getText();
            pricelist.add(prices);
            System.out.println(prices);         
        }
        return pricelist;
}
public void addtocart(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//*[@id=\'root\']/div[1]/div[1]/div[2]/div/div/div[4]/div[1]/div/div[2]/div/div/div[2]/div[2]/div/div[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"modal-placeholder\"]/div/div/div[2]/div/div[3]")).click();
	
	}

public  void update(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	driver.findElement(By.xpath("//div[@class='_1ds9T']")).click();
	driver.findElement(By.xpath("//button[@class=\"_2-MHS\"]\r\n")).click();
	driver.findElement(By.xpath("//div[@class='_1ds9T']")).click();
	driver.findElement(By.xpath("//button[@class=\"_2-MHS\"]\r\n")).click();		
	driver.findElement(By.xpath("//*[@class='_29Y5Z']")).click();
	
}
}


