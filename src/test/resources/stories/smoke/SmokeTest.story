Meta:

Narrative:
As a QA and Developer
I want verify the main functional of HUB
So that was wrote test scenarios for  it

Scenario: The user login with admin account and verify Home Page
Given the user is on the HUB login page
When the user login in the HUB with email:'testhubuser@gmail.com', password:'optimaldynamics' and time base code
Then the user should observe war room
