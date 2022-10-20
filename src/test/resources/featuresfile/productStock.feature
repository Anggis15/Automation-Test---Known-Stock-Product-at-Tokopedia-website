Feature: Check Product Stock

	Scenario: Search a Product to Known that Stock
	Given User Accses link "https://www.tokopedia.com"
	When User in Tokopedia Homepage
	And User Fill Search Box with "infinix"
	And User Press Enter Key on Keyboard
	And User Scroll Down the Browser
	And User Click a Product
	Then User Get Information about Product Stock
	