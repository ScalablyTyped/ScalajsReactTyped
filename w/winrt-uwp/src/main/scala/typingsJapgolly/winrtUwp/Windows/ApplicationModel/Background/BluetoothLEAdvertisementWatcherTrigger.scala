package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background

import typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFilter
import typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.BluetoothSignalStrengthFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that is registered to scan for Bluetooth LE advertisement in the background. */
@JSGlobal("Windows.ApplicationModel.Background.BluetoothLEAdvertisementWatcherTrigger")
@js.native
/** Creates a new instance of the BluetoothLEAdvertisementWatcherTrigger class. */
class BluetoothLEAdvertisementWatcherTrigger () extends js.Object {
  /** Gets or sets the configuration of Bluetooth LE advertisement filtering that uses payload section-based filtering. */
  var advertisementFilter: BluetoothLEAdvertisementFilter = js.native
  /** Gets the maximum out of range timeout supported for the SignalStrengthFilter property of this trigger. */
  var maxOutOfRangeTimeout: Double = js.native
  /** Gets the maximum sampling interval supported for the SignalStrengthFilter property of this trigger. The maximum sampling interval is used to deactivate the sampling filter and only trigger received events based on the device coming in and out of range. */
  var maxSamplingInterval: Double = js.native
  /** Gets the minimum out of range timeout supported for the SignalStrengthFilter property of this trigger. */
  var minOutOfRangeTimeout: Double = js.native
  /** Gets the minimum sampling interval supported for the SignalStrengthFilter property of this trigger. The minimum sampling interval for the background watcher cannot be zero unlike its foreground counterpart. */
  var minSamplingInterval: Double = js.native
  /** Gets or sets the configuration of Bluetooth LE advertisement filtering that uses signal strength-based filtering. */
  var signalStrengthFilter: BluetoothSignalStrengthFilter = js.native
}

