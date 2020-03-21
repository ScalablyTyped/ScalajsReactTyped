package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.squareConnect.squareConnectStrings.PROPOSED
  - typingsJapgolly.squareConnect.squareConnectStrings.RESERVED
  - typingsJapgolly.squareConnect.squareConnectStrings.PREPARED
  - typingsJapgolly.squareConnect.squareConnectStrings.COMPLETED
  - typingsJapgolly.squareConnect.squareConnectStrings.CANCELED
  - typingsJapgolly.squareConnect.squareConnectStrings.FAILED
*/
trait FulfillmentStateType extends js.Object

object FulfillmentStateType {
  @scala.inline
  def CANCELED: typingsJapgolly.squareConnect.squareConnectStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def COMPLETED: typingsJapgolly.squareConnect.squareConnectStrings.COMPLETED = this.cast("COMPLETED")
  @scala.inline
  def FAILED: typingsJapgolly.squareConnect.squareConnectStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def PREPARED: typingsJapgolly.squareConnect.squareConnectStrings.PREPARED = this.cast("PREPARED")
  @scala.inline
  def PROPOSED: typingsJapgolly.squareConnect.squareConnectStrings.PROPOSED = this.cast("PROPOSED")
  @scala.inline
  def RESERVED: typingsJapgolly.squareConnect.squareConnectStrings.RESERVED = this.cast("RESERVED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

