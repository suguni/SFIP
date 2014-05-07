object session6 {
  println("Hello chapter 6 session")

  object Accounts {
    private var lastNumber = 0
    def newUniqueNumber() = { lastNumber += 1; lastNumber }
  }

  object Account {
    private var lastNumber = 0
    private def newUniqueNumber() = { lastNumber += 1; lastNumber }
  }

  class Account {
    val id = Account.newUniqueNumber()
    private var balance = 0.0
    def deposit(amount: Double) { balance += amount }
  }

  object TrafficLightColor extends Enumeration {
    val Red, Yellow, Green = Value
  }

}
