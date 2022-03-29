package model

open class Persona {
    var nombre : String = ""
        set(value) {field=value}
        get() = field
    var edad : Int = 0
        set(value) {field=value}
        get() = field
    var cedula : Int = 0
        set(value) {field=value}
        get() = field
    var sexo : Char = 'H'
        set(value) {field=value}
        get() = field
    var peso : Int = 0
        set(value) {field=value}
        get() = field
    var altura : Double = 0.0
        set(value) {field=value}
        get() = field

    constructor()
    constructor(nombre : String, edad : Int, sexo : Char){
        this.nombre = nombre
        this.edad = edad
        this.sexo = sexo
    }
    constructor(nombre : String, edad : Int, cedula : Int, sexo : Char, peso : Int, altura : Double){
        this.nombre = nombre
        this.edad = edad
        this.cedula = cedula
        this.sexo = sexo
        this.peso = peso
        this.altura = altura
    }

}