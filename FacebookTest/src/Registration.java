import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Registration {

	public static void main(String[] args) {
	
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium Driver jars\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("hardik@facebook.com");
	    driver.findElement(By.id("pass")).sendKeys("");
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.id("u_0_1")).sendKeys("Hardik");
		driver.findElement(By.id("u_0_3")).sendKeys("Patel");
		driver.findElement(By.id("u_0_5")).sendKeys("xxx-xxx-xxxx");
		driver.findElement(By.id("u_0_8")).sendKeys("xxx-xxx-xxxx");
		driver.findElement(By.id("u_0_a")).sendKeys("hardik124");
		driver.findElement(By.id("day")).sendKeys("21");
		driver.findElement(By.id("month")).sendKeys("July");
		driver.findElement(By.id("year")).sendKeys("1993");
		driver.findElement(By.id("u_0_e")).click();
		driver.findElement(By.id("u_0_i")).click();
		driver.findElement(By.xpath(".//*[@name='code']"));

	}

}
