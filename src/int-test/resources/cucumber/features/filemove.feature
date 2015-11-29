Feature: Copy file
    File should copied from source to target
    File should not be deleted from source

  Scenario: Copy file from source to target
    Given there are is a file in the source directory
    When the route is started
    Then the file is copied to the target directory