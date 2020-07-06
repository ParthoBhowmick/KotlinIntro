package ProblemSolving

class Triangle (
    var a:Int,
    var b:Int,
    var c:Int
): Shape("triangle") {
    init {
        println(this.toString())
    }

    override fun perimeter() = println(a+b+c)


}