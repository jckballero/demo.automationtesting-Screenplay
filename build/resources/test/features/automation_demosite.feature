#Autor: Jean Caballero
#languaje:es
      @tag1
      Feature:
      Como usuario
      Quiero ingresar a la web Automation Demo Side
      para verificar que la pantalla muestre el texto solicitado

      @scenario1
      Scenario: Acceder a la Web Automation demo
        Given que Jean quiere acceder a la Web Automation Demo Site
        When el realiza el registro en la pagina
          | firstName  | lastName  | address             | email                    | phone      | gender | hobbies1 | hobbies2 | languages | skills     | country | selectCountry | year | month     | day | password | confirmPassword |
          | Jean       | Caballero | Panama Rep. Panama  | jean8.caballero@mail.com | 4556118820 | Male   | Cricket  | Hockey   | Spanish   | Java       | Aruba   | India         | 1990 | August    | 29  | Abcd1234 | Abcd1234        |
        Then el verifica que se carga la pantalla con texto Double Click on Edit Icon to "EDIT" the Table Row