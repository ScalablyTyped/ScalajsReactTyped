package typingsJapgolly.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.w3cWebUsb.w3cWebUsbStrings.device
  - typingsJapgolly.w3cWebUsb.w3cWebUsbStrings.interface
  - typingsJapgolly.w3cWebUsb.w3cWebUsbStrings.endpoint
  - typingsJapgolly.w3cWebUsb.w3cWebUsbStrings.other
*/
trait USBRecipient extends js.Object

object USBRecipient {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def device: typingsJapgolly.w3cWebUsb.w3cWebUsbStrings.device = this.cast("device")
  @scala.inline
  def endpoint: typingsJapgolly.w3cWebUsb.w3cWebUsbStrings.endpoint = this.cast("endpoint")
  @scala.inline
  def interface: typingsJapgolly.w3cWebUsb.w3cWebUsbStrings.interface = this.cast("interface")
  @scala.inline
  def other: typingsJapgolly.w3cWebUsb.w3cWebUsbStrings.other = this.cast("other")
}

