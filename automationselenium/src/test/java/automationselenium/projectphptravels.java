package automationselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class projectphptravels {
public static void main(String[] args) {
	
	
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");      
    WebDriver driver = new ChromeDriver();//up casting
    driver.get("https://www.phptravels.net/home/");// mostly 
    driver.manage().window().maximize();
    
    WebElement button =driver.findElement(By.xpath("//*[@class=\"bx bx-user\"]"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", button);
    button.click();
    
    
    		
    WebElement button1 =driver.findElement(By.xpath("//*[@class=\"dropdown-item active tr\"]"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", button1);
    button1.click();
    
    WebElement email =driver.findElement(By.xpath("//*[@ type=\"email\"]"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid green'", email);
    email.sendKeys("mezankhan07@yahoo.com");
    
    
    WebElement password =driver.findElement(By.xpath("//*[@type=\"password\"]"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid blue'", password);
    password.sendKeys("mezan123");
    
    
    WebElement finalsignBtn =driver.findElement(By.xpath("//*[@type=\"submit\"]"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", finalsignBtn);
    finalsignBtn.click();
    


    
    
}
	
	
	
	
	
}



