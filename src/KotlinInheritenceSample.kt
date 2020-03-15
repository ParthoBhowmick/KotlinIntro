fun main(args: Array<String>) {
//    var dogVar = Dog()
//    dogVar.color = "brown"
//    dogVar.getClr()
//
//    var catVar = Cat()
//    catVar.eat()

    var childCls2 = ChildCls2("Black","African")

}

open class ParentCls{
    lateinit var color:String
    constructor(color:String) {
        this.color = color
    }
}

class childCls : ParentCls {
    lateinit var breed: String
    constructor(color: String, breed:String):super(color) {
        this.breed = breed
    }
}

open class ParentCls2(color:String){
    init {
        println("Parent color is ${color}")
    }
}

class ChildCls2 : ParentCls2 {
    var breed: String
    constructor(color: String, breed:String):super(color) {
        this.breed = breed
        println("Child color is ${color} and breed is ${this.breed}")
    }
}

open class Animal {
    var color: String = ""
    open fun eat() {
        println("Animal Eating")
    }
}

class Dog:Animal() {

    fun getClr() {
        println("color is ${this.color}")
    }

    fun bark() {
        println("Dog is barking..")
    }
}

class Cat(var breed: String, sex:String):Animal() {



    override fun eat() {
        println("Cat is eating")
    }

    init {
        println("breed is ${this.breed} and sex is ${sex}")
    }

    fun meow() {
        println("Cat is meowing..")
    }

}

/// Important notes -> in case of kotlin all class ,
/// their func , variable are public final by nature
/// thats why kotlin class can't be inherited directly
/// make parent class open and use constructor to inherit

// public, protected, internal, private
// internal variable is accessed in same module and protected in derived class

// abstract class is open by default

// in interface everything is open in nature