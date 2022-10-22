package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileDeviceLoginRequest extends StObject {
  
  var mobileDeviceLoginRequest: typingsJapgolly.authorizenet.mod.APIContracts.MobileDeviceLoginRequest
}
object MobileDeviceLoginRequest {
  
  inline def apply(mobileDeviceLoginRequest: typingsJapgolly.authorizenet.mod.APIContracts.MobileDeviceLoginRequest): MobileDeviceLoginRequest = {
    val __obj = js.Dynamic.literal(mobileDeviceLoginRequest = mobileDeviceLoginRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileDeviceLoginRequest]
  }
  
  extension [Self <: MobileDeviceLoginRequest](x: Self) {
    
    inline def setMobileDeviceLoginRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.MobileDeviceLoginRequest): Self = StObject.set(x, "mobileDeviceLoginRequest", value.asInstanceOf[js.Any])
  }
}
