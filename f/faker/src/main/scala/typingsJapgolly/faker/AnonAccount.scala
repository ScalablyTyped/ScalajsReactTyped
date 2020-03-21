package typingsJapgolly.faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccount extends js.Object {
  def account(): String = js.native
  def account(length: Double): String = js.native
  def accountName(): String = js.native
  def amount(): String = js.native
  def amount(min: Double): String = js.native
  def amount(min: Double, max: Double): String = js.native
  def amount(min: Double, max: Double, dec: Double): String = js.native
  def amount(min: Double, max: Double, dec: Double, symbol: String): String = js.native
  def bic(): String = js.native
  def bitcoinAddress(): String = js.native
  def currencyCode(): String = js.native
  def currencyName(): String = js.native
  def currencySymbol(): String = js.native
  def iban(): String = js.native
  def iban(formatted: Boolean): String = js.native
  def mask(): String = js.native
  def mask(length: Double): String = js.native
  def mask(length: Double, parens: Boolean): String = js.native
  def mask(length: Double, parens: Boolean, elipsis: Boolean): String = js.native
  def routingNumber(): String = js.native
  def transactionType(): String = js.native
}

