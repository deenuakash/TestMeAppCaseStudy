
Feature: Login to TestMeApp
Description:User tries different login credentials
Scenario Outline: Login
Given User enters browser and provide TestMeApp URL 
When User enters the "<username>"
When User enters "<password>"
When User clicks Login button
Then User enters Home page
Examples:
|username|password|
|AlexUser|Alex@123|