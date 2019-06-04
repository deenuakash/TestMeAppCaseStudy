Feature:Add to Cart
Description: User checks out cart
Scenario:
Given User opens browser and enters url
When User enters valid username as "Lalitha"
When User enters valid password as "Password123"
When User searches for headphones in search field
Then User tries to proceed without clicking Add to Cart
Scenario:
Given User opens browser and enters url
When User enters valid username as "Lalitha"
When User enters valid password as "Password123"
When User searches for headphones in search field
When User clicks Add to cart
When User clicks cart option
When User clicks Checkout button
When User clicks proceed to pay button
When User Selects bank options
When User give Payment Username
When User give Payment Password
Then User clicks payment login