object ex6 {

  // #1
  object Conversions {
    def inchesToCentimeters(n: Double) = n * 2.54
    def gallonsToLiters(n: Double) = n * 3.78541
    def milesToKilometers(n: Double) = n * 1.60934
  }

  println(Conversions.inchesToCentimeters(10))


  // #2
  abstract class UnitConversion {
    def convert(n: Double) : Double
  }

  object InchesToCentimeters extends UnitConversion {
    override def convert(n: Double) : Double = n * 2.54
  }

  class GallonsToLiters extends UnitConversion {
    override def convert(n: Double) = n * 3.78541
  }

  class MilesToKilometers extends UnitConversion {
    override def convert(n: Double) = n * 1.60934
  }

  println("10 inch to cetimeter : " + InchesToCentimeters.convert(10))


  // #3
  object Origin extends java.awt.Point
  // ???

  // #4
  class Point private (val x: Int, val y: Int)
  object Point {
    def apply(x: Int, y: Int) = new Point(x, y)
  }

  // #5
  object Reverse extends App {
    println(args.reverse.reduce((arg1: String, arg2: String) => arg1 + " " + arg2))
  }

  // #6 - encoding ???
  object Suit extends Enumeration {
    type Suit = Value
    val Spade = Value("♣")
    val Diamond = Value("♦")
    val Heart = Value("♥")
    val Clover = Value("♠")
  }

  // #7
  import Suit._
  def isRed(c: Suit) : Boolean = c == Diamond || c == Heart

  // #8
  object Color extends Enumeration {
    type Color = Value
    val Red = Value(0xff0000)
    val Green = Value(0x00ff00)
    val Blue = Value(0x0000ff)
    val Yellow = Value(0xffff00)
    val Magenta = Value(0xff00ff)
    val Cyan = Value(0x00ffff)
    val Black = Value(0x000000)
    val White = Value(0xffffff)
  }
}
