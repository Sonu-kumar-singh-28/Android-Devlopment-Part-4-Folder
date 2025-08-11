fun main(){
    var fruitsList = mutableListOf("Apple", "Banana", "Orange","Papaya","JackFruits")

    println(fruitsList)

    fruitsList.add(1,"Grapes")
    println(fruitsList)

    fruitsList.remove("JackFruits")

    println(fruitsList)

    var result = fruitsList.contains("Banana")

    if(result){
        println("Banana are Exists in the List")
    }else{
        println("Banana are Not Exist in the List ")
    }
}