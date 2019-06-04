Feature: Registering to TestMeApp 
Description: Taking data input from this feature file for TestMeApp Registration.
Scenario: Registration 
Given User opens Browser and enters TestMeApp URL
When User enters username as "akash123"
When User enters firstname as "akash"
When User enters lastame as "R"
When User enters password as "123456"
When User enters confirm password as "123456"
When User select gender  as "Male"
When User enters email as "ak@mail.com"
When User enters mobile number as "9876543210"
When User enters DOB as "08/11/1998"
When User enters address as "Accenture chennai"
When User select security question as "What is your favourite colour?"
When User enters answer as "Red"
Then User clicks register button