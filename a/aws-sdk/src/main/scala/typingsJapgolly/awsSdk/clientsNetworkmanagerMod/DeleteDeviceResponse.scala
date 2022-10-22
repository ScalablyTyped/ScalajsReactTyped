package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDeviceResponse extends StObject {
  
  /**
    * Information about the device.
    */
  var Device: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.Device] = js.undefined
}
object DeleteDeviceResponse {
  
  inline def apply(): DeleteDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDeviceResponse]
  }
  
  extension [Self <: DeleteDeviceResponse](x: Self) {
    
    inline def setDevice(value: Device): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "Device", js.undefined)
  }
}
