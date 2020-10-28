import scala.collection.convert.ImplicitConversions.`enumeration AsScalaIterator`
import scala.sys.SystemProperties
//01

val things = Map("jeans" -> 100, "polo" -> 200, "nikes" -> 300)
val discount = for ((k, v) <- things) yield (k, v * 0.9)

//02
import java.util.Scanner
import java.io.File
import java.util
import java.util.function.BiConsumer


val file = new File("/Users/z/42/scala_book/src/04/test.txt")
var scanner = new Scanner(file)
var counter = new scala.collection.mutable.HashMap[String, Int]
while (scanner.hasNext()) {
  val str = scanner.next()
  counter(str) = counter.getOrElse(str, 0) + 1
}
for ((k, v) <- counter) println(k + ": " + v)
scanner.close()

//03
var imm_map = Map[String, Int]()
scanner = new Scanner(file)
while (scanner.hasNext()) {
  val str1 = scanner.next()
  if (imm_map.contains(str1)) {
    val i = imm_map(str1) + 1
    imm_map = imm_map + (str1 -> i)
  }
  else {
    imm_map = imm_map + (str1 -> 1)
  }
}
for ((k, v) <- imm_map) println(k + ": " + v)
scanner.close()

//04
import scala.collection.immutable.SortedMap

var sort_map = SortedMap[String, Int]("1" -> 1)
scanner = new Scanner(file)
while (scanner.hasNext()) {
  val str1 = scanner.next()
  if (sort_map.contains(str1)) {
    val i = sort_map(str1) + 1
    sort_map = sort_map + (str1 -> i)
  }
  else {
    sort_map = sort_map + (str1 -> 1)
  }
}
for ((k, v) <- sort_map) println(k + ": " + v)
scanner.close()

//05
import scala.jdk.CollectionConverters._

val tree: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]().asScala
scanner = new Scanner(file)
while (scanner.hasNext()) {
  val str = scanner.next()
  tree(str) = tree.getOrElse(str, 1) + 1
}
for ((k, v) <- tree) println(k + ": " + v)
scanner.close()

//06
import java.util.Calendar

val map = scala.collection.mutable.LinkedHashMap(1 -> "Monday",
  2 -> "Tuesday", 3 -> "Wednesday", 5-> "Friday", 4 -> "Thursday")
val c2 = Calendar.getInstance()
map(c2.get(Calendar.DAY_OF_WEEK))
for (i <- map) println(i)

//07
val props = new SystemProperties
val max_key = props.keys.maxBy(i => i.length).length
val max_value = props.values.maxBy(i => i.length).length
println("-" * (max_key + max_value + 1))
for ((k, v) <- props) println(k +
  " " * (max_key - k.length) +
  "|" + v)
println("-" * (max_key + max_value + 1))

//08
def minmax(values: Array[Int]) = {
  (values.min, values.max)
}

val arr = Array(-1, 4,3, 5,6,-10,0)
minmax(arr)

//09
def lteqgt(values: Array[Int], v: Int) = {
  (values.filter(_ < v).length, values.filter(_ == v).length,
  values.filter(_ > v).length)
}

lteqgt(arr, 3)

//10
"Hello".zip("World")