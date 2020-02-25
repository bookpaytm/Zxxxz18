package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pageobject {
	
	
	
	
WebDriver driver;
public Pageobject(WebDriver driver){
	this.driver=driver;
}
@FindBy(name="username") WebElement user;
@FindBy(name="password") WebElement pass;
@FindBy(id="tdb1") WebElement button;
@FindBy(linkText="Online Catalog") WebElement online;
@FindBy(linkText="create an account") WebElement account;
@FindBy(name="gender") WebElement gender1;
@FindBy(name="firstname") WebElement first1;
@FindBy(name="lastname") WebElement last1;
@FindBy(name="dob") WebElement dob1;
@FindBy(name="email_address") WebElement email1;
@FindBy(name="company") WebElement company1;
@FindBy(name="street_address") WebElement street1;
@FindBy(name="suburb") WebElement suburb1;
@FindBy(name="postcode") WebElement postcode1;
@FindBy(name="city") WebElement city1;
@FindBy(name="state") WebElement state1;
@FindBy(name="country") WebElement country1;
@FindBy(name="telephone") WebElement telephone1;
@FindBy(name="fax") WebElement fax1;
@FindBy(name="newsletter") WebElement letter1;
@FindBy(name="password") WebElement pass1;
@FindBy(name="confirmation") WebElement confir1;
@FindBy(id="tdb4") WebElement button2;
public void Gcrit(String Uname,String pwd,String first2,String last2,String dob2,String email2,String company2,String street2,String suburb2,String postcode2,String city2,String state2,String country2,String telephone2,String fax2,String pass2,String confir2){
user.sendKeys(Uname);
pass.sendKeys(pwd);
button.click();
online.click();
account.click();
first1.sendKeys(first2);
last1.sendKeys(last2);
dob1.sendKeys(dob2);
company1.sendKeys(company2);
street1.sendKeys(street2);
suburb1.sendKeys(suburb2);
postcode1.sendKeys(postcode2);
city1.sendKeys(city2);
state1.sendKeys(state2);
country1.sendKeys(country2);
telephone1.sendKeys(telephone2);
fax1.sendKeys(fax2);
letter1.click();
pass1.sendKeys(pass2);
confir1.sendKeys(confir2);
button2.click();
}

}
