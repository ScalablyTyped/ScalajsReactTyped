package typingsJapgolly.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object usb {
  type DeviceEvent = typingsJapgolly.chromeApps.chrome.events.Event[
    js.Function1[/* device */ typingsJapgolly.chromeApps.chrome.usb.Device, scala.Unit]
  ]
}
