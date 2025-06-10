Feature: shopping Jeans


  Background:
    Given user opens the demo web shop page
    When user click on the login button on the top menu
    And user enters the username "omidtester@gamil.com"
    And user enters the password "Tester@2025"
    And user clicks on the login button
    Then user should be successfully logged in

  @test
  Scenario: Shopping for jeans
    When user clicks on the top menu Apparel & Shoes
    And user clicks on Blue Jeans
    And user enters quantity 5 in the quantity textbox
    And user clicks on the Add to cart button
    Then verify the "Add to cart" success message is displayed

