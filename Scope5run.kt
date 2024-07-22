fun main(){
    val greet = "Hello".run{val toUpper = this.uppercase()
    "$toUpper, WORLD"}
    print(greet)
}