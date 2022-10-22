package typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Groups parameters used to configure payload-based filtering of received Bluetooth LE advertisements. */
trait BluetoothLEAdvertisementFilter extends StObject {
  
  /** A BluetoothLEAdvertisement object that can be applied as filters to received Bluetooth LE advertisements. */
  var advertisement: BluetoothLEAdvertisement
  
  /** Gets a vector of byte patterns with offsets to match advertisement sections in a received Bluetooth LE advertisement. */
  var bytePatterns: IVector[BluetoothLEAdvertisementBytePattern]
}
object BluetoothLEAdvertisementFilter {
  
  inline def apply(
    advertisement: BluetoothLEAdvertisement,
    bytePatterns: IVector[BluetoothLEAdvertisementBytePattern]
  ): BluetoothLEAdvertisementFilter = {
    val __obj = js.Dynamic.literal(advertisement = advertisement.asInstanceOf[js.Any], bytePatterns = bytePatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothLEAdvertisementFilter]
  }
  
  extension [Self <: BluetoothLEAdvertisementFilter](x: Self) {
    
    inline def setAdvertisement(value: BluetoothLEAdvertisement): Self = StObject.set(x, "advertisement", value.asInstanceOf[js.Any])
    
    inline def setBytePatterns(value: IVector[BluetoothLEAdvertisementBytePattern]): Self = StObject.set(x, "bytePatterns", value.asInstanceOf[js.Any])
  }
}
