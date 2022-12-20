@Login
Feature: Login en la web de Swaglabs

  @loginOK
  Scenario Outline: Validar login de usuario
    Given La URL esta operativa
    When el usuario ingresa su usuario "<usuario>" y password "<password>"
    And el usuario da click en login
    Then se muestra la pagina de productos
    Examples:
      | usuario       | password      |
      | standard_user | secret_sauce |

  @logOutOK
  Scenario Outline: Validar Logout de usuario
    Given La URL esta operativa
    When el usuario ingresa su usuario "<usuario>" y password "<password>"
    And el usuario da click en login
    And el usuario selecciona el menu principal
    And el usuario da click en LOGOUT
    Then se muestra la pagina de inicio de sesion
    Examples:
      | usuario       | password      |
      | standard_user | secret_sauce |
