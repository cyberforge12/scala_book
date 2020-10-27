import java.beans.BeanProperty

import scala.reflect.internal.NoPhase.assignsFields.&&


//01
def calculateSignum (int: Int): Int = {
  if (int > 1) 1
  else if (int == 0) 0
  else -1
}

calculateSignum(10)
calculateSignum(Int.MaxValue)
calculateSignum(Int.MaxValue + 1)
calculateSignum(0)
calculateSignum(-1)

//02
"{} is of type Unit aka void"

//03
var x: Unit = ()
var y: Int = 1
x = y = 1

//04
for (i <- (0 to 10).reverse)
  println(i)

//05

def countdown(n: Int): Unit = {
  for (i <- (0 to n).reverse)
    println(i)
}

countdown(10)
countdown(56)

//06
val str: String = "111111111"
var mult: BigInt = 1;
for (i <- str) {
  println(i + " " + i.toInt);
  mult *= i.toInt
}
mult

//07
val x: BigInt = 1
str.foldLeft(x)((x, y) => x * y)

//08

def product (str: String) = {
  val x: BigInt = 1
  str.foldLeft(x)((x, y) => x * y)
}

product(str)

//09
def productRecursive (str: String, n: BigInt = 1): BigInt = {
  if (str.length == 0)
    n
  else
    productRecursive(str.drop(1), n * str.codePointAt(0))
}

product(str)

//10

import scala.math.BigDecimal.double2bigDecimal

def poke (x: Double, n: Int) = {
  if (x == 0)
    1
  else if (n < 0)
    1 / x.pow(-n)
  else if ((n.&(1) == 0) && (n > 0))
    x.pow(n / 2).pow(2)
  else if ((n.&(1) == 1) && (n > 0))
    x * x.pow(n - 1)
}

poke(0, 10)
poke(2, -1)
poke(2, -2)
poke(2.5, 2)
poke(3, 2)
