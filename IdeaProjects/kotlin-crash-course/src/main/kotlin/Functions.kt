import java.lang.Exception

fun main(){
    //print10Numbers()
    //we can specify the name of the parameter
    //to have better readability
    val x=isEven(number = 5)
    val y=7;
    //println(y.isOdd())

    /*
    val dog= Dog()
    dog.makeSound()
    val cat=Cat()
    cat.makeSound()

    //we can create anonymous class when we know we are
    //only gonna use that class once
    val bear=object : Animal("Polar bear"){
        override fun makeSound() {
            println("ROOOOAAR!!!")
        }
    }
    bear.makeSound()*/
    val number= readLine() ?:"0"
    val parsedNumber=try {
        number.toInt()
    }catch (e: Exception){
        0
    }
    println(parsedNumber)
}




// we can specify a value of a parameter
//or leave to be assigned later
fun isEven(number: Int=10): Boolean{
    return number%2==0
}

fun Int.isOdd(): Boolean{
    return this %2==1
}

fun print10Numbers(){
    for(i in 1..10){
        println(i)
    }
}