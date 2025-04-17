@regression
Feature: Testing Groups Endpoints

  Scenario: Happy Path Add Groups (Add-Group Endpoint) --> POST
    Then User provides 'GrodhhjupApi8e58', '2025-04-10','description of group' and validates 'Group successfully saved' from end-point Post