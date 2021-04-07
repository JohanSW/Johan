

Feature: Registrate a new user on MailChimp

  Scenario Outline: Title of your scenario outline
    Given Browser is open
    And User is on ChimpMail webpage
    When user click on create an account
    And User add '<eMail>' and '<Username>' and '<Password>'
    Then click on create account and user account is created
    

    Examples: 
      | eMail  | Username | Password |
      | oolaaminoo@hotmail.com | oolaaminoo     | 934538Kk_ |
      | llissamyggga@gmail.com | LlissaMyggga   | 654877Ii_ |
			| GgrrylllsBear@hotmail.com | Ggrryllls   | 547876Oo_ |
			| chrisrockk@yahoo.com | ChrisRockk   | 654814Pp_ |