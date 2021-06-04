Feature: Redireccionar pagina WEB

  Scenario: Entrar a una Pagina WEB y darle click en dos opciones que redireccionan
    Given El susuario ingresa a la pagina
    When encuentre la opcion que desea y le da click
    And dentro de la nueva pagina le da click nuevamente al enlace de redireccionamiento
    Then confirma un banner o aviso de STATUS CODES

