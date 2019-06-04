Feature:Search Engine
Description: User tries various search methods
Scenario:
Given User enters browser and provide TestMeApp Url 
When User enters the username "Lalitha"
When User enters password "Password123"
When User clicks Login
When user types four characters in search field as "head"
When user verifies appropriate product is displayed
Then user clicks search button