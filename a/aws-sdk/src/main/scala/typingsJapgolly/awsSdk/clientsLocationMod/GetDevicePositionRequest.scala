package typingsJapgolly.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDevicePositionRequest extends StObject {
  
  /**
    * The device whose position you want to retrieve.
    */
  var DeviceId: Id
  
  /**
    * The tracker resource receiving the position update.
    */
  var TrackerName: ResourceName
}
object GetDevicePositionRequest {
  
  inline def apply(DeviceId: Id, TrackerName: ResourceName): GetDevicePositionRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], TrackerName = TrackerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevicePositionRequest]
  }
  
  extension [Self <: GetDevicePositionRequest](x: Self) {
    
    inline def setDeviceId(value: Id): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setTrackerName(value: ResourceName): Self = StObject.set(x, "TrackerName", value.asInstanceOf[js.Any])
  }
}
