fun main(){
    var a = 5
    for(i in a){
        for(j in i){
            print("*")
        }
        for(j in i downTo 1){
            print("*")
        }
    }
}