package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedOrganizationInfo extends StObject {
  
  var consumerInfo: js.UndefOr[Any] = js.undefined
  
  var customerInfo: js.UndefOr[AppsDynamiteSharedOrganizationInfoCustomerInfo] = js.undefined
}
object AppsDynamiteSharedOrganizationInfo {
  
  inline def apply(): AppsDynamiteSharedOrganizationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedOrganizationInfo]
  }
  
  extension [Self <: AppsDynamiteSharedOrganizationInfo](x: Self) {
    
    inline def setConsumerInfo(value: Any): Self = StObject.set(x, "consumerInfo", value.asInstanceOf[js.Any])
    
    inline def setConsumerInfoUndefined: Self = StObject.set(x, "consumerInfo", js.undefined)
    
    inline def setCustomerInfo(value: AppsDynamiteSharedOrganizationInfoCustomerInfo): Self = StObject.set(x, "customerInfo", value.asInstanceOf[js.Any])
    
    inline def setCustomerInfoUndefined: Self = StObject.set(x, "customerInfo", js.undefined)
  }
}
