Feature: Home Page Verification of Free CRM Website

Scenario Outline: Home Page Section Count
Given User logs into CRM
Then  User clicks on Login
When User Provides the login "<Username>" and "<Password>"
Then User is Logged into the Account
Given User logs into the CRM Website and is on Home Page
Then  User gets to Cogmento Home Page List
|Home|
|Calendar|
|Contacts|
|Companies|
|Deals|
|Tasks|
|Cases|
|Calls|
|Documents|
|Email|
|Campaigns|
|Forms|
|Reports| 
And  Home Page count should be 13
	Examples:
	|Username| Password|
	|laslowjas@gmail.com|Laslow@Jas|