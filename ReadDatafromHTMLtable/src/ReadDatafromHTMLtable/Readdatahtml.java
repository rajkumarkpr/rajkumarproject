package ReadDatafromHTMLtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Readdatahtml {
@Test
public void ReaddataFromhtml()
{ 
//System.getProperty("webdriver.gecko.driver","C:\\Seleniumjava\\drivers\\geckodriver.exe");
//WebDriver dr=new FirefoxDriver();

System.getProperty("webdriver.chrome.driver","C:\\Seleniumjava\\drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver dr=new ChromeDriver();

	dr.get("https://www.livechennai.com/gold_silverrate.asp");
System.err.println(dr.getTitle());

//get cell value from html/web table

System.out.println(dr.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td/div[2]/table[1]/tbody/tr[11]/td[2]/font")));

//row count


//cell count
}
}
