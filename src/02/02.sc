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