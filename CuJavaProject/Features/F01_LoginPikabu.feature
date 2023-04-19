Feature: Login into Pikabu

  @F01S01
  Scenario: Авторизация и профиль

    Given Launch the Chrome Browser
    When User opens URL "https://pikabu.ru/"
    And User enters Email as "ipv1990@yandex.ru" and Password as "Master_1986"
    And Click on Login
    And I can see the element "Страница.Текущий_уровень" on the page
    And I can see the element "Страница.Пост_первый" on the page
    And I can see the element "Страница.Рейтинг_поста" on the page
    But I cannot see the element "Параметры_профиля.Достижения_список" on the page
    When User click on Profile
    And I can see the element "Страница.Текущий_уровень" on the page
    And Text of the element "Страница.Текущий_уровень" is "начальный"
    And I can see the element "Параметры_профиля.Достижения_список" on the page
    When User click on Log out button
    And Click on element "Страница.Пдтв_выход"
    Then I can see the element "Кнопка_войти" on the page
    And User closes browser
