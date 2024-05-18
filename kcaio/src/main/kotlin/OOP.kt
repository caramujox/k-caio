package morais.acaio

object OOP {

    //classes
    open class Pet{
        val age = 0
        open fun eat() {
            println("Pet is eating")
        }
    }

    class Dog(val name: String): Pet(){
        fun bark() {
            println("${name} is barking")
        }
        @Override
        override fun eat() {
            println("${name} is eating")
        }
    }

    val aPet = Pet()
    val aDog = Dog("Bobby")


    //abstract class
    abstract class WalkingPet {
        val hasLegs = true
        abstract fun walk()
    }


    @JvmStatic
    fun main(args: Array<String>) {
        aPet.eat()
        aDog.eat()
        aDog.bark()
    }
}