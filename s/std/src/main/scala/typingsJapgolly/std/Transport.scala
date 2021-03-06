package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.nfc_
import typingsJapgolly.std.stdStrings.usb_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.std.stdStrings.ble
  - typingsJapgolly.std.stdStrings.nfc_
  - typingsJapgolly.std.stdStrings.usb_
*/
trait Transport extends js.Object

object Transport {
  @scala.inline
  def ble: typingsJapgolly.std.stdStrings.ble = this.cast("ble")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def nfc: nfc_ = this.cast("nfc")
  @scala.inline
  def usb: usb_ = this.cast("usb")
}

