package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public WebDriver driver;
	public Properties prep;
	public WebDriver initiadriver() throws IOException
	{

 prep=new Properties();
	FileInputStream nor=new FileInputStream("C:\\Users\\15199\\Downloads\\Firstpractice\\src\\main\\java\\Resources\\record.properties");
	//FileInputStream nor=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\record.properties");
	prep.load(nor);
	//prep.getProperty("browser");
	String browsername=System.getProperty("browser");
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\15199\\Music\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
	return driver;
}
	
}
