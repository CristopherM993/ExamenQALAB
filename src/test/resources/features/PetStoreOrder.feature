@EjecutarLosDosEscenariosPOSTandGET
Feature: Creación de Order GET/POST PetStore


  Scenario Outline: Creación de orden usando el metodo Post
    Given que tengo una orden con los siguientes datos <id>, <petId> , <quantity> , "<shipDate>", "<status>", "<complete>"
    When envío una solicitud POST con la orden al endpoint
    Then la respuesta debería tener un código de estado 200
    Examples:
      | id | petId | quantity | shipDate   | status | complete |
      | 1  | 10    | 1        | 2024-08-07 | placed | true     |


  Scenario: Consulta de un pedido existente
    Given la url "https://petstore.swagger.io/v2" del la pagina PetStore
    When se envía una solicitud GET del ordenId
    Then la respuesta debe tener un código de estado 200