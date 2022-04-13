package Homeproject.Firstpractice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.Baseclass;
import pageobjects.Initialpage;

public class FirstpageTest extends Baseclass {
public WebDriver driver;
	@BeforeTest
	public void clickonmenu() throws IOException
	{
		driver=initiadriver();
	driver.get(prep.getProperty("URL"));
	
	}
	@Test
	public void firstclick()
	{
	Initialpage work=new Initialpage(driver);
	work.threedots().click();
	}
	
	@Test
	public void newissue()
	{
		System.out.println("new issue created");
	}
}
