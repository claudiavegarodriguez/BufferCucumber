# BufferCucumber

En este repositorio se va a realizar la implementación de la clase Buffer, junto con sus pruebas unitarias usando Cucumber y Gherkin.

Para ello, he creado cuatro escenarios para cada uno de los métodos dentro de la clase Buffer. Estos son put, get, full y empty. Cada escenario realiza su correspondiente función y consta de ejemplos para poder comprobar que el resultado sea correcto y pase los test.

El escenario put consta de dos variables, una es el número de elementos iniciales y otra es el número de elementos totales al realizar la operación. Si el buffer se encuentra lleno y pretendemos insertar más elementos, el resultado será un FAIL.

El escenario get consta de dos variables, una es el número de elementos iniciales y otra es el número de elementos totales al realizar la operación. Si el buffer se encuentra vacío y pretendemos quitar más elementos, el resultado será un FAIL.

El escenario full consta de dos variables, una es el número de elementos iniciales y otra es el número de elementos totales al realizar la operación. Cuando se realiza, nos indica con True si el buffer está lleno, o con False si el buffer no lo está y, por tanto, podemos seguir insertando elementos en el buffer. Al igual que si se encuentra lleno y pretendemos meter más elementos nos salta un FAIL.

El escenario empty consta de dos variables, una es el número de elementos iniciales y otra es el número de elementos totales al realizar la operación. Cuando se realiza, nos indica con True si el buffer está vacío, o con False si el buffer no lo está y con lo cual podemos seguir quitando elementos del buffer. Al igual que si se encuentra vacío y pretendemos quitar más elementos nos salta un FAIL.

(El código se encuentra en la rama master).
