package ProblemSolving

abstract class Shape (var name : String)  {

    init {
        println(this.toString())
    }

    fun changeName(newName : String) {
        name = newName
    }

    abstract fun perimeter()

    fun calculateArea(a:Int=0,b:Int=0,c:Int=0):Double {
        if(name.equals("Rectangle"))
            return (a*b).toDouble()
        else if(name.equals("triangle"))
            return (0.5*b*c)

        return 0.0
    }

}