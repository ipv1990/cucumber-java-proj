$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/F01_LoginPikabu.feature");
formatter.feature({
  "name": "Login into Pikabu",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Авторизация и профиль",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@F01S01"
    }
  ]
});
formatter.step({
  "name": "Launch the Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://pikabu.ru/\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"ipv1990@yandex.ru\" and Password as \"Master_1986\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Email_and_Password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can see the element \"Страница.Текущий_уровень\" on the page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.element_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can see the element \"Страница.Пост_первый\" on the page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.element_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can see the element \"Страница.Рейтинг_поста\" on the page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.element_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I cannot see the element \"Параметры_профиля.Достижения_список\" on the page",
  "keyword": "But "
});
formatter.match({
  "location": "Steps.element_isnt_displayed(String)"
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
  "name": "I can see the element \"Страница.Текущий_уровень\" on the page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.element_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Text of the element \"Страница.Текущий_уровень\" is \"начальный\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.page_element_should_be(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can see the element \"Параметры_профиля.Достижения_список\" on the page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.element_displayed(String)"
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
  "name": "Click on element \"Страница.Пдтв_выход\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_element(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can see the element \"Кнопка_войти\" on the page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.element_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User closes browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});