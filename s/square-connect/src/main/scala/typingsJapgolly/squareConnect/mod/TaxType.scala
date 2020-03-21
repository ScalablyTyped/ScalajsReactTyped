package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.squareConnect.squareConnectStrings.ADDITIVE
  - typingsJapgolly.squareConnect.squareConnectStrings.INCLUSIVE
  - typingsJapgolly.squareConnect.squareConnectStrings.UNKNOWN_TAX
*/
trait TaxType extends js.Object

object TaxType {
  @scala.inline
  def ADDITIVE: typingsJapgolly.squareConnect.squareConnectStrings.ADDITIVE = this.cast("ADDITIVE")
  @scala.inline
  def INCLUSIVE: typingsJapgolly.squareConnect.squareConnectStrings.INCLUSIVE = this.cast("INCLUSIVE")
  @scala.inline
  def UNKNOWN_TAX: typingsJapgolly.squareConnect.squareConnectStrings.UNKNOWN_TAX = this.cast("UNKNOWN_TAX")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

