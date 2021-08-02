fun main() {
    val list= listOf("Kotlin", "is","Fun")
    val count =list.customCount { currentString->currentString.length>=3 }
    println(count)


}

fun List<String>.customCount(function: (String)->Boolean):Int{
    var counter=0;

    for (string in this){
        if(function(string)){
            counter++
        }
    }
    return counter
}