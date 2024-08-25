Feature: Testing of the Login Page with Credentials

Scenario Outline: Login into CRM with the Account details
	Given User logs into CRM
	Then  User clicks on Login
	When User Provides the login "<Username>" and "<Password>"
	Then User is Logged into the Account
	Then User Verifies the company in Homepage
	Examples:
	|Username| Password|
	|laslowjas@gmail.com|Laslow@Jas|