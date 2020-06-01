package br.am.rbalves.appium.page;

import br.am.rbalves.appium.core.BasePage;

public class HomePage extends BasePage{
	public boolean confirmAccessPage() {
		try {
			return getText(getXpathTextViewByText("Categories")).intern() == "Categories" 
					&& getText(getXpathTextViewByText("Popular")).intern() == "Popular";
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
