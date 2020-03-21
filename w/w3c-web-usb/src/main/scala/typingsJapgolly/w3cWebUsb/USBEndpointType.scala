package typingsJapgolly.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.w3cWebUsb.w3cWebUsbStrings.bulk
  - typingsJapgolly.w3cWebUsb.w3cWebUsbStrings.interrupt
  - typingsJapgolly.w3cWebUsb.w3cWebUsbStrings.isochronous
*/
trait USBEndpointType extends js.Object

object USBEndpointType {
  @scala.inline
  def bulk: typingsJapgolly.w3cWebUsb.w3cWebUsbStrings.bulk = this.cast("bulk")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def interrupt: typingsJapgolly.w3cWebUsb.w3cWebUsbStrings.interrupt = this.cast("interrupt")
  @scala.inline
  def isochronous: typingsJapgolly.w3cWebUsb.w3cWebUsbStrings.isochronous = this.cast("isochronous")
}

