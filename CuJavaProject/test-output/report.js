$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/F01_LoginEmias.feature");
formatter.feature({
  "name": "Login into Emias",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Отладка шагов",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@F01S01"
    }
  ]
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://www.nopcommerce.com/en/login?returnUrl\u003d%2Fen\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"PaveL_I\" and Password as \"Blackened_1990\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Email_and_Password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on element \"Онколог.Login.xpath\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_element(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Элемент \"Онколог.Login.Баннер\" будет иметь текст \"Free and open-source eCommerce platform\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_element_should_be(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Элемент \"Онколог.Login.Баннер\" будет содержать текст \"nd open-source eCommerce platfor\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.page_element_should_be_contain(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Profile",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Log out button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_Log_out_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});