package ProblemSolving

open class Shape (var name : String)  {

    init {
        println("I am parent")
    }

    fun changeName(newName : String) {
        name = newName
    }

}