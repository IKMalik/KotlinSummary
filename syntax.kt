fun helloWorld (){
    val name: String = "Ibrahim"
    val lastName: String = "Malik"
    val age: Int = 132
    println("My name is $name $lastName")
    if (age in 18..200){
        println("I am $age")
    }
    else {
        println("I am a kid")
    }
    
    val aList = mutableListOf("PYTHON", "JAVASCRIPT", "KOTLIN")
    
    aList.add("JAVA")
    println(aList)
    aList.remove("JAVA")
    println(aList)
    
    val newList = listOf("Bob", "Iacopo", "Tyson", "Aidan", "Peter", "Matthew", "Piotr", "Hitesh", "Anna")
    
    for ((index, person) in newList.withIndex()){
        println("$index $person")
    }
    println("Neext")
    for (pos in 2..4){
        println(newList[pos])
    }
}

fun main(){
    helloWorld()
}


/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */
import java.util.*

fun randomFish(){
    val type = fishTypes()
    val age = ageOfFish(type)
    println("Fish type is $type and it is $age old")
}

fun fishTypes(): String{
    val types = listOf("Shark", "Nemo", "Whale", "Uerry", "UnknownEntity")
    println(types.filter{it[0] == 'U'})
    return types[Random().nextInt(types.size)]
}

fun ageOfFish(type: String = "defaultFish"): Int{
    
    return when (type){
        "Shark" -> 1000
        "Nemo" -> 100
        "Whale" -> 310
        "Jerry" -> 99
        else -> -999
    }
}

fun main(){
    randomFish()
    test(132,23)
}

fun test(a: Int, b:Int=3){
    println(a>b)

}
