// 1
val wishes = Map("iPad" -> 800, "iMac" -> 2000, "Telescope" -> 3000)
val discounted = for ((k, v) <- wishes) yield (k, v * 0.9)

// 2
val words = new scala.collection.mutable.HashMap[String, Int]
val in = new java.util.Scanner(new java.io.File("myfile.txt"))
while (in.hasNext()) {
  val w = in.next()
  words(w) = words.getOrElse(w, 0) + 1
}
in.close()

for ((k, v) <- words) printf("%s: %d\n", k, v)

// 3
import scala.collection.immutable._
def scan(in:java.util.Scanner, m:Map[String, Int]):Map[String, Int] = {
  if (!in.hasNext()) m
  else {
    val key:String = in.next()
    scan(in, m + (key -> (m.getOrElse(key, 0) + 1)))
  }
}

val in = new java.util.Scanner(new java.io.File("myfile.txt"))
val output = scan(in, new HashMap[String, Int])
in.close()
for ((k, v) <- output) printf("%s: %d\n", k, v)

// 4
val in = new java.util.Scanner(new java.io.File("myfile.txt"))
val output = scan(in, new TreeMap[String, Int])
in.close()
for ((k, v) <- output) printf("%s: %d\n", k, v)

// 5

// 6
val weeks = collection.mutable.LinkedHashMap("Monday" -> java.util.Calendar.MONDAY,
  "Tuesday" -> java.util.Calendar.TUESDAY,
  "Wednesday" -> java.util.Calendar.WEDNESDAY,
  "Thursday" -> java.util.Calendar.THURSDAY,
  "Friday" -> java.util.Calendar.FRIDAY,
  "Saturday" -> java.util.Calendar.SATURDAY,
  "Sunday" -> java.util.Calendar.SUNDAY)
for ((k, v) <- weeks) printf("%s %d\n", k, v);

// 7
import scala.collection.JavaConversions.propertiesAsScalaMap
val props: scala.collection.Map[String, String] = System.getProperties()
val max_length = props.keys.maxBy(_.length).length
for ((k, v) <- props) printf("%s | %s\n", (k + (" " * max_length)).substring(0, max_length), v)

// 8
def minmax(values: Array[Int]) = Array(values.min, values.max)

// 9
def lteggt(values: Array[Int], v: Int) = (values.count(_ < v), values.count(_ == v), values.count(_ > v))

// 10
"Hello".zip("World") // => (H, W), (e, o), (l, r), (l, l), (o, d)
// use case : ???
