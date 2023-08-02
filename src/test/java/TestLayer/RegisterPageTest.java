package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.Baseclass;
import PageLayer.RegisterPage;

public class RegisterPageTest extends Baseclass{

	// 1.mention preCondition
		@BeforeTest
		public static void setup() {
			intitialization();

		}

		// 2.Write Testcases with the help of @Test annotation and call methods froom
		// register Page class with the
		// help of registerPage class object name and pass the Test data at the time of
		// calling this method
		@Test
		public void validateResisterFunctionality() {
			RegisterPage register = new RegisterPage();
			register.contactInformationFunctionality("Shivay", "Sahu", "1123456", "Shiva@outlook.com");
		
			register.mailinIformatinFunctinality("Navimumbai", "ulwe", "maharashtra", "41256", "BHUTAN");
			
			register.userInformatinFunctionality("Shiva.com", "12345", "12345");
		}
		
		

		// 3.mention post condition

		@AfterTest
		public void tearDown() {

		}
	
}
