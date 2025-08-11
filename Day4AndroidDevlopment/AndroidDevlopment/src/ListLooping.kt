fun main(){
    var number = mutableListOf(1,2,3,4,5)
    for(index in 0 until number.size){
        println("values are Double ${number[index]*2} at the index is $index")
    }
}