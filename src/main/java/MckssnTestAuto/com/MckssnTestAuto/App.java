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
       //driver.findElement(By.cssSelector("body > div:nth-child(22) > div.action-bar > div > span > button.btn-act-bar-secondary")).click();
       //driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/span/button[1]")).click();
       //String h1 = driver.getWindowHandle();// original handle
       //System.out.println("First handle = " + h1);
       //WebElement clickhere = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/span/button[1]"));
       //clickhere.click();//moved to a new child page<

       //String h2 = driver.getWindowHandle();
       //System.out.println("Second handle = " + h2);//
       //WebElement clickhere2 = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/span/button[1]"));
       //clickhere2.click();//moved to a new child page<
    }
}
