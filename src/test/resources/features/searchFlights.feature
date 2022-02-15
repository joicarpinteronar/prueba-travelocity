#language: es
#Author: Ivan Carpintero

Característica: Como Usuario Viajero de la Aplicacion
                Quiero poder buscar vuelos de diferentes formas
                Para ir a los destinos que quiero.

  Esquema del escenario: Validar la busqueda de vuelos de ida y regreso de manera exitosa
    Dado que un Viajero ingresa al portal de Travelocity
    Y el viajero selecciona el menu de Flights y selecciona la opcion Roundtrip
    Cuando ingresa la ciudad de origen y destino y selecciona un vuelo para el mes siguiente
       | origin   | destination   |
       | <origin> | <destination> |
    Entonces se debe mostrar la lista de vuelos disponibles
    Ejemplos:
      | origin | destination |
      | Bogota | Santa Marta |

  Esquema del escenario: Validar la busqueda de vuelos de ida y regreso con campos vacios
    Dado que un Viajero ingresa al portal de Travelocity
    Y el viajero selecciona el menu de Flights y selecciona la opcion Roundtrip
    Cuando ingresa la ciudad de origen y destino y selecciona un vuelo para el mes siguiente
      | origin   | destination   |
      | <origin> | <destination> |
    Entonces se debe mostrar el mensaje de error que faltan campos por llenar
    Ejemplos:
      | origin | destination |
      | Bogota | Santa Marta |

  Esquema del escenario: Validar la busqueda de vuelos de ida y regreso de manera exitosa agregando el numero de viajeros
    Dado que un Viajero ingresa al portal de Travelocity
    Y el viajero selecciona el menu de Flights y selecciona la opcion Roundtrip
    Y agrega 3 Adultos y 2 ninos para la reserva del viaje
    Cuando ingresa la ciudad de origen y destino y selecciona un vuelo para el mes siguiente
      | origin   | destination   |
      | <origin> | <destination> |
    Entonces se debe mostrar la lista de vuelos disponibles
    Ejemplos:
      | origin | destination |
      | Bogota | Santa Marta |

  Esquema del escenario: Validar la busqueda de vuelos para un viaje sencillo
    Dado que un Viajero ingresa al portal de Travelocity
    Y el viajero selecciona el menu de Flights y selecciona la opcion One-way
    Cuando ingresa la ciudad de origen y destino y selecciona un vuelo para el mes siguiente
      | origin   | destination   |
      | <origin> | <destination> |
    Entonces se debe mostrar la lista de vuelos disponibles
    Ejemplos:
      | origin | destination |
      | Bogota | Santa Marta |