package testcase;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstMaven {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		String Title = driver.getTitle();
		
		System.out.println(Title);
		
		System.out.println(Title.length());
		
		driver.close();
		
		driver.quit();
		
		

	}

}
