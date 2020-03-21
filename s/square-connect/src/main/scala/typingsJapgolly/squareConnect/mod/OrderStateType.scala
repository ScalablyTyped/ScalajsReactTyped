package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.squareConnect.squareConnectStrings.OPEN
  - typingsJapgolly.squareConnect.squareConnectStrings.COMPLETED
  - typingsJapgolly.squareConnect.squareConnectStrings.CANCELED
*/
trait OrderStateType extends js.Object

object OrderStateType {
  @scala.inline
  def CANCELED: typingsJapgolly.squareConnect.squareConnectStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def COMPLETED: typingsJapgolly.squareConnect.squareConnectStrings.COMPLETED = this.cast("COMPLETED")
  @scala.inline
  def OPEN: typingsJapgolly.squareConnect.squareConnectStrings.OPEN = this.cast("OPEN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

