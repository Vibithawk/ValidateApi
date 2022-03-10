@FetchL1category
  Feature: To fetch L1category values
    Scenario Outline: Fetch L1category and verify
      Given user_cm1@wescodist.com and demo@123 to access API
      When <l1Category> used to fetch the  API
      Then verify data fetch for the L1Category
      Examples:
      | l1Category                   |
      | heating_cooling_and_plumbing |
