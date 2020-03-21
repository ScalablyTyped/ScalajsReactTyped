package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.squareConnect.squareConnectStrings.CUSTOM
  - typingsJapgolly.squareConnect.squareConnectStrings.IN_STOCK
  - typingsJapgolly.squareConnect.squareConnectStrings.SOLD
  - typingsJapgolly.squareConnect.squareConnectStrings.RETURNED_BY_CUSTOMER
  - typingsJapgolly.squareConnect.squareConnectStrings.RESERVED_FOR_SALE
  - typingsJapgolly.squareConnect.squareConnectStrings.SOLD_ONLINE
  - typingsJapgolly.squareConnect.squareConnectStrings.ORDERED_FROM_VENDOR
  - typingsJapgolly.squareConnect.squareConnectStrings.RECEIVED_FROM_VENDOR
  - typingsJapgolly.squareConnect.squareConnectStrings.IN_TRANSIT_TO
  - typingsJapgolly.squareConnect.squareConnectStrings.NONE
  - typingsJapgolly.squareConnect.squareConnectStrings.WASTE
  - typingsJapgolly.squareConnect.squareConnectStrings.UNLINKED_RETURN
*/
trait InventoryStateType extends js.Object

object InventoryStateType {
  @scala.inline
  def CUSTOM: typingsJapgolly.squareConnect.squareConnectStrings.CUSTOM = this.cast("CUSTOM")
  @scala.inline
  def IN_STOCK: typingsJapgolly.squareConnect.squareConnectStrings.IN_STOCK = this.cast("IN_STOCK")
  @scala.inline
  def IN_TRANSIT_TO: typingsJapgolly.squareConnect.squareConnectStrings.IN_TRANSIT_TO = this.cast("IN_TRANSIT_TO")
  @scala.inline
  def NONE: typingsJapgolly.squareConnect.squareConnectStrings.NONE = this.cast("NONE")
  @scala.inline
  def ORDERED_FROM_VENDOR: typingsJapgolly.squareConnect.squareConnectStrings.ORDERED_FROM_VENDOR = this.cast("ORDERED_FROM_VENDOR")
  @scala.inline
  def RECEIVED_FROM_VENDOR: typingsJapgolly.squareConnect.squareConnectStrings.RECEIVED_FROM_VENDOR = this.cast("RECEIVED_FROM_VENDOR")
  @scala.inline
  def RESERVED_FOR_SALE: typingsJapgolly.squareConnect.squareConnectStrings.RESERVED_FOR_SALE = this.cast("RESERVED_FOR_SALE")
  @scala.inline
  def RETURNED_BY_CUSTOMER: typingsJapgolly.squareConnect.squareConnectStrings.RETURNED_BY_CUSTOMER = this.cast("RETURNED_BY_CUSTOMER")
  @scala.inline
  def SOLD: typingsJapgolly.squareConnect.squareConnectStrings.SOLD = this.cast("SOLD")
  @scala.inline
  def SOLD_ONLINE: typingsJapgolly.squareConnect.squareConnectStrings.SOLD_ONLINE = this.cast("SOLD_ONLINE")
  @scala.inline
  def UNLINKED_RETURN: typingsJapgolly.squareConnect.squareConnectStrings.UNLINKED_RETURN = this.cast("UNLINKED_RETURN")
  @scala.inline
  def WASTE: typingsJapgolly.squareConnect.squareConnectStrings.WASTE = this.cast("WASTE")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

