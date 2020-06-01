#language: pt
@tag
Funcionalidade: Cadastro

  @tag1
  Esquema do Cenario: : Cadastrar usuarios
    Dado que acesso a url "https://petstore.swagger.io/v2"
    Quando preencho o campo "id" com "1" no objeto json
    E preencho o campo "username" com "ana_maia" no objeto json
    E preencho o campo "firstName" com "Ana" no objeto json
    E preencho o campo "lastName" com "Maia" no objeto json
    E preencho o campo "email" com "ana@maia.com" no objeto json
    E preencho o campo "password" com "123456" no objeto json
    E preencho o campo "phone" com "40028922" no objeto json
    E preencho o campo "userStatus" com "1" no objeto json
    E realizo a requisicao post
    Então valido que retornou 200

    Exemplos: 
      | id | username            | firstname | lastname    | email                   | password | phone    | userStatus |
      |  1 | ana_maia            | Ana       | Maia        | ana@maia.com            |   123456 | 40028922 |          1 |
      |  2 | rodrigo_mendes      | Rodrigo   | Mendes      | rodrigo@mendes.com      |   123456 | 40028923 |          1 |
      |  3 | tatiana_vasconcelos | Tatiana   | Vasconcelos | tatiana@vasconcelos.com |   123456 | 40028924 |          1 |
