object Suit extends Enumeration {
  type Suit = Value
  val Spade = Value("♣")
  val Diamond = Value("♦")
  val Heard = Value("♥")
  val Clover = Value("♠")
}

object Reverse extends App {
  for (s <- Suit.values) println(s)

  println(args.reverse.reduce((arg1: String, arg2: String) => arg1 + " " + arg2))
}
