package typingsJapgolly.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.trezorConnect.trezorConnectStrings.available
  - typingsJapgolly.trezorConnect.trezorConnectStrings.occupied
  - typingsJapgolly.trezorConnect.trezorConnectStrings.used
*/
trait DeviceStatus extends js.Object

object DeviceStatus {
  @scala.inline
  def available: typingsJapgolly.trezorConnect.trezorConnectStrings.available = this.cast("available")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def occupied: typingsJapgolly.trezorConnect.trezorConnectStrings.occupied = this.cast("occupied")
  @scala.inline
  def used: typingsJapgolly.trezorConnect.trezorConnectStrings.used = this.cast("used")
}

