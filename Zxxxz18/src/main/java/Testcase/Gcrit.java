package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Baseclass;
import Pages.Pageobject;
import Utilities.Browserfactory;

public class Gcrit  extends Baseclass{
	
	
	
	
	

@Test
public void launchapplication(){
logger=report.createTest("Gcrit");
System.out.println(driver.getTitle());
Pageobject login=PageFactory.initElements(driver, Pageobject.class);
logger.info("pass");
login.Gcrit(excel.getString("login", 0, 0), excel.getString("login", 0, 1), excel.getString("login", 0, 2), excel.getString("login", 0, 3), excel.getString("login", 0, 4), excel.getString("login", 0, 5), excel.getString("login", 0,6), excel.getString("login", 0, 7), excel.getString("login", 0, 8), excel.getString("login", 0, 9), excel.getString("login", 0, 10), excel.getString("login", 0, 11), excel.getString("login", 0, 12), excel.getString("login", 0, 13), excel.getString("login", 0, 14), excel.getString("login", 0, 15), excel.getString("login", 0, 16));
logger.pass("excel sheet is pass");
}


}
