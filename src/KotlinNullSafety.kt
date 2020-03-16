// Null Safety
// ?. -> Safe call operator
// !! -> Not null assertion
// ?.let{} -> Safe call with let
// ?: -> Elvis

fun main() {
    // make nullable operator
    //val name: String ?= null
    val name: String ?= "Steve"

    // returns null if is actually null otherwise return the length
    println("The length of name is ${name?.length}")

    // executes the block only if name is not null
    name?.let{
        println("The length of name is ${name.length}")
    }

    // elvis is used to check if not null
    println(name?.length?:-1)

    // strongly said not null, if null then throws exception
     //println("The length of name is ${name!!.length}")

    //lateinit
    lateinit var name2:String
    name2 = "rovman"
    println(name2)

    //lazy initialization
    // initialized only once then used from cache memory
    


}
