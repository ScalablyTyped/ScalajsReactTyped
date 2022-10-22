package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Background

import typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementFilter
import typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.BluetoothSignalStrengthFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that is registered to scan for Bluetooth LE advertisement in the background. */
@JSGlobal("Windows.ApplicationModel.Background.BluetoothLEAdvertisementWatcherTrigger")
@js.native
/** Creates a new instance of the BluetoothLEAdvertisementWatcherTrigger class. */
open class BluetoothLEAdvertisementWatcherTrigger ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.BluetoothLEAdvertisementWatcherTrigger {
  
  /** Gets or sets the configuration of Bluetooth LE advertisement filtering that uses payload section-based filtering. */
  /* CompleteClass */
  var advertisementFilter: BluetoothLEAdvertisementFilter = js.native
  
  /** Gets the maximum out of range timeout supported for the SignalStrengthFilter property of this trigger. */
  /* CompleteClass */
  var maxOutOfRangeTimeout: Double = js.native
  
  /** Gets the maximum sampling interval supported for the SignalStrengthFilter property of this trigger. The maximum sampling interval is used to deactivate the sampling filter and only trigger received events based on the device coming in and out of range. */
  /* CompleteClass */
  var maxSamplingInterval: Double = js.native
  
  /** Gets the minimum out of range timeout supported for the SignalStrengthFilter property of this trigger. */
  /* CompleteClass */
  var minOutOfRangeTimeout: Double = js.native
  
  /** Gets the minimum sampling interval supported for the SignalStrengthFilter property of this trigger. The minimum sampling interval for the background watcher cannot be zero unlike its foreground counterpart. */
  /* CompleteClass */
  var minSamplingInterval: Double = js.native
  
  /** Gets or sets the configuration of Bluetooth LE advertisement filtering that uses signal strength-based filtering. */
  /* CompleteClass */
  var signalStrengthFilter: BluetoothSignalStrengthFilter = js.native
}
