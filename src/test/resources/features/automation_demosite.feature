#Autor: Jean Caballero

@stories
Feature: demo.automationtesting
  As a user, I want to enter the Automation Demo Side web to verify that the screen displays the requested text

      @scenario1
      Scenario: Access the Web Automation demo
        Given that Jean wants to access the Web Automation Demo Site
        When he makes the record on the page
          | firstName  | lastName  | address             | email                    | phone      | gender | hobbies1 | hobbies2 | languages | skills     | country | selectCountry | year | month     | day | password | confirmPassword |
          | Jean       | Caballero | Panama Rep. Panama  | jean8.caballero@mail.com | 4556118820 | Male   | Cricket  | Hockey   | Spanish   | Java       | Aruba   | India         | 1990 | August    | 29  | Abcd1234 | Abcd1234        |
        Then he verifies that the screen is loaded with text Double Click on Edit Icon to "EDIT" the Table Row