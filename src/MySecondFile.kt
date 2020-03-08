fun main() {
    myLoop@ for (i in 1..3)
        for (j in 1..3)
            if (i == 2 && j == 2)
                continue@myLoop
            else
                println("$i  |  $j")

    println(max(4,6))
    println(MyJavaClass.min(4,6));

    area(width = 55, length = 15)
    area(45)
    area(60,width = 70)

}


// function as expression
fun max(a:Int, b:Int) : Int = if (a>b) a else b

// default funciton
@JvmOverloads
fun volume(length:Int, breadth:Int, height:Int = 10) : Int {
    return length*breadth*height
}

//naming parameter -> no need to follow the sequence of parameter,if omit then default value will take place
fun area(length: Int,width: Int = -5) : Unit {
    println("length $length  &  width $width")
}

//extension function
