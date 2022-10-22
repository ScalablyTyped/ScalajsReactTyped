package typingsJapgolly.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse extends StObject {
  
  /** Resultant DeviceUser object for the action. */
  var deviceUser: js.UndefOr[GoogleAppsCloudidentityDevicesV1DeviceUser] = js.undefined
}
object GoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse {
  
  inline def apply(): GoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse]
  }
  
  extension [Self <: GoogleAppsCloudidentityDevicesV1WipeDeviceUserResponse](x: Self) {
    
    inline def setDeviceUser(value: GoogleAppsCloudidentityDevicesV1DeviceUser): Self = StObject.set(x, "deviceUser", value.asInstanceOf[js.Any])
    
    inline def setDeviceUserUndefined: Self = StObject.set(x, "deviceUser", js.undefined)
  }
}
