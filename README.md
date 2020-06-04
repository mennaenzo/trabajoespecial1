# trabajoespecial1

Trabajo Práctico Entregable
Software para la Construcción

Nos contratan para .encargarnos del desarrollo de un software para una
empresa constructora que tiene muchos empleados y obras en este momento. Nos
comentan como es el proceso de construcción de una obra nueva y como es el
trabajo de cada personal con el que cuentan.

Esta Empresa, tienen distintos tipos de Empleados. Si bien todos comparten
datos en común (Nombre, DNI y TEL), existen 3 tipos de empleados con tareas e
información distinta: Arquitectos, Obreros y Maestro mayor de obra:
 • Los arquitectos tienen (además de los datos de cualquier empleado) el
número de matrícula.
 • Por el otro lado, los maestros y obreros comparten el dato de la edad
exclusivamente.
Otro dato importante que tienen todos los empleados, es el costo por día de
trabajo. Cada empleado tiene un costo por día distinto:
 • Arquitecto: 2000 pesos.
 • Maestros: 1800 pesos.
 • Obreros: 1500 pesos
 
Al consultar sobre las tareas específicas que realiza cada empleado,
descubrimos que la única función del arquitecto es “crear planos” para las obras.
Mientras que los obreros y los maestros tienen la función de “construir”, aunque el
“trabajo” de los obreros y los maestros no es el mismo.
 • Cuando un obrero trabaja devuelve un mensaje: “Soy obrero y construyo”.
 • Mientras que el maestro devuelve el mensaje: “Soy maestro y superviso las
construcciones”.
 • El arquitecto mientras crea los planos devuelve el mensaje: “Creando mi
próximo plano”.

Es importante marcar que si bien TODOS son empleados, el arquitecto solo
crea planos y los obreros con los maestros construyen de maneras distintas.
Cuando consultamos por las distintas obras que realiza esta empresa, nos
enteramos que existen dos tipos: Las obras domésticas y las obras comerciales.
Las obras domésticas son aquellas en las que solamente habita una familia;
mientras que las obras comerciales se dividen en dos tipos: Hoteles y Comercios.
Las obras domésticas y las comerciales comparten los datos de:
 • Dirección
 • Cantidad de metros cuadrados
 • Tiempo estimado de obra (Este es un valor en días)
 • Costo por metro cuadrado
 • Listado del personal asignado (arquitectos, obreros y maestros
mayores de la empresa)

También existen otros datos que varían según el tipo de obra:
 • Nombre de la obra (para todas las obras comerciales)
 • Cantidad de pisos (solo para los hoteles)
 • Rubro (solo para los comercios)
 • Cantidad de habitaciones (solo para obras domésticas)
 
Para todas las obras se le calcula un precio estimado del total de la obra.
Este cálculo se realiza de la siguiente manera:
((costo_por_metro * mt2) + (costo_de_empleados)) * cantidad_días

Por último existen ciertas restricciones a la hora de asignar empleados a las
obras:
 • Solo puede haber UN arquitecto por obra.
 • Mínimo UN maestro mayor y un máximo de tres por obra.
 • No hay límite para los obreros pero al menos debe haber 2.
Con toda esta información se solicita para el sistema:

1) Crear las diferentes clases del texto anterior respetando los valores y distintas
funciones.
2) Generar un método main donde se vea el comportamiento de nuestro sistema:
A) Crear instancias de cada tipo de empleado y mostrar el comportamiento
de “construir” (para los obreros y maestros) y como es el comportamiento de
un arquitecto.
B) Crear una nueva empresa con un nombre y asignarle distintos tipos de
empleados. La empresa tiene: nombre, una lista de empleados y las obras
realizadas.
C) Crear al menos una obra por cada tipo distinto que existe, asignando
Laboratorio de Programación III
empleados a la obra. También se pide ejecutar algún método para saber el
costo estimado de la obra.
D) Se solicita agregar las obras (del punto anterior) a la lista de la empresa.
E) Crear un método para recorrer los empleados que trabajan en una obra.
Mostrando por pantalla los distintos datos particulares de cada empleado.
F) Crear un método para listar todas las obras por pantalla con el costo de la
obra.
3) Generar un diagrama UML y adjuntarlo con el código fuente del ejercicio.

UTN Mar del Plata
