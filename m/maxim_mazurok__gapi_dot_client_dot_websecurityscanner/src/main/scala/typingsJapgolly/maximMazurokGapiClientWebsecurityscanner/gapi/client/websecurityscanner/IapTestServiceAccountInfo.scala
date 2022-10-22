package typingsJapgolly.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IapTestServiceAccountInfo extends StObject {
  
  /** Required. Describes OAuth2 client id of resources protected by Identity-Aware-Proxy (IAP). */
  var targetAudienceClientId: js.UndefOr[String] = js.undefined
}
object IapTestServiceAccountInfo {
  
  inline def apply(): IapTestServiceAccountInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IapTestServiceAccountInfo]
  }
  
  extension [Self <: IapTestServiceAccountInfo](x: Self) {
    
    inline def setTargetAudienceClientId(value: String): Self = StObject.set(x, "targetAudienceClientId", value.asInstanceOf[js.Any])
    
    inline def setTargetAudienceClientIdUndefined: Self = StObject.set(x, "targetAudienceClientId", js.undefined)
  }
}
