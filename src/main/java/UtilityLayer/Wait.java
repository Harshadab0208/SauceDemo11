package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass
{
	public static WebElement visibilityStatus(WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Waitwb =  wait.until(ExpectedConditions.visibilityOf(wb));
		return Waitwb;
	}

	public static List<WebElement> VisibilityOfAllElements(WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		List<WebElement> Waitwb =  wait.until(ExpectedConditions.visibilityOfAllElements(wb));
		return Waitwb;
	}

	public static Alert AlertIsPresent(WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Alert  Waitwb =  wait.until(ExpectedConditions.alertIsPresent());
		return Waitwb;
	}
	
	public static void sendKeys(WebElement wb,String value)
	{
		visibilityStatus(wb).sendKeys(value);
	}
	
	public static void click(WebElement wb)
	{
		visibilityStatus(wb).click();
	}

	public static void clear(WebElement wb)
	{
		visibilityStatus(wb).clear();
	}

	public static String getText(WebElement wb, String value)
	{
		return visibilityStatus(wb).getText();
	}

	public static String getAttribute(WebElement wb, String keyName)
	{
		return visibilityStatus(wb).getAttribute(keyName);
	}

	public static boolean isSelected(WebElement wb)
	{
		return visibilityStatus(wb).isSelected();
	}

	

}

