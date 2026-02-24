# TALLER MERCEDAWs - FASES

## FASE 1:

Haz clic **[AQUÍ](DESIGN.md)** para ver el **Diagrama de Clases** completo.

## FASE 2:

A partir del modelo conceptual y arquitectónico definido en la Fase 1, se ha aplicado el proceso de **Ingeniería Directa** para traducir el diagrama UML a código fuente en Java. 

El objetivo de esta fase ha sido reflejar fielmente el "plano" diseñado, construyendo el esqueleto estructural del sistema. Para ello, se han programado las siguientes características:

* **Definición de Entidades:** Se han creado todas las clases (`Cliente`, `Vehiculo`, `Coche`, `Moto`, `Reparacion`, `Mecanico`, `Taller`) y la interfaz (`Especialista`).
* **Traducción de Relaciones:** * La herencia y realización se han implementado.
  * Las multiplicidades de composición y asociación (ej. `1..*`) se han resuelto mediante el uso de Colecciones en Java, instanciando listas (`List<Vehiculo>`, `List<Reparacion>`).
* **Firmas de Métodos y Atributos:** Se han respetado las visibilidades (atributos `private`, métodos `public`) estipuladas en el diagrama.


