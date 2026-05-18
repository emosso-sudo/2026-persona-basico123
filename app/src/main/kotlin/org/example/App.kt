package org.example

class Persona(
    private val nombre: String,
    private val apellido: String,
    private val edad: Int
){
    override fun toString(): String {
        return "Persona(nombre=$nombre, apellido=$apellido, edad=$edad)"
    }
}
fun main() {
    val p = Persona("Euge", "Mosso", 16)
    println(p)  
}