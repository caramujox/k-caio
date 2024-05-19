package morais.acaio

object Dec2Bin {

    fun validateInput(input: String): Boolean {
        val validRegex = input.matches(Regex("[0-9]+"))
        val validLength = input.length <= 8
        return validRegex && validLength
    }

    fun convertToBinary(input: String): String {
        var binary = ""
        var decimal = input.toInt()

        while (decimal > 0) {
            val resto = decimal % 2
            binary = resto.toString() + binary
            decimal /= 2
        }

        return binary
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println("Digite o valor decimal que deseja converter: ")
        val decInput = readLine()!!
        if(validateInput(decInput)) {
            convertToBinary(decInput).also { println("Valor em binário: $it" ) }
        }
        else {
            println("Valor inválido")
            return
        }
    }
}