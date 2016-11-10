import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LogoutTest {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	//Login
	    driver.findElement(By.id("email")).sendKeys("hardik@facebook.com");
	    driver.findElement(By.id("pass")).sendKeys("hardik1234");
		driver.findElement(By.id("loginbutton")).click();
	//Mouse over on logOut drop down menu icon,then click logout
		WebElement mouseOverEle = driver.findElement(By.id("pageLoginAnchor"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseOverEle).click().perform();
    //click for logout
		driver.findElement(By.xpath("//input[@value='Log Out']")).click();
		

	}

}
