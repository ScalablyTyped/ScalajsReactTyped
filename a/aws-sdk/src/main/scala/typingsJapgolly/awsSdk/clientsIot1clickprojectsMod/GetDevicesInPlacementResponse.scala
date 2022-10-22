package typingsJapgolly.awsSdk.clientsIot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDevicesInPlacementResponse extends StObject {
  
  /**
    * An object containing the devices (zero or more) within the placement.
    */
  var devices: DeviceMap
}
object GetDevicesInPlacementResponse {
  
  inline def apply(devices: DeviceMap): GetDevicesInPlacementResponse = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicesInPlacementResponse]
  }
  
  extension [Self <: GetDevicesInPlacementResponse](x: Self) {
    
    inline def setDevices(value: DeviceMap): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
  }
}
