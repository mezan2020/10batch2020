package automationselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class projectzoopla {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");      
	     WebDriver driver = new ChromeDriver();//up casting
	     driver.get("https://www.zoopla.co.uk/");// mostly 
	     driver.manage().window().maximize();
	     
	     WebElement button =driver.findElement(By.xpath("//*[@class=\"ui-button-primary ui-cookie-accept-all-medium-large\"]"));
	     ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", button);
	     button.click();
	     	     
	     WebElement signBtn =driver.findElement(By.xpath("//*[@data-testid=\"header-profile-sign-in\"]"));
	     ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", signBtn);
	     signBtn.click();
	     
	     
	     WebElement email =driver.findElement(By.xpath("//*[@id='signin_email']"));
	     ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid green'", email);
	     email.sendKeys("mezankhan07@yahoo.com");
	     
	     
	     WebElement password =driver.findElement(By.xpath("//*[@id='signin_password']"));
	     ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid blue'", password);
	     password.sendKeys("mezan123");
	     
	     
	     WebElement finalsignBtn =driver.findElement(By.xpath("//*[@id='signin_submit']"));
	     ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", finalsignBtn);
	     finalsignBtn.click();



	     
	     
	}
		
	}


