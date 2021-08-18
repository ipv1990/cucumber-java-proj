Feature: Login into Emias

  @F01S01
  Scenario: Отладка шагов

    Given User Launch Chrome Browser
    When User opens URL "https://www.nopcommerce.com/en/login?returnUrl=%2Fen"
    And User enters Email as "PaveL_I" and Password as "Blackened_1990"
    #And Click on Login
    And Click on element "Онколог.Login.xpath"
    Then Элемент "Онколог.Login.Баннер" будет иметь текст "Free and open-source eCommerce platform"
    And Элемент "Онколог.Login.Баннер" будет содержать текст "nd open-source eCommerce platfor"
    When User click on Profile
    When User click on Log out button
    #Then Page Title should be contain "12 years of experience"
    And close browser


  @F01S02
  Scenario: Успешный вход с корректными данными

    Given я авторизуюсь в системе под пользователем "Арапова_О_И.Врач-онколог_ОД"