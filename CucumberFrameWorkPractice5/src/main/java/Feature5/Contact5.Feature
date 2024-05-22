Feature: Contact us form

  @tag1
  Scenario Outline: verify that when the user clicks the Contact link the form displays and confirm the message when the user clicks the register button after entering the valid data.
    Given Already openend the protrainingtech.com
    When User clicks the Contact link
    Then User able to see Join us form
    When User enters the value for firstname "<FirstName>"
    And User enters the value for lastname "<LastName>"
    And User enters the email "<email>"
    And User enters the phonenumber "<PhoneNumber>"
    When User clicks the Register button
    Then User shall see confirmation message

    Examples: 
      | FirstName | LastName | email            | PhoneNumber |
      | Saleem    | Shahbaz  | saleem@gmail.com |  7302456145 |

 