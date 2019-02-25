package selectdropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	@Test(priority=0)
	public void first(){
		System.out.println("first");
	}
@Test(priority=1)
public void second(){
	System.out.println("second");
}
@Test(priority=2)
public void third(){
	System.out.println("third");
}
/*good right*/
}