package br.am.rbalves.appium.page;

import br.am.rbalves.appium.core.BasePage;

public class MainPage extends BasePage{
	
	public void clickButton(String text) {
		click(getXpathTextViewByText(text));
	}
	
	public void goRegisterPage() {
		this.clickButton("I AM NEW");
	}
}
