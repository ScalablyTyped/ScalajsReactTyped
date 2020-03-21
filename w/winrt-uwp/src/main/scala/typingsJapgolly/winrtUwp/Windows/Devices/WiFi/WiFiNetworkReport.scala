package typingsJapgolly.winrtUwp.Windows.Devices.WiFi

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the result of a network scan operation. */
@JSGlobal("Windows.Devices.WiFi.WiFiNetworkReport")
@js.native
abstract class WiFiNetworkReport () extends js.Object {
  /** A list of available networks. */
  var availableNetworks: IVectorView[WiFiAvailableNetwork] = js.native
  /** Contains the result of a network scan operation. */
  var timestamp: js.Date = js.native
}

