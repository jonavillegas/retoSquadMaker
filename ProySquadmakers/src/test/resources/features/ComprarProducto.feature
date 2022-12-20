Feature: Como usuario quiero realizar la compra de productos

  @Compra
  Scenario Outline: Verificar la compra exitosa de productos
    Given La URL esta operativa
    When el usuario ingresa su usuario "<usuario>" y password "<password>"
    And el usuario da click en login
    And el usuario agrega "<numeroProductos>" productos al carrito
    And el usuario da click en el carrito
    And el usuario da click en checkout
    When el usuario ingresa nombre "<nombre>", apellido "<apellido>" y codigoPostal "<zip>"
    And el usuario da click en continue
    And el usuario da click en finish
    And se muestra el boton de BackHome

    Examples:
      | usuario       | password     | numeroProductos | nombre   | apellido | zip   |
      | standard_user | secret_sauce | 3               | Jonathan | Villegas | 12345 |