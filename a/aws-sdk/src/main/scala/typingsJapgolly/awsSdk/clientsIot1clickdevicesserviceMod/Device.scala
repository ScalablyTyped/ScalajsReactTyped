package typingsJapgolly.awsSdk.clientsIot1clickdevicesserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Device extends StObject {
  
  /**
    * The user specified attributes associated with the device for an event.
    */
  var Attributes: js.UndefOr[typingsJapgolly.awsSdk.clientsIot1clickdevicesserviceMod.Attributes] = js.undefined
  
  /**
    * The unique identifier of the device.
    */
  var DeviceId: js.UndefOr[string] = js.undefined
  
  /**
    * The device type, such as "button".
    */
  var Type: js.UndefOr[string] = js.undefined
}
object Device {
  
  inline def apply(): Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Device]
  }
  
  extension [Self <: Device](x: Self) {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setDeviceId(value: string): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setType(value: string): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
