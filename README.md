## Proyecto: Automatizacion Aplicacion Travelocity
#Tipo Aplicacion: Web
#Ambiente Productivo
#Modulo: Vuelos(Flights)

En la siguiente sección se describen los módulos que abarca el proyecto de automatización web para la aplicacion de Travelocity, modulo de vuelos, la mayoría de los cuales forman parte de la arquitectura propuesta por el patrón Screenplay:

* ```src/main/java```

``` 
+ com.travelocity.automation.exceptions
    Clases que detectan excepciones personalizadas cuando falla la automatización.

+ com.travelocity.automation.interactions
    
Clases que realizan las acciones adicionales que el usuario realiza sobre la interfaz o el servicio, y que el framework SerenityBDD no tiene.
	
+ com.travelocity.automation.models
    Clases que definen objetos de negocio abstraídos en una entidad real, modelados por atributos y métodos.

+ com.travelocity.automation.questions
    Clases con las que se hacen preguntas al sistema para luego ser verificadas en las definiciones de pasos (asserts).

+ com.travelocity.automation.tasks
    
Clases que representan las tareas realizadas por el actor a nivel de proceso de negocio.   

+ com.travelocity.automation.userinterfaces
    Clases donde se mapean los elementos de la interfaz de usuario y a su vez para la interacción con cada uno de estos elementos.

+ com.travelocity.automation.utils
   
Clases que contienen utilidades o funcionalidades comunes, enums, constantes manejadas en el proyecto, conexión a la base de datos, etc.
``` 

* ```src/test/java```

``` 
+ com.travelocity.automation.runners
    Clases que representan a los runners para ejecutar la automatización con los escenarios indicados en la función.
    
+ com.travelocity.automation.stepdefinitions
    
Clases que son el punto de entrada de la característica para la ejecución de la automatización.
``` 

* ```src/test/resources```

``` 
+ 
+ features
     Representación de los escenarios de prueba en lenguaje Gherkin a través de archivos escritos en Cucumber.
    
+ webdriver
     Carpeta donde se almacenan los drivers, agrupados por Sistema Operativo
``` 

* ```Herramientas```

+ Framework: Serenity
+ Metodologia de desarrollo: BDD
+ Patron de Diseño: ScreenPlay
+ Lenguaje de Programacion: Java 1.8
+ Gestor de Dependencias: Gradle
+ Runner: JUnit
+ Cucumber

* ```Desarrollo```
El desarrollo de la automatizacion se llevo a cabo con las herramientas y framework ya mecionados, para interactuar con los elementos web de la aplicacion y gestionar los escenarios de pruebas escritos en lenguaje Gherkin de los ya diseñados para esta prueba.
*  Nota: Como es un ambiente productivo la automatizacion no se pudo desarrollar a cabalidad porque al parecer el framework presenta incompatibilidad con la aplicacion ya que para la gestion de busquedas las ciudades de origin y destino con la automatizacion, no esta mostrando la lista de ciudades no los desglosa, muestra los campos en blanco como si estuvieran cargando pero nunca carga la lista de ciudades, dado esto se bloque la automatizacion y no se pueden realizar los flujos a completitud, se tendrian que hacer otras pruebas para validar que sucede o conocer como se gestiona ese desarrollo el cual impide la robotizacion en ese flujo. Los escenarios a automatizar quedaron pendientes, de igual forma se muesta los resultados de las ejecuciones con su respectiva evidencia, y la gestion para el desarrollo de automatizacion, gestionando cada una de las caractiristicas y funcionalidades del modulo, desarrollando las interacciones y tareas propias para lograr el objetivo de las prebas.


* ```Ejecucion```
Se puede ejecutar desde un IDE de desarrollo, compilando con Gradle o JUnit

Tambien se puede ejecutar desde el achivos raiz ejecutando el comando:

gradle clean test aggregate

* ```Reporte```

Una vez Ejecutado los test se genera un reporte en la ruta: target/site/serenity --> archivo index.html

* ```Documentos de soporte```
En la carpeta documents se encuentra los archivos de gestion y diseño de las pruebas y solucion de la prueba a nivel funcional, asi como las evidencias de ejecucion

* ```Criterios Tecnicos```
* 
La prueba se desarrollo en una maquina con Sistema Operativo Windows 10 y se trabajo con el browser de Chrome Versión 98.0.4758.102 (Build oficial) (64 bits)