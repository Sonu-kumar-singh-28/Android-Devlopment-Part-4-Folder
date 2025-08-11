import kotlin.concurrent.fixedRateTimer

fun main(){
    var FruitsItem = mutableListOf("Apple","Orange","Papaya","Grapes","Lichi")

    for(item in FruitsItem){
        println(item)

        if(item == "Papaya"){
            FruitsItem.removeLast()
            break
        }
    }

    println(FruitsItem)
}