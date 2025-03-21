package BasePages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

import Base.Baseclass;

public class Homepage extends Baseclass {
	 private By Searchpage = By.xpath("//input[@id='inputValEnter']");
	 
	 @BeforeMethod
	 public void Entertext(String Text) {
		WebElement Searchbox =  driver.findElement(Searchpage);
		Searchbox.sendKeys(Text);
	 }
	

}
