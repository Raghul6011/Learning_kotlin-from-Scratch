fun main()
{
    var name:String? = "Raghul"
    var length = name.also{println("The name given is ${it}")}?.length
    print(length)
}