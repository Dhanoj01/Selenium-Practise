
public class Alerts {

  public static void main(String args[])
  {
     WebDriver driver = new ChromeDriver();
    driver.get("");
    driver.manage().window().maximise();

    //simple alert
    driver.findElement(By.xpath("fdinfdkj")).click();
    driver.switchTo().alert().accept();


    //confirm box alert
    driver.findElement(By.xpath("button[[]""ref)).click();
    driver.switchTo().alert().dismiss();
    
    //prompt alert
    driver.findElement(By.ClassName(alert-box)).click();
    driver.switchTo().alert().sendKeys("HII");
    driver.switchTo().alert().accept();

    driver.quit();
  
  }
}

