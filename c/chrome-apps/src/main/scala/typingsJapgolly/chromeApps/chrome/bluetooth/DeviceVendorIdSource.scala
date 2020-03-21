package typingsJapgolly.chromeApps.chrome.bluetooth

import typingsJapgolly.chromeApps.chromeAppsStrings.bluetooth_
import typingsJapgolly.chromeApps.chromeAppsStrings.usb_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chromeApps.chromeAppsStrings.bluetooth_
  - typingsJapgolly.chromeApps.chromeAppsStrings.usb_
*/
trait DeviceVendorIdSource extends js.Object

object DeviceVendorIdSource {
  @scala.inline
  def bluetooth: bluetooth_ = this.cast("bluetooth")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def usb: usb_ = this.cast("usb")
}

