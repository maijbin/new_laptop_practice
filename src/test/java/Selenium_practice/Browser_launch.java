package Selenium_practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch {

	public static void main(String[] args) {

		//Launching browser
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://chatgpt.com/");
		
		//opening URL
		driver.get("https://www.opencart.com/");
		
		//getting title
		String act_title=driver.getTitle();
		if(act_title.equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("test passed");
		}
		
		else
		{
			System.out.println("test failed");
		}
		
		//closing the current url
		//driver.close();
		
		//closing all url and browser
		driver.quit();
	}

}
