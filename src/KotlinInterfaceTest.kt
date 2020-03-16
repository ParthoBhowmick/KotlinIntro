class KotlinInterfaceTest {

}

// lamda as interface in java
fun main() {
    addNumber(7,5,{x,y->x+y})
}

fun addNumber(a:Int, b:Int, action:(Int,Int)->(Int)) {
    println(action(a,b))
}