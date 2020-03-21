package typingsJapgolly.chromeApps.chrome.usb

import typingsJapgolly.chromeApps.chromeAppsStrings.bulk
import typingsJapgolly.chromeApps.chromeAppsStrings.control
import typingsJapgolly.chromeApps.chromeAppsStrings.interrupt
import typingsJapgolly.chromeApps.chromeAppsStrings.isochronous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Direction, Recipient, RequestType, and TransferType all map to their namesakes within the USB specification. */
@JSGlobal("chrome.usb.TransferType")
@js.native
object TransferType extends js.Object {
  var BULK: bulk = js.native
  var CONTROL: control = js.native
  var INTERRUPT: interrupt = js.native
  var ISOCHRONOUS: isochronous = js.native
}

