package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Facebookcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aravind");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("pree");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8056232323");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("aravind@19233");
		WebElement day1 = driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(day1);
		day.selectByVisibleText("19");
		WebElement month1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(month1);
		month.selectByVisibleText("Nov");
		WebElement year1 = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(year1);
		year.selectByVisibleText("1997");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();


	}

}
