fun main(){
    var a:String? = "Raghul"
    print(a?.uppercase())       //Using ?. we can perform some operations without facing the error as
                                //error -> only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
}