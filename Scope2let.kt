fun main(){
    var list:List<String?> = listOf("Raghul","Janani","MyLove")
    var newlist = listOf<String?>()
    
    for(item in list){
        item?.let{newlist = newlist.plus(it)}
    }
    for (i in newlist ){
        println(i)
    }
}