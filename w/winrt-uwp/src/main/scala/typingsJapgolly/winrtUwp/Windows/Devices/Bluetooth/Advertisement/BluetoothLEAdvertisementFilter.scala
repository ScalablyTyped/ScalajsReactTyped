package typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Groups parameters used to configure payload-based filtering of received Bluetooth LE advertisements. */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFilter")
@js.native
/** Creates a new BluetoothLEAdvertisementFilter object. */
class BluetoothLEAdvertisementFilter () extends js.Object {
  /** A BluetoothLEAdvertisement object that can be applied as filters to received Bluetooth LE advertisements. */
  var advertisement: BluetoothLEAdvertisement = js.native
  /** Gets a vector of byte patterns with offsets to match advertisement sections in a received Bluetooth LE advertisement. */
  var bytePatterns: IVector[BluetoothLEAdvertisementBytePattern] = js.native
}

