Feature: MyAccount-Login feature
Description: This is feature test a login fuctionality
#Simple login without perameters
Scenario: Log-in with valid username and Password
Given : Open the browser
When : Enter the URL "https://en-gb.facebook.com/"
And : click on my Account Menu
And : Enter register username and password
And : Click on log-in buttion
Then : User must successfully log-in to the web page
