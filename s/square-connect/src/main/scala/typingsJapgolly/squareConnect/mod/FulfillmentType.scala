package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.squareConnect.squareConnectStrings.PICKUP
  - typingsJapgolly.squareConnect.squareConnectStrings.SHIPMENT
*/
trait FulfillmentType extends js.Object

object FulfillmentType {
  @scala.inline
  def PICKUP: typingsJapgolly.squareConnect.squareConnectStrings.PICKUP = this.cast("PICKUP")
  @scala.inline
  def SHIPMENT: typingsJapgolly.squareConnect.squareConnectStrings.SHIPMENT = this.cast("SHIPMENT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

