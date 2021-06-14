package stepDefinition;


import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.hooks;

public class StepDefinition {
	WebDriver driver = hooks.driver;
	@Given("^Launch the eLearning portal$")
	public void launch_the_eLearning_portal() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://elearningm1.upskills.in/");
		driver.manage().window().maximize();
		
	}

	@When("^User clicked signup button$")
	public void user_clicked_signup_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://elearningm1.upskills.in/main/auth/inscription.php");
	}

	@And("^Create User and verify user created$")
	public void create_User_and_verify_user_created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Random rand = new Random();
		int rand_num = rand.nextInt(1000);
		String firstName = "SDET";
		String lastName = "User" + rand_num;
		System.out.println("Last name is "+lastName);
		System.out.println("User name is "+ firstName + " " + lastName);
		String UserName = firstName + "_" + lastName;
		String mailid = firstName + "@" + lastName + ".com";
		System.out.println("mailId is " + mailid);
		String password1 = "Password@sdet14";
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//First name
		WebElement fName = driver.findElement(By.xpath("//*[@id=\"registration_firstname\"]")); //xPath
		fName.findElement(By.xpath("/html/body/main/section/div/div[2]/div/form/fieldset/div[2]/div[1]/input")).sendKeys(firstName); //fullXPath
		//Last name
		WebElement lName = driver.findElement(By.xpath("//*[@id=\"registration_lastname\"]"));
		lName.findElement(By.xpath("/html/body/main/section/div/div[2]/div/form/fieldset/div[3]/div[1]/input")).sendKeys(lastName);
		//email
		WebElement email = driver.findElement(By.xpath("//*[@id=\"registration_email\"]"));
		email.findElement(By.xpath("/html/body/main/section/div/div[2]/div/form/fieldset/div[4]/div[1]/input")).sendKeys(mailid);
		//username		
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		userName.findElement(By.xpath("/html/body/main/section/div/div[2]/div/form/fieldset/div[5]/div[1]/input")).sendKeys(UserName);
		//password
		WebElement password = driver.findElement(By.xpath("//*[@id=\"pass1\"]"));
		password.findElement(By.xpath("/html/body/main/section/div/div[2]/div/form/fieldset/div[6]/div[1]/input")).sendKeys(password1);
		//confirm Password
		WebElement confirmpassword = driver.findElement(By.xpath("//*[@id=\"pass2\"]"));
		confirmpassword.findElement(By.xpath("/html/body/main/section/div/div[2]/div/form/fieldset/div[7]/div[1]/input")).sendKeys(password1);
		//phone
		WebElement phone = driver.findElement(By.xpath("//*[@id=\"registration_phone\"]"));
		phone.findElement(By.xpath("/html/body/main/section/div/div[2]/div/form/fieldset/div[8]/div[1]/input")).sendKeys("9876543210");
		//language
		Select language = new Select(driver.findElement(By.name("language")));
		language.selectByVisibleText("Galego");
		System.out.println("Selected Language is Galego");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		language.selectByVisibleText("English");
		System.out.println("Selected Language is English");		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//code
		WebElement code1 = driver.findElement(By.xpath("//*[@id=\"registration_official_code\"]"));
		code1.findElement(By.xpath("/html/body/main/section/div/div[2]/div/form/fieldset/div[10]/div[1]/input")).sendKeys("515515");
		//skype
		WebElement skypeId = driver.findElement(By.xpath("//*[@id=\"extra_skype\"]"));
		skypeId.findElement(By.xpath("/html/body/main/section/div/div[2]/div/form/fieldset/div[11]/div[1]/input")).sendKeys("skypeID");
		//linkedin url
		WebElement url = driver.findElement(By.xpath("//*[@id=\"extra_linkedin_url\"]"));
		url.findElement(By.xpath("/html/body/main/section/div/div[2]/div/form/fieldset/div[12]/div[1]/input")).sendKeys("http://www.linkedin.com/in/name");
		//Click Register button
		driver.findElement(By.xpath("//*[@id=\"registration_submit\"]")).click();;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(driver.getPageSource().contains("Dear " + firstName + " " + lastName + ",")){
			System.out.println("Dear " + firstName + " " + lastName + ", is present");
			}else{
			System.out.println("Dear " + firstName + " " + lastName + ", is absent");
			}

		
		if(driver.getPageSource().contains("Your personal settings have been registered.")){
			System.out.println("Your personal settings have been registered - is present");
			}else{
			System.out.println("Your personal settings have been registered - is absent");
			}
	   //Click profile > Inbox
		WebElement user_profile_photo = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/a/img"));
	   user_profile_photo.findElement(By.xpath("/html/body/main/header/nav/div/div[2]/ul[2]/li[2]/a/img")).click();
	   if(driver.getPageSource().contains(mailid)){
			System.out.println("Displayed mail id is same as the one specified during account creation");
			}else{
			System.out.println("displayed mail id is different compared to the one specified during account creation");
			}
	   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			   
	  
	  
	   
	}

	@And("^Send Mail$")
	public void send_Mail() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("/html/body/main/header/nav/div/div[2]/ul[2]/li[2]/ul/li[3]/a")).click(); // Click Inbox
		   try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/div[2]/div[1]/div/div[1]/a[1]/img")).click(); // Click Compose Message
		   try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	/*	   WebElement autoOptions= driver.findElement(By.className("select2-search__field"));
		   autoOptions.sendKeys("sdet");
		   List<WebElement> optionsToSelect = driver.findElements(By.className("select2-search__field"));
		   for(WebElement option : optionsToSelect){
		       System.out.println(option);
		       if(option.getText().contains("sdet")) {
		           System.out.println("Trying to select: "+"sdet");
		           option.click();
		           break;
		       }
		   }*/
		   
		  driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/div[2]/div/div[2]/form/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).click();
		  driver.findElement(By.className("select2-search__field")).sendKeys("SDET", Keys.RETURN);
		//  driver.findElement(By.className("select2-search__field")).sendKeys("SDET","\13");
		  
		   //driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/div[2]/div/div[2]/form/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys("SDET");
		   //driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/div[2]/div/div[2]/form/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys(Keys.ENTER);
		   try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		   
		 
		   driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/div[2]/div/div[2]/form/fieldset/div[2]/div[1]/input")).sendKeys("Test Mail");
		   try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		   
		//   driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,Keys.END);
		   driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/div[2]/div/div[2]/form/fieldset/div[7]/div[1]/button")).click();
		   driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div/div[2]/div/div[2]/form/fieldset/div[7]/div[1]/button")).click();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			   
		   
	}

	@Then("^Verify Acknowledge message$")
	public void verify_Acknowledge_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		   
		   String ackText = driver.findElement(By.xpath("/html/body/main/section/div/div[2]/div/div[1]")).getText();
		   if(ackText.equalsIgnoreCase("The message has been sent to Tester1 SDET (Tester1)")) {
			   System.out.println("Acknowledgement text is verified successfully");
		   }
		   else {
			   System.out.println("Acknowledgement text verification is failed");
		   }
	    
	}


}
