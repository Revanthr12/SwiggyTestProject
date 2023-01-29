package com.excel;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listener.class)
public class Runner {
	public WebDriver driver;
  @Test
  public void main() {
	  mainpage mainpagetest = new mainpage();
	  Writeexcel WExcel = new Writeexcel();
	  ReadExcel RExcel = new ReadExcel();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   mainpagetest.home(driver);
	   mainpagetest.loc(driver);
	   mainpagetest.search(driver);
	   ArrayList<String> itemlist = mainpagetest.item(driver);
	   ArrayList<String> pricelist = mainpagetest.price(driver);
        mainpagetest.addtocart(driver);
	   mainpagetest.update(driver);
	   WExcel.EnterExcel(itemlist, pricelist);
	   ArrayList<String> namex = RExcel.Readname();
	   ArrayList<String> pricex = RExcel.Readprice();
	   System.out.println("Reading from excel");
	   for (int index = 1; index <= 10; index++) {
		   System.out.println("value from Excel"+ "   "+ "value from web");
		   System.out.println(namex.get(index-1)+ "   "+ itemlist.get(index-1));
		   System.out.println(pricex.get(index-1)+ "   "+ pricelist.get(index-1)); 
	   }
  }
}
