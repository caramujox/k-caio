package morais.acaio

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun validateInput(input: String): Boolean {
    val validRegex = input.matches(Regex("[0-1]+"))
    val validLength = input.length <= 8
    return validRegex && validLength
}

fun convertToDecimal(input: String): Int {
    var decimal = 0
    var base = 1
    var binary = input.toInt()

    while (binary > 0) {
        val lastDigit = binary % 10
        binary /= 10
        decimal += lastDigit * base
        base *= 2
    }

    return decimal
}

fun main() {
    println("Digite o valor binario de até 8 digitos: ")

    val binInput = readln()!!

    if (!validateInput(binInput)) {
        println("Valor inválido")
        return
    }
    else {
        println("Valor válido: $binInput")
        println("Convertendo.....")
        println("Valor em decimal: ${convertToDecimal(binInput)}")
    }


}