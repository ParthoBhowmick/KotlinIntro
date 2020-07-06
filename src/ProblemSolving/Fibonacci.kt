package ProblemSolving

fun main() {
    var list = mutableListOf<Int>();
    val x = readLine()?.toInt();


    list.add(0)
    list.add(1)

    var initial:Int

    if(x!=null && x>1) {
        for (i in 2 until x-1) {
            initial = list.get(i-1) + list.get(i-2)
            list.add(initial)
        }
    }

    println(list)

    println(sumOfList(list.toTypedArray()))

    val array = intArrayOf(1,2,3)

    println(sumOfList2(*array,4,5,*(list.toIntArray())))

}

fun sumOfList(list : Array<Int>):Int {
    var sum = 0
    for (item in list){
        sum = sum + item
    }
    return sum
}

fun sumOfList2(vararg list : Int):Int {
    var sum = 0
    for (item in list){
        sum += item
    }
    return sum
}