package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.nfc_
import typingsJapgolly.std.stdStrings.usb_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.usb_
  - typings.std.stdStrings.nfc_
  - typings.std.stdStrings.ble
  - typings.std.stdStrings.internal
*/
trait AuthenticatorTransport extends js.Object

object AuthenticatorTransport {
  @scala.inline
  def ble: typingsJapgolly.std.stdStrings.ble = this.cast("ble")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def internal: typingsJapgolly.std.stdStrings.internal = this.cast("internal")
  @scala.inline
  def nfc: nfc_ = this.cast("nfc")
  @scala.inline
  def usb: usb_ = this.cast("usb")
}

