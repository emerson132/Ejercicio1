package view

import controller.ControladorPersona
import model.Persona

class VistaPersona {


    fun iniciar(){
        var nombre: String
        var edad: Int
        var sexo: Char
        var altura: Double
        var peso: Int
        println("Ingrese su nombre: ")
        nombre = readLine()?.toString() as String
        println("Ingrese su edad: ")
        edad = readLine()?.toInt() as Int
        println("Ingrese su sexo(H/M): ")
        sexo = readLine()!!.first()
        println("Ingrese su peso: ")
        peso = readLine()?.toInt() as Int
        println("Ingrese su altura: ")
        altura = readLine()?.toDouble() as Double

        var persona1 = Persona(nombre,edad,12345678,sexo,peso,altura)
        var persona2 = Persona(nombre,edad,sexo)
        persona2.peso = 41
        persona2.altura = 1.69
        var persona3 = Persona()
        persona3.nombre = "Antonio"
        persona3.edad = 14
        persona3.sexo = 'H'
        persona3.cedula = 456123
        persona3.peso = 65
        persona3.altura = 1.68

        var controladorPersona1 = ControladorPersona(persona1)
        var controladorPersona2 = ControladorPersona(persona2)
        var controladorPersona3 = ControladorPersona(persona3)

        println("Objeto1")
        controladorPersona1.mostrar()
        println("Objeto2")
        controladorPersona2.mostrar()
        println("Objeto3")
        controladorPersona3.mostrar()


    }
}