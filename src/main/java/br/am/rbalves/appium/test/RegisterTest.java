package br.am.rbalves.appium.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.am.rbalves.appium.core.DriverFactory;
import br.am.rbalves.appium.core.User;
import br.am.rbalves.appium.page.HomePage;
import br.am.rbalves.appium.page.MainPage;
import br.am.rbalves.appium.page.RegisterPage;
import br.am.rbalves.appium.page.TokenPage;
import br.am.rbalves.appium.page.TutorialPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class RegisterTest {
	
	AndroidDriver<MobileElement> driver;
	
	private TutorialPage tutorialPage = new TutorialPage();
	private MainPage mainPage = new MainPage();
	private RegisterPage registerPage = new RegisterPage();
	private TokenPage tokenPage = new TokenPage();
	private HomePage homePage = new HomePage();
	
	private User validUser;
	
	@Before
	public void startAppium() throws MalformedURLException {
		driver = DriverFactory.getDriver();
		
		validUser = new User("rafael@mail.com","92999999999","123456");
		
		tutorialPage.advanceTutorial();
		mainPage.goRegisterPage();
	}
	
	@After
	public void tearDown() {
		DriverFactory.killDriver();
	}
	
	@Test
	public void registerValidUser() throws MalformedURLException {
		registerPage.register(validUser);
		tokenPage.submitCode("1111");
		assertTrue(homePage.confirmAccessPage());
	}
	
	@Test
	public void registerInvalidToken() throws MalformedURLException {
		registerPage.register(validUser);
		tokenPage.submitCode("2356");
		assertFalse(homePage.confirmAccessPage());
	}

}
