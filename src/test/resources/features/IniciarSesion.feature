#language: es
#Author: Natalia henao

Característica: Iniciar sesion en la pagina de Saucedemo

  Yo como usuario registrado en la pagina Saucedemo puedo iniciar sesion


    Esquema del escenario: <Escenario>
    Dado que me encuentro en la pagina de Saucedemo
    Cuando ingreso las credenciales en la pagina
      |usuario     | contrasena|
      |<Username>  | <Password>|
    Entonces podre ingresar a la pagina de product <Mensaje>

    Ejemplos:
    | Escenario                | Username      | Password     | Mensaje |
    | Inicio de sesion Exitoso | standard_user | secret_sauce | Products|
    | Inicio de sesion Fallido | Natalia       | Prueba1      | Products|



