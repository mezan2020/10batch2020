package automationselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {
	public static void main(String[] args) {
	
   
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");      
	     WebDriver driver = new ChromeDriver();//up casting
	     driver.get("http://automationpractice.com/index.php");// mostly 
	     driver.manage().window().maximize();
	    
	     //xpath method formula starts-with signing button
	     
	     WebElement signBtn =driver.findElement(By.xpath("//*[starts-with(@class,'login')]"));
	     ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", signBtn);
	     signBtn.click();
	     
	   //xpath method formula contains signing button
	     //WebElement signBtn =driver.findElement(By.xpath("//*[contains(@class,'login')]"));
	     //((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", signBtn);
	     //signBtn.click();
	     
	   //xpath normal formula signing button
	    // WebElement signBtn =driver.findElement(By.xpath("//*[@class='login']"));
	     //((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", signBtn);
	     //signBtn.click();
	     
	     WebElement email =driver.findElement(By.xpath("//*[@id='email']"));
	     ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid green'", email);
	     email.sendKeys("sarowerny@gmail.com");
	     //password
	     
	     WebElement password =driver.findElement(By.xpath("//*[@id='passwd']"));
	     ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid blue'", password);
	     password.sendKeys("student");
	     
	     //password.submit();
	     WebElement finalsignBtn =driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
	     ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", finalsignBtn);
	     finalsignBtn.click();
	}
}
