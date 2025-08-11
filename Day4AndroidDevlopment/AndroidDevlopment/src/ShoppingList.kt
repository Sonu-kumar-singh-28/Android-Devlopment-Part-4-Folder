fun main(){

    //  immutable list = we can not add after the initilizations
    //val ShoppingList =listOf("Processor","Graphics", "SSD");


    // we can modify the list after initalizations
    val ShoppingList = mutableListOf("Processor","RAM","Graphics Card 3060 RTX","SSD")

    // adding item to list
    ShoppingList.add("Colling System")
    ShoppingList.remove("Graphics Card 3060 RTX")
    ShoppingList.add("Graphics Card 4060 RTX")
    println(ShoppingList)


    ShoppingList.removeAt(2)
    println(ShoppingList)

    ShoppingList.removeAt(1)
    println(ShoppingList)

    ShoppingList.add(1,"SSD")
    println(ShoppingList)

    println(ShoppingList[3])



    ShoppingList[3] = "Graphics Card RX 7800XT"
    println(ShoppingList[3])

    println(ShoppingList)

    ShoppingList.set(1,"Cooling System")
    println(ShoppingList)

}