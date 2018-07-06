package MckssnTestAuto.com.MckssnTestAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       WebDriver driver = new ChromeDriver();
       WebDriverWait wait = new WebDriverWait(driver, 20);
       Actions action = new Actions(driver);
       
       driver.get("https://devwcm-preview.mckesson.com/portal/site/smo");
       
       System.out.println("Browser opened");
      // WebElement LoginForm;
       
     //  LoginForm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("class[@login-form]")));
       
       driver.findElement(By.id("username")).sendKeys("devngp06");
       driver.findElement(By.id("password")).sendKeys("Password1");
       driver.findElement(By.className("button")).click();
       System.out.println("Account accessed");
       //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("a[@title='Ordering']")));
       WebElement NGO = driver.findElement(By.id("mmlink0"));
       action.moveToElement(NGO).click().perform();
       driver.findElement(By.xpath("//*[@id='lnk9']/table/tbody/tr/td[1]/div/a")).click();
       //System.out.println("NGO opened");
       
       
    }
}
