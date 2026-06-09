Actividad sumativa 1 – DESARROLLO ORIENTADO A OBJETOS I_003A
👤 Autor Jorge Munoz Leon

    Nombre completo: Jorge Munoz Leon
    Sección: DESARROLLO ORIENTADO A OBJETOS I_003A >>> 2026_202_OL_PRY2202_24613390_PCT
    Carrera: Analista Programador
    Sede: [Online]

📘 Descripción general del sistema

Este proyecto corresponde a la Evaluación Sumativa 1 de la asignatura Desarrollo Orientado a Objetos I. Proyecto desarrollado en Java para la asignatura de Fundamentos de Programación Orientada a Objetos.
El sistema modela a las personas vinculadas a la empresa Llanquihue Tour mediante la aplicación de conceptos básicos de Programación Orientada a Objetos, tales como encapsulamiento, herencia, composición y polimorfismo.

## Objetivos

- Representar personas relacionadas con la empresa.
- Aplicar encapsulamiento mediante atributos privados.
- Implementar herencia utilizando una clase extendida.
- Utilizar composición entre clases.
- Mostrar la información de los objetos mediante el método `toString()` sobrescribiendo el metodo con @override.

---

## Estructura del Proyecto

```
src
│
├── model
│   ├── Direccion.java
│   ├── Persona.java
│   └── Empleado.java
│
└── app
    └── Main.java
```

---

## Clases Implementadas

### Direccion

Representa la dirección asociada a una persona.

Atributos:
- calle
- ciudad

### Persona

Clase base del sistema.

Atributos:
- rut
- nombre
- direccion

### Empleado

Clase que hereda de Persona.

Atributos:
- cargo

### Main

Clase principal utilizada para probar el funcionamiento del sistema.

---

## Conceptos de POO Aplicados

### Encapsulamiento

Todos los atributos fueron declarados como privados y se accede a ellos mediante métodos getter y setter.

### Herencia

La clase `Empleado` hereda de la clase `Persona`.

### Composición

La clase `Persona` contiene un objeto de tipo `Direccion`.

### Polimorfismo

Se utiliza la sobrescritura del método `toString()` para mostrar la información de los objetos.

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluacion Sumativa 1 | 08/06/2026

---
