fun main()
{
    var stringlist: List<String?> = listOf("One","Two","Three")
    var newlist = listOf<String>()
    for(items in stringlist)
    {
        items?.let{newlist = newlist.plus(it)}
        items?.also{it -> println(it)}
    }
}