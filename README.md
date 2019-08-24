# Integrantes:

	- Eduardo Ocampo
	- Juan Navarro

# Ejercicio Descuento de tarifas

## 1) ExcepcionParametrosInvalidos

### Deberia generar parametros invalidos cuando:

**Tarifa Base:** tiene que ser mayor a 0.
**Dias de antelacion:** Tiene que ser un numero positivo.
**Edad:** La edad del pasajero tiene que ser mayor a 0 y menor a 130.


##  2) Clases de Equivalencia.

|         Numero        |                                                                     Clase de equivalencia                                                                     |  Resultado  |
|:---------------------:|:-------------------------------------------------------------------------------------------------------------------------------------------------------------:|:-----------:|
|  Parametros Invalidos | Tarifa Base: tiene que ser mayor a 0. Dias de antelacion: Tiene que ser un numero positivo. Edad: La edad del pasajero tiene que ser mayor a 0 y menor a 130. |  Incorrecto |
|  No Aplica Descuentos | Dias de antelacion menores a 20 dias y edad del pasajero mayor de  18 años y menor de 65 años                                                                 |   Correcto  |
|   Descuento del 15%   | Dias de antelacion mayores a 20 dias.                                                                                                                         |   Correcto  |
|    Descuento del 5%   | Pasajero con edad inferior a 18 años.                                                                                                                         |   Correcto  |
|    Descuento del 8%   | Pasajero con edad mayor a 65 años.                                                                                                                            |   Correcto  |
|   Descuento del 20%   | Dias de antelacion mayores a 20 dias y pasajero con edad inferior a 18 años.                                                                                  |   Correcto  |
|   Descuento del 23%   | Dias de antelacion mayores a 20 dias y pasajero con edad mayor a 65 años.                                                                                     |   Correcto  |


## 3) Pruebas Especificas.

### Parametros invalidos:
Los parametros que entrarian serian los siguientes:
	
-**Tarifa Base:** tiene que ser mayor a 0.
-**Dias de antelacion:** Tiene que ser un numero positivo.
-**Edad:** La edad del pasajero tiene que ser mayor a 0 y menor a 130.

El resultado esperado es una **ExceptionParametrosInvalidos**.

### No aplica descuentos:
Los parametros que entrarian serian los siguientes:

-**Dias de antelacion** menores a 20 dias.
-**Edad del pasajero** mayor de 18 años y menor de 65 años.

El resultado esperado es que la tarifa base sea igual a la tarifa a cobrar.

### Descuento del 15%.
Los parametros que entrarian serian los siguientes:

-**Dias de antelacion** mayores a 20 dias.

El resultado esperado es que la tarifa a cobrar tenga un descuento del 15% con respecto a la tarifa base.

### Descuento del 5%.
Los parametros que entrarian serian los siguientes:

-**Edad del pasajero** inferior a 18 años.

El resultado esperado es que la tarifa a cobrar tenga un descuento del 5% con respecto a la tarifa base.

### Descuento del 8%.
Los parametros que entrarian serian los siguientes:

-**Edad del pasajero** mayor a 65 años.

El resultado esperado es que la tarifa a cobrar tenga un descuento del 8% con respecto a la tarifa base.

### Descuento del 20%.
Los parametros que entrarian serian los siguientes:

-**Dias de antelacion** mayores a 20 dias 
-**Edad del pasajero**  inferior a 18 años.

El resultado esperado es que la tarifa a cobrar tenga un descuento del 20% con respecto a la tarifa base.

### Descuento del 23%.
Los parametros que entrarian serian los siguientes:

-**Dias de antelacion** mayores a 20 dias 
-**Edad del pasajero** mayor a 65 años.

El resultado esperado es que la tarifa a cobrar tenga un descuento del 23% con respecto a la tarifa base.

## 4) Condiciones Limite

### Parametros invalidos:
Los limites para los parametros invalidos serian:
	
 tarifaBase <= 0
diasDeAntelacion < 0
130 < edadPasajero < 0

### No aplica descuento:
Los limites para que no aplique descuento serian:

diasDeAntelacion < 20
18 < edadPasajero < 65 