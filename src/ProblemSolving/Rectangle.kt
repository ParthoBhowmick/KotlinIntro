package ProblemSolving

class Rectangle  (
    var a : Int,
    var b : Int
):Shape("Rectangle"){

    constructor(a:Int) : this(a,a)

    init {
        println(this.toString())
    }

    fun area() = println(calculateArea(a,b))
    override fun perimeter() = println(2*(a+b))



}