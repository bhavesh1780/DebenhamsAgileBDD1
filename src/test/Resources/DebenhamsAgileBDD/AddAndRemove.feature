
@basket
Feature: User should able to add and remove products from the basket
Background:
  Given User is on Debenhams home page
  When User search for any toy
  And Add any toy to a basket

  Scenario: User should able to add product to basket successfully
    Then He should able to see product into a basket

  Scenario: User should able to remove product from basket successfully
    And He remove product from basket
    Then He should able to see that product has been successfully removed from basket