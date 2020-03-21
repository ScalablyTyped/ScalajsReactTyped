package typingsJapgolly.moneyMath

import typingsJapgolly.moneyMath.moneyMathNumbers.`0`
import typingsJapgolly.moneyMath.moneyMathStrings.CHF
import typingsJapgolly.moneyMath.moneyMathStrings.CNY
import typingsJapgolly.moneyMath.moneyMathStrings.EUR
import typingsJapgolly.moneyMath.moneyMathStrings.GBP
import typingsJapgolly.moneyMath.moneyMathStrings.JPY
import typingsJapgolly.moneyMath.moneyMathStrings.LTL
import typingsJapgolly.moneyMath.moneyMathStrings.PLN
import typingsJapgolly.moneyMath.moneyMathStrings.SEK
import typingsJapgolly.moneyMath.moneyMathStrings.SKK
import typingsJapgolly.moneyMath.moneyMathStrings.UAH
import typingsJapgolly.moneyMath.moneyMathStrings.USD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("money-math", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def add(a: String, b: String): String = js.native
  def cmp(a: String, b: String): `0` | Double = js.native
  def div(a: String, b: String): String = js.native
  def floatToAmount(value: Double): String = js.native
  def format(currency: CHF | CNY | EUR | GBP | JPY | LTL | PLN | SEK | SKK | UAH | USD | String, value: String): String = js.native
  def isEqual(a: String, b: String): Boolean = js.native
  def isNegative(value: String): Boolean = js.native
  def isPositive(value: String): Boolean = js.native
  def isZero(value: String): Boolean = js.native
  def mul(a: String, b: String): String = js.native
  def percent(a: String, b: String): String = js.native
  def roundTo5Cents(value: String): String = js.native
  def roundUpTo5Cents(value: String): String = js.native
  def subtract(a: String, b: String): String = js.native
}

