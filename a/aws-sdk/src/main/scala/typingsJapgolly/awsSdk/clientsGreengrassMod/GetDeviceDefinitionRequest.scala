package typingsJapgolly.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeviceDefinitionRequest extends StObject {
  
  /**
    * The ID of the device definition.
    */
  var DeviceDefinitionId: string
}
object GetDeviceDefinitionRequest {
  
  inline def apply(DeviceDefinitionId: string): GetDeviceDefinitionRequest = {
    val __obj = js.Dynamic.literal(DeviceDefinitionId = DeviceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeviceDefinitionRequest]
  }
  
  extension [Self <: GetDeviceDefinitionRequest](x: Self) {
    
    inline def setDeviceDefinitionId(value: string): Self = StObject.set(x, "DeviceDefinitionId", value.asInstanceOf[js.Any])
  }
}
