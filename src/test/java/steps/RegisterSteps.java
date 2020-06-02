package steps;

import static org.junit.Assert.assertTrue;

import br.am.rbalves.appium.core.DriverFactory;
import br.am.rbalves.appium.core.User;
import br.am.rbalves.appium.page.HomePage;
import br.am.rbalves.appium.page.MainPage;
import br.am.rbalves.appium.page.RegisterPage;
import br.am.rbalves.appium.page.TokenPage;
import br.am.rbalves.appium.page.TutorialPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class RegisterSteps {
	
	AndroidDriver<MobileElement> driver;
	
	private TutorialPage tutorialPage = new TutorialPage();
	private MainPage mainPage = new MainPage();
	private RegisterPage registerPage = new RegisterPage();
	private TokenPage tokenPage = new TokenPage();
	private HomePage homePage = new HomePage();
	
	private User user;
	
	@Given("^that I am accessing the application$")
	public void thatIAmAccessingTheApplication() throws Throwable {
		driver = DriverFactory.getDriver();
	}

	@Given("^that I advanced the tutorial$")
	public void thatIAdvancedTheTutorial() throws Throwable {
		tutorialPage.advanceTutorial();
	}

	@Given("^I clicked on the \"([^\"]*)\" button$")
	public void iClickedOnTheButton(String buttonIAmNew) throws Throwable {
		mainPage.clickButton(buttonIAmNew);
	}

	@Given("^that I inform the email \"([^\"]*)\"$")
	public void thatIInformTheEmail(String email) throws Throwable {
	  	registerPage.enterEmail(email);
	}

	@Given("^the phone \"([^\"]*)\"$")
	public void thePhone(String phone) throws Throwable {
		registerPage.enterPhone(phone);
	}

	@Given("^the password \"([^\"]*)\"$")
	public void thePassword(String password) throws Throwable {
		registerPage.enterPassword(password);
	}

	@When("^I click the button \"([^\"]*)\"$")
	public void iClickTheButton(String buttonCreateAccount) throws Throwable {
		registerPage.clickButton(buttonCreateAccount);
	}

	@Then("^I view the screen to insert the token$")
	public void iViewTheScreenToInsertTheToken() throws Throwable {
		assertTrue(tokenPage.confirmAccessPage());
	}

	@Given("^that I enter the token \"([^\"]*)\"$")
	public void thatIEnterTheToken(String token) throws Throwable {
		tokenPage.inputToken(token);
	}

	@Then("^I view the home screen$")
	public void iViewTheHomeScreen() throws Throwable {
		assertTrue(homePage.confirmAccessPage());
	}

}
