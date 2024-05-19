package morais.acaio

object Collections {
    //lists
    // immutable list
    val aList: List<Int> = listOf(1, 2, 3, 4, 5)
    //lists api
    val thirdElement = aList[2]
    val thirdElement_v2 = aList.get(2)
    val lenght = aList.size
    val find3 = aList.indexOf(2) // compara com 0, se não achar retorna -1
    val has3 = aList.contains(3) // retorna true ou false

    // mutable list
    val mutableList: List<Int> = listOf(1, 2, 3, 4, 5, 6)

    // arrays
    val anArray: Array<Int> = arrayOf(1, 2, 3, 4, 5, 7)

    //sets - nao tem duplicatas!
    val aSet: Set<Int> = setOf(1, 2, 3, 4, 5, 6, 1, 2, 3)
    val contains1 = aSet.contains(1)
    val contains7 = 7 in aSet

    //maps
    val phoneBook: Map<String, Int> = mapOf("Caio" to 123456, "Joao" to 654321, Pair("Isabela", 987654))
    val caioNumber = phoneBook["Caio"]
    val getIsabelaNumber = phoneBook.get("Isabela")
    val containsCleber = phoneBook.contains("Cleber")
    val contaisIsabela = "Isabela" in phoneBook



    @JvmStatic
    fun main(args: Array<String>) {
        // lists
        println("Third element is $thirdElement")
        println("Third element is $thirdElement_v2")
        println("List size is $lenght")
        //sets
        println("Viu como setOf(1, 2, 3, 4, 5, 6, 1, 2, 3) nao tem duplicatas? $aSet")
        //maps
        println("Phonebook is $phoneBook")
        println("Caio number is $caioNumber")
        println("Isabela number is $getIsabelaNumber")
        println("Contains Cleber? $containsCleber")
        println("Contains Isabela? $contaisIsabela")

    }
}