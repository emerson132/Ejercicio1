package controller
import model.Persona

class ControladorPersona  {

    val peso_ideal = 0
    val sobrepeso = 1
    val bajopeso = -1
    var persona = Persona()

    constructor(persona: Persona)  {
        this.persona = persona
    }


    fun calcularIMC():Int{

        if (persona.peso / (persona.altura * persona.altura) < 18.5)
            return bajopeso
        if (persona.peso / (persona.altura * persona.altura) < 25.0)
            return peso_ideal
        else
            return sobrepeso
    }
    fun  esMayorDeEdad():Boolean{
        return persona.edad >17
    }

    fun  comprobarSexo(){
        if (persona.sexo != 'M' || persona.sexo != 'H')
            persona.sexo= 'H'
    }
    fun mostrar(){
       if(calcularIMC() == 0){
           println("Se encuentra en su peso ideal")
       }
        if (calcularIMC() == 1){
            println("Tiene sobrepeso")
        }else{
            println("Se encuentra abajo de su peso ideal")
        }

        if (esMayorDeEdad()){
            println("Es mayor de edad")
        }else{
            println("NO es mayor de edad")
        }

        println("Nombre:" +persona.nombre)
        println("Cedula:" +persona.cedula)
        println("Edad:" +persona.edad)
        println("Peso(KG):" +persona.peso)
        println("Altura(cm):" + persona.altura)
    }
}