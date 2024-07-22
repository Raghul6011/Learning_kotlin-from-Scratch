/*fun main()
{
    var A= readLine()!!.toInt()
    var B = println(A*1000)
    var C = println(A*100000)

}*/

import java.util.Scanner
import java.math.*

fun main()
{   
    var aa = Scanner(System.`in`)
    var a = aa.nextInt()
    var b = aa.nextInt()
    var c = aa.nextInt()

    var X= ((b*b)-4*a*c).sqrt()
    X = (-b + X)
    X = X /(2*a)

    print(X)
}