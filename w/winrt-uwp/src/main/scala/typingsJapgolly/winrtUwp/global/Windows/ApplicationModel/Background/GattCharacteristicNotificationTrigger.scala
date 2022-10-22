package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Background

import typingsJapgolly.winrtUwp.Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that launches a background task when an incoming change notification is received for a Bluetooth LE GATT characteristic. */
@JSGlobal("Windows.ApplicationModel.Background.GattCharacteristicNotificationTrigger")
@js.native
open class GattCharacteristicNotificationTrigger protected ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Background.GattCharacteristicNotificationTrigger {
  /**
    * Initializes a new instance of the GattCharacteristicNotificationTrigger class.
    * @param characteristic The GATT characteristic for which value change notifications are desired.
    */
  def this(characteristic: GattCharacteristic) = this()
  
  /** Gets the GATT characteristic for which value change notifications are desired. */
  /* CompleteClass */
  var characteristic: GattCharacteristic = js.native
}
