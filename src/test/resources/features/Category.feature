@Category
Feature:To fetch category values
  Scenario: Fetch category and verify.
    Given I send a request to the URL to get category Details.
       Then Verify data for category