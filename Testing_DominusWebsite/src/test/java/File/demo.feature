Feature: Open the Browser

  Scenario: Open the Browser
    Given User enter into the URl
    Then User click the online order
    Then User select the delivery loaction
    And User add the peppy panner
    And User add the Margherita
    And user add the Primavera
    And User add the peppy panner,Margherita,Primavera the product of two Qty in the cart
    Then User checking the cart total
    And User add the pepsi 475ml and the product of twele Qty in the cart
    And User removing the Margherita of one Qty
    And User removing the pepsi 475ml of six Qty
    Then User checking the cart total and click the checkout
