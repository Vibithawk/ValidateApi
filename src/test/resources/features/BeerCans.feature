Feature:To validate login Api
  Scenario: Validate login Api with Valid credentials.
    Given login API
    When user_cm1@wescodist.com and demo@123 is inputted for login API
    Then Verify auth token is generated