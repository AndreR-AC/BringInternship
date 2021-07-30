fun main(args:Array<String>){
    //print10Numbers()
    //we can specify the name of the parameter
    //to have better readability
    val x=isEven(number = 5)
    println(x)
}
// we can specify a value of a parameter
//or leave to be assigned later
fun isEven(number: Int=10): Boolean{
    return number%2==0
}

fun print10Numbers(){
    for(i in 1..10){
        println(i)
    }
}