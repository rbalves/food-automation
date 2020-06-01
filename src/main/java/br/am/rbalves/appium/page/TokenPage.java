package br.am.rbalves.appium.page;

import org.openqa.selenium.By;

import br.am.rbalves.appium.core.BasePage;

public class TokenPage extends BasePage{
	
	public void clickButton(String text) {
		click(getXpathTextViewByText(text));
	}
	
	public void clickNumber(String value) {
		click(By.xpath("//android.widget.TextView[@text='SUBMIT CODE']/..//following-sibling::android.view.ViewGroup//android.widget.TextView[@text='"+value+"']"));
	}
	
	public void submitCode(String token) {
		
		String tokenArray[] = new String[token.length()];
		tokenArray = token.split("");
		
		for(int i = 0; i < token.length(); i++) {
			this.clickNumber(tokenArray[i]);
		}
		
		this.clickButton("SUBMIT CODE");
	}
	
}
