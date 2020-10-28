import scala.collection.mutable.ArrayBuffer

//01
val n: Int = 10
val arr = (for (i <- 0 until n) yield i).toArray

//02
for (i <- 1 until arr.length if i % 2 == 1) {
  var tmp: Int = arr(i - 1)
  arr(i - 1) = arr(i)
  arr(i) = tmp
}
arr

//03
for (i <- 0 until arr.length if i % 2 == 0; r <- List(arr(i + 1), arr(i))) yield r

//04
val arr2 = Array(-1, -2, -3, 0, 1, 0, 2, 0, 3)
arr2.sortBy(x => (x == 0, x < 0, x > 0))

//05
val arr3 = Array(0.3, 0.5, -10.453534, 4.23423)
val mean = arr3.sum / arr3.length

//06
val arrBuf = arr2.toBuffer
arr2.sorted(Ordering.Int.reverse)
val b = arrBuf.sorted(Ordering.Int.reverse)

//07
arr2.distinct

//08
val a = ArrayBuffer(2, 3, 5, 7, 11, -1, -5, -16)
var first = false
val indexes = for (i <- (0 until a.length).reverse
                   if first || a(i) < 0) yield i
for (j <- 0 until indexes.length) a(j) = a(indexes(j))
a
a.trimEnd(a.length - indexes.length + 1)
a

//09
import java.util.TimeZone.getAvailableIDs
val time = getAvailableIDs.filter(_ contains "America")
  .map(_ drop("America/".length))
  .sorted

//10
import java.awt.datatransfer._
val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
val buf = ArrayBuffer(flavors.getNativesForFlavor(DataFlavor.imageFlavor))