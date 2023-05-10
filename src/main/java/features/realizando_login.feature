Feature: realizando login

  Scenario: realizando um login valido
    Given Dado um login valido
    When Quando preenche campos login e senha
    Then Então o login é efetuado com sucesso
