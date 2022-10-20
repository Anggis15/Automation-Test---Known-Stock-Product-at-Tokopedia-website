$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featuresfile/productStock.feature");
formatter.feature({
  "name": "Check Product Stock",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search a Product to Known that Stock",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Accses link \"https://www.tokopedia.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "testcase.JumlahProduct.user_Accses_link(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User in Tokopedia Homepage",
  "keyword": "When "
});
formatter.match({
  "location": "testcase.JumlahProduct.user_in_Tokopedia_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User Fill Search Box with \"infinix\"",
  "keyword": "And "
});
formatter.match({
  "location": "testcase.JumlahProduct.user_Fill_Search_Box_with(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User Press Enter Key on Keyboard",
  "keyword": "And "
});
formatter.match({
  "location": "testcase.JumlahProduct.user_Press_Enter_Key_on_Keyboard()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User Scroll Down the Browser",
  "keyword": "And "
});
formatter.match({
  "location": "testcase.JumlahProduct.user_Scroll_Down_the_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User Click a Product",
  "keyword": "And "
});
formatter.match({
  "location": "testcase.JumlahProduct.user_Click_a_Product()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "User Get Information about Product Stock",
  "keyword": "Then "
});
formatter.match({
  "location": "testcase.JumlahProduct.user_Get_Information_of_Product_Stock()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});