package typingsJapgolly.baseui.paymentCardMod

import typingsJapgolly.cardValidator.AnonMinLength
import typingsJapgolly.cardValidator.AnonMonth
import typingsJapgolly.cardValidator.mod.validExpirationDate
import typingsJapgolly.cardValidator.mod.validExpirationMonth
import typingsJapgolly.cardValidator.mod.validExpirationYear
import typingsJapgolly.cardValidator.mod.validNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/payment-card", "valid")
@js.native
object valid extends js.Object {
  def cvv(value: String): typingsJapgolly.cardValidator.mod.valid = js.native
  def cvv(value: String, maxLength: Double): typingsJapgolly.cardValidator.mod.valid = js.native
  def expirationDate(value: String): validExpirationDate = js.native
  def expirationDate(value: AnonMonth): validExpirationDate = js.native
  def expirationMonth(value: String): validExpirationMonth = js.native
  def expirationYear(value: String): validExpirationYear = js.native
  def number(value: String): validNumber = js.native
  def postalCode(value: String): typingsJapgolly.cardValidator.mod.valid = js.native
  def postalCode(value: String, options: AnonMinLength): typingsJapgolly.cardValidator.mod.valid = js.native
}

