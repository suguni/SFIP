import scala.beans.BeanProperty

object ex5 {

  // #1
  class Counter {
    private var value: Int = Int.MaxValue
    def increment() = if (value == Int.MaxValue) value = 0 else value += 1
    def current = value
  }

  val c = new Counter
  c.increment()
  c.increment()
  println("counter: " + c.current)

  // #2
  class BankAccount(private var bal:Int = 0) {
    def balance = bal
    def deposit(money: Int) = if (money > 0) bal += money
    def withdraw(money: Int) = if (balance > money) bal -= money
  }

  // #3
  class Time(hrs:Int, min:Int) {

    require(hrs >= 0 && hrs <= 23, "Hours")
    require(min >= 0 && min <= 59, "Minutes")

    def hours: Int = hrs
    def minutes: Int = min
    def before(other: Time): Boolean = 
      hours < other.hours || (hours == other.hours && minutes < other.minutes)
  }

  // #4
  class Time2(hrs:Int, min:Int) {

    require(hrs >= 0 && hrs <= 23, "Hours")
    require(min >= 0 && min <= 59, "Minutes")

    private val mid_min:Int = hrs * 60 + min

    def hours: Int = mid_min / 60
    def minutes: Int = mid_min % 60
    def before(other: Time2): Boolean = mid_min < other.mid_min
  }

  // #5
  class Student(@BeanProperty var name: String,
    @BeanProperty var id: Long)
/*
public class ex5$Student {
  private java.lang.String name;
  private long id;
  public java.lang.String name();
  public void name_$eq(java.lang.String);
  public void setName(java.lang.String);
  public long id();
  public void id_$eq(long);
  public void setId(long);
  public java.lang.String getName();
  public long getId();
  public ex5$Student(java.lang.String, long);
}
 */

  // #6
  class Person(var age: Int) {
    if (age < 0) age = 0
  }

  // #7
  class Person2(name: String) {
    val firstName: String = name.split(" ")(0)
    val lastName: String = name.split(" ")(1)
  }

  // #8
  class Car(val manufacturer: String, val model: String,
    val year: Int = -1, var license: String = "")

  // #9
  // skip

  // #10
  class Employee {
    private var _name: String = "John Q. Public"
    private var _salary: Double = 0.0

    def this(name: String, salary: Double) {
      this()
      _name = name
      _salary = salary
    }

    def name = _name
    def salary = _salary
  }
}
