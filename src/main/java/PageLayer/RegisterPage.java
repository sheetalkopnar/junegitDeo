package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.Baseclass;

public class RegisterPage extends Baseclass{

	//1.Locate the element with the help of POM with pageFactory 
		//and declare object reopsitory as global private webelement variables
		@FindBy(name="firstName")
		private WebElement firstname; 
		
		@FindBy(name="lastName")
		private WebElement Lastname; 
		
		@FindBy(name="phone")
		private WebElement Phone; 
		
		@FindBy(name="userName")
		private WebElement Username; 
		
		//Contact mailing informtion object repository
		
		@FindBy(name="address1")
		private WebElement add; 
		
		@FindBy(name="city")
		private WebElement City;  
		
		@FindBy(name="state")
		private WebElement state;
		
		@FindBy(name="postalCode")
		private WebElement code; 
		
		@FindBy(name="country")
		private WebElement contry; 
		
		//USER information object repositry
		@FindBy(name="email")
		private WebElement email; 
		
		@FindBy(name="password")
		private WebElement password; 
		
		@FindBy(name="confirmPassword")
		private WebElement confPass; 
		
		@FindBy(name="submit")
		private WebElement submit; 
		
		//2initialize the object repository with the help of page Factory class in constructor
		
		public RegisterPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		//3.write associated functionality method without entering the test data
		
		public void contactInformationFunctionality(String fname, String lname, String mob, String uname)
		{
			firstname.sendKeys(fname);
			Lastname.sendKeys(lname);
			Phone.sendKeys(mob);
			Username.sendKeys(uname);
		
		}

		public void mailinIformatinFunctinality(String Addres, String City1 , String State1 , String Code1, String Country1)
		{
			add.sendKeys(Addres);
			City.sendKeys(City1);
			state.sendKeys(State1);
			code.sendKeys(Code1);
			
			Select sel = new Select(contry);
			sel.selectByVisibleText(Country1);
		}
		
		public void userInformatinFunctionality(String Email , String Password, String ConfirmPass)
		{
			email.sendKeys(Email);
			password.sendKeys(Password);
			confPass.sendKeys(ConfirmPass);
			submit.click();
		}
	
}
