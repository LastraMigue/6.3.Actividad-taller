# TALLER MERCEDAWs - MERMAID

## FASE 1:

Este documento presenta el **modelo de dominio y la estructura de clases** para el sistema de gestión del taller mecánico **"MerceDAWs"**. Mediante un diagrama de clases UML, se detallan las entidades principales del sistema (Clientes, Vehículos, Reparaciones, Mecánicos...) junto con sus relaciones estructurales y de comportamiento.

```mermaid
classDiagram
direction TB
    class Cliente {
        - dni : String
        - nombre : String
        - vehiculos : List~Vehiculo~
        + agregarVehiculo(Vehiculo v) void
    }

    class Vehiculo {
        <<abstract>>
        # matricula : String 
        # modelo : String
        # historialReparaciones : List~Reparacion~
        + agregarReparacion(Reparacion r) void
    }

    class Coche {
    }

    class Moto {
    }

    class Reparacion {
        - idReparacion : String
        - descripcion : String
    }

    class Factura {
        - idFactura : String
        - fecha : Date
        - total : double
        - reparacion : Reparacion
        + emitir() void
    }

    class Especialista {
        <<interface>>
        + reparar(Reparacion r) void
    }

    class Mecanico {
        - idEmpleado : String
        + reparar(Reparacion r) void
    }

    class Taller {
        - nombre : String
        + asignarReparacion(Mecanico m, Reparacion r) void
    }

    %% Relaciones
    Cliente "1" --> "1..*" Vehiculo : posee
    Taller ..> Reparacion : gestiona
    Vehiculo "1" *-- "0..*" Reparacion : contiene
    Vehiculo <|-- Coche : herencia
    Vehiculo <|-- Moto : herencia
    Especialista <|.. Mecanico : implementa
    Taller ..> Mecanico : usa
    Factura "1" --> "1" Reparacion : documenta
```