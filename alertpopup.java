//Program to test alert popup in edge 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class alertpopup {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.edge.driver", "C:\\Users\\shailja.dubey\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    WebDriver driver=new EdgeDriver();
    driver.manage().window().maximize();
    driver.get("https://nxtgenaiacademy.com/alertandpopup/");
    Thread.sleep(1000);
    WebElement alertbutton=driver.findElement(By.xpath("//button[@name='alertbox']"));
    alertbutton.click();
    System.out.println("alert box click to open alert popup ");
    Alert a=driver.switchTo().alert();
    String s=driver.switchTo().alert().getText();
    System.out.println("alert message  - "+s);
    a.accept();
    System.out.println("Alert popup accept");
    
}
}
