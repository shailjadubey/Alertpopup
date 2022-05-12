import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class programtotest {
public static void main(String[] args) throws InterruptedException
{System.setProperty("webdriver.chrome.driver", "C:\\Users\\shailja.dubey\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

//Launching google
driver.get("https://www.google.com");

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
