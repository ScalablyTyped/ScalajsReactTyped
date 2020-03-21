package typingsJapgolly.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.trezorConnect.trezorConnectStrings.valid
  - typingsJapgolly.trezorConnect.trezorConnectStrings.outdated
  - typingsJapgolly.trezorConnect.trezorConnectStrings.required
*/
trait DeviceFirmwareStatus extends js.Object

object DeviceFirmwareStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def outdated: typingsJapgolly.trezorConnect.trezorConnectStrings.outdated = this.cast("outdated")
  @scala.inline
  def required: typingsJapgolly.trezorConnect.trezorConnectStrings.required = this.cast("required")
  @scala.inline
  def valid: typingsJapgolly.trezorConnect.trezorConnectStrings.valid = this.cast("valid")
}

