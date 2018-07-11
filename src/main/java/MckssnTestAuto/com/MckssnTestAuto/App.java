package MckssnTestAuto.com.MckssnTestAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!  branch
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       WebDriver driver = new ChromeDriver();
       //WebDriverWait wait = new WebDriverWait(driver, 20);
       Actions action = new Actions(driver);
       
       driver.get("https://devwcm-preview.mckesson.com/portal/site/smo");
       
       System.out.println("Browser opened");
       driver.findElement(By.id("username")).sendKeys("devngp06");
       driver.findElement(By.id("password")).sendKeys("Password1");
       driver.findElement(By.className("button")).click();
       System.out.println("Account accessed");
       //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("a[@title='Ordering']")));
       WebElement NGO = driver.findElement(By.xpath("//*[@id=\"wcm-left180\"]/div[4]/ul[1]/li[1]"));
       action.moveToElement(NGO).click();
       driver.findElement(By.cssSelector("#wcm-left180 > div.wcm-lnav > ul:nth-child(2) > li:nth-child(1) > a")).click();
       System.out.println("NGO opened");
    
       //overwindow detected
       driver.findElement(By.xpath("/html/body/div[2]"));
       System.out.println("superimposed screen");
       
       //dialog window detected
       driver.findElement(By.xpath("/html/body/div[3]"));
       System.out.println("Warning message");
       
       driver.switchTo().window("Alert");
       driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]/span/button[1]")).click();
       System.out.println("okay");
    }
}
