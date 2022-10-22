package typingsJapgolly.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminGetDeviceResponse extends StObject {
  
  /**
    * The device.
    */
  var Device: DeviceType
}
object AdminGetDeviceResponse {
  
  inline def apply(Device: DeviceType): AdminGetDeviceResponse = {
    val __obj = js.Dynamic.literal(Device = Device.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminGetDeviceResponse]
  }
  
  extension [Self <: AdminGetDeviceResponse](x: Self) {
    
    inline def setDevice(value: DeviceType): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
  }
}
