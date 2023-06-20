  @Regression
  Feature: Etsy Landing Page Validation

  @Etsy
  Scenario: Validate Etsy main navigation header items
    Given user navigates to "https://www.etsy.com"
    Then user should see below menu item links
    |Unique Gifts for Dad|
    |Outdoor Entertaining|
    |Barware & Glassware|
    |Leather Accessories|
    |Wedding Gifts |
    | On Sale      |

