package typingsJapgolly.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MerchantAccountId extends StObject {
  
  var authorization: js.UndefOr[String] = js.undefined
  
  var client: js.UndefOr[typingsJapgolly.braintreeWeb.modulesClientMod.Client] = js.undefined
  
  var merchantAccountId: js.UndefOr[String] = js.undefined
}
object MerchantAccountId {
  
  inline def apply(): MerchantAccountId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MerchantAccountId]
  }
  
  extension [Self <: MerchantAccountId](x: Self) {
    
    inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    inline def setClient(value: typingsJapgolly.braintreeWeb.modulesClientMod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setMerchantAccountId(value: String): Self = StObject.set(x, "merchantAccountId", value.asInstanceOf[js.Any])
    
    inline def setMerchantAccountIdUndefined: Self = StObject.set(x, "merchantAccountId", js.undefined)
  }
}
