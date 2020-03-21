package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.squareConnect.squareConnectStrings.NONE
  - typingsJapgolly.squareConnect.squareConnectStrings.LOW_QUANTITY
*/
trait InventoryAlertType extends js.Object

object InventoryAlertType {
  @scala.inline
  def LOW_QUANTITY: typingsJapgolly.squareConnect.squareConnectStrings.LOW_QUANTITY = this.cast("LOW_QUANTITY")
  @scala.inline
  def NONE: typingsJapgolly.squareConnect.squareConnectStrings.NONE = this.cast("NONE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

