package morais.acaio

object FunctionalProgramming {

    //esse treco
    val tenxFun: (Int) -> Int = fun(x:Int): Int { return x * 10 }
    //eh igual a esse treco aqui
    val tenxFun2: (Int) -> Int = { x -> x * 10 }
    //que eh igual a esse treco aqui
    val tenxFun3 = { x: Int -> x * 10 }

    //multi-value lambda
    val adder = { x: Int, y: Int -> x + y }

    //collections
    val list = listOf(1, 2, 3, 4, 5)
    val tenxNumbers = list.map( { x:Int -> x * 10 })
    val tenxNumbers3 = list.map(tenxFun)

    //functional api
    //filter
    val evenNumbers = list.filter { x -> x % 2 == 0 }
    //reduce
    val sum = list.reduce { acc, x -> acc + x }
    //predicates (aqui ta me dando ptsd)
    val firstEven = list.first { x -> x % 2 == 0 }
    val allEven = list.all { x -> x % 2 == 0 }
    val findAny = list.find { x -> x % 2 == 0 }
    val correAteVal = list.takeWhile { x -> x < 4} //para na primeira ocorrencia do valor na lista
    val evenNumberCount = list.count { x -> x % 2 == 0 }
    val stringRep = list.joinToString("|","{", "}") { x -> x.toString() }


    @JvmStatic
    fun main(args: Array<String>) {
        println(tenxFun2(5))
        println(tenxFun3(5))
        println(adder(5, 5))
        println(sum)
        println(firstEven)
        println(allEven)
        println(findAny)
        println(correAteVal)
        println(evenNumberCount)
        println(stringRep)
    }
}