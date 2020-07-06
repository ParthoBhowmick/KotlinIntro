package ProblemSolving

fun main() {
    var rectangle = Rectangle(4,5)
    rectangle.area()

    var triangle = Triangle(5,10,5)
    println(triangle.calculateArea(b=triangle.b,c=triangle.c))
    triangle.perimeter()

    var square = Rectangle(5)
    square.area()
    square.perimeter()

    // testing overloading
    println(changeOrder(mutableListOf(1,2,3,4,5)))

    println(changeOrder(arrayOf(10,20,30,40,50)))

}

fun changeOrder(list: MutableList<Int>) : MutableList<Int> {
    //println(list)
    var newList = mutableListOf<Int>()
    var start = 0
    var last = list.size-1

    while (start!=last) {
        newList.add(list[start])
        newList.add(list[last])
        ++start
        --last
    }

    newList.add(list[start])
    //println(newList)
    return newList

}

fun changeOrder(list: Array<Int>) : MutableList<Int>{
    //println(changeOrder(list.toMutableList()).toTypedArray().contentToString())
    return changeOrder(list.toMutableList())
}