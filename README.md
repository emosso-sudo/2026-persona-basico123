# Consigna: Clase Persona en Kotlin

## Objetivo

Crear una clase `Persona` en Kotlin que modele los datos básicos de una persona.

## Requisitos

1. La clase debe llamarse `Persona`.
2. Debe tener los siguientes **atributos privados**:
   - `nombre` (String)
   - `apellido` (String)
   - `edad` (Int)
3. Implementar un **constructor** que reciba los tres parámetros e inicialice los atributos.
4. Sobrescribir el método `toString()` para que devuelva una representación en cadena de la persona con el formato:
   ```
   Persona(nombre=Juan, apellido=Pérez, edad=30)
   ```

## Ejemplo de uso esperado

```kotlin
fun main() {
    val p = Persona("Juan", "Pérez", 30)
    println(p)  // Persona(nombre=Juan, apellido=Pérez, edad=30)
}
```

## Entrega

Subir el archivo `Persona.kt` con la implementación completa.
