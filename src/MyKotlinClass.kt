class MyKotlinClass (name:String) {
    var name = "dummy";
    init {
        println("Name is $name")
    }
    constructor(name:String ,id: Int) : this(name) {
        println("id is $id")
    }
}