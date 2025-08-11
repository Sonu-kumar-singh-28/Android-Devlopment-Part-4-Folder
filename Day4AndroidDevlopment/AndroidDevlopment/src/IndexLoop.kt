fun main(){
    var FruitsItem = mutableListOf("Apple","Orange","Papaya","Grapes","Lichi")

    println(FruitsItem.size)
    for(index in 0 until FruitsItem.size){

        println("Item ${FruitsItem[index]} is at index $index")
    }
}

