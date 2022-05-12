import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertpopupforff {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.edge.driver","C:\\Users\\shailja.dubey\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			driver.findElement(By.xpath("//input[@name='alert']")).click();
			Alert alert = driver.switchTo().alert();
			Thread.sleep(3000);
			alert.accept();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='confirmation']")).click();
			Alert alert2 = driver.switchTo().alert();
			Thread.sleep(3000);
			alert2.accept();
}
}