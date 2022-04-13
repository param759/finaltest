package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Initialpage {

	public WebDriver driver;

	public Initialpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	By menu=By.xpath("//div[@class=\"hnf-page-container__aside\"]/button[@title=\"Menu\"]");
	
	public WebElement threedots()
	{
		return driver.findElement(menu);
	}
}
