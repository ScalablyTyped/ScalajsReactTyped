package typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedConfigurationsForDeviceListResponse extends StObject {
  
  /** A managed configuration for an app on a specific device. */
  var managedConfigurationForDevice: js.UndefOr[js.Array[ManagedConfiguration]] = js.undefined
}
object ManagedConfigurationsForDeviceListResponse {
  
  inline def apply(): ManagedConfigurationsForDeviceListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedConfigurationsForDeviceListResponse]
  }
  
  extension [Self <: ManagedConfigurationsForDeviceListResponse](x: Self) {
    
    inline def setManagedConfigurationForDevice(value: js.Array[ManagedConfiguration]): Self = StObject.set(x, "managedConfigurationForDevice", value.asInstanceOf[js.Any])
    
    inline def setManagedConfigurationForDeviceUndefined: Self = StObject.set(x, "managedConfigurationForDevice", js.undefined)
    
    inline def setManagedConfigurationForDeviceVarargs(value: ManagedConfiguration*): Self = StObject.set(x, "managedConfigurationForDevice", js.Array(value*))
  }
}
