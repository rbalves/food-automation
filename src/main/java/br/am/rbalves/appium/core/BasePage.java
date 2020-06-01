package br.am.rbalves.appium.core;

import static br.am.rbalves.appium.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {
	
	public void writeText(By by, String text) {
		getDriver().findElement(by).sendKeys(text);
	}
	
	public void click(By by) {
		getDriver().findElement(by).click();
	}
	
	public String getText(By by) {
		return getDriver().findElement(by).getText();
	}
	
	public By getXpathEditTextByText(String text) {
		return By.xpath("//android.widget.EditText[@text='"+text+"']");
	}
	
	public By getXpathTextViewByText(String text) {
		return By.xpath("//android.widget.TextView[@text='"+text+"']");
	}
	
}
