package genericLibraries;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
		
	// dropdown
	public void dropDown(WebElement dropDown,String text) {
		Select s = new Select(dropDown);
		s.selectByVisibleText(text);
	}
	
	
	//mouse hover
	public void mouseHover(WebDriver driver, WebElement ele ) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	//right click
	public void rightClick(WebDriver driver ,WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();;
	}
	
	//drag n drop
		public void dragAndDrop(WebDriver driver ,WebElement src, WebElement dest) {
			Actions a = new Actions(driver);
			a.dragAndDrop(src, dest).perform();;
		}
	
		public void switchFrame(WebDriver driver) {
			driver.switchTo().frame(0);
		}
		
		public void switchBackFrame(WebDriver driver) {
			driver.switchTo().defaultContent();
		}
		
		public void alertpopupAccept(WebDriver driver) {
			driver.switchTo().alert().accept();;
		}
		
		public void alertpopupDismiss(WebDriver driver) {
			driver.switchTo().alert().dismiss();;
		}
		
		public void scroll(WebDriver driver, WebElement ele) {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("argument[0].ScrollIntoView", ele);
		}
		
}
