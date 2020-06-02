Feature: New user registration

Scenario: It should display the screen to inform the token
	Given that I am accessing the application
	And that I advanced the tutorial
	And I clicked on the "I AM NEW" button
	Given  that I inform the email "rafael@mail.com"
	And the phone "92999999999"
	And the password "123456"
	When I click the button "CREATE ACCOUNT"
	Then I view the screen to insert the token

Scenario: It should display the home screen of the application
	Given that I enter the token "1111"
	When I click the button "SUBMIT CODE"
	Then I view the home screen