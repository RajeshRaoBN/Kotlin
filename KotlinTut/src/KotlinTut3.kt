import java.util.*

fun main(args: Array<String>) {

    for(x in 1..10) println("Loop: $x")

    val rand = Random()
    val magicNum = rand.nextInt(50) + 1

    var guess = 0

    while(magicNum != guess) {
        guess += 1
    }

    println("Magic Number was $guess")
}