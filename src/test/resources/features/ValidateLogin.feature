Feature: To validate login functionality inAdactin hotel appp

@wip0404k
Scenario Outline: To validate login functionality using different inputs
Given User starts browser
And user launch the appliction using "LoginPage"
When user enter text "usernameTextbox" in textbox using xpath '<username>'
And user enter text "passwordTextbox" in textbox using xpath '<password>'
And user click on login button using xpath "loginButton"
Then user verify the title to be  '<expTitle>' 
Examples:
| username | password | expTitle |
|sekhar1521| 513ZB0   | Adactin.com - Search Hotel |
|sekhar1521| 513ZB0   | Adactin.com - Search Hotel |