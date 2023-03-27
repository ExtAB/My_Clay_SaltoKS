@Login
Feature: Login test at SaltoKS

    @InvalidUsername
    @InvalidPassword
    Scenario Outline: Login with invalid data
        Given I navigate to SaltoKS app
        When I enter my credentials, "<username>" and "<password>"
        Then I should verify error message "<error_message>"
        Examples:
            | username        | password        | error_message                                     |
            | invalidUsername | 123456Ab        | You entered an incorrect email, password or both. |
            | ts@my-clay.com  | invalidPassword | You entered an incorrect email, password or both. |

    @ValidLogin
    Scenario Outline: Login with valid username and password
        Given I navigate to SaltoKS app
        When I enter my credentials, "<username>" and "<password>"
        Then I should see SaltoKS homepage
        Examples:
            | username       | password |
            | ts@my-clay.com | 123456Ab |



#        API SaltoKS Tests
#       Create a new SaltoKS Site/User/AccessGroups	2
#       Remove a existing SaltoKS Site/User/AccessGroups	2
#       Retrieve a existing SaltoKS Site/User/AccessGroups	3
#       Authenticate to an existing SaltoKS	3
#       Others