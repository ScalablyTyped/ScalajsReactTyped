package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.squareConnect.squareConnectStrings.FIXED_AMOUNT
  - typingsJapgolly.squareConnect.squareConnectStrings.FIXED_PERCENTAGE
  - typingsJapgolly.squareConnect.squareConnectStrings.VARIABLE_AMOUNT
  - typingsJapgolly.squareConnect.squareConnectStrings.VARIABLE_PERCENTAGE
  - typingsJapgolly.squareConnect.squareConnectStrings.UNKNOWN_DISCOUNT
*/
trait DiscountType extends js.Object

object DiscountType {
  @scala.inline
  def FIXED_AMOUNT: typingsJapgolly.squareConnect.squareConnectStrings.FIXED_AMOUNT = this.cast("FIXED_AMOUNT")
  @scala.inline
  def FIXED_PERCENTAGE: typingsJapgolly.squareConnect.squareConnectStrings.FIXED_PERCENTAGE = this.cast("FIXED_PERCENTAGE")
  @scala.inline
  def UNKNOWN_DISCOUNT: typingsJapgolly.squareConnect.squareConnectStrings.UNKNOWN_DISCOUNT = this.cast("UNKNOWN_DISCOUNT")
  @scala.inline
  def VARIABLE_AMOUNT: typingsJapgolly.squareConnect.squareConnectStrings.VARIABLE_AMOUNT = this.cast("VARIABLE_AMOUNT")
  @scala.inline
  def VARIABLE_PERCENTAGE: typingsJapgolly.squareConnect.squareConnectStrings.VARIABLE_PERCENTAGE = this.cast("VARIABLE_PERCENTAGE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

