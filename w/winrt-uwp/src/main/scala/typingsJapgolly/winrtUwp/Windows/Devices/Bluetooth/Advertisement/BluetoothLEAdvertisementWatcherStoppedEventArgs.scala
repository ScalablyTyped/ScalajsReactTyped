package typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.BluetoothError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a Stopped event on a BluetoothLEAdvertisementWatcher . */
trait BluetoothLEAdvertisementWatcherStoppedEventArgs extends StObject {
  
  /** Gets the error status for Stopped event. */
  var error: BluetoothError
}
object BluetoothLEAdvertisementWatcherStoppedEventArgs {
  
  inline def apply(error: BluetoothError): BluetoothLEAdvertisementWatcherStoppedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementWatcherStoppedEventArgs]
  }
  
  extension [Self <: BluetoothLEAdvertisementWatcherStoppedEventArgs](x: Self) {
    
    inline def setError(value: BluetoothError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
