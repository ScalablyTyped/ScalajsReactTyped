package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.squareConnect.squareConnectStrings.PHYSICAL_COUNT
  - typingsJapgolly.squareConnect.squareConnectStrings.ADJUSTMENT
  - typingsJapgolly.squareConnect.squareConnectStrings.TRANSFER
*/
trait InventoryType extends js.Object

object InventoryType {
  @scala.inline
  def ADJUSTMENT: typingsJapgolly.squareConnect.squareConnectStrings.ADJUSTMENT = this.cast("ADJUSTMENT")
  @scala.inline
  def PHYSICAL_COUNT: typingsJapgolly.squareConnect.squareConnectStrings.PHYSICAL_COUNT = this.cast("PHYSICAL_COUNT")
  @scala.inline
  def TRANSFER: typingsJapgolly.squareConnect.squareConnectStrings.TRANSFER = this.cast("TRANSFER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

