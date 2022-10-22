package typingsJapgolly.awsSdk.clientsSagemakeredgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentsRequest extends StObject {
  
  /**
    * The name of the fleet that the device belongs to.
    */
  var DeviceFleetName: typingsJapgolly.awsSdk.clientsSagemakeredgeMod.DeviceFleetName
  
  /**
    * The unique name of the device you want to get the configuration of active deployments from.
    */
  var DeviceName: typingsJapgolly.awsSdk.clientsSagemakeredgeMod.DeviceName
}
object GetDeploymentsRequest {
  
  inline def apply(DeviceFleetName: DeviceFleetName, DeviceName: DeviceName): GetDeploymentsRequest = {
    val __obj = js.Dynamic.literal(DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any], DeviceName = DeviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeploymentsRequest]
  }
  
  extension [Self <: GetDeploymentsRequest](x: Self) {
    
    inline def setDeviceFleetName(value: DeviceFleetName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: DeviceName): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
  }
}
