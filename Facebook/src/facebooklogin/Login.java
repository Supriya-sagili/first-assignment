package facebooklogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rani Sagili\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("sagilisupriya@gamil.com");
	    driver.findElement(By.id("pass")).sendKeys("14bc1@0528");
	    driver.findElement(By.name("login")).click();
	    System.out.println(driver.getTitle());
	}

}
