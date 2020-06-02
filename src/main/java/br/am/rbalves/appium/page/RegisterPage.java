package br.am.rbalves.appium.page;

import br.am.rbalves.appium.core.BasePage;
import br.am.rbalves.appium.core.User;

public class RegisterPage extends BasePage{
	
	public void clickButton(String text) {
		click(getXpathTextViewByText(text));
	}
	
	public void fillField(String field, String text) {
		writeText(getXpathEditTextByText(field), text);
	}
	
	public void register(User user) {
		this.fillField("E-mail", user.getEmail());
		this.fillField("Phone number", user.getPhone());
		this.fillField("Password", user.getPassword());
		this.clickButton("CREATE ACCOUNT");
	}
	
	public void enterEmail(String email) {
		this.fillField("E-mail", email);
	}
	
	public void enterPhone(String phone) {
		this.fillField("Phone number", phone);
	}
	
	public void enterPassword(String password) {
		this.fillField("Password", password);
	}
}
