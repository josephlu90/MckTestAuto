apackage MckssnTestAuto.com.MckssnTestAuto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--start-maximized");
    	
    	WebDriver driver = new ChromeDriver(options);
    	WebDriverWait wait = new WebDriverWait(driver, 20);
    	Actions action = new Actions(driver);
       
       driver.get("https://devwcm-preview.mckesson.com/portal/site/smo");
       System.out.println("Browser opened");
       //WebElement LoginForm;
       
       //LoginForm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("class[@login-form]")));
       
       //Fill login fields  ---------------------------------------------------------------------------
       driver.findElement(By.id("username")).sendKeys("devngp02");
       driver.findElement(By.id("password")).sendKeys("Password4");
       driver.findElement(By.className("button")).click();
       System.out.println("Account accessed");
       
       
       //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("a[@title='Ordering']")));
       //Find and click to access NGO ------------------------------------------------------------------------------
       /*WebElement NGO =  1..*/
       driver.findElement(By.xpath("//*[@id=\'wcm-left180\']/div[4]/ul[1]/li[1]/a")).click();
       System.out.println("NGO opened");
       /*..1 action.moveToElement(NGO).click().perform();
       driver.findElement(By.xpath("//*[@id='lnk9']/table/tbody/tr/td[1]/div/a")).click();*/
      
       //Change to catalog on NGO
       driver.findElement(By.xpath("//*[@id=\"menu-link-catalog-search\"]")).click();
       System.out.println("Catalog section opened");
       
       
      //Cambiar mando al frame de alerta, ¡¡La alerta no es frame ni alert!!
      driver.switchTo().activeElement().getAttribute("k-widget k-window dialog-window dialog-overlay");
      
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //Element Alert btnCancel--------------------------------------------------------------------
      driver.switchTo().parentFrame().close();
      //driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/span/button[2]")).click();
      //Element Alert btnClose-----------------------------------------------------------------------
      //driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/a")).click();
      
      
      driver.navigate().refresh();
       
    }
}