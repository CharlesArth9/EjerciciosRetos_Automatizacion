# language: en


@Regresion

Feature:  Gestionar fomulario Popup Validation Se espera que el usuario sea capaz de ingresar los datos requeridos
          por el formulario realizando las validaciones obligatorias correspondientes.

@CasoExitoso
  Scenario:  Diligenciar de manera correcta el formulario Popup Validation
             no existe mensaje de validacion al realizar este procedimiento.


   Given ingresar credenciales de autenticacion en colorlib con usuario "demo" y password "demo"
    And  ingreso a la funcion de Forms Validation
    When  diligencio el formulario Popup validation
      | Required | Select | MultipleS1| MultipleS2 | Url                   | Email       | Password1 | Password2 | MinSize | MaxSize | Number | IP           | Date       | DateEarlier|
      | valor1   | Golf   | Tennis    | Golf       | http://www.valor1.com | k@gmail.com | valor1    | valor1    | 123456  | 123456  | -99.99 | 200.200.5.4  | 2020-05-14 | 2020/01/01 |
    Then se verifica que el ingreso es exitoso



