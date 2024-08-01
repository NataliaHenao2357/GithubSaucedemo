#language: es
#Author: Natalia henao

  Característica: Selecionar el producto de preferencia

    Antecedentes:
      Dado que me encuentro en la pagina de Saucedemo
      Cuando ingreso las credenciales en la pagina
        |usuario        | contrasena   |
        | standard_user | secret_sauce |

      Escenario: Buscar el producto a seleccionar
        Cuando selecciono el producto que me gusta
        Entonces Se anadira al carrito de compras