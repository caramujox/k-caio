package morais.acaio

object Basics {
    @JvmStatic
    fun main(args: Array<String>) {
        //val é uma variável imutável, const equivalent
        val kcaio: String = "Kotlin"
        val jcaio = "Java"

        //var é uma variável mutável
        var caiok: String = "Caio"

        println("It`s time to ${kcaio}!")
        // if can be expression
        val ifCanBeExpression = if (kcaio == "Kotlin") "Yes" else "No"
        println(ifCanBeExpression)

        // when can be expression
        var whenCanBeExpression = when (caiok) {
            "Kotlin" -> "Yes"
            "Java" -> "No"
            else -> "Maybe"
        }
        println(whenCanBeExpression)

        // arrays or lists
        println("Arrays or Lists")
        var numbers = listOf(1, 2, 3, 10, 4, 5)
        for (number in numbers) {
            println(number)
        }


    }
}