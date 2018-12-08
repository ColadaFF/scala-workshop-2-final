package step1.algebra.interpreter

import java.util.{Calendar, Date}

object common {
  type Amount = BigDecimal

  def today: Date = Calendar.getInstance.getTime
}

import step1.algebra.interpreter.common._

case class Balance(amount: Amount = 0)

case class Account(no: String, name: String, dateOfOpening: Date = today, dateOfClosing: Option[Date] = None,
                   balance: Balance = Balance())
