package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background

import typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that launches a background task when an incoming change notification is received for a Bluetooth LE GATT characteristic. */
trait GattCharacteristicNotificationTrigger extends StObject {
  
  /** Gets the GATT characteristic for which value change notifications are desired. */
  var characteristic: GattCharacteristic
}
object GattCharacteristicNotificationTrigger {
  
  inline def apply(characteristic: GattCharacteristic): GattCharacteristicNotificationTrigger = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any])
    __obj.asInstanceOf[GattCharacteristicNotificationTrigger]
  }
  
  extension [Self <: GattCharacteristicNotificationTrigger](x: Self) {
    
    inline def setCharacteristic(value: GattCharacteristic): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
  }
}
