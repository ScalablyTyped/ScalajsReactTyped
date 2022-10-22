package typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.BluetoothError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a StatusChanged event on a BluetoothLEAdvertisementPublisher . */
trait BluetoothLEAdvertisementPublisherStatusChangedEventArgs extends StObject {
  
  /** Gets the error status for a StatusChanged event on a BluetoothLEAdvertisementPublisher . */
  var error: BluetoothError
  
  /** Gets the new status of the BluetoothLEAdvertisementPublisher . */
  var status: BluetoothLEAdvertisementPublisherStatus
}
object BluetoothLEAdvertisementPublisherStatusChangedEventArgs {
  
  inline def apply(error: BluetoothError, status: BluetoothLEAdvertisementPublisherStatus): BluetoothLEAdvertisementPublisherStatusChangedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementPublisherStatusChangedEventArgs]
  }
  
  extension [Self <: BluetoothLEAdvertisementPublisherStatusChangedEventArgs](x: Self) {
    
    inline def setError(value: BluetoothError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: BluetoothLEAdvertisementPublisherStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
