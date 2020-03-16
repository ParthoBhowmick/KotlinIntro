fun main() {
    var myArray = Array<Int>(5) {0} // 0 is initial value
    for(index in 0 .. myArray.size-1)
        print("${myArray[index]}  ")

    // immutable collection

    var list = listOf<String>("john","Doe")
    //print(list)

    for (element in list)
        print(element)

    var mutlist = mutableListOf<String>("john","Doe")
    mutlist.add("lorem")
    mutlist.add("ipsum")

    println()

    mutlist[0] = "poco"

    for(index in 0 .. mutlist.size-1)
        print("${mutlist[index]}  ")


    var myMap = mapOf<Int,String>(4 to "john",1 to "doe",20 to "loren")

    println()

    for(key in myMap.keys)
        print("${myMap[key]}  ")

    var myHashMap = hashMapOf<Int,String>(4 to "john",1 to "doe",20 to "loren")
    myHashMap.put(5,"Vivan")

    println()

    for(key in myHashMap.values)
        print("${key}  ")

    // mutablesetof retrurn set in sequence but hashset return no sequence

    // filter and map

    val myNumber: List<Int> = listOf(2,3,12,5,1,40)

    val mysmallNumber = myNumber.filter { v-> v<10}
    println(mysmallNumber )

    val mySquareNumberMap = mysmallNumber.map { it*it }
    println(mySquareNumberMap)

    // lambda predicates
    val myNumbers = listOf<Int>(2,20,5,12)
    val myPredicate = {num:Int -> num>10}

    println(myNumbers.all(myPredicate))
    println(myNumbers.any(myPredicate))
    println(myNumbers.count(myPredicate))
    println(myNumbers.find(myPredicate))

}
