


fun main(args: Array<String>){
    /*println("Hello World")

    // var values can be altered
    var x:Int= 3
    println("The value of x is $x")
    x=5
    println("The value of x is now $x")


    //val value cant be reassigned
    // and doesn't need type specification
    val y=3

    val wholeNumber=5

    val bigNumber=8L

    val precise=3.33

    val decimal= 3.33f

    val iLovePizza= true

    val iLoveBoobs= true

    //division with whole numbers result must be whole number
    //kotlin throws away the result
    val numOp= 3f/4f

    println(numOp)

    //module returns the remainder of a division
    val moduleNum= 10%2

    println("Module: $moduleNum")

    //boolean operations

    val amIAProgrammer= true
    val amIAnADULT=true

    //the adultProgrammer val will only have it's value assigned
    //to true if both vals in the operation are true
    val amIAnAdultProgrammer= amIAnADULT && amIAProgrammer

    val string= "Kotlin is awesome"
    println(string)

    //double exclamations before numerical functions
    //is a way of telling kotlin we know the the number is not null
    // ?: "0" to tell us that something went wrong with the readline function
    val number1= readLine() ?: "0"
    val number2= readLine() ?: "0"
    val sum= number1!!.toInt()+number2!!.toInt()

    println(sum)

     */

    //creating lists
    //imutable
    val shoppingList= listOf<String>("Lambo","PentHouse","Yacht")
    //println(shoppingList[2])

    //mutable list
    val youtuberPerks= mutableListOf("Lambo","PentHouse","Yacht")
    //println(youtuberPerks[2])
    youtuberPerks.add("Hotel")

    /*creating counter var and iterating over list
    var counter=0
    while (counter<youtuberPerks.size){
        println(youtuberPerks[counter])
        counter++
    }

    //for loop
    for (perk in youtuberPerks){
        println(perk)
    }*/
    /*for loop with a range of number
    for (i in 1..100){
        println(i)
    }*/

    //when expression can be used to verify conditions over a value
    val x=3
    when(x){
        in 1..2->println("x is between 1 and 2")
        in 3..10->println("x is between 3 and 10")
        else ->{
            print("x is not in the range of 1 to 10")
        }
    }

}