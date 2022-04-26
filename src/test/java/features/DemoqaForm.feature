Feature: Automatizacion flujos Agregar Editar Eliminar desde Demoqa

  Background: Acceder a demoqa
    Given Me encuentro en la pagina de demoqa Web Tables
    When Doy click al boton Web Tables de la lista desplegada
    Then Visualizo el Web Tables

    Scenario: Agregar usuario en tabla de registros
    When Doy click al boton Add de la tabla de registro
    And Ingreso datos de usuario en la tabla de registro
    And Doy click al boton Submit de la tabla de registro
    Then Visualizo el dato creado en la tabla de registros

    Scenario: Editar usuario en tabla de registros
    When Doy click al boton Edit de la tabla de registro
    And Cambio los datos del usuario de la tabla de registro
    And Doy click al boton Submit despues de editar tabla de registro

    Scenario: Eliminar un usuario de la tabla de registros
    When Doy click al boton Eliminar de la tabla de registro
    Then Se elimina el usuario correctamente