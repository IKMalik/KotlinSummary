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
