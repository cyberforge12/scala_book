
// 01
3.toFloat

//02
import scala.math.sqrt
val root = sqrt(3)
root * root

//03
"res is val"

//04
"crazy" * 3

//05
10 max 2
10.max(12)

//06
var x: BigInt = 2
x.pow(1024)

//07
import scala.math.BigInt.probablePrime
import scala.util.Random
probablePrime(100, Random)

//08
var x = BigInt.apply(8 * 10, Random)
val str: String = x.toString(36)

//09
val myString: String = "Hello"
myString.charAt(0)
myString.last

//10
myString.take(2)
myString.takeRight(2)
myString.drop(2)
myString.dropRight(2)
/*
The main benefit is that it allows you to treat a String as a sequential collection of characters, much like any other Seq or List instance.

In fact, these methods (and other important transformational functions like map, flatMap and filter) are not implemented in String itself (which is, in fact, simply the Java String class, not a native-Scala class), but in the StringOps class (which extends StringLike -> ... -> SeqLike), and an implicit conversion ensures that a String is converted into a StringOps whenever you need access to these methods.

This means you can pass a String to a list-manipulation function and the function will receive a StringOps instance, work on it like any other SeqLike entity without needing to know it is actually a String, and hand back the results of the manipulation, which StringOps is designed to present back to you as a String.

If you know an entity is a String in a given piece of code, feel free to use the String-specific methods, but the availability of this implicit conversion means that you can also take advantage of a String's "character sequence"-like nature to treat it like any other list in situations where that may be convenient.
 */
