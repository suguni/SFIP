// 1.
def signum(n:Int) : Int = if (n == 0) 0 else if (n > 0) 1 else -1

// 2
val a = -1
val x = if (a > 0) 10
// => x: AnyVal = ()
// 이니까 Unit 인 듯

// 3
// x를 선언하기 위해? 모르겠는걸...

// 4
for (i <- 10 to 0 by -1) println(i)

// 5
def countdown(n:Int) {
  if (n >= 0) {
    print(n + " ")
    countdown(n-1)
  }
}

// 6
def product(str:String):Long = {
  var p:Long = 1
  for (i <- str) p *= i.toInt;
  p
}

// 7
"Hello".foldLeft(1L)((x:Long, y:Char) => x * y)

// 8
def product(str:String):Long = {
  var p:Long = 1
  for (i <- "Hello") p *= i.toInt;
  p
}

// 9
def product2(str:String):Long = {
  if (str.length == 0) 1
  else str.head * product2(str.tail)
}

// 10
def pow1(x:Long, n:Long):Float = {
  if (n == 0) 1L
  else if (n < 0) 1 / pow1(x, -n)
  else if (n % 2 == 0) pow1(x, n / 2) * pow1(x, n / 2)
  else x * pow1(x, n - 1)
}
