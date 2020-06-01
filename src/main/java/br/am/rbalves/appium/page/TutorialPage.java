package br.am.rbalves.appium.page;

import br.am.rbalves.appium.core.BasePage;

public class TutorialPage extends BasePage{
	
	public void clickButton(String text) {
		click(getXpathTextViewByText(text));
	}
	
	public void advanceTutorial() {
		for(int i = 0; i < 3; i++) {
			this.clickButton("NEXT");
		}
		this.clickButton("DONE");
	}
	
}
