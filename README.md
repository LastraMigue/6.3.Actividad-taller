# TALLER MERCEDAWs - FASES

## FASE 1:

Haz clic **[AQUÍ](DESIGN.md)** para ver el **Diagrama de Clases** completo.

## FASE 2:

A partir del modelo conceptual y arquitectónico definido en la Fase 1, se ha aplicado el proceso de **Ingeniería Directa** para traducir el diagrama UML a código fuente en Java. 

El objetivo de esta fase ha sido reflejar fielmente el "plano" diseñado, construyendo el esqueleto estructural del sistema. Para ello, se han programado las siguientes características:

* **Definición de Entidades:** Se han creado todas las clases (`Cliente`, `Vehiculo`, `Coche`, `Moto`, `Reparacion`, `Mecanico`, `Taller`) y la interfaz (`Especialista`).
* **Traducción de Relaciones:**
  * La herencia y realización se han implementado.
  * Las multiplicidades de composición y asociación (ej. `1..*`) se han resuelto mediante el uso de Colecciones en Java, instanciando listas (`List<Vehiculo>`, `List<Reparacion>`).
* **Firmas de Métodos y Atributos:** Se han respetado las visibilidades (atributos `private`, métodos `public`) estipuladas en el diagrama.

### **ENLACES** ###

1. Clase Cliente → **[Cliente.java](ActividadTaller/src/main/Cliente.java)**
2. Clase Coche → **[Coche.java](ActividadTaller/src/main/Coche.java)**
3. Interfaz Especialista → **[Especialista.java](ActividadTaller/src/main/Especialista.java)**
4. Clase Mecanico → **[Mecanico.java](ActividadTaller/src/main/Mecanico.java)**
5. Clase Moto → **[Moto.java](ActividadTaller/src/main/Moto.java)**
6. Clase Reparacion → **[Reparacion.java](ActividadTaller/src/main/Reparacion.java)**
7. Clase Taller → **[Taller.java](ActividadTaller/src/main/Taller.java)**
8. Clase Vehiculo → **[Vehiculo.java](ActividadTaller/src/main/Vehiculo.java)**
