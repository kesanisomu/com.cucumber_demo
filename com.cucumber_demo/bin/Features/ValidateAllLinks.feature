Feature: Validate the all internal links on the page
Description: Verify the all links in Home page.
Scenario: Check the all links are valid or not 
Given  Open the browser
When  Enter the URL "https://developer.here.com/documentation"
And  Verify the home page
And  Check the links are valid or not
Then  It be stored on the internal links results successfully

