fun main() {
    println("Hello world")
    var factor:Int
    var factor2 = 5

    val r1 = 1..5
    println(r1)

    val r3 = 5 downTo 1 step 2
    println(r3)

    var moveup = 1.rangeTo(10)
    println(moveup)

    var countDown = 10.downTo(1)
    println(countDown)

    var x= 5
    var str: String =  when(x) {
        1 -> "x is 1"
        2 -> "x is 2"
        else -> "x is none"
    }

    println(str)

    var i = 77

    while (i<3)
        println("while : hello")

    do {
        println("do_while : hello")
        i++
    }while (i<3)

}