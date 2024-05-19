package morais.acaio

object Nicities {

    //nullables
    data class Developer(val name: String, val language: String)

    val maybeDeveloper: Developer? = null
    val developer: Developer? = Developer("Morais", "Kotlin")

    data class Person(val name: String, val age: Int){
        infix fun likes(movie: String) = println("$name likes $String")
    }

    class Vector (val x: Int, val y: Int){
        operator fun plus(other: Vector) = Vector(x + other.x, y + other.y)
        operator fun minus(other: Vector) = Vector(x - other.x, y - other.y)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        //?. is a safe call -> turns nullable into null
        println(maybeDeveloper?.name)
        println(developer?.name)

        //?: is the elvis operator -> turns null into a default value
        println(maybeDeveloper?.name ?: "No developer name")

        //infix methods are kinda like natural language
        val person = Person("Morais", 25)
        person likes "Inception"
    }
}