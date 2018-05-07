import java.util.*

fun main(args: Array<String>) {

    var myArray = arrayOf(1, 1.23, "Doug")

    println(myArray[2])

    myArray[1] = 3.14

    println("Array Lenght: ${myArray.size}")

    println("is Doug in the array ${myArray.contains("Doug")}")

    var partArray = myArray.copyOfRange(1,2)

    println("First element: ${partArray.first()}")

    println("Index of 3.14: ${myArray.indexOf(3.14)} ")

    var sqArray = Array(15, {x -> x * x})

    println(Arrays.toString(sqArray))

    var arr2: Array<Int> = arrayOf(1, 7, 19)
}
