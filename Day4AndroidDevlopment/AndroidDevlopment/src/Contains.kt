fun main(){
    val ShoppingList = mutableListOf("Processor","RAM","Graphics Card 3060 RTX","SSD")

    val hasRam = ShoppingList.contains("RAM")
    if(hasRam){
        println("HasH Ram in the list")
    }else{
        println("HasRam not in the List ")
    }
    
}
